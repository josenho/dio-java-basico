public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 28.0;
        double valorSolicitado = 27.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque efetuado. Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente: " + saldo);
        }
    }
}
