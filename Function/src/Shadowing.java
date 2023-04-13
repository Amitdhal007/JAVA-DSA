public class Shadowing {
    static int x = 10; // global scope , class variable
    public static void main(String[] args) {
        // shadowing is a practice of using two variable with same while overlapping scopes
        // shadowing occurs when a variable is declared in lower scope
        // having same name as variable declared in higher scope
        // variable with higher scope is shadowed/hidden bcz it is overlapped by lower scope variable
        System.out.println(x); // 10
        int x = 20; // class variable at line 2 is shadowed by this
        System.out.println(x); // 20
        fun();
    }

    static void fun(){
        System.out.println(x); // 10
    }
}
