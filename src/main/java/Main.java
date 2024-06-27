import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {


        Class<String> stringClass = String.class;
        Method[] declaredMethods = stringClass.getDeclaredMethods();

        printMethodsString(declaredMethods);


    }
    public static <T> void printMethodsString(T[] elements){
        for (T element : elements) {
            System.out.println(element.toString());
        }
    }
}
