/**
 * UsingExceptions
 */
public class UsingExceptions {

    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception exception) {
            System.out.println("Exception handled in main ");
            //TODO: handle exception
        }

        doesNotThrowException();
    }

    public static void throwException() throws Exception {
        try {
            System.out.println("Method ThrowException");
            throw new Exception();
        } catch (Exception exception) {
            System.out.println("Exception handled in method throwException");
            throw exception;
            //TODO: handle exception
        }

        finally{
            System.out.println("Finally executed in throwException");
        }
    }

    public static void doesNotThrowException() {
        try {
            System.out.println("Method doesNotThrowException");
        } catch (Exception exception) {
            System.err.println(exception);
            //TODO: handle exception
        }
        finally{
            System.err.println("Finally executed in doesNotThrowException");
        }

        System.out.println("End of method doesNotThrowException");
    }
}