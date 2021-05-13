import customer.Customer
import customer.CustomerReader
import customer.EntityManagerStub
import spock.lang.Specification

class FirstStubSpec extends Specification {
    private EntityManagerStub entityManagerStub;
    private CustomerReader customerReader;

    def "setup"() {
        entityManagerStub = Stub(EntityManagerStub.class);
        customerReader = new CustomerReader(entityManagerStub)

    }

    def "get fullName when null is not returned"() {
        given:
        Customer customer = new Customer()
        customer.firstName = "Deepak"
        customer.lastName = "Yadav"
        and:
        entityManagerStub.find() >> customer

        when:
        def fullName = customerReader.getFullName()

        then:
        fullName == "DeepakYadav"
    }

    def "when result is not present"() {
        given: "the db has no record for the customer"
        entityManagerStub.find() >> null
        when:
        def fullName = customerReader.getFullName()
        then:
        fullName ==" "
    }
}
