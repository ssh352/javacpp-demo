package sample;

import sample.VirtualSample.Sample;

public class Test {

    public static void main(String[] args) {
        Sample sample = new JavaSample(1);
        System.out.println(sample.add(2, 3));
        System.out.println(sample.minus(2, 3));
        sample.printId();
    }

}
