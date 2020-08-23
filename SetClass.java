package be.intecbrussel.hashSet;

import java.util.HashSet;

public class SetClass
{
    public static void main(String[] args)
    {
        HashSet<String> cars = new HashSet<>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("VW");
        cars.add("Audi");
        cars.add("BMW");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.contains("Audi"));
        cars.remove("BMW");
        System.out.println(cars);
        for (String i: cars)
        {
            System.out.println(i);
        }
        cars.clear();
        System.out.println(cars);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(9);
        numbers.add(7);
        numbers.add(8);
        System.out.println(numbers);
        for (int i = 0; i <= 10; i++)
        {
        if (numbers.contains(i))
        {
            System.out.println(i + " in the set.");
        }
        else
        {
            System.out.println(i + " NOT in the set.");
        }
        }
    }
}
