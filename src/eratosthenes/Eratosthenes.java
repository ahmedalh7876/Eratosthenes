/*
 * Author: Ahmed A.
 * Final edit: March 5th, 2020.
 * This program uses the eratosthenes sieve method to determine primes between 2 and 1000.
 */
package eratosthenes;

/**
 *
 * @author ahalh7876
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Boolean array of size 1000 for 1000 numbers and declaring their status as prime as T or F.
        boolean numbers[] = new boolean[1000];

        //Running a for loop to change the state of all numbers to being true instead of the default null.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = true;
        }

        /* Running a nested for loop for each number to be divided by every number between 2 and its 
        square root to ensure they are a prime. If a number is divisable by any of the numbers, it is
        labelled as non=prime by having its prime status as a boolean converted to false. */
        for (int i = 2; i < numbers.length; i++) {
            for (int x = 2; x <= Math.sqrt(i); x++) {
                if ((i % x) == 0) {
                    numbers[i] = false;
                }
            }
            //Conditional statement within the for loop to output all the prime numbers in the console.
            if (numbers[i] == true) {
                System.out.println(i);
            }
        }
    }

}
