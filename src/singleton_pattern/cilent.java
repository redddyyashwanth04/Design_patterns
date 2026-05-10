package singleton_pattern;

public class cilent {
    public static void main(String[] args) {
//        eagerIntialization s1=eagerIntialization.getinstance();
//        System.out.println("first"+s1);
//        eagerIntialization s2=eagerIntialization.getinstance();
//        System.out.println("second"+s2);
//        eagerIntialization.fun();

        //Lazy inialization
//        LazyIntialization.fun();
//        LazyIntialization l1=LazyIntialization.getobject();
//        LazyIntialization L2=LazyIntialization.getobject();
//        System.out.println("first"+l1);
//        System.out.println("second"+L2);
        //the LazyIntialization.fun(); doesnot intialze the object untill unless it is required to do that
        //where as in the previous eager when you call static memnber aslo the object is being created

        //Thread safe intialization

        blockthreadsafe.fun();
        blockthreadsafe thread=blockthreadsafe.getInstance();
        blockthreadsafe thread2=blockthreadsafe.getInstance();
        System.out.println("first"+thread);
        System.out.println("second"+thread2);


    }
}
