public class RH {

    public static String formula = "2 * horasExtras * salarioBase / 220 + salarioBase";

    public static double calcularSalario(double horasExtras, double salarioBase) {
        String expressao;
        expressao = formula.replace("horasExtras", Double.toString(horasExtras));
        expressao = expressao.replace("salarioBase", Double.toString(salarioBase));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

