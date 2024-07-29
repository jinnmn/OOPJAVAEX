public class Input {
    private final CalcComplex cA = new CalcComplex( 4.0, -2.0 );
    private final CalcComplex cB = new CalcComplex( 2.5, 1.5 );
    private final CalcComplex[] nums 
        = new CalcComplex[] {cA,cB};// на случай если чесел больше 2ч
    

    public CalcComplex getA() {
        return cA;
    }
    public CalcComplex getB() {
        return cB;
       
    }
    public CalcComplex[] getNums() {
        return nums;
    }

    

   
}
 


