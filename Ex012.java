public class Ex012 {
    public static void execute(){
        int nMonth = Prompt.lerInteiro("Digite o número do mês: ");

        switch (nMonth) {
            case 1:
                Prompt.imprimir("Janeiro");
                break;
            case 2:
                Prompt.imprimir("Fevereiro");
                break;
            case 3:
                Prompt.imprimir("Março");
                break;
            case 4:
                Prompt.imprimir("Abril");
                break;
            case 5:
                Prompt.imprimir("Maio");
                break;
            case 6:
                Prompt.imprimir("Junho");
                break;
            case 7:
                Prompt.imprimir("Julho");
                break;
            case 8:
                Prompt.imprimir("Agosto");
                break;
            case 9:
                Prompt.imprimir("Setembro");
                break;
            case 10:
                Prompt.imprimir("Outubro");
                break;
            case 11:
                Prompt.imprimir("Novembro");
                break;
            case 12:
                Prompt.imprimir("Dezembro");
                break;
            default:
                Prompt.imprimir("Número inválido");
                break;
        }
    }
}
