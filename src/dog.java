public class dog implements Horse {
    private int weight;
    private String name;

    public dog (int weight, String name)
    {
        this.name = name;
        this.weight = weight;
    }
    public int getWeight()
    {
        return this.weight;
    }
    public String getName()
    {
        return this.name;
    }

}
