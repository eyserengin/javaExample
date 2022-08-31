package Adapters;

import Abstract.*;
import Entities.*;
import MernisReferance.*;

import java.rmi.RemoteException;
import java.util.Locale;

public class MernisServiceAdaters implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {

        RPQKPSPublicSoap client = new RPQKPSPublicSoap();

        boolean result= client.TCKimlikNoDogrula(
                Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getBirthDay());

        if(result == true) {
            return true;
        }
        else {
            return false;
        }


    }



}
