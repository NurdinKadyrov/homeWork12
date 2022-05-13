package com.company;

public class Parrot {
    private String name;
    private String address;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Parrot _" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", year=" + year;
    }
}
