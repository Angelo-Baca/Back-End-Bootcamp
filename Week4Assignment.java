import java.util.Random;

public class Week4Assignment {

    public static void main(String[] args) {
    // Start of assignment
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

    // 1a
    // explain that int oneA = 93 -3 && int oneA = ages[7] - ages[0] are wrong
    int oneA = ages[(ages.length - 1)] - ages[0];
    System.out.println("Here is question 1a:");
    System.out.println("The difference between the last index and the first of the ages array is: " + oneA);
    
    System.out.println("\n");
    // 1b
    int[] ages2 = new int[9];
    // need to populate this array otherwise this is pretty meaningless because it will populate with 0s
    Random randomNum = new Random();
    for (int i = 0; i < ages2.length; i++) {
        // nextInt(100) generates a number from 0 to 99.
        int numToAdd = randomNum.nextInt(100);
        ages2[i] = numToAdd;
    }
    
    System.out.print("The numbers in the ages2 array, generated randomly are: ");
    for (int i = 0; i < ages2.length; i++) {
        System.out.print(ages2[i] + " ");
}
System.out.println("\n");
    //b ii)
    int oneB = ages2[(ages2.length - 1)] - ages2[0];
    System.out.println("The difference between the last index and the first of the ages2 array is: " + oneB);
    //1c find the average of each array
    /* explain why commented below code doesn't work -> 1st attempt
        resets the sum to "0" each time because sum is inside loop
            for (int i = 0; i < ages.length; i++) {
            int sum = 0;
            sum += ages[i];
            int average = (sum / ages.length);
            };
    */
   int sum1 = 0;
   for (int i = 0; i < ages.length; i++) {
        sum1 += ages[i];
    }
    double average1 = (double) sum1 / ages.length;
    System.out.println("The average of the ages array is: " + average1);

    //repeat for 2nd array
    int sum2 = 0;
    for (int i = 0; i < ages2.length; i++) {
        sum2 += ages2[i];
    }
    double average2 = (double) sum2 / ages2.length;
    System.out.println("The average of the ages2 array is: " + average2);
    System.out.println("\n");
    // Question 2
    System.out.println("Question 2:");
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

    
    // 2a: Use a loop to iterate through the array and calculate 
    // the average number of letters per name. Print the result to the console.
    int letterCount = 0;
    for (String name : names) {
        letterCount += name.length();
    }
    double averageNameLength = (double) letterCount / names.length;
    System.out.println("The average number of letters per name is: " + averageNameLength);
    // 2b: Use a loop to iterate through the array again 
    // and concatenate all the names together, separated by spaces, 
    // and print the result to the console.
    String concatNames = "";
    for (String name : names) {
        concatNames += name + " ";
    }
    // explain that .trim() is there to remove the whitespace at the end of the concatNames string
    // it isn't necessary but it does make the output prettier
    System.out.println("The concatenated names are: " + concatNames.trim());
    System.out.println("\n");

    // Q3: How do you access the last element of any array?
    String lastElement = names[names.length - 1];
    System.out.println("To answer Q3, we must take the total number of elements and subtract 1.\n" + 
    "We do this because the indexing of array starts at 0 whereas the incremental counter for\n"  +
    "the .length() method tells us the total amount of elements in the array\n" +
    "Finally, we must specify the data type. In this example\n" +
    "We are printing the last element in the names array: " + lastElement);
    System.out.println("\n");

    // Q4: How do you access the first element of any array?
    int firstElement = ages2[0];
    System.out.println("Q4");
    System.out.println("Much like Q3 except far more simply, we need only access the first index\n" +
    "of the array and specify the data type in the call. In this example we pull the first element of \n" +
    "the ages2 array: " + firstElement);
    System.out.println("\n");

    /* Q5:  Create a new array of int called nameLengths. 
    Write a loop to iterate over the previously created names array 
    and add the length of each name to the nameLengths array.
    */
    /*  Explanation:
    1. Create empty array of ints and element size = length of previous array
    2. Use a for loop and have increment by 1 each iteration and have the
    maximum range be 1 less than the total size of the names array.
    3. Set the value of the newest array at whatever index we are on
    to the value of the length of whatever name is in the names array at that index.
    */
    System.out.println("Q5 example code:");

    int[] nameLengths = new int [names.length];
    for (int i = 0; i < names.length; i++) {
        nameLengths[i] = names[i].length();
    }
    
    System.out.println("\n");
    System.out.println("Q6 example code:");
    /* Q6. Write a loop to iterate over the nameLengths array 
    and calculate the sum of all the elements in the array. 
    Print the result to the console.
    */
   int Q6Counter = 0;
    for(int i =0; i < nameLengths.length; i++) {
        Q6Counter += nameLengths[i];
    }
    System.out.println("The sum of all elements (integers) in the\n" +
    "nameLengths array is: " + Q6Counter);
    System.out.println("\n");

    // Q7 call in main
    System.out.println("Q7 example code:");
    System.out.println(concatNTimes("Hello", 3));
    System.out.println("\n");

    // Q8 calls in main
    System.out.println("Q8 example code:");
    System.out.println(fullName("Spartan", "John-117"));
    System.out.println("\n");

    //Q9 call in main
    System.out.println("Q9 example code:");
    int[] exampleArray = {10, 20, 30, 40, 50};
    System.out.println("Is the sum of the example array greater than 100? " + isGreaterThan100(exampleArray));
    System.out.println("\n");

    //Q10 call in main
    System.out.println("Q10 example code:");
    double[] exampleArray2 = {10.5, 20.5, 30.5, 40.5, 50.5};
    System.out.println("The average of the example array is: " + returnsAverage(exampleArray2));
    System.out.println("\n");

    //Q11 call in main
    System.out.println("Q11 example code:");    
    double[] exampleArray3 = {10.5, 20.5, 30.5, 40.5, 50.5};
    double[] exampleArray4 = {5.5, 15.5, 25.5, 35.5, 45.5};
    System.out.println("Is the average of the first example array greater than the second? " + firstBiggerThanSecond(exampleArray3, exampleArray4));
    System.out.println("\n");

    //Q12 calls in main
    System.out.println("Q12 example code:");
    System.out.println("Will buy drink? " + willBuyDrink(true, 15.0));
    System.out.println("Will buy drink? " + willBuyDrink(false, 15.0));
    System.out.println("Will buy drink? " + willBuyDrink(true, 5.0));
    System.out.println("\n");

    //Q13 calls in main
    System.out.println("Q13 example code:");
    System.out.println("The result of my custom method is: " + 
    shouldYouHaveKids(true, true, true, true, true));      


    // This is the end of the main function 
    }

