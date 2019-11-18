package com.company;

public class IssueRunner {
    public static void main(String[] args) {
        DigitCounter dc=new DigitCounter();
 System.out.println(dc.calculate(5678));

 NameMapper nm=new NameMapper();
 String[] stringArray = {"Vitalizer", "Delendik", "Misha", "Nikitos"};
 nm.mapName(stringArray);
    }
}
