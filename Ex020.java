public class Ex020 {
    public static void execute() {
        double tempo = Prompt.lerDecimal("Digite o tempo gasto na viagem em horas: ");

        double vm = Prompt.lerDecimal("Digite a velocidade média em km/h: ");

        double distancia = tempo * vm;

        double combustivelGasto = distancia / 12;

        Prompt.imprimir("A quantidade de combustível gasto na viagem é: " + combustivelGasto + "litros");

    }
}
