package Abstract;
import Concrete.*;
import Entities.*;

import java.rmi.RemoteException;

public interface CustomerCheckService {

   boolean CheckIfRealPerson(Customer customer) throws Exception;
}
