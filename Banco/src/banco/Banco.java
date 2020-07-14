package banco;
public class Banco {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.abrirConta("CC");
        p1.setNome("Near");
        p1.setNumero(1010);
        
        Conta p2 = new Conta();
        p2.setNumero(1011);
        p2.setNome("Lux");
        p2.abrirConta("CP");
        
        p1.depositar(200);
        p2.depositar(600);
        p2.sacar(1000);
        
        p1.sacar(250);
        p1.fecharConta();
       
        p1.estadoAtual();
        p2.estadoAtual();
     }
    
}
