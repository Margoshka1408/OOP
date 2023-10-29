package Lesson6;

//LSP
class Bird {
    public void fly() {
        // Реализация полета птицы
    }
}

class Ostrich extends Bird {
    public void fly() {
        System.out.println("Ostrich run");
    }
}
