package JavaError;


class AzadException extends Exception
{
    public AzadException(String string)
    {
        super(string);
    }
}

class JavaErrorLesson {



 

    public static void main(String s[])
    {

        String names = "Azad";
        char myInitial = 'A';
        int initialNumber = 9;
        

        try
        {

        if (names == "Azad")
                throw new AzadException("My name used double time");
        }catch(AzadException a)
        {
            System.out.println(a);
        }



        int a = 1;
        int[] intArr = new int[8];

        try 
        {   
            int c = 19;
            int b = intArr[9];

            int d = 18 / c;
            System.out.println(d);

            
            if (d == 0)
            {
                throw new Error("there is an error occured ");
            }
            

        }
        catch(Exception ArrayIndexOutOfBoundsException)
        {   
            System.out.println("this is out of bound exception error lol");

        }

         

    }
}
