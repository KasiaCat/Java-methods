import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int T = scan.nextInt();
        int i = 0; 

     do
        {
        int n = scan.nextInt();
        System.out.println(Integer.toBinaryString(n));
        } while (i < T);
}
}