package Problems;

import java.util.*;


class StaticBlockInitializer{
    static boolean flag;
    static int B, H;
    
    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if(H > 0 && B > 0){
            flag = true;
        }else if(H <= 0 || B <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    public static void main(String[] args){
        if(flag){
            int area = B*H;
            System.out.print(area);
        }
    }
}
