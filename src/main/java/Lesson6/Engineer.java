package Lesson6;

//ISP
interface Worker {
    void work();

}

class Engineer implements Worker {
    public void work() {
        // Реализация работы инженера
    }

    public void eat() {
        // Реализация приема пищи
    }
}
