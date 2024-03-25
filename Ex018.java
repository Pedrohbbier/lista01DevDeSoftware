public class Ex018 {
    public static void execute(){
        double n1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double n2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double n3 = Prompt.lerDecimal("Digite a terceira nota: ");

        double mediaHarmonica = 3 / ((1 / n1) + (1 / n2) + (1 / n3));

        Prompt.imprimir("Media Harmonica: " + mediaHarmonica);
    }
}
