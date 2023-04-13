import java.util.Arrays;

public class VarArgs {
    // implicit creating an array of integer,string... , it is used when we don't know
    // how many values are passed in arguments
    public static void main(String[] args){
        infinite(2,4,6,8,3,4,5,6);
        multiple(2,4,"Amit","Anis","Harish");
    }

    static void multiple(int a,int b,String ...v){
        //variable length arguments must be in last
        System.out.println(v[1]);
    }

    static void infinite(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
