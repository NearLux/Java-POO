
package banco;
public class Conta {
    //Atributos
    public String nome;
    public float saldo;
    public boolean status;
    public int numero;
    public String tipo;
    
    //Métodos
    
    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Número da conta: " + this.getNumero());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (this.getTipo() == "CC"){
            this.setSaldo(50);
            System.out.println("Conta criada com sucesso.");
        } else if (this.getTipo() == "CP") {
            this.setSaldo(150);
            System.out.println("Conta criada com sucesso.");
        } else {
            System.out.println("Não foi possível criar a conta.");
        }
    }
    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Não foi possível fechar a conta pois ainda ela ainda está com saldo.");
        } else if (getSaldo() < 0){
            System.out.println(" Não foi possível fechar a conta pois você está com débito no banco.");
        } else {
            this.setStatus(false);
        }
    }
    public void depositar(float v){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getNome());
        }
    }
    public void sacar(float v){
        if(this.getStatus() == true){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque feito com sucesso.");
            }else{
                System.out.println("Não foi possível fazer o saque pois não há saldo suficiente.");
            }
        }else{
            System.out.println("Não é possível sacar em uma conta fechada.");
        }
    }
    public void pagarTaxa(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 20;
        }else if(this.getTipo() == "CP"){
            v = 10;
        }
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Taxa paga com sucesso.");
        } else {
            System.out.println("Não é possível pagar a taxa pois a conta está fechada.");
        }
    }
//--------------------------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
