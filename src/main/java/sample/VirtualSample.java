package sample;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.NoOffset;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Virtual;

@Platform(include = "Sample.h")
public class VirtualSample {
    static {
        Loader.load();
    }

    public static class Sample extends Pointer {
        static {
            Loader.load();
        }

        public Sample(long id) {
            allocate(id);
        }

        public native void allocate(long id);

        @NoOffset
        public native long id();

        public native Sample id(long id);

        @Virtual
        public native int add(int a, int b);

        @Virtual
        public native int minus(int a, int b);

        @Virtual
        public native void printId();
    }
}
