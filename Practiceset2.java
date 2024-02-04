import java.util.Scanner;

public class Practiceset2 {

    public static float Question1(){
        return (7/4.0f*9/2.0f);
    }
    public static char Question2(char g){
        return (char)(g+8);
    }

    public static void Question3(){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        System.out.println(a>8);
        sc.close();
    }

    public static float Question4(float v, float u, float a, float s){
        return (v*v -u*u)/(2*a*s);
    }

    public static void Question5(){
        System.out.println(7*49/7+7/35/7);
    }

    public static void main(String[] args) {
        System.out.println(Question1());
        System.out.println(Question2('a'));
        Question3();
        System.out.println(Question4(1, 2, 3, 4));
        Question5();
    }
}
