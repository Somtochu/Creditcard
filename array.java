package array;
import java.lang.String;
import java.util.*;
import java.util.stream.*;


public class array {
    public static void main(String... args) {
       // definre the array by giving it a name


       //Like declarations for variables of other types, 
       //an array declaration has two components: the array's type and the array's name. An array's type is 
       //written as type[], where type is the data type of the contained elements;
       // the brackets are special symbols indicating that this variable holds an array. 
       //The size of the array is not part of its type (which is why the brackets are empty). 
       //An array's name can be anything you want, provided that it follows the rules and conventions
       // as discussed in the Classes section. As with variables of other types, 
       //the declaration does not actually create an array; it simply tells the compiler 
       //that this variable will hold an array of the specified type.
       int[] arrayList;

       // allocate the no. of array you want to create
       // we are going to allocate a memory of with integer of 10 i.e 10 element with index from 0 -9.
       // if it was 11 element, therefore the no. of index is 0-10
              arrayList = new int[10];

       // name ur array
       arrayList[1] = 600;
       arrayList[2] = 100;
       arrayList[3] = 200;
    //    arrayList[4] = 300;
       arrayList[5] = 500;
       arrayList[6] = 900;
       arrayList[7] = 500;
       arrayList[8] = 700;
       arrayList[9] = 500;
     

       System.out.println("Element at index 0 \t" + arrayList[0]);
       System.out.println("Element at index 1 \t" + arrayList[1]);
       System.out.println("Element at index 2 \t" + arrayList[4]);
       System.out.println("Element at index 3 \t" + arrayList[5]);
       System.out.println("Element at index 4 \t" + arrayList[6]);
       System.out.println("Element at index 9 \t" + arrayList[1]);
     
    



       //alternatively 

       int[] score = {
        70, 50, 90, 100, 80
       };

       System.out.println("\n the element at 4 is:\t" + score[3] + "\n the length of thr array of score is: " + score.length);



       //multidimensional array
       String[][] name = {
        {"Mr.", "Mrs. ", "Prof."},
        {"Somto", "chikamso", "Onyinyehukwu", "Okoronkwo"}
       };
    
       //printing prof. somto
       System.out.println("\n"  + name[0][2] + name[1][0]);

       //printing Mr. okoronkwo
       System.out.println(name[0][0] + name[1][3] + "\n");



       //multidimensional array  of nameconsisting of 4 array
       String[][][][] word= {
        {{{"i", "my", "our"}}},     //1-Dimension array
        {{{"love", "hate", "like"}}},       //2-Dimension array
        {{{"you", "me", "my", "teacher", "mum"}}},        //3-Dimension array
        {{{"mum", "dad", "family"}}}                   //4th=Dimension array




        //whythe 3 curly braces
        //String[][][][]  (First dimension): holds every thing that is the outer curly braces
        // String[][][] (Second dimension): contains array within the first dimension. i.e each of the array is itself an array of arrays
        //String[][] (third dimension):the 3rd curly braces exist within each of the aarrays that exist in second dimension
        //String[] (Fourth dimension): it hold the string of words thus making it the innemost level where the data is stored

       };


       //printing i love you mum
       System.out.println(word[0][0][0][0] +" " + word[1][0][0][0] + " " + word[2][0][0][0] + " " + word[3][0][0][0]);

       //printing i like my family
       System.out.println("\n" + word[0][0][0][0] + " " + word[1][0][0][2] + " "+ word[2][0][0][2] + " " + word[3][0][0][2]);


        //N.b the word[1] select the 3D array {{{"love," hate, etc}}}
        // the word[1][0] select the 2D array {{"love", hate, etc}}
        // the word[1][0][0] drills down to the 1D array {"love", "hate", etc}
        // the word[1][0][0][2] make the selection of the final pick "like"




            // length of an array
            System.out.println("\n++++++++++  Length of an array  ++++++++++++ ");

            System.out.println("\nthe length of the variable name \"arrayList\" is: " + arrayList.length);
            System.out.println("the length of the variable name \"name\" is: " + name.length);
            System.out.println("the length of the variable name \"score\" is: " + score.length);
            System.out.println("the length of the variable name \"word\" is: " + word.length);
            System.out.println("the length of the variable name \"word\" is: " + word.length);





            //copying an array
            System.out.println("\n+++++++++ Copying an array ++++++++++ ");

            //in copying array, 

            /*arraycopy(Object src, int srcPos,
                    Object dest, int destPos, int length)*/


            String[] cars = {
                "peugeot", "camery", "lexus", "honda", "G-wagon", "corolla",
                "BMW", "tesla", "land cruisier"
            };


            // we create the loction where we are going to copying the following content from cars with a size of 5
            
            String[] bestcars = new String[5];


            // starting fro lexus with postion 2(index) to the place where we want to copy it (bestcars) starting from postion 0
            // from the memory, with a lenght of 5 ie 5 element
            // we make use of the system.arraycopy()  

            System.arraycopy(cars, 2, bestcars, 0, 5);

            for(String container : bestcars) {
                System.out.println(container + " ");
            }


            //another alternative by using the java.util.arrays
            // the java.util.arrays make use of from - to while the arrayCopy() make use pf src, srcpos, des, despos, length
            System.out.println("\n+++++++++ Alternative ++++++++++");
            //using the previous example
            String[] worstcars = java.util.Arrays.copyOfRange(cars, 2, 7);

            System.out.println(java.util.Arrays.toString(worstcars));


            for(String contain : worstcars) {
                System.out.print(contain + " ");
            }



            //using stream() to print out the value of worst car

            System.out.println("\n\n +++++++++++++++++ USING STREAM TO PRINT OUT WORSTCARS ++++++++++++++++++");

            Arrays.stream(worstcars)
            .map(contain -> contain + " ")
            // .forEach(System.out::println)
            //or
            .forEach(x -> System.out.print("\t" + x + ""));
            System.out.println(" ");


            //Use of binarysearch() 
            // in binarysearch algorithm, it assumes that the array is already arranged the start from the middle side by diving the data into half
            // then it looks at the left and right and returns the indeex of the data requested
            System.out.println("\n++++++++++++++ using binarySearch() and others ++++++++++++++++");
            int[] num = {
                10, 20, 30, 40, 50, 60, 70, 80, 90, 100
            };
            int index = java.util.Arrays.binarySearch(num, 30);
            System.out.println("the index of 80: " + index);

            // equals()
            // it is used to compare two array and return true if both are equal in length and content

            int[] num1 = {10, 20, 30};
            int[] num2 = {10, 20, 40};
            int[] num3 = {10, 20, 30};
            System.out.println(java.util.Arrays.equals(num1, num2));
            System.out.println(java.util.Arrays.equals(num1, num3));

            //fill()
            //fills all elemnt of an array with a specified value
            
            int[] box = new int[8];
            java.util.Arrays.fill(box, 7);
          System.out.println(java.util.Arrays.toString(box)); 
          
          

          //sort(): used for sorting an array in ascending order

          //to sort in descending order, you first need to convert the arrays to integers by substituing int with Integer[]
          // then u make use of the java.util.collections.reverseOrder 

          Integer[] arr = {10, 2, 15, 8, 100, 92, 69, 50, 43, 70};
          
          Arrays.sort(arr, Collections.reverseOrder());
          
          System.out.println(java.util.Arrays.toString(arr));

          //parallelsort(): sort the array in parallel to leverage multicore processors for faster sorting

          int[] score1 = {20,50,0,1,79,80,100,33};
          Arrays.parallelSort(score1);
          System.out.println(java.util.Arrays.toString(score1));

          //using stream to sort score1 in descending order

          score1 = IntStream.of(score1)
          .boxed()   //convert to integer value
          .sorted(Collections.reverseOrder()) //sorted in reverse order using collection.reverseOrder
          .mapToInt(Integer::intValue) //convert back to intstream
          .toArray(); //conveert back to int[]


          //using the stream()

        //   IntStream stream = Arrays.stream(score1);
        //   System.out.println("No. greater than 50 are:");
        //   stream.filter(x -> x > 50)
        //   .forEach(System.out::println);

        Arrays.stream(score1)
        .filter(x -> x > 60 || x < 30)
        .forEach(System.out::println);



        System.out.println("\n\t\tThanks for stopping by, see you next time\n\n\n");
    }
}
