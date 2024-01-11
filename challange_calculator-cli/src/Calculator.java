public class Calculator {
    private Float firstNumber;
    private Operator operator;
    private Float secondNumber;
    private String operatorSymbol = "";

    public Calculator(Float firstNumber, Operator operator, Float secondNumber) {
        this.firstNumber = firstNumber;
        this.operator = operator;
        this.secondNumber = secondNumber;
    }

    public Calculator(Float firstNumber, Float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public float exec() {
        return switch (operator) {
            case PLUS -> firstNumber + secondNumber;
            case MINUS ->  firstNumber - secondNumber;
            case MULTIPLY ->  firstNumber * secondNumber;
            case DIVIDE -> {
                if (secondNumber == 0)
                    throw new ArithmeticException("Nao pode dividir um numero por 0");
                 yield firstNumber / secondNumber;
            }
        };
    }

    public Operator parseOperator(String operator) {
        operatorSymbol = operator;

        return switch (operator) {
            case "+" -> Operator.PLUS;
            case "-" -> Operator.MINUS;
            case "/" -> Operator.DIVIDE;
            case "*","x" -> Operator.MULTIPLY;
            default -> {
                operatorSymbol = "";
                 throw new RuntimeException("Operador invalido");
            }
        };
    }

    public String displayOperation() {
        return String.format("%.2f %s %.2f", firstNumber, operatorSymbol, secondNumber);
    }
    public float getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setOperator(String operator) {
        this.operator = parseOperator(operator);
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }
}
