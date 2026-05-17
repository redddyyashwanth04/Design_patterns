package factory;

public class concretecreatorB extends creator{
    @Override
    public product createproduct() {
        return new concreteproductB();
    }
}
