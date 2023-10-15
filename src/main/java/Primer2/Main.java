package Primer2;
//абстракция и интерфейсы
public class Main {
    public static void main(String[] args){
        Capybara capybara = new Capybara();
        capybara.voice();
        Car bmv = new Car();
        bmv.use();
        bmv.move();
        bmv.heatUp();
    }
}
