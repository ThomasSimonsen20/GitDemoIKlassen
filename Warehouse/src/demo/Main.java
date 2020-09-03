package demo;
 //YOooooTEST
// TEST COMMENT
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Iwarehouse warehouse = new LocalShop();
        //Iwarehouse warehouse = new Warehouse();
        Product product1 = new Product(2,LocalDate.of(2020, 3,31),"Mælk");
        Product product2 = new Product(5,LocalDate.of(2020,3,27),"Skrald");
        Product product3 = new Product(6,LocalDate.of(2020,3,20),"piv");

        //Insert Interface
        warehouse.insert(product1);
        warehouse.insert(product2);
        warehouse.insert(product3);

        //Remove Interface
        //warehouse.remove(6);
        //warehouse.remove(6);

        //removeAll Interface
        //warehouse.removeAll();

        //Find Interface
        System.out.println(warehouse.find(2));

        //FindAll Interface
        //System.out.println(warehouse.findAll());

        //RemoveExpired Interface
        //warehouse.removeExpired();

        //System.out.println(warehouse);





    }
}
