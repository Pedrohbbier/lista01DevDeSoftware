public class Ex016 {
    public static void execute(){

        double n1 = Prompt.lerDecimal("Digite a nota 1:");
        double n2 = Prompt.lerDecimal("Digite a nota 2:");
        double n3 = Prompt.lerDecimal("Digite a nota 3:");

        double mediaAritmetica = (n1 + n2 + n3) / 3;

        Prompt.imprimir("Media Aritmetica: " + mediaAritmetica);



    }
}
