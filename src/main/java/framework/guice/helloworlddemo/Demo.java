package framework.guice.helloworlddemo;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Ref: <a href="https://zhuanlan.zhihu.com/p/32299568">https://zhuanlan.zhihu.com/p/32299568</a>
 * 1. Guice里最常用的两个注解就是@Singleton和@Inject，Singleton表示构建的对象是单例的，Inject表示被标注的字段将使用Guice自动注入。
 * 2. Guice需要实例化对象，请确保相应被实例化的对象有默认构造器。
 */
public class Demo {

    @Inject
    private HelloWorldPrinter hwPrinter;

    private void print() {
        hwPrinter.print();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        Demo demo = injector.getInstance(Demo.class);
        demo.print();
    }
}
