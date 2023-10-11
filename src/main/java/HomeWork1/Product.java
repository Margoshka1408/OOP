package HomeWork1;

public class Product {
    String name;
    double cost;
    int volume;

    public Product(String name, double cost, int volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public double getCost(double cost) {
        return cost;
    }

    public String getName(String name) {
        return name;
    }

    public int getVolume(int volume) {
        return volume;
    }

    @Override
    public String toString() {
        return "{Product " +
                "name = '" + name + '\'' +
                ", cost = " + cost + '\'' +
                ", volume = " + volume +
                '}';
    }


}
