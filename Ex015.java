public class Ex015 {
    public static void execute(){
        Prompt.imprimir("Insira as cordenadas de p1:");
        double x1 = Prompt.lerDecimal("x1 = ");
        double y1 = Prompt.lerDecimal("y1 = ");

        Prompt.imprimir("Insira as cordenadas de p2:");
        double x2 = Prompt.lerDecimal("x2 = ");
        double y2 = Prompt.lerDecimal("y2 = ");

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        Prompt.imprimir("Distância = " + distancia);
    }
}
