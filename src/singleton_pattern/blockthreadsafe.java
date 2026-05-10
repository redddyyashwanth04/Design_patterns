package singleton_pattern;

public class blockthreadsafe {
    private static blockthreadsafe thread;
    private blockthreadsafe(){}

    public static blockthreadsafe getInstance(){
        if(thread==null){

            synchronized (blockthreadsafe.class){//Even if you haven't created any objects using new, the .class object for that type exists in memory.
                if(thread==null){
                    thread=new blockthreadsafe();
                }
            }
        }
        return thread;
    }
    public  static void fun(){
        System.out.println("having fun"+"in   "+  thread);
    }
}
