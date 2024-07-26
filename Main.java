public class Main {
    public static void main (String args[]) {
        
        // Ввод и вывод в консоль двух комплексных чисел

        // CalcComplex cA = new CalcComplex( 1.0, 2.0 );
        // CalcComplex cB = new CalcComplex( 3.0, 4.0 );
        Input input = new Input();
        CalcComplex cA = input.getA();
        CalcComplex cB = input.getB();
        View view = new View();
        view.SoutNums();

        System.out.println("cA = " + cA.toString() );
        System.out.println("cB = " + cB.toString() );

        // Вывод операций

        CalcComplex cAdd = cA.Add(cB);
        System.out.println("Complex   cA + cB = " + cAdd.toString() );
        CalcComplex cSub = cA.Sub(cB);
        System.out.println("Complex   cA - cB = " + cSub.toString() );
        CalcComplex cDiv = cA.Mult(cB);
        System.out.println("Complex   cA * cB = " + cDiv.toString() );
        CalcComplex cMult = cA.Div(cB);
        System.out.println("Complex   cA / cB = " + cMult.toString() );

    }
}
