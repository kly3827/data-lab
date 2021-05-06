import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PolioVacc {
    public static void main(String[] args) {
        
        DataSource ds = DataSource.connect("Pol3.csv").load();
        ArrayList<Country> countries = ds.fetchList("Country", "Country", " 2018", 
             " 2017", " 2016",
             " 2015", " 2014");
        // ds.printUsageString();    
        // Country c1 = ds.fetch("Country", "Country");
        // System.out.println(c1.getName());
        
        System.out.println();
        
        System.out.println("Question: Which country has the highest average rate of polio immunizations from 2014-2018?");
        Country temp = new Country("", 0, 0, 0, 0, 0);
        for(int i = 0; i<countries.size(); i++)
        {
            if(temp.findAvg()<countries.get(i).findAvg())
            {
                temp = countries.get(i);
            }
        }
        System.out.println(temp.getName()+" has the highest average rate of "+temp.findAvg()+"% per year.");
        
        Country temp2 = new Country("", 101, 101, 101, 101, 101);
        for(int i = 0; i<countries.size(); i++)
        {
            if(temp2.findAvg()>countries.get(i).findAvg())
            {
                temp2 = countries.get(i);
            }
        }
        System.out.println(temp2.getName()+" has the lowest average rate of "+temp2.findAvg()+"% per year.");
        
        System.out.println();
             
        System.out.println("Percentage of 1-yr-olds who have received 3 doses of the polio vaccine by year and country");
        for(int i = 0; i<countries.size(); i++){
            System.out.println(countries.get(i));
        }
        
        
    }
}
