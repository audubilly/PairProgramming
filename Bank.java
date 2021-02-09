package BankingApplication;

public class Bank{
    private Customer [] customers= new Customer[10];
    private BankAccount [] accounts=new BankAccount[2];

    public Bank() {
    }

    public Bank(Customer[] customers) {
        this.customers = customers;
        
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customer) {
        for (int counter = 0; counter < customers.length; counter++) {
            if(customers[counter]==null){
            customers[counter]=customer;
            break;
            }

        }

    }


}
