package Primer2;

public interface RemoteControl {
    void use();
    default void heatUp(){
        System.out.println("thing is heating");
    }
}
