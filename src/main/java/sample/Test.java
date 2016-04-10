package sample;

import sample.VirtualSample.Sample;

public class Test {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Sample sample = new JavaSample(1);
        System.out.println(sample.add(2, 3));
        System.out.println(sample.minus(2, 3));
        sample.printId();

        Sample sample2 = new JavaSample(2);
        sample2.printId();
    }

}
