//    https://qaarchint.files.wordpress.com/2020/12/java_arrays_ex.pdf


package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner prn = new Scanner(System.in);
        Random r = new Random();


        // PART 1 - ARRAYS

        //ex2
        short[] arr2 = {101, 102, 103, 104, 105};
                     //  0                   4

        //ex3
        short[] arr3 = {2, 4, 6};
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        //ex4
        System.out.println(arr[arr.length - 1]);

        //ex5
        int[] arr5 = new int[20];

        //ex6
        String[] arr6 = {"Welcome", "to", "Java"};

        //ex7
        short[] arr7 = {-1, -2, -3, -4, -5};
        for (int i = 0; i < arr7.length; i++)
        {
            System.out.print(arr7[i] + "  ");
        }
        System.out.println();

        //ex8
        int[] arr8 = new int[10];
        for (int i = 0; i < arr8.length; i++)
        {
            arr8[i] = i + 1;
        }
        for (int i = 0; i < arr8.length; i++)
        {
            if (arr8[i] % 2 == 0)
            {
                System.out.print(arr8[i] + "  ");
            }
        }
        System.out.println();

        //ex9
        for (int i = arr8.length - 1; i > 0; i--)
        {
            if (arr8[i] % 2 == 0)
            {
                System.out.print(arr8[i] + "  ");
            }
        }
        System.out.println();

        //ex10
        int[] arr10 = new int[3];
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Please enter a number: ");
            arr10[i] = prn.nextInt();
        }

        //ex11
        int[] arr11 = new int[5];
        for (int i = 0; i < 5; i++)
        {
            arr11[i] = r.nextInt(50) + 1;
        }
        System.out.print("The numbers for exercise 11 are: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(arr11[i] + "  ");
        }
        System.out.println();

        //ex12
        int i12;
        for (i12 = 0; i12 < arr11.length; i12++)
        {
            if (arr11[i12] % 2 != 0)
            {
                    break;
            }
        }
        if (i12 == arr11.length)
        {
            System.out.println("All numbers are even");
        }
        else
        {
            System.out.println("Not all numbers are even!");
        }
        System.out.println();

        //ex13
        int[] arr13a = new int[5];
        int[] arr13b = new int[5];
        for (int i = 0; i < 5; i++)
        {
            arr13a[i] = r.nextInt();
            arr13b[i] = r.nextInt();
        }
        int i13;
        for (i13 = 0; i13 < 5; i13++)
        {
            if (arr13a[i13] != arr13b[i13])
            {
                break;
            }
        }
        if (i13 == 5)
        {
            System.out.println("The arrays are identical!");
        }
        else
        {
            System.out.println("The arrays are not identical!");
        }

        //ex14
        int[] code14 = {9, 4, 6};
        int[] guess14 = new int[3];
        int i14;
        for (int i = 0; i < 3; i++)
        {
            System.out.println(String.format("Please enter guess #%d: ", i + 1));
            guess14[i] = prn.nextInt();
        }
        for (i14 = 0; i14 < 3; i14++)
        {
            if (guess14[i14] != code14[i14])
            {
                break;
            }
        }
        if (i14 == 3)
        {
            System.out.println("Access Granted");
        }
        else
        {
            System.out.println("Wrong");
        }

        //ex15
        System.out.println("Please enter a word: ");
        String str15 = prn.next();
        System.out.println(String.format("The word length is %d", str15.length()));

        //ex16       chars counter
        String[] words16 = new String[3];
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Please enter a word: ");
            words16[i] = prn.next();
        }
        int sum16 = 0;
        for (int i = 0; i < 3; i++)
        {
            sum16 += words16[i].length();
        }
        System.out.println("The total character length is: " + sum16);

        //ex17   grades system
        String[] names17 = new String[5];
        int[] grades17 = new int[5];
        for (int i = 0; i < 5; i++)
        {
            System.out.println(String.format("Please enter the name of student #%d", i + 1));
            names17[i] = prn.next();
            System.out.println(String.format("Please enter the grade for student #%d", i + 1));
            grades17[i] = prn.nextInt();
        }
        System.out.println("The names and grades of the 5 students are: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(names17[i] + "  " + grades17[i]);
        }

        //ex18
        System.out.println("Please enter length of array: ");
        int[] arr18 = new int[prn.nextInt()];
        for (int i = 0 ; i < arr18.length; i++)
        {
            arr18[i] = r.nextInt(100);
        }
        System.out.println("The array is: ");
        for (int i = 0 ; i < arr18.length; i++)
        {
            System.out.print(arr18[i] + "  ");
        }
        System.out.println();
        int largest18 = 0;
        int smallest18 = arr18[0];               //maybe smallest18 = 100 (range of r) is better?
        for (int i = 0; i < arr18.length; i++)
        {
            if (arr18[i] < smallest18)
            {
                smallest18 = arr18[i];
            }
            if (arr18[i] > largest18)
            {
                largest18 = arr18[i];
            }
        }
        System.out.println("The largest number is: " + largest18);
        System.out.println("The smallest number is: " + smallest18);
        System.out.println();

        //ex19
        String[] words19 = {"one", "two", "three" ,"four", "five", "six", "seven", "eight", "nine", "ten"};
        System.out.println("Please enter a word to check: ");
        String user_word = prn.next();
        int count19 = words19.length;
        for (int i = 0; i < words19.length; i++)
        {
            if (words19[i].equals(user_word))
            {
                count19 = i;
                System.out.println(String.format("The word you entered is in element %d!", count19));
            }
        }
        if (count19 == words19.length)
        {
            System.out.println(String.format("The array doesn't include the word '%s'.", user_word));
        }

        //ex20
        int[] arr20 = new int[5];
        for (int i = 0; i < arr20.length; i++)
        {
            arr20[i] = r.nextInt(100);
        }
        System.out.println("The array is: ");
        for (int i = 0 ; i < arr20.length; i++)
        {
            System.out.print(arr20[i] + "  ");
        }
        System.out.println();
        int last20 = arr20[arr20.length - 1];
        for (int i = arr20.length - 1; i > 0; i--)
        {
            arr20[i] = arr20[i - 1];
        }
        arr20[0] = last20;
        System.out.println("The new array is: ");
        for (int i = 0 ; i < arr20.length; i++)
        {
            System.out.print(arr20[i] + "  ");
        }
        System.out.println();

        //ex21 (hangman)
        String[] arr_hangman = {"H", "E", "L", "L", "O"};
        String[] arr_guess = new String[arr_hangman.length];
        for (int i = 0; i < arr_guess.length; i++)
        {
            arr_guess[i] = "_";
        }
        int total_guesses = 30;
        int num_guessed = 0;
        int index1;
        for (index1 = 1; index1 <= total_guesses; index1++)
        {
            System.out.println("Please guess a letter: ");
            String guess_letter = prn.next();
            int index2;
            for (index2 = 0; index2 < arr_hangman.length; index2++)
            {
                if (arr_hangman[index2].equalsIgnoreCase(guess_letter))
                {
                    System.out.println("yes!");
                    for (int i3 = 0; i3 < arr_hangman.length; i3++)
                    {
                        if (arr_hangman[i3].equalsIgnoreCase(guess_letter) && arr_guess[i3].equals("_"))
                        {
                            arr_guess[i3] = guess_letter;
                            num_guessed++;
                        }
                    }
                    break;
                }
            }
            if (index2 == arr_hangman.length)
            {
                System.out.println("no!");
                System.out.println(String.format("You have %d guesses left", total_guesses - index1));
            }
            System.out.println("The current guess is: ");
            for (int i3 = 0; i3 < arr_guess.length; i3++)
            {
                System.out.print(arr_guess[i3]);
            }
            System.out.println();
            if (num_guessed == arr_guess.length)
            {
                System.out.println();
                System.out.println(String.format("You won! You finished the word in %d guesses", index1));
                System.out.print("The word was: ");
                for (int i3 = 0; i3 < arr_guess.length; i3++)
                {
                    System.out.print(arr_guess[i3]);
                }
                break;            }
        }
        if (index1 > total_guesses)
        {
            System.out.println("Sorry, game over.");
        }
        System.out.println();
        System.out.println();


        // PART 2 - NESTED LOOPS

        //ex1
        for (int i1 = 0; i1 < 5; i1++)
        {
            for (int i2 = 1; i2 <= 10; i2++)
            {
                System.out.print(i2 + "  ");
            }
            System.out.println();
        }
        System.out.println();

        //ex2
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i1 = 0; i1 < 4; i1++)
        {
            for (int i2 = 0; i2 < days.length; i2++)
            {
                System.out.print(days[i2] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        //ex3
        for (int i1 = 1; i1 <= 10; i1++)
        {
            int sum3 = 1;
            for (int i2 = 1; i2 <= 5; i2++)
            {
                sum3 *= i1;
                System.out.println(String.format("%d^%d = %d", i1, i2, sum3));
            }
        }

        //ex4
        for (int i1 = 1; i1 <= 10; i1++)
        {
            int fact22 = 1;
            for (int i2 = 1; i2 <= i1; i2++)
            {
                fact22 = fact22 * i2;
            }
            System.out.println(String.format("%d!=%d", i1, fact22));
        }

        //ex5
        System.out.println("Please enter length: ");
        short length5 = prn.nextShort();
        System.out.println("Please enter width: ");
        short width5 = prn.nextShort();
        for (int i1 = 0; i1 < length5 ; i1++)
        {
            for (int i2 = 0; i2 < width5 ; i2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //ex6
        System.out.println("Please enter length: ");
        short length6 = prn.nextShort();
        System.out.println("Please enter width: ");
        short width6 = prn.nextShort();
        for (int i1 = 1; i1 <= length6 ; i1++)
        {
            for (int i2 = 1; i2 <= width6 ; i2++)
            {
                if (i1 == 1 || i1 == length6 || i2 == 1 || i2 == width6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //ex7
        System.out.println("Please enter length of triangle: ");
        short length7 = prn.nextShort();
        for (int i1 = 1; i1 <= length7 ; i1++)
        {
            for (int i2 = 1; i2 <= length7 ; i2++)
            {
                if (i2 <= i1)
                {
                    System.out.print("*");
                }
                else
                {
                    break;
                }
            }
            System.out.println();
        }
        
    }
}
