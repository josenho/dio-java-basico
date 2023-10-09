public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;

        if(nota >= 7){
            System.out.println("APROVADO");
        } else if(nota >= 4 && nota <= 6){
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
