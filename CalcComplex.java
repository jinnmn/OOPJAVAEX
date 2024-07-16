public class CalcComplex extends Complex{

    public CalcComplex() {
    }

    public CalcComplex(double dReal, double dImaginary) {
        super(dReal, dImaginary);
    }

    // Конвертация комплексного числа

    public String toString() {
        if (dImaginary >= 0)
            return dReal + "+" +  dImaginary + "i";
        else
            return dReal + "-" + -dImaginary + "i";
    }


    // ================================================================  
    // Операции над комплексными числами


    // cA + cB
    public Complex Add(Complex cB ) {
        Complex sum = new Complex();

        sum.dReal      = dReal      + cB.dReal;
        sum.dImaginary = dImaginary + cB.dImaginary;

        return (sum);
    }

    // cA * cB

    public Complex Mult( Complex cB ) {
        Complex multi = new Complex();

        multi.dReal      = dReal*cB.dReal      - dImaginary*cB.dImaginary;
        multi.dImaginary = dImaginary*cB.dReal + dReal*cB.dImaginary;

        return (multi);
    }

    // cA - cB
    public Complex Sub( Complex cB ) {
        Complex subs = new Complex();

        subs.dReal      = dReal      - cB.dReal;
        subs.dImaginary = dImaginary - cB.dImaginary;

        return (subs);
    }



    // cA / cB

    public Complex Div( Complex cB ) {
        Complex div = new Complex();
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
