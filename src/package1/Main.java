package package1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year = 2001;
        String str = String.valueOf(year);
        System.out.println(str);

        String rev = "1002";



        int day = Integer.parseInt(rev.substring(0, 2));
        int month = Integer.parseInt(rev.substring(2, 2 + 2));
        System.out.println(day);
        System.out.println(month);
        String combined = rev + str;
        String reversed = reverse(combined);
        System.out.print(rev + str +"\n");
        if (reversed.equals(combined)){
            System.out.print("true");
        }


        //look at page 215 in textbook for linkedstack class
        ArrayList<String> stack = new ArrayList<String>();


    }


    static String reverse(String input)
    {
        char[] a = input.toCharArray();
        int l, r = a.length - 1;
        for (l = 0; l < r; l++, r--)
        {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }
}
