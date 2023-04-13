import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        // this occurs when two or more functions exist with same name but must have diff arguments
        // (1) diff data types
        // (2) diff number of arguments
        int ans = sum(12,67); // this figures out during compile time
        int res = sum(12,67,89);
        System.out.println(ans+" "+res);

        fun(1,2,3,4,5,6,7);
        fun("Amit","Harish","Anis");
    }


    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }
}
