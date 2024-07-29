public abstract class Complex {
    double dReal, dImaginary;

    public Complex() {}

    public Complex( double dReal, double dImaginary ) {
        this.dReal      = dReal; // Действительное
        this.dImaginary = dImaginary; // Мнимое
    }

    public String toString() {
        if (dImaginary >= 0)
            return String.format("%.2f",dReal) + "+" 
            +  String.format("%.2f",dImaginary) + "i";
        else
            return String.format("%.2f",dReal) + "-" 
            + String.format("%.2f",-dImaginary) + "i";
    }

    
       
}

