/*
In Java, a jagged array is essentially an array of arrays where each element of the main array is an array itself, and these sub-arrays can have different lengths. This is in contrast to a two-dimensional array, where all rows have the same number of columns.

Here's how you can create and work with jagged arrays in Java:

java
 */
package arrays;
class jaggedarray
{  
        public static void main(String[] args){  
            //declaring a 2D array with odd columns  
            int arr[][] = new int[3][];  
            arr[0] = new int[3];  
            arr[1] = new int[4];  
            arr[2] = new int[2];  
            //initializing a jagged array  
            int count = 0;  
            for (int i=0; i<arr.length; i++)  
                for(int j=0; j<arr[i].length; j++)  
                    arr[i][j] = count++;  
       
            //printing the data of a jagged array   
            for (int i=0; i<arr.length; i++){  
                for (int j=0; j<arr[i].length; j++){  
                    System.out.print(arr[i][j]+" ");  
                }  
                System.out.println();//new line  
            }  
        }  
     
}