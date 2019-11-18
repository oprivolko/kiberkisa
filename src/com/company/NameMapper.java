package com.company;

public class NameMapper {
    public void mapName(String []names){
        for (String name:names) {
            switch (name) {

                case "Misha":
                    System.out.println("обучись!");
                    break;
                case "Vitalizer":
                    System.out.println("разорви меня блины!");
                    break;
                case "Delendik":
                    System.out.println("что?");
                    break;
                case "Nikitos":
                    System.out.println("давайте по шаурме?");
                    break;
                default:
                    System.out.println("никого нет");
            }
        }
    }
}