import java.lang.reflect.Method;

public class TestRunner {

    public static void runTests(Class<?> x) {
        Method[] methods = x.getDeclaredMethods();
        Object instance = null; // Pour les méthodes statiques, instance est null

        for (Method method : methods) {
            if (method.isAnnotationPresent(BeforeClass.class)) {
                try {
                    method.invoke(instance);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test testAnnotation = method.getAnnotation(Test.class);
                if (testAnnotation.enabled()) {
                    for (Method methodx : methods) {
                        if (methodx.isAnnotationPresent(Before.class)) {
                            try {
                                methodx.invoke(instance);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    System.out.println(testAnnotation.name());
                    try {
                        method.invoke(instance);
                        for (Method methody : methods) {
                            if (methody.isAnnotationPresent(After.class)) {
                                try {
                                    methody.invoke(instance);
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }

        for (Method method : methods) {
            if (method.isAnnotationPresent(AfterClass.class)) {
                try {
                    method.invoke(instance);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}