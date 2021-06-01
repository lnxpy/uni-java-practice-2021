public class IndustrialSub extends Subscriber {

    int fuzz;

    IndustrialSub(String n, int u, int f)
    {
        super(n, u, 250);
        if(u <= 0)
        {
            throw new RuntimeException("Usage or base cost can not be less than 0");
        }
        if(f != 1 && f != 3){
            throw new RuntimeException("Fuzz parameter for the industrial subs has to be either 1 or 3");
        }
        
        fuzz = f;
    }

    public double calculateUsageCost() {
        int multipler = 3;
        if(fuzz == 3) {
            multipler = 6;
        }
        return usage * base_cost * multipler;
    }
}