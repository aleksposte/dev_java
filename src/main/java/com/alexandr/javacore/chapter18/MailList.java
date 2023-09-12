package com.alexandr.javacore.chapter18;

import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
      return name + "\n" + street + "\n" + city + " " + state + " " + code;
    };
}

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<Address>();

        ml.add(new Address("Name 1", "Street 1", "City 1", "State 1", "001"));
        ml.add(new Address("Name 2", "Street 2", "City 2", "State 2", "002"));
        ml.add(new Address("Name 3", "Street 3", "City 3", "State 3", "003"));

        for (Address element : ml)
            System.out.println(element + "\n");
        System.out.println();
    }
}
