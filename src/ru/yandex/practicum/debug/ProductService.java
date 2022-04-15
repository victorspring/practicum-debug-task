package ru.yandex.practicum.debug;

import java.util.*;

public class ProductService {

    private final Map<String, List<Customer>> productCustomers = new HashMap<>();
    private final Map<String, Integer> productAmounts = new HashMap<>();
    private final MessageService messageService = new MessageService();

    public void subscribe(String productName, Customer customer) {
        List<Customer> list = productCustomers.getOrDefault(productName, new ArrayList<>());
        if (list.isEmpty()){
            productCustomers.put(productName, list);
        }

        list.add(customer);
    }

    public void addProduct(String productName){
        int productCount = productAmounts.getOrDefault(productName, 0);

        productAmounts.put(productName, ++productCount);
        checkAndNotify(productName, productCount - 1, productCount);
    }

    public void sellProduct(String productName){
        int productCount = productAmounts.get(productName);

        productAmounts.put(productName, --productCount);
        checkAndNotify(productName, productCount, productCount - 1);
    }

    private void checkAndNotify(String productName, int amountBefore, int amountAfter) {
        if (amountBefore < 1 && amountAfter >= 1) {
            notifyCustomers(productName,
                    String.format("Product '%s' arrived", productName));

        } else if (amountBefore >= 1 && amountAfter < 1) {
            notifyCustomers(productName,
                    String.format("Product '%s' is out", productName));
        }
    }

    private void notifyCustomers(String productName, String message){
        List<Customer> customers = productCustomers
                .getOrDefault(productName, Collections.emptyList());

        messageService.sendMessage(customers, message);
    }


}