import Adapters.*;
import Entities.*;
import Abstract.*;
import Concrete.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdaters());
        customerManager.save(new Customer(1, "54934030312", "osman eyser ", "engin", 2002));
        System.out.println();


    }
}
