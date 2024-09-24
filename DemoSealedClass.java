
sealed class A extends Thread implements Cloneable permits B, C{


}

non-sealed class B extends A{

}

final class C extends A{

}

class X  extends B{

}

sealed interface Y permits Z {

}

final interface Z extends Y {
    
}

public class DemoSealedClass {
    
    public static void main(String[] args) {
        
    }
}
