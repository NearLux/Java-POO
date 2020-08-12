
package clinicaveterinaria;

public class ClinicaVeterinaria {

    public static void main(String[] args) {
        Consulta p1 = new Consulta();
        p1.marcarConsulta("12/08/2020", "Armando Luz", "000000000-00", "Cachorro", "Pitbull");
        p1.setMedico("Dr.Lucas");
        p1.exibirConsulta();
        p1.registrarSintomas("A pata do animal está quebrada.");
        p1.exibirSintomas();
        p1.solicitarExames("Raio-X do animal.");
        p1.registrarDiagnostico("O animal está com a pata quebrada, deverá permanecer em repouso até seu total recuperamento.");
        p1.historicoDoTratamento();
        
        
        
        
    }
    
}
