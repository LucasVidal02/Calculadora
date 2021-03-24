package calculadora.menuprincipal;

import java.util.Scanner;
import calculadora.funcionalidades.FuncionalidadesCalc;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        FuncionalidadesCalc funcionalidades = new FuncionalidadesCalc();
        int op;
        double num1, num2;
        int num3, num4;

        do {
            menuOpcoes();
            System.out.println("Digite a opção: ");
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Digite o 1 número: ");
                    num3 = in.nextInt();
                    System.out.println("Digite o 2 número: ");
                    num4 = in.nextInt();
                    System.out.println("O resultado da sua soma foi: " + funcionalidades.soma(num3, num4));
                    break;

                case 2:
                    System.out.println("Digite o 1 número: ");
                    num3 = in.nextInt();
                    System.out.println("Digite o 2 número: ");
                    num4 = in.nextInt();
                    System.out.println("O resultado da sua subtração foi: " + funcionalidades.subt(num3, num4));
                    break;

                case 3:
                    System.out.println("Digite o 1 número: ");
                    num1 = in.nextDouble();
                    System.out.println("Digite o 2 número: ");
                    num2 = in.nextDouble();
                    System.out.println("O resultado da sua multiplicação foi: " + funcionalidades.mult(num1, num2));
                    break;

                case 4:
                    System.out.println("Digite o 1 número: ");
                    num1 = in.nextDouble();
                    System.out.println("Digite o 2 número: ");
                    num2 = in.nextDouble();
                    System.out.println("O resultado da sua divisão foi: " + funcionalidades.div(num1, num2));

                    break;

                case 5:
                    System.out.println("Digite o 1 número: ");
                    num1 = in.nextDouble();
                    System.out.println("O resultado da sua multiplicação foi: " + funcionalidades.exp2(num1));

                    break;

                case 6:
                    System.out.println("Digite o 1 número: ");
                    num1 = in.nextDouble();
                    System.out.println("O resultado da sua multiplicação foi: " + funcionalidades.exp3(num1));

                    break;
                case 0:
                    System.out.println("Fim do Calculadora!");
                    break;

                default:
                    System.out.println("Opção Inválida. Digite Novamente!");
            }
        } while (op != 0);
    }

    public static void menuOpcoes() {
        System.out.println("1 - Adicionar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Elevar a quadrado.");
        System.out.println("6 - Elevar a cubo.");
        System.out.println("0 - Sair do programa.");
    }

}
    

