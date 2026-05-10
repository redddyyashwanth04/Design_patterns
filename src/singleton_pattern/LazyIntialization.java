package singleton_pattern;

public class LazyIntialization {
    private static LazyIntialization lazy;
    LazyIntialization(){

    }
    public  static LazyIntialization getobject(){
        if(lazy==null){
            LazyIntialization lazy=new LazyIntialization();
        }
        return lazy;
    }
    static void fun()
    {
        System.out.println(lazy);
        System.out.println("fun is called !");
        System.out.println();
    }



}
