package customer;

public class Customer {
    public long id;
    public String firstName;
    public String lastName;

    public Customer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }
}
