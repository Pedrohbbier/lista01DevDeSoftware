public class Ex019 {
    public static void execute(){
        double raio= Prompt.lerDecimal("Digite o raio do cilindro: ");
        double altura = Prompt.lerDecimal("Digite a altura do cilindro: ");

        double volume = 3.14 * (raio * raio) * altura;

        Prompt.imprimir("O volume do cilindro é: " + volume);
    }
}
