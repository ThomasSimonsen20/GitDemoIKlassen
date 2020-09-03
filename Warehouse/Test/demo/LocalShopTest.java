package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LocalShopTest {

    Iwarehouse warehouse;
    Product product1,product2,product3;

    @BeforeEach
    void generate() {
        warehouse = new Warehouse();
        product1 = new Product(2, LocalDate.of(2020, 3,31),"Mælk");
        product2 = new Product(5,LocalDate.of(2020,3,27),"Skrald");
        product3 = new Product(6,LocalDate.of(2020,3,20),"piv");
        //act
        warehouse.insert(product1);
        warehouse.insert(product2);
        warehouse.insert(product3);
    }

    @Test
    void removeAll() {
        //Arange
       /* Iwarehouse warehouse = new Warehouse();
        Product product1 = new Product(2, LocalDate.of(2020, 3,31),"Mælk");
        Product product2 = new Product(5,LocalDate.of(2020,3,27),"Skrald");
        Product product3 = new Product(6,LocalDate.of(2020,3,20),"piv");
        //act
        warehouse.insert(product1); */
        warehouse.removeAll();

        //assert
        assertEquals(0,warehouse.findAll().size());
    }

    @Test
    void remove() {
        //Arange
        Iwarehouse warehouse = new Warehouse();
        Product product1 = new Product(2, LocalDate.of(2020, 3,31),"Mælk");
        Product product2 = new Product(5,LocalDate.of(2020,3,27),"Skrald");
        Product product3 = new Product(6,LocalDate.of(2020,3,20),"piv");
        //act
        warehouse.insert(product1);
        warehouse.insert(product2);
        warehouse.insert(product3);
        warehouse.remove(5);


        //assert
        assertEquals(2,warehouse.findAll().size());

    }

    @Test
    void find() {
        //Arange
        Iwarehouse warehouse = new Warehouse();
        Product product1 = new Product(2, LocalDate.of(2020, 3,31),"Mælk");
        Product product2 = new Product(5,LocalDate.of(2020,3,27),"Skrald");
        Product product3 = new Product(6,LocalDate.of(2020,3,20),"piv");
        //act
        warehouse.insert(product1);
        warehouse.insert(product2);
        warehouse.insert(product3);

        //assert
        assertEquals(product2,warehouse.find(5));
    }

    @Test
    void findAll() {
        Iwarehouse warehouse = new Warehouse();
        assertNotNull(warehouse.findAll());
    }

    @Test
    void insert() {
        //Arange
        Iwarehouse warehouse = new Warehouse();
        Product product1 = new Product(2, LocalDate.of(2020, 3,31),"Mælk");
        Product product2 = new Product(5,LocalDate.of(2020,3,27),"Skrald");
        Product product3 = new Product(6,LocalDate.of(2020,3,20),"piv");
        int expectedSize = 1;
        //act
        warehouse.insert(product1);

        //assert
        assertEquals(expectedSize, warehouse.findAll().size());
    }

    @Test
    void testToString() {

    }
}