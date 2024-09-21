import java.util.ArrayList;
import java.util.List;

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


class Statico {

    private static int startupNumbers = 19;

    public void Statico()
    {
        System.out.println(startupNumbers++);
    }

    public int returnStatic()
    {
        return startupNumbers;
    }

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
        System.out.println(m == me  );


        int[] sayi = new int[4];
        sayi[0] = 2;
        System.out.println(sayi[0]);


        String[] isim = new String[8];
        isim[2] = "azad";
        System.out.println(isim[2]);

        int[] arrays = {1,2,3,5,6,7,8,98,112};

        
        //iterating over dynamic list 
        List<Integer> col = new ArrayList<>();
        col.add(2);

        List<String> schools = new ArrayList<>();
        schools.add("regys college");
        schools.add("harward");
        schools.add("mit");
        schools.add("standford");
        schools.remove(1);
        System.out.println(schools.get(1));

        for (String s : schools)
        {   
            System.out.println(s);

        }

        for (int s = 0; s < schools.size(); s++)
        {
            System.out.println(schools.remove(s));

        }



        Statico st1 = new Statico();
        Statico st2 = new Statico();
        Statico st3 = new Statico();


        st1.Statico();
        st2.Statico();
        st3.Statico();
        st1.Statico();
        

        
    }
}
