package Primer5;


import Primer5.view.CatView;

public class Main {
    public static void main(String[] args){
        CatView catView = new CatView();
        catView.saveACat("murzik","persian", 4, 6);
        catView.getACat("murzik");
    }

}
