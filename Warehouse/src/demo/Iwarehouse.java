package demo;

import java.util.ArrayList;

public interface Iwarehouse {

    public void removeAll();
    public void remove(int number);
    public Product find(int number);
    public ArrayList<Product> findAll();
    public void insert(Product product);
    public ArrayList<Product> removeExpired();
    public void printud();

}
