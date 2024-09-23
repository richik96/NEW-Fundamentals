
//Exception class extends to throwable

public class DemoErrorException {
    public static void main(String[] args) {
        
        int i = 2;
        int j = 0;
        int nums[] = new int[3];
        try {
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);


        } catch (ArithmeticException e) {  //will be executed only if there is some exception

            // TODO: handle exception
            System.out.println("Error: " + e);
            System.out.println("Cannot divide");
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
            System.out.println("Array index out of bounds");
        }

        catch(Exception e) {

            
        }

        finally {  //this is nothing but the super class Exception
            System.out.println("In finally block");
        }
    }
}
