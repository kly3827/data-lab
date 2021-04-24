public class CerealTester
{
    public static void main(String[] args)
    {
        Cereal allBran = new Cereal("All-Bran", 5, 25, 1.0);
        System.out.println(allBran);
        
        Cereal appleJacks = new Cereal("Apple Jacks", 14, 25, 1.0);
        System.out.println(appleJacks);
        
        Cereal creamWheat = new Cereal("Cream of Wheat (Quick)", 0, 0, 1.0);
        System.out.println(creamWheat);
        
        System.out.println(allBran.compareCereal(appleJacks));
    }
}
