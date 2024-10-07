package by.tasksLaba.изменениеРеализации;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// подкючить spring boot и AOP
// 1 Создайте аннотацию, будет использоваться для обозначения методов, которые вы хотите подменить.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ReplaceMethod {
}
/*
// 2 Создание аспекта, используйте Spring AOP для создания аспекта,
// который будет перехватывать вызовы методов, помеченных вашей аннотацией

@Aspect
@Component
public class MethodReplacementAspect {
    @Around("@annotashion(ReplaceMethod)")
    public Object replaceMethod(ProceedingJoinPoint joinPoint) throws {
        // логика подмены метода
        System.out.println("Метод заменен");
    }

    //  Вызов нового метода или логика новой реализации
           return alternativeMethod(joinPoint);
}
    // Логика нового метода
    private Object alternativeMethod(ProceedingJoinPoint joinPoint){
        return "Результат нового метода";
    }
}

// 3 Создание класса с методом**:
// теперь создайте класс с методом, который будет подменяться.
@Service
public class MyService {
    @ReplaceMethod
    public String oldMethod(){
        return "Старый метод";
    }
}

// 4 Проверка работы**:
// теперь давайте протестируем, как работает наш метод,
// когда мы вызываем `oldMethod()` из `MyService
@Component
public class MyAppRunner implements CommandLineRunner {

    @Autowired
    private MyService myService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myService.oldMethod()); // Вывод: "Метод заменен! Результат нового метода"
    }

В этом примере метод `oldMethod()` будет подменен на новое поведение внутри `MethodReplacementAspect`.
- Вы можете расширить логику в аспекте для различных сценариев, например, можно передавать параметры, изменять их и т.д.
- Убедитесь, что аспект сканируется вашим контейнером Spring. Если у вас используются аннотации, такие как `@EnableAspectJAutoProxy`, это также может быть важно.

*/


