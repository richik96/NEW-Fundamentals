import tools.AdvCalc;

public class DemoInheritance {
    public static void main(String[] args) {


        AdvCalc calc = new AdvCalc();

        System.out.println(calc.add(5, 10));
        System.out.println(calc.substract(5, 10));
        System.out.println(calc.multi(5, 10));
        System.out.println(calc.div(155, 10));

    }
}


//multi-level inheritance from demo class to calc class and from calc class to advcalc class

// methods are kept as public so that they can be accessed from outside of package and class
