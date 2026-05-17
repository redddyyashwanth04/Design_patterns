package factory;

public abstract class creator {
    public abstract product createproduct();
    public void someoperation(){
        product p=createproduct();
        p.dostuff();
    }
}
interface product{
    void dostuff();
}