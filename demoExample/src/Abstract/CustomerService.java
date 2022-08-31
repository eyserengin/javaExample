package Abstract;
import Concrete.*;
import Entities.*;

public interface CustomerService {

    void save(Customer customer) throws Exception;

}
