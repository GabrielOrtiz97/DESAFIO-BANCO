public class Main {
    
    public static void main(String[] args) {

        Cliente gabriel = new Cliente();
        gabriel.setNome(" Gabriel ");


        Conta cc = new ContaCorrente(gabriel); 
        Conta poupanca = new ContaPoupanca(gabriel);
       
        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();
    }
}
