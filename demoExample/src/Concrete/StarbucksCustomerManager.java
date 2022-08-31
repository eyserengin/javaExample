package Concrete;

import Abstract.*;
import Entities.*;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {

        this.customerCheckService = customerCheckService;
    }

    public void save(Customer customer) throws Exception {
        if (customerCheckService.CheckIfRealPerson(customer)) {
            System.out.println("Saved to db: " + customer.getFirstName());
        } else {
            System.out.println("Not a valid person");
        }

    }
}
