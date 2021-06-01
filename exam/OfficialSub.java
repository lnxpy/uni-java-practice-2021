public class OfficialSub extends Subscriber {

    int is_educational;

    OfficialSub(String n, int u, int is_e)
    {
        super(n, u, 300);
        if(u <= 0)
        {
            throw new RuntimeException("Usage or base cost can not be less than 0");
        }
        if(is_e != 0 && is_e != 1)
        {
            throw new RuntimeException("Educational parameter has to be either 1 or 0");
        }
        is_educational = is_e;
    }

    public double calculateUsageCost() {
        if(is_educational == 1) {
            return usage * base_cost;
        }
        return usage * base_cost * 2;
    }
}