
package clinicaveterinaria;

public class SessaoDeTratamento{
    //Variáveis de instância...
    private String Sintomas;
    protected String Exames;
    protected String medico;
    
    //Métodos personalizados...
    public void sessao(String sintomas, String exames){
        Sintomas = sintomas;
        Exames = exames;
    }
    
    public void exibirSintomas(){
        System.out.println("----------------------------------------------------");
        System.out.println("Sintomas: " + Sintomas);
    }
    
    public void encerrarSessao(){
        Sintomas = "";
        System.out.println("----------------------------------------------------");
        System.out.println("Sua sessão foi encerrada.");
    }
    
    public void solicitarExames(String exames){
        Exames = exames;
    }
    
    public void historicoDoTratamento(){
        System.out.println("Medico: " + medico);
        System.out.println("Exames solicitados: " + Exames);
        System.out.println("Sintomas: " + Sintomas);
    }
    
    public void atualizarHistoricoDaConsulta(String exames, String sintomas){
        Exames += exames;
        Sintomas += sintomas;
    }

    //Getters and Setters...
    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
    
}
