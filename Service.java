public class Service {
        Input input = new Input();
        CalcComplex cA = input.getA();
        CalcComplex cB = input.getB();

        // CalcComplex cAdd = cA.Add(cB);
        // System.out.println("Complex   cA + cB = " + cAdd.toString() );
        // CalcComplex cSub = cA.Sub(cB);
        // System.out.println("Complex   cA - cB = " + cSub.toString() );
        // CalcComplex cDiv = cA.Mult(cB);
        // System.out.println("Complex   cA * cB = " + cDiv.toString() );
        // CalcComplex cMult = cA.Div(cB);
        // System.out.println("Complex   cA / cB = " + cMult.toString() );

        public CalcComplex Calculate(String x) {
            switch (x) {
                case "+":
                    return cA.Add(cB);
                case "-":                    
                    return cA.Sub(cB);
                case "*":                    
                    return cA.Mult(cB);
                case "/":                    
                     return cA.Div(cB);
          
                
            }
            return cA;

        }
}
