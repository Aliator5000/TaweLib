package sample;

public class User
{
    private String username;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private Address address;
    private String profilePicture;

    public User(String username, String firstName, String lastName, int phoneNumber, Address address)
    {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public Address getAddress()
    {
        return address;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return username;
    }
}
