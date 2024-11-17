
public class Familia {
    public static void main (String args[]) {
        // Cria conta conjunta da família
        final Conta conta = new Conta(100);
        // Cria familiares e lhes informa a conta conjunta
        Cliente pai = new Cliente("Pai ", conta);
        Cliente mae = new Cliente("Mãe ", conta);
        Cliente filho = new Cliente("Filho ", conta);

        Cliente filho2 = new Cliente("Filho 2", new Conta(200));

        // Inicia as threads
        pai.start();
        mae.start();
        filho.start();
        filho2.start();
    }
}