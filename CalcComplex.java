public class CalcComplex extends Complex{

    public CalcComplex() {
    }

    public CalcComplex(double dReal, double dImaginary) {
        super(dReal, dImaginary);
    }

    


    // ================================================================  
    // Операции над комплексными числами


    // cA + cB
    public CalcComplex Add(CalcComplex cB ) {
        CalcComplex sum = new CalcComplex();

        sum.dReal      = dReal      + cB.dReal;
        sum.dImaginary = dImaginary + cB.dImaginary;

        return (sum);
    }

    // cA * cB

    public CalcComplex Mult( CalcComplex cB ) {
        CalcComplex multi = new CalcComplex();

        multi.dReal      = dReal*cB.dReal      - dImaginary*cB.dImaginary;
        multi.dImaginary = dImaginary*cB.dReal + dReal*cB.dImaginary;

        return (multi);
    }

    // cA - cB
    public CalcComplex Sub( CalcComplex cB ) {
        CalcComplex subs = new CalcComplex();

        subs.dReal      = dReal      - cB.dReal;
        subs.dImaginary = dImaginary - cB.dImaginary;

        return (subs);
    }



    // cA / cB

    public CalcComplex Div( CalcComplex cB ) {
        CalcComplex div = new CalcComplex();
        double dR, dDen;

        if(Math.abs( cB.dReal ) >= Math.abs( cB.dImaginary )) {
            dR   = cB.dImaginary/cB.dReal;
            dDen = cB.dReal + dR*cB.dImaginary;
            div.dReal      = (dReal      + dR*dImaginary)/dDen;
            div.dImaginary = (dImaginary - dR*dReal)/dDen;
        } else {
            dR   = cB.dReal/cB.dImaginary;
            dDen = cB.dImaginary + dR*cB.dReal;
            div.dReal      = (dR*dReal      + dImaginary)/dDen;
            div.dImaginary = (dR*dImaginary - dReal)/dDen;
        }

        return (div);
    }
    
}
