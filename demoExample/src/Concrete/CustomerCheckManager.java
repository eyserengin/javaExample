package Concrete;

import Abstract.*;
import Entities.*;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
