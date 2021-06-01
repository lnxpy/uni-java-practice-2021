public class HomeSub extends Subscriber {
     
    public HomeSub(String n, int u)
    {
        super(n, u, 200);
        if(u <= 0)
        {
            throw new RuntimeException("Usage or base cost can not be less than 0");
        }
    }

    public double calculateUsageCost() {
        double additional = 0;
        if(usage / 200 >= 1) {
            additional = usage - 200;
        }

        double cost = (usage * base_cost‌) + ((additional * additional) * 0.5);
        return cost;
    }
}