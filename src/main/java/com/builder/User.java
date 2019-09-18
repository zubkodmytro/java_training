package com.builder;

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private int code;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", code=" + code +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class Builder {
        private User newUser;

        public Builder() {
            newUser = new User();
        }

        public Builder withName(String name){
            newUser.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newUser.surname = surname;
            return this;
        }

        public Builder withEmail(String email){
            newUser.email = email;
            return this;
        }

        public Builder withPassword(String password){
            newUser.password = password;
            return this;
        }

        public Builder withCode(int code){
            newUser.code = code;
            return this;
        }

        public User build(){
            return newUser;
        }

    }

}
