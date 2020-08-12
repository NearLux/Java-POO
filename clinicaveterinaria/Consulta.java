package clinicaveterinaria;
public class Consulta extends SessaoDeTratamento {
    //Variáveis de instância...
    private String dataDaConsulta;
    private String nomeDoCliente;
    private String CPF;
    private String Animal;
    private String Raca;
    
    //Métodos personalizados...
    //Consulta...
    public void marcarConsulta(String data, String nome, String cpf, String animal, String raca){
        this.dataDaConsulta = data;
        this.nomeDoCliente = nome;
        this.CPF = cpf;
        this.Animal = animal;
        this.Raca = raca;
        
        System.out.println("----------------------------------------------------");
        System.out.println("A consulta está marcada para " + dataDaConsulta);
    }
    public void exibirConsulta(){
        System.out.println("----------------------------------------------------");
        System.out.println("Consulta");
        System.out.println("");
        System.out.println("Nome: " + nomeDoCliente);
        System.out.println("Animal: " + Animal);
        System.out.println("Exames requeridos: " + Exames);
        System.out.println("Medico: " + medico);
    }
    //Cadastro...
    public void cadastrarCliente(String nome, String cpf, String animal, String raca){
        this.nomeDoCliente = nome;
        this.CPF = cpf;
        this.Animal = animal;
        this.Raca = raca;
        
        System.out.println("----------------------------------------------------");
        System.out.println("Cadastro realizado com sucesso!");
    }
    
    public void renovarCadastro(String nome, String cpf, String animal, String raca){
        this.nomeDoCliente = nome;
        this.CPF = cpf;
        this.Animal = animal;
        this.Raca = raca;
        
        System.out.println("----------------------------------------------------");
        System.out.println("Cadastro renovado com sucesso!");
    }
    
    public void exibirCadastro(){
        System.out.println("----------------------------------------------------");
        System.out.println("Cadastro");
        System.out.println("");
        System.out.println("Nome: " + nomeDoCliente);
        System.out.println("CPF: " + CPF);
        System.out.println("Animal: " + Animal);
        System.out.println("Raça: " + Raca);
    }
    
    //Histótico...
    public void historicoDoTratamento(){
        System.out.println("----------------------------------------------------");
        System.out.println("Histórico");
        System.out.println("Medico: " + medico);
        System.out.println("Exames solicitados: " + Exames);
        System.out.println("Sintomas: " + Sintomas);
        System.out.println("Diagnóstico: " + Diagnostico);
    }
    
    public void atualizarHistorico(String nome, String animal, String raca,String exames, String sintomas){
        this.nomeDoCliente = nome;
        this.Animal = animal;
        this.Raca = raca;
        this.Exames += exames;
        this.Sintomas += sintomas;
    }

    //Getters and Setters...
    public String getDataDaConsulta() {
        System.out.println("----------------------------------------------------");
        System.out.println("A consulta está marcada para " + dataDaConsulta);
        return dataDaConsulta;
    }

    public void setDataDaConsulta(String dataDaConsulta) {
        this.dataDaConsulta = dataDaConsulta;
    }
    
}
