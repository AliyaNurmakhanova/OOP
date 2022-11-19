package Lab;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        customer = new Customer(name);
        this.date = date;
    }

    public Visit(Customer customer, Date date, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotal() {
        return getServiceExpense()+getProductExpense();
    }

    @Override
    public String toString() {
        return "Visit[" + "customer=" + getName() + ", date=" + date + ", service expense="
                + serviceExpense + ", product expense=" + productExpense + "]";
    }
}
