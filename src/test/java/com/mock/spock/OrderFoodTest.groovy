package com.mock.spock

import spock.lang.Specification

class OrderFoodTest extends Specification {
    private PlaceOrder placeOrder
    private CheckAccount checkAccount;
    private OrderFood orderFood;
    private Customer sampleCustomer;


    def "setup"() {
        checkAccount = Stub(CheckAccount);
        placeOrder = Mock(PlaceOrder);
        orderFood = new OrderFood(placeOrder, checkAccount)
        sampleCustomer= new Customer("Deepak")
    }

    def "No order be placed if balance is low."(){
        given:"low account balance"
        checkAccount.balance(sampleCustomer) >> false

        when:"when food is ordered"
        orderFood.notifyIfOrderPlaced(sampleCustomer);

        then:"no order is placed when the there is no balance"
        0*placeOrder.order()
    }
    def "Order can be placed if you have sufficient balance"(){
        given:"Enough account balance"
        checkAccount.balance(sampleCustomer) >> true

        when:
        orderFood.notifyIfOrderPlaced(sampleCustomer)

        then:
        1*placeOrder.order()
    }
}
