package factory;

import model.Tea;

public class WhiteTeaFactory extends TeaFactory{
    @Override
    public Tea createTea() {
        return new Tea("White Tea", 22000, "Light Yellow");
    }
}
