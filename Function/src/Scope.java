public class Scope {
    public static void main(String[] args) {
        int a = 10; // lly in case of string also
        int b = 20;
        {
            //int a = 30;  we can't initialize it in block of code if it already exists in same function but can use
            // but, we can change it
            a = 40; // reassigning value to original reference variable (means change will reflect to original variable)
            int c = 50; // value initialized in this block will remain inside it
            System.out.println(c); // it can be accessed here only
        }
        int c = 60; //anything which is initialized inside can also be initialized outside but can't use
        System.out.println(a); // earlier 10 but, now 40
        //System.out.println(c); it is giving error bcz its scope is inside block code can't access here
    }
}
