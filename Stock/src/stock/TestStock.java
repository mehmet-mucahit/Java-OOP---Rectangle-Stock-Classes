
public class TestStock {
    
    public static void main(String[] args) {
   
        Stock stock1= new Stock("ORCL","  Oracle Corporation");
        
         stock1.previousClosingPrice = 34.5;
         stock1.currentPrice = 34.35 ; 
          System.out.println("hisse senedi sembolü: " + stock1.symbol);
        System.out.println("hisse senedi adı: " + stock1.name);
        System.out.println("önceki kapanış fiyatı: " + stock1.previousClosingPrice);
        System.out.println("güncel fiyat: " + stock1.currentPrice);
        System.out.println("değişim yüzdesi: " + stock1.getChangePercent() + "%");
    }
    
}
