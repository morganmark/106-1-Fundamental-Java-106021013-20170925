import java.util.Scanner;

public class test3 {

    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String str=scn.nextLine();
        char cho=scn .next().charAt(0);
        char ch1=scn .next().charAt(0);
        System.out.println(str);
        System.out.println(str.replace(cho,ch1));
}
}