package clinicaveterinaria;
public class Consulta extends SessaoDeTratamento {
    //Variáveis de instância...
    private String dataDaConsulta;
    private String nomeDoCliente;
    private String CPF;
    private String Animal;
    private String Raca;
    
    //Métodos personalizados...
    public void marcarConsulta(String data, String nome, String cpf, String animal, String raca){
        dataDaConsulta = data;
        nomeDoCliente = nome;
        CPF = cpf;
        Animal = animal;
        Raca = raca;
        
        System.out.println("----------------------------------------------------");
        System.out.println("A consulta está marcada para " + dataDaConsulta);
    }
    
    public void renovarCadastro(String nome, String cpf, String animal, String raca){
        nomeDoCliente = nome;
        CPF = cpf;
        Animal = animal;
        Raca = raca;
        
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
    
    public void exibirConsulta(){
        System.out.println("----------------------------------------------------");
        System.out.println("Consulta");
        System.out.println("");
        System.out.println("Nome: " + nomeDoCliente);
        System.out.println("Animal: " + Animal);
        System.out.println("Exames requeridos: " + Exames);
        System.out.println("Medico: " + medico);
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
