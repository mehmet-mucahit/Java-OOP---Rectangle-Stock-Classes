


public class Stock {

    String name;
    String symbol;
    double previousClosingPrice;
    double currentPrice ; 
    
    
    public Stock() {}
    
    public Stock(String s,String n){
        symbol = s;
        name = n;
        
    }
    public double getChangePercent(){
     return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    
    
}
