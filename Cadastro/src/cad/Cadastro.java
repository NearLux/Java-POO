
package cad;

class cadastro{
    public String nome;
    public int idade;
    public String DataDeNascimento;
    public float altura;
    public String rg;
    public String cpf;
    
    public void adicionarPessoa(String Nome, int Idade, String Nascimento, float Altura, String RG, String CPF ){
        nome = Nome;
        idade = Idade;
        DataDeNascimento = Nascimento;
        altura = Altura;
        rg = RG;
        cpf = CPF;
        
    }
    
    public void atualizarCadastro(String Nome, int Idade, String Nascimento, float Altura, String RG, String CPF ){
        nome = Nome;
        idade = Idade;
        DataDeNascimento = Nascimento;
        altura = Altura;
        rg = RG;
        cpf = CPF;
    }
    
    public void perfil(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Data de nascimento: " + DataDeNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("----------------------------------------------------");
    }
}