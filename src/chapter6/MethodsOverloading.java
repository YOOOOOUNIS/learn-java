package chapter6;

public class MethodsOverloading {
    public static void main(String[] args) {

        int x=20,y=30;
        char a = 'A', b = 'a';
        System.out.println(larger(x,y));
        System.out.println(larger(a,b));
    }

    public static int larger (int n1, int n2){
        if (n1 > n2){
            return n1;
        }
        else return n2;
    }

    public static char larger (char ch1, char ch2){
        if (ch1 > ch2){
            return ch1;
        }
        else return ch2;
    }
}
