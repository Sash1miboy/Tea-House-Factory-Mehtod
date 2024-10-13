package factory;

import model.Tea;

public class OolongTeaFactory extends TeaFactory{
    @Override
    public Tea createTea() {
        return new Tea("Oolong Tea", 30000, "Amber");
    }
}
