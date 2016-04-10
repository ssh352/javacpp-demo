package sample;

import sample.VirtualSample.Sample;

public class JavaSample extends Sample {

    public JavaSample(long id) {
        super(id);
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

}
