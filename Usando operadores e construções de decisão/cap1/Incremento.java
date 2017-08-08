import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Incremento {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        String aux = new String();
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(Double.parseDouble(unsorted[i]) > Double.parseDouble(unsorted[j])){
                    aux = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = unsorted[i];
                    
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(unsorted[i]);
        }
    }
}