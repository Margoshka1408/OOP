package Lesson6;

//DIP
class LightBulb extends  Equipment{
    public void turnOn() {
        // Включение лампочки
    }
    public void turnOff() {
        // Выключение лампочки
    }
}
class Switch {
    private LightBulb lightBulb;
    private Equipment equipment;

    public Switch() {
        this.lightBulb = new LightBulb();
    }
    public void operate() {
        // Работа с выключателем
        equipment.turnOn();
    }
}