    /* Q7:
    Write a method that takes a String, word, and an int, n, 
    as arguments and returns the word concatenated to itself n 
    number of times. (i.e. if I pass in “Hello” and 3, I expect 
    the method to return “HelloHelloHello”).   
    */

    public static String concatNTimes(String word, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        return result;
    }

    /* Q8:
    Write a method that takes two Strings, firstName and lastName, and returns a 
    full name (the full name should be the first and the last name 
    as a String separated by a space).
    */
    public static String fullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    /* Q9. Write a method that takes an array of int and returns true if 
    the sum of all the ints in the array is greater than 100.
    */
   public static boolean isGreaterThan100(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    if (sum > 100) {
        return true;
    }
    else {
        return false;
    }
   }

   /*10. Write a method that takes an array 
   of double and returns the average of all the elements in the array. 
   */
   public static double returnsAverage(double[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    double average = sum / arr.length;
    return average;
   }

   /* Q11: 
   Write a method that takes two arrays of double and returns true 
   if the average of the elements in the first array is greater than 
   the average of the elements in the second array.   
   */

   public static boolean firstBiggerThanSecond(double[] arr1, double[] arr2) {
    double sum1 = 0;
    for (int i = 0; i < arr1.length; i++) {
        sum1 += arr1[i];
    }
    double sum2 = 0;
    for (int i = 0; i < arr2.length; i++) {
        sum2 += arr2[i];
    }
    double average1 = sum1 / arr1.length;
    double average2 = sum2 / arr2.length;
    if (average1 > average2) {
        return true;
    } else {
        return false;
    }
   }

   /* Q12: Write a method called willBuyDrink that takes a boolean isHotOutside, 
   and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket 
   is greater than 10.50.
   */
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    return isHotOutside && moneyInPocket > 10.50;
}

  /* Q13. Create a method of your own that solves a problem. 
  In comments, write what the method does and why you created it.
  */

 /*
 This method decides whether someone is in a good position to have children.
 I created it because it combines several logical conditions into one decision
 making process, which can help determine readiness for parenthood. It also specifically has
 a low chance of success on purpose to add a bit of humor.
*/
public static boolean shouldYouHaveKids(boolean hasSpouse, boolean trustsSpouse,
    boolean hasEnoughMoney, boolean nameIsNotRachel, boolean nameIsNotAaron) {
    return hasSpouse && trustsSpouse && hasEnoughMoney && nameIsNotRachel && nameIsNotAaron;
}
  }

