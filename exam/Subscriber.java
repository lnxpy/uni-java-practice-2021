public abstract class Subscriber {
    public String name;
    public int usage;
    public double base_cost;

    public Subscriber(String name, int usage, double base_cost) {
        this.name = name;
        this.usage = usage;
        this.base_cost = base_cost;
    }

    public abstract double calculateUsageCost();
}