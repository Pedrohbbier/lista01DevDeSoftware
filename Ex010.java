public class Ex010 {
    public static void execute(){
        int n1 = Prompt.lerInteiro("Escreva um número de 1 a 5: ");
        switch (n1) {
            case 1:
                Prompt.imprimir("Um");
                break;
        
            case 2:
                Prompt.imprimir("Dois");
                break;

            case 3:
                Prompt.imprimir("Três");
                break;
            
            case 4:
                Prompt.imprimir("Quatro");
                break;

            case 5:
                Prompt.imprimir("Cinco");
                break;

            default:
                Prompt.imprimir("Número inválido");
                break;
        }
    }
}
