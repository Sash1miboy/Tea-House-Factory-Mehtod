package factory;

import model.Tea;

public class HerbalTeaFactory extends TeaFactory{
    @Override
    public Tea createTea() {
        return new Tea("Herbal Tea", 25000, "Varies");
    }
}
