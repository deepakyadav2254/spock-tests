package customer;

public class EntityManagerStub {

    public Customer find(){
        return new Customer(1,"Deepak", "Yadav");
    }
}
