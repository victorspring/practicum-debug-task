package ru.yandex.practicum.debug;

public class Demo {

    private static final String BUCKWHEAT = "Гречка";
    private static final String SUGAR = "Сахар";

    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Customer customer = new Customer("customer@yandex.ru");

        productService.subscribe(BUCKWHEAT, customer);
        productService.subscribe(SUGAR, customer);

        productService.addProduct(SUGAR);
        productService.sellProduct(SUGAR);

        productService.addProduct(BUCKWHEAT);
        productService.addProduct(BUCKWHEAT);

        productService.sellProduct(BUCKWHEAT);
        productService.sellProduct(BUCKWHEAT);
    }
}