package demo;

import java.time.LocalDate;
import java.util.ArrayList;

public class LocalShop implements Iwarehouse {

    private Product[] productArray = new Product[10];


    @Override
    public void removeAll() {
        productArray = null;
    }

    @Override
    public void remove(int productNumber) {
        for (int i = 0; i < productArray.length; i++) {
            if (productArray[i].getProductNumber() == productNumber) {
                for (int j = i; j < productArray.length - 1; j++) {
                    productArray[j] = productArray[j + 1];
                }
                break;
            }
        }
    }

    @Override
    public Product find(int number) {
        for (int i = 0; i < productArray.length; i++) {
            if (productArray[i].getProductNumber() == number) {
                return productArray[i];
            }
        }
        return null;
    }

    @Override
    public ArrayList<Product> findAll() {
        for (int i = 0; i < productArray.length; i++) {
            if (productArray[i] != null) {
                System.out.println(productArray[i]);
            }
        }
        return null;
    }

    @Override
    public void insert(Product product) {
        for (int i = 0; i < productArray.length; i++)
            if (productArray[i] == null) {
                productArray[i] = product;
                break;
            }
    }

    @Override
    public ArrayList<Product> removeExpired() {
        for (int i = 0; i < productArray.length; i++) {
            if (productArray[i].getExpirationDate().isBefore(LocalDate.now())) {
                for (int j = i; j < productArray.length - 1; j++) {
                    productArray[j] = productArray[j + 1];
                }
            }
        } return null;
    }

    @Override
    public void printud() {

    }

    @Override
    public String toString() {
        for (int i = 0; i < productArray.length; i++) {
            if (productArray[i] != null) {
                System.out.println(productArray[i]);
            }
        }
        return "";
    }
}
