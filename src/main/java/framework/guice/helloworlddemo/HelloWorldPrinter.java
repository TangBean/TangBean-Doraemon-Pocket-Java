package framework.guice.helloworlddemo;

import com.google.inject.Singleton;

/**
 * 如果我们不用Singleton标注，每次获取实例时，Guice会重新构造一个，这个会有反射构造器的性能损耗，在高性能场景下，请谨慎。
 */
@Singleton
public class HelloWorldPrinter {
    public void print() {
        System.out.println("Hello World!");
    }
}
