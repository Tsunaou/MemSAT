package data.nemos;

final public class Test13 {
    static int a = 0;
    static int b = 0;
    
    final public static void p1() { a = 1; }
    
    final public static void p2() {
        final int r1 = a;
        final int r2 = b;
        assert r1 == 1;
        assert r2 == 0;
    }
    
    final public static void p3() { b = 1; }
    
    final public static void p4() {
        final int r3 = b;
        final int r4 = a;
        assert r3 == 1;
        assert r4 == 0;
    }
    
    public Test13() { super(); }
}
