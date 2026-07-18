public class Book extends BookGroup
{
    String color;
    String name;
    int price;
    final String isbn = "10011";
    static int counter;
    Author author;
    
    public Book(String name){
        this.name = name;
        System.out.printf("Object created" + this.name);
    }
    
      public Book(String name,int price){
        this.name = name;
        this.price = price;
        System.out.printf("name = " + this.name + "pricr = " + price);
    }
    
    String getInfo(){
        return "Name is " + name + "color is " + color + "price is " + price;
    }
    
    void printInfo() {
        System.out.printf("Name is %s Color is %s price is %d", name, color,price);
    }
    
    void amount(int qty){
        System.out.printf("Amount is %d", (price * qty));
    }
    
     void printIsbn(){
        System.out.printf("\n isbn = " + isbn);
    }
    
       void info(){
        System.out.println("child info");
    }

}