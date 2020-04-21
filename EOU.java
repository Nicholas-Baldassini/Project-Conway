
package ProjectConway;

public class EOU {
    
    /*
    PRINT methods
    Pre: N/A
    Post: N/A
    Print a value
    */
    public static void println(String print){
        System.out.println(print);
    }public static void println(int print){
        System.out.println(print);
    }public static void println(float print){
        System.out.println(print);
    }public static void println(double print){
        System.out.println(print);
    }public static void println(boolean print){
        System.out.println(print);
    }
    
    public static void print(String print){
        System.out.print(print);
    }public static void print(int print){
        System.out.print(print);
    }public static void print(float print){
        System.out.print(print);
    }public static void print(double print){
        System.out.print(print);
    }public static void print(boolean print){
        System.out.print(print);
    }
    
    /*
    ADD method
    pre: N/a
    post: N/a
    Add a value to an array
    */
    public static Boid[] add(Boid[] old, Boid n) {
        int l = old.length;
        
        Boid[] newlist = new Boid[l+1];
        
        System.arraycopy(old, 0, newlist, 0, l);
        newlist[l] = n;
        return newlist;
    }

    public static Rule[] add(Rule[] old, Rule n){
        int l = old.length;
        
        Rule[] newlist = new Rule[l+1];
        
        System.arraycopy(old, 0, newlist, 0, l);
        newlist[l] = n;
        return newlist;
    }
}
