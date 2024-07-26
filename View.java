public class View {
    Input input = new Input();
    CalcComplex cA = input.getA();
    CalcComplex cB = input.getB();

    public void SoutNums() {
        System.out.println("cA = " + cA.toString());
        System.out.println("cB = " + cB.toString());

    }
    
}
