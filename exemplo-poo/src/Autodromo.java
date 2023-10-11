public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("878787");
        //jeep.ligar();

        Moto z700 = new Moto();
        z700.setChassi("22222");
        //z700.ligar();

        Veiculo coringa = z700;

        coringa.ligar();
    }
}
