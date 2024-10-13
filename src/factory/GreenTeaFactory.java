package factory;

import model.Tea;

public class GreenTeaFactory extends TeaFactory{
    @Override
    public Tea createTea() {
        return new Tea("Green Tea", 28000, "Green");
    }
}
