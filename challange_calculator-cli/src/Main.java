import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Desafio 2 - Calculadora\n");

        while (true) {
            float first = readOperand("Insira o primeiro valor ");
            float second = readOperand("INsira o segundo valor: ");

            Calculator calculator = new Calculator(first, second);

            displayOperationMenu();

            try {
                calculator.setOperator(readOperatorOption());
                System.out.println(calculator.displayOperation() + " = " + calculator.exec());
                System.out.println("\nIniciar novo calculo!");
            } catch (IllegalArgumentException e) {
                System.out.println("Fechando a aplicacao...");
                System.exit(0);
            }
        }

    }

    private static float readOperand(String message) {
        System.out.println(message);
        try {
            return sc.nextFloat();
        } catch (InputMismatchException exception) {
            System.out.println("O caracter que inseriu é invalido.\nInsira um valor valido!");
            sc.next();
        }
        return readOperand(message);
    }

    private static void displayOperationMenu() {
        System.out.println("\nEscolha a operacao que deseja realizar: \n\n");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("outro - Fechar aplicação!");
    }

    private static String readOperatorOption() {
        String option = sc.next();
        return switch (option) {
            case "1" -> "+";
            case "2" -> "-";
            case "3" -> "/";
            case "4" -> "*";
            default -> throw new IllegalArgumentException("Terminar aplicacao!");
        };
    }

}