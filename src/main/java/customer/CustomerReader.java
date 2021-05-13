package customer;

public class CustomerReader {
    private EntityManagerStub entityManagerStub;

    public CustomerReader(EntityManagerStub entityManagerstub){
        this.entityManagerStub=entityManagerstub;
    }

    public String getFullName(){
        Customer customer=entityManagerStub.find();
        if(customer == null) return " ";
        return customer.firstName + customer.lastName;
    }
}
