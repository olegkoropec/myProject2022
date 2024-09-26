import java.lang.annotation.*;
import java.lang.reflect.Method;


public class AnnotationInstance {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);
        System.out.println("+++++++++++++++++++++++++++++++");
        inspectMethod(SimpleService.class);
        System.out.println("---");
        inspectMethod(LazyService.class);
        System.out.println("---");
        inspectMethod(String.class);

    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name() + " " + ann.lazy());
        } else {
            System.out.println("name of annotation not exists");
        }

    }

    static void inspectMethod(Class any) {
       Method [] methods = any.getDeclaredMethods();        // getDeclaredMethods - показує всі методи класу;
                                                            // getMethods - показує тільки public методи класу та суперкласу
       for (int i = 0; i < methods.length; i ++){
           if(methods[i].isAnnotationPresent(Init.class)){
               Init init = methods[i].getAnnotation(Init.class);
               System.out.println("Init annotation EXIST");
           }
           else {
               System.out.println("NOT");
           }
       }
    }


}

@Retention(RetentionPolicy.RUNTIME) // час життя
// SOURCE - анотація доступна тільки в коді програми і скидається під час створення. class файлу;
//CLASS - анотація зберігається в. class файлі, але недоступна під час виконання програми;
//RUNTIME - анотація зберігається в. class файлі і доступна під час виконання програми.
@Target(ElementType.TYPE)   // галузь застосування, TYPE - анотація застосовується для класів та інтерфейсів
@Inherited
// дана анотація показує, що створена анотація Service буде наслідуватися нащадками класу над яким вона помічена
@Documented // клас помічений цією анотацією попаде до Javadoc
@interface Service {
    String name();

    boolean lazy() default true;
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Init {
    boolean suppressException() default false;
}

@Service(name = "AnnotationSimpleService")
class SimpleService {
    @Init
    public void initService() {
        System.out.println("I an method initService");
    }

    public void withoutAnnotation() {
        System.out.println("I am method without annotation");
    }
}

@Service(name = "AnnotationLazyService")
class LazyService {
    @Init
    public void lazyInit() throws Exception {
        System.out.println("I am method lazyInit");
    }
}
