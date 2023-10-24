package Primer5.controller;

import Primer5.model.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatVetController {
    private List<Cat> cats;

    public CatVetController() {
        this.cats = new ArrayList<>();
    }

    public void addACat(String name,String breed,int age, int weight){
        cats.add(new Cat(name, breed, age, weight));
        System.out.println("cat has been aded in controller");

    }
    public Cat getByName(String name){
        for (int i=0; i<cats.size(); i++) {
            if (cats.get(i).getName().equals(name)){
                System.out.println("cat was found");
                return cats.get(i);
            }
        }
        System.out.println("no cat found");
        return null;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "CatVetController{" +
                "cats=" + cats +
                '}';
    }
}
