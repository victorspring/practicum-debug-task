package ru.yandex.practicum.debug;

import java.util.List;

public class MessageService {

    public void sendMessage(Customer customer, String message) {
        System.out.printf("Sending to '%s': %s\n", customer.getEmail(), message);
    }

    public void sendMessage(List<Customer> customers, String message) {
        for (Customer customer : customers){
            sendMessage(customer, message);
        }
    }

}
