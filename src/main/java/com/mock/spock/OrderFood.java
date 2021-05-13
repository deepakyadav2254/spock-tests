package com.mock.spock;

public class OrderFood {
    private PlaceOrder placeOrder;
    private CheckAccount checkAccount;

    public OrderFood(PlaceOrder placeOrder , CheckAccount checkAccount){
        this.checkAccount= checkAccount;
        this.placeOrder = placeOrder;
    }

    public void notifyIfOrderPlaced(Customer customer){
        if(checkAccount.balance(customer)){
            placeOrder.order();
        }
    }


}
