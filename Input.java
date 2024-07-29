public class Input {
    public final CalcComplex cA = new CalcComplex( 1.0, 2.0 );
    public final CalcComplex cB = new CalcComplex( 3.0, 4.0 );
    public final CalcComplex[] nums = new CalcComplex[] {cA,cB};
    
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
 