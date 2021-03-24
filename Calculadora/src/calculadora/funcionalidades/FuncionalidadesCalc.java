package calculadora.funcionalidades;

public class FuncionalidadesCalc {

    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int subt(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public double mult(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double div(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public double exp2(double numero1) {
        return Math.pow(numero1, 2);
    }

    public double exp3(double numero1) {
        return Math.pow(numero1, 3);
    }

}
