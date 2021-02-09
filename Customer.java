package BankingApplication;

public class Customer {
    private String firstName;
    private String lastName;
    private String otherName;
    private String address;
    private String email;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String otherName, String address, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return String.format("Customer Profile{%n" +
                "firstName='" + firstName + '\'' +
                "%nlastName='" + lastName + '\'' +
                "%notherName='" + otherName + '\'' +
                "%naddress='" + address + '\'' +
                "%nemail='" + email + '\'' +
                "%nphoneNumber='" + phoneNumber + '\''
                );
    }
}
