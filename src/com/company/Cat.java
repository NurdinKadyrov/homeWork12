package com.company;

public class Cat {
    private String name;
    private String address;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return address;
    }

    public void setAddres(String addres) {
        this.address = addres;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cat _" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", year=" + year;
    }
}
