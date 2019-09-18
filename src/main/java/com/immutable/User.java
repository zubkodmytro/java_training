package com.immutable;

public class User {
    private final Address address;
    private final String name;

    public User(Address address, String name) {
        this.address = new Address(address.getCity(), address.getCode());
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
