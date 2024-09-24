
//Exception class extends to throwable

public class DemoErrorException {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;
        //int nums[] = new int[3];
        try {
            j = 18/i;
            if(j == 0)
                throw new ArithmeticException("Cannot be zero"); //here we are passing a error message
            //System.out.println(nums[1]);
            //System.out.println(nums[5]);


        } catch (ArithmeticException e) {  //will be executed only if there is some exception

            // TODO: handle exception
            j = 18/1;
            System.out.println("Default value given " + e);
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds : "+e);
        }

        catch(Exception e) {

            System.out.println(e);
        }

        System.out.println(j);

    }
}
