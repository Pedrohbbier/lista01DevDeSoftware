public class Ex006 {
    public static void execute(){
        double tempCel = Prompt.lerDecimal("Digite uma temperatura em gráus célsius: ");
        double tempF = (tempCel * 9 / 5) + 32;
        Prompt.imprimir("Convertido para graus Fahrenheit: " + tempF);
    }
}
