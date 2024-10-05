package Algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
class Teams 
{
    String name;
    int stars;


    @Override
    public String toString()
    {
        return name + "="+ stars;
    }


    public Teams(String name,int stars)
    {
        this.name = name;
        this.stars = stars;
    }




}


class Lesson11 {
    



    @SuppressWarnings("unchecked")
    public static void main(String azad[])
    {
        Collection nums = new ArrayList<>();

        nums.add(2);
        nums.add(5);
        nums.remove(2);
        int numOfCollection = nums.size();
        System.out.println(numOfCollection + " space " + nums);



        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(1233);
        int returnedNum = numbers.get(2);
        System.out.println(returnedNum);


        List<Teams> footballClub = new ArrayList<>();

        footballClub.add(new Teams("Real Madrid", 10));
        footballClub.add(new Teams("Milan", 11));
        footballClub.add(new Teams("Barcelona", 12));
        footballClub.add(new Teams("Manchester United", 14));

        System.out.println(footballClub);

        for (Teams club : footballClub)
        {
            System.out.println(club);
        }


        List<Integer> numbeers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        for (int n : numbeers)
        {
           if (n % 2 == 0) n = n * 2;
           else n = n  / 2;

           System.out.println(n);
        }


        Consumer <Integer> m = k -> System.out.println(k);

        numbeers.forEach(m);

        // Stream<Integer> a = numbeers.stream();

        // Stream<Integer> a2 = a.filter(k -> k % 3 == 0);
        // int result = a2.reduce(0, (d,e) -> d + e);
        // a2.forEach(k -> System.out.println(k));
        // System.out.println(result);


       int result2 =  numbeers.stream()
        .filter(n -> n % 3 == 0)
        .map(n -> n + 101)
        .reduce(0, (y,z) -> y + z);

        System.out.println(result2);
    
    }
}

