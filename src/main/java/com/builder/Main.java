package com.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .withName("Dmytro")
                .withSurname("Zubko")
                .withEmail("trololo@mail.com")
                .build();
        System.out.println(user.toString());
    }
}
