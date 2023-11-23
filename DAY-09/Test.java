import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
    public String name() default "Test";
    public boolean enabled() default true;
} 
