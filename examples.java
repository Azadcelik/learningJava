
class Overload { 

    int numberr;

    public void  over() 
    {
        System.out.println("This is over first");
    }

    public int over(int num) 
    {
        return num;
    }

    public String over(String name)
    {
        return name;
    }
}




class SwitchCase { 

    String name = "azad";

    public void switchCase(String name)
    {
        switch (name)
        {
            case "azad":
                System.out.println("printed azad for");
                break;
            case "john":
                System.out.println("printed john for");
                break;
            default: 
                System.out.println("nothing matched with that");
                
        }



    }
   
}

class Memory
{
    int numbers;
    String names;
    double doubles;

}



public class examples {
    
    int nums;
    String name;
    double numbers;

    public static void main (String[] azad)
    {
        examples a = new examples();
        a.nums = 3;
        a.name = "Azad";
        a.numbers = 33.3;
        System.out.println(a.name);


        Overload o = new Overload();
        System.out.println(o.over(22));


        SwitchCase swit = new SwitchCase();
        swit.switchCase("john");
        
        Memory m = new Memory();
        Memory me = new Memory();

        m.names = "jack";
        me.names = "jorge";
        




        System.out.println(m == me);


        
    }
}
