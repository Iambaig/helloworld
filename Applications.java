class Bank
{ 
    int balance=1000,rate=10;
    void Find_interest(int year) 
    { 
      
    } 
} 
  
class Bank1 extends Bank 
{ 
    private int rate=10;
    void Find_interest(int year) 
    { 
          System.out.println("SI"+(rate*balance*year/100));    
    } 
} 
class Bank2 extends Bank
{ 
    private int rate=15;
    void Find_interest(int year) 
    { 
        System.out.println("SI"+(rate*balance*year/100));
    } 
}
class Applications
{
public static void main(String args[])
{
        Bank a = new Bank(); 
        Bank1 b = new Bank1(); 
        Bank2 c = new Bank2();
        Bank ref; 
        ref = a; 
        ref.Find_interest(4); 
        ref = b; 
        ref.Find_interest(4); 
        ref = c; 
        ref.Find_interest(4); 
}
}