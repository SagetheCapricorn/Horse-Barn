public class HorseRunner {
    public static void main(String[] args)
    {
        Horse horse1 = new dog(120000000,"Secretariat");
        Horse horse2 = new dog(220000000,"Dusty Trail");
        Horse horse3 = new dog(1200000000, "Silver");

        Horse[] horses = new Horse[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[3] = horse3;
        HorseBarn barn =  new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Dusty Trail is in space " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space " + barn.findHorseSpace("Dusty Trail"));
    }
}
