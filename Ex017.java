public class Ex017 {
    public static void execute(){

        double n1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double n2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double n3 = Prompt.lerDecimal("Digite a terceira nota: ");

        double peso1 = Prompt.lerDecimal("Digite o peso da primeira nota: ");
        double peso2 = Prompt.lerDecimal("Digite o peso da segunda nota: ");
        double peso3 = Prompt.lerDecimal("Digite o peso da terceira nota: ");

        double mediaPonderada = (n1 * peso1 + n2 * peso2 + n3 * peso3) / (peso1 + peso2 + peso3);

        Prompt.imprimir("Media Ponderada: " + mediaPonderada);

    }
}
