package sample;

import java.util.ArrayList;

public class Customer extends User
{
    private ArrayList<Resource> borrwedItems = new ArrayList<>();

    public Customer()
    {
        super("","","",0, new Address("","",""));
    }
    public Customer(String username, String firstName, String lastName, int phoneNumber, Address address)
    {
        super(username, firstName, lastName, phoneNumber, address);
    }
}
