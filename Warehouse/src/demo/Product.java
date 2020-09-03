package demo;

import java.time.LocalDate;

public class Product {

    private int productNumber;
    private LocalDate expirationDate;
    private String productName;

    public Product(int productNumber, LocalDate expirationDate, String productName) {
        this.productNumber = productNumber;
        this.expirationDate = expirationDate;
        this.productName = productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "productNumber = " + productNumber +
                " expirationDate = " + expirationDate +
                " productName = " + productName;
    }
}
