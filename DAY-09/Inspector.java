import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Inspector<T>{
    
    protected Class<T> inspectedClass;
    
    public Inspector(Class<T> t){
        this.inspectedClass = t;
    }
    
    public Inspector(){}

    public void displayInformations(){
        System.out.println("Information of the \"" + inspectedClass.getName() + "\" class:");
        System.out.println("Superclass: "+ inspectedClass.getSuperclass().getName());
        
        Method method[] = inspectedClass.getDeclaredMethods();
        Field field[] = inspectedClass.getDeclaredFields();


        System.out.println(method.length + " methods:");

        for (int i=0; i<method.length ; i++){
            System.out.println("- " + method[i].getName());
        }

        System.out.println(field.length + " fields:");

        for (int i=0; i<field.length ; i++){
            System.out.println("- " + field[i].getName());
        }
    }

    
    public T createInstance() throws Exception {
        return inspectedClass.getDeclaredConstructor().newInstance();
    }
}