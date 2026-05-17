package factory;

public class concretecreatorA extends creator{
    @Override
    public product createproduct() {
        return new concreteproductA();
    }
}
