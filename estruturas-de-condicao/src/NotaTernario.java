public class NotaTernario {
    public static void main(String[] args) {
        int nota = 0;
        String resultado = nota >= 7 ? "Aprovado" : nota == 0 ? "Expulso" : nota >=5 && nota < 7 ? "Recuperação" :  "Reprovado";

        System.out.println(resultado);
    }
}
