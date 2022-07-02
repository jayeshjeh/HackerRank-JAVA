package Problems;

import java.util.*;
import java.io.*;

class JavaEndOfFiles{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int count = 1;
        while(scan.hasNext()){
            String s = scan.nextLine();
            System.out.println(count + " " + s);
            count++;
        }
        
    }
}
