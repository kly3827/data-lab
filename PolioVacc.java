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
        
        // answer main question of project
        System.out.println("Question: Which country has the highest average rate of polio immunizations from 2014-2018?");
        Country temp = new Country("", 0, 0, 0, 0, 0);
        Country temp2 = new Country("", 101, 101, 101, 101, 101);
        // finds max and min out of all countries
        for(int i = 0; i<countries.size(); i++)
        {
            if(temp.findAvg()<countries.get(i).findAvg())
            {
                temp = countries.get(i);
            }
            if(temp2.findAvg()>countries.get(i).findAvg())
            {
                temp2 = countries.get(i);
            }
        }
        // prints all countries that share highest value
        System.out.println("The following country/countries have the highest average rate of "+temp.findAvg()+"% per year:");
        for(int i = 0; i<countries.size(); i++)
        {
            if(countries.get(i).findAvg()==temp.findAvg())
            {
                System.out.println(countries.get(i).getName());
            }
        }
        // prints all countries that share lowest value
        System.out.println("The following country/countries have the lowest average rate of "+temp2.findAvg()+"% per year:");
        for(int i = 0; i<countries.size(); i++)
        {
            if(countries.get(i).findAvg()==temp2.findAvg())
            {
                System.out.println(countries.get(i).getName());
            }
        }
        
        System.out.println();
        
        //for fun
        System.out.println("Compare two countries' vaccination rate");
        //compare avg vacc rates of 2014-2018 between 2 countries
        System.out.println("Enter the first country:");
        String name1 = input.nextLine().toLowerCase();
        input.nextLine();
        System.out.println("Enter the second country:");
        String name2 = input.nextLine().toLowerCase();
        Country temp3 = new Country(name1, 0, 0, 0, 0, 0);
        Country temp4 = new Country(name2, 0, 0, 0, 0, 0);
        for(int i = 0; i<countries.size(); i++)
        {
            if(countries.get(i).getName().toLowerCase().equals(name1))
            {
                temp3 = countries.get(i);
            }
            else if(countries.get(i).getName().toLowerCase().equals(name2))
            {
                temp4 = countries.get(i);
            }
        }
        if(temp3.findAvg()>temp4.findAvg())
        {
            System.out.println(temp3.getName()+" ("+temp3.findAvg()+"%) has a higher average polio immunization rate than "+temp4.getName()+" ("+temp4.findAvg()+"%)");
        }
        else if(temp4.findAvg()>temp3.findAvg())
        {
            System.out.println(temp4.getName()+" ("+temp4.findAvg()+"%) has a higher average polio immunization rate than "+temp3.getName()+" ("+temp3.findAvg()+"%)");
        }
        else
        {
            System.out.println(temp3.getName()+" and "+temp4.getName()+" have the same average polio immunization rate ("+temp3.findAvg()+"%)");
        }
             
        /**System.out.println("Percentage of 1-yr-olds who have received 3 doses of the polio vaccine by year and country");
        for(int i = 0; i<countries.size(); i++){
            System.out.println(countries.get(i));
        }*/
        
        
    }
}
