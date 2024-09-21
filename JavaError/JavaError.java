package JavaError;
class JavaErrorLesson {


    public static void main(String s[])
    {
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
