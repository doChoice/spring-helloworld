import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldClass1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld helloWorldClass2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(helloWorldClass1.getMessage());
        System.out.println("Ссылки helloWorldClass1 и helloWorldClass2 указывают на один объект? "
                + (helloWorldClass1 == helloWorldClass2));

        Cat cat1 = applicationContext.getBean("catBean", Cat.class);
        Cat cat2 = applicationContext.getBean("catBean", Cat.class);
        System.out.println("Ссылки cat1 и cat2 указывают на один объект? " + (cat1 == cat2));
    }
}