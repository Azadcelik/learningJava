package Interfaces;


interface Homosapiens {

    public String drink(String drinks);
    public String eat(String food);
    public Integer count(int count);
    
}

class Human implements Homosapiens
{
    public String drink (String drinks)
    {
        System.out.println("Azad loves to drink " + drinks );
        return drinks;
    }
    public String eat(String food)
    {
        return food;
    }
    public Integer count(int count)
    {
        return count;
    }

} 


public class Interfaces 
{
    public static void main (String azad[]) {


        Homosapiens azadi = new Human();
        azadi.drink("cole");
        azadi.eat("chicken rice");
        azadi.count(100);



    }

}
