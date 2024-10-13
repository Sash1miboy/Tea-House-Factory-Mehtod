package factory;

import model.Tea;

public class BlackTeaFactory extends TeaFactory{
    @Override
    public Tea createTea() {
        return new Tea("Black Tea", 35000, "Dark Brown");
    }
}
