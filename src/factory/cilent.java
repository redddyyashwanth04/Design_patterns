package factory;

public class cilent {
    public static void main(String[] args) {
        creator proda=new concretecreatorA();
        proda.someoperation();

        creator prodb=new concretecreatorB();
        prodb.someoperation();

    }
}
