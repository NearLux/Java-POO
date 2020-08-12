
package clinicaveterinaria;

public class SessaoDeTratamento{
    //Variáveis de instância...
    protected String Sintomas;
    protected String Exames;
    protected String medico;
    protected String Diagnostico;
    
    //Métodos personalizados...
    //Sintomas...
    public void registrarSintomas(String sintomas){
        this.Sintomas = sintomas;
    }
    
    public void exibirSintomas(){
        System.out.println("----------------------------------------------------");
        System.out.println("Sintomas: " + Sintomas);
    }
    //Diagnostico...
    public void registrarDiagnostico(String diagnostico){
        this.Diagnostico = diagnostico;
    }
    //Exames...
    public void solicitarExames(String exames){
        this.Exames = exames;
    }
    
    //Getters and Setters...
    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
    
}
