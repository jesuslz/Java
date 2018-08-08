/**
 * UsingChainedExceptions
 */
public class UsingChainedExceptions {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            exception.printStackTrace();
            //TODO: handle exception
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("Exception thrown in method1", exception);
            //TODO: handle exception
        }
    }

    public static void method2() throws Exception{
        try {
            method3();
        } catch (Exception exception) {
            throw new Exception("Exception thrown in method2", exception);
            //TODO: handle exception
        }
    }

    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method3");
    }
}