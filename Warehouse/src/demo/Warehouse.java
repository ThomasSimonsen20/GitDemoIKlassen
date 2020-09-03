package demo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Warehouse implements Iwarehouse {


    private ArrayList<Product> produkter = new ArrayList<>();

    @Override
    public void removeAll() {
        produkter.clear();
    }

    @Override
    public void remove(int productNumber) {
        for (int i = 0; i < produkter.size(); i++) {
          if (produkter.get(i).getProductNumber() == productNumber) {
              produkter.remove(i);
              return;
          }
        }
    }

    @Override
    public Product find(int number) {
        for (Product value : produkter) {
        if (value.getProductNumber() == number) {
            return value;
        }
    }
        return null;
}

    @Override
    public ArrayList<Product> findAll() {
        return produkter;
    }

    @Override
    public void insert(Product product) {
        this.produkter.add(product);
    }


    public ArrayList<Product> removeExpired() {
        for (int i = 0; i < produkter.size(); i++) {
            if (produkter.get(i).getExpirationDate().isBefore(LocalDate.now())) {
                produkter.remove(i);
                i--;
            }
        } return produkter;
    }

    public void printud() {
        for (Product product : this.produkter) {
            System.out.println(product);
        }
    }

}
