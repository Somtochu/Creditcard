package array;
import java.util.*;
import java.util.stream.IntStream;


//you are to create an array of size 10, which takes the vaue fron 1-10 and sort them in descending order
public class test {
    public static void main(String[] args) {
        Integer[] num = new Integer[10];
        for (int i = 0; i < num.length; i++) {
          num[i] = i + 1;     // this is where the filling takes place
            
        }
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println(Arrays.toString(num));

        //test2 on array

//given the array 100,20,30,60,50,40,10 use binarySearch to find the index of 50 after sorting the array

        int[] key = {100, 20, 30, 60, 50, 40, 10};
        Arrays.sort(key);
            System.out.println("The index of 50 is : " + Arrays.binarySearch(key, 50));

            //3td task
            //you are to create an array of 5,3,1,9,7 sort it using the parallelsort then filter and print only
            //the value greater than 5

            int[] values = {5, 3, 1, 9, 7};
            Arrays.parallelSort(values);
            Arrays.stream(values)
            .filter(x -> x > 5)
            .forEach(System.out::println);

            //task 4
            //write a program that sorts the array 100,20,50,70,30,10,90 in descending order. 
            //then filter the element that is greater than 50 and print

            int[] program = {100,20,50,70,30,10,90};

            System.out.println(" ");

            //the program that does the sorting
            program = IntStream.of(program)
            .boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();

            // now to filter the element greater than 20 and print
            Arrays.stream(program)
            .filter(x -> x > 20)

            .forEach(x -> System.out.print(x + " "));
            System.out.println(" ");
    }
}





