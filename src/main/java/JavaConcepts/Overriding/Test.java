package JavaConcepts.Overriding;

public class Test {
    public static void main(String args[])
    {
        P p=new P();
        p.marry();
        c cc=new c();
        cc.marry();
        P pp=new c();
        pp.marry();

    }
}
