package ac.za.cput.cardealership.factory.people;


import ac.za.cput.cardealership.domain.people.Customer;


public class CustomerFactory{

    public static Customer getCustomer(int discount, String type){
        return new Customer.Builder().type(type)
                .discount(discount)
                .build();
    }


}
