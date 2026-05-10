package singleton_pattern;

public class eagerIntialization {
    private  static eagerIntialization singletoneager=new eagerIntialization();
    //this object is created while loading the class
    private eagerIntialization(){//this constructor can only be accessed by member of its class
        System.out.println("object is created"+this);

    }
    public  static eagerIntialization getinstance(){
        return singletoneager;
    }//we can call this method because this is static method
    public static void fun(){
        System.out.println(singletoneager);
        System.out.println("having fun");
    }
}
