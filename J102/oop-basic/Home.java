public class Home
{
   public static void main(String[] ags) {
       
       Book b = new Book("java 102");
       System.out.println(b);
       
       Book b2 = new Book("PHP", 900);
       
       b.info();
       
       PrinterEpson printer1 = new PrinterEpson();
       printer1.checkPower();
       printer1.print();
       
       PrinterCannon connon1 = new PrinterCannon();
       connon1.print();
       //connon1.test();
       
    }
    
}