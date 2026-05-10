package singleton_pattern;

public class threadsafe {

    private  static  threadsafe thread;
    private threadsafe(){

    }
    static  synchronized threadsafe getInstance(){
        if(thread==null){
            thread=new threadsafe();
        }
        return thread;
    }
}
