public class SimpleCalculator {
    private int firstOperand;
    private int secondOperand;

    public SimpleCalculator(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    public double division(){

        return this.firstOperand / this.secondOperand;
    }
    public int multiplication(){
        return this.firstOperand * this.secondOperand;
    }

    public int add(){
        return this.firstOperand + this.secondOperand;
    }

    public int subtract(){
        return this.firstOperand - this.secondOperand;
    }
}
