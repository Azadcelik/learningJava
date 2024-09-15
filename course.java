
class Person { 

    String name; 
    int age;
    double height;
}



class Glass { 
    private int price = 1;
    private String name = "Nothing";


    public  int getPrice() 
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String anything)
    {
        name = anything;
    }
    public void setPrice(int p)
    {
        price = p;
    }
}


class Azad { 

    public Azad()
    {
        System.out.println("this is Azad constructor default");
    }

    public Azad(String name)
    {
    System.out.println("This is Azad constructor parameterized");
        
    }
}

class Silo extends Azad {

    public Silo()
    {   
        // super(); // this is called each time even you do not see it 
        //if you want to call paremeterized public then use super and explicitly pass parameter 
        System.out.println("this is Silo constructor default");

    }
    public Silo(String name)
    {
        System.out.println("this is Silo constructor parameterized");

    }
}

class Lesson { 

    public static void main (String azad[]) { 
        int num1 = 3;
        int num2 = 7;
        System.out.println(num1 + num2);


        //type casting 
        int r = 12;
        byte t = (byte) r;
        System.out.println(r);

        //comparing 

        int a = 12;
        int b = 13;

        boolean c = a < b;
        boolean d = a > b;
        boolean e = a != b;
        System.out.println(c);

        //switch case so break is important here because in switch case method when condition met it will execute rest of the code
        //so you have to say stop execution when condition met.Also it is good for multiple if else conditions lol 

        char azadi = 'c';

        switch (azadi) { 
            case 'c':
                System.out.println("this is very weird");
                break;
            case 'd': 
                System.out.println("this is very interesting");
                break;
            case 'e':
                System.out.println("this is very strange");
                break;
            default: 
                System.out.println("this is for other condiitions like else");

        }


        //loop where you want to output things multiple times => for, while, do while

        // int i = 2;

        // while ( i < 10)
        // {
        //     System.out.println("this is hi for how many times" + i);
            
        //     int j = 1;
        //     while (j <= 3)
        //     {
        //         System.out.println("azadiya welat " + j + " times");
        //         j++;
        //     }
        //     i++;

        // }


        //with do while loops you at least get one time although it is false so it is useful
        int k = 5;

        do { 
            System.out.println("get output once anyway");
            k++;
        } while(k < 9);


        //if you know the numbers using for loop is better but if you do not know what number then using while loop is great


        int nums [][] = new int [3][4];


        for (int i = 0; i < 3 ;i++)
        {
         
          for (int j = 0; j < 4 ; j++) 
          {

            nums[i][j] = (int) (Math.random() * 10);
            System.out.print(nums[i][j] + " ");
          }
            System.out.println();
        }


        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.name = "Azad";
        p2.name = "Ali";
        p3.name = "Ahmed";

        p1.age = 21;
        p2.age = 22;
        p3.age = 23;


        p1.height = 6.4;
        p2.height = 6.4;
        p3.height = 6.4;

        Person people[] = new Person[3];
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;


        // for (int i = 0; i < people.length; i++) 
        // {
        //     System.out.println(people[i].name + " " + people[i].age + " " + people[i].height);
        // }

        for (Person person : people) 
        {
            System.out.println(person.name + " " + person.age + " " + person.height);
        }


        // you are changing adress from 101 to 105 (arbitrary) you are not changing actual data
        String names = "Navin";
        String nam = "Navin";
        //once you assign variable for string you can not change lol it will assign new memory 
        String name = "Azad";
        name = "Azad" + "Berat";


        Glass glass = new Glass();
        glass.setName("Azadiya welat");
        glass.setPrice(999);
        
        System.out.println(glass.getName() + " " + glass.getPrice());


        Azad azadiya = new Azad();
        // so when you call child class it will call super method each time which will call default parent class anyway 
        //this is very important men 
        Silo silo = new Silo("azad parameter");
        Silo siloye = new Silo();


        int num = 9; 
        String numberso  = "12";
        Integer n = Integer.parseInt(numberso);
        System.out.println(n * 12);

        int[] numbersArray = {1,2,3,5,6,7,8};
        System.out.println(numbersArray[2]);
        


    }
}