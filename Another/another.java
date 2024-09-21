package Another;

@FunctionalInterface
interface A { 
    public void display();
}

//this is how you extend interface and use method 
// class B implements A 
// {
//     public void display()
//     {
//         System.out.println(" my class B inherits from interface A");
//     }

// }

class Func {

    public static void main(String[] args) {
        
    A obj = () -> System.out.println("this is syntactic sugar and better way");
    obj.display();



        }
    
}
