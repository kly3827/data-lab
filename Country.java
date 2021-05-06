public class Country {
    private String name;
    private int percent18;
    private int percent17;
    private int percent16;
    private int percent15;
    private int percent14;
    
    public Country(String name, int percent18, int percent17, int percent16, int percent15, int percent14){
        this.name = name;
        this.percent18 = percent18;
        this.percent17 = percent17;
        this.percent16 = percent16;
        this.percent15 = percent15;
        this.percent14 = percent14;
    }
    
    public Country(String name)
    {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPercent18(){
        return percent18;
    }
    
    public int getPercent17(){
        return percent17;
    }
    
    public int getPercent16(){
        return percent16;
    }
    
    public int getPercent15(){
        return percent15;
    }
    
    public int getPercent14(){
        return percent14;
    }
    
    public double findAvg(){
        return (double) (percent18+percent17+percent16+percent15+percent14)/5;
    }
    
    public String toString(){
        return name+": "+percent18+"% (2018), "+percent17+"% (2017), "+percent16+"% (2016), "+percent15+"% (2015) "+percent14+"% (2014)";
    }
    
}
