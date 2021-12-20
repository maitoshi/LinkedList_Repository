package com.training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedList {

    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("PHILIPPINES");
        countries.add("JAPAN");
        countries.add("KOREA");
        countries.add("CHINA");

        new linkedList().printList(countries);
        //to add new country
        /*countries.add(1,"Canada");
        new linkedList().printList(countries);
        countries.add("Brazil");
        new linkedList().printList(countries);
        countries.set(7,"brazil"); //modify the content (brazil) in the list
        new linkedList().printList(countries);
        //remove from the list
        countries.remove(); //g.remove nya ang 1st sa list
        new linkedList().printList(countries);
        countries.remove("brazil");
        new linkedList().printList(countries);*/

        ArrayList<String> demo = new ArrayList<>();
        demo.add("One");
        demo.add("Two");
        demo.add("Three");
        demo.add("Four");
        demo.add("Five");
        new linkedList().printList(demo);

    }

    /*void printList(LinkedList<String> list){
        for (String element:list) {
            System.out.println("Element: " + element);
        }
        System.out.println("**************************");
    }*/
    void printList(List<String> list){
        for (String element:list) {
            System.out.println("Element: " + element);
        }
        System.out.println("**************************");
    }
}
