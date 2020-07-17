package cachorro.virtual;
public class Cachorro {
    //Atributos
//------------------------------------------------------------------------------
    private float saude = 0 ;
    private String nome;
    private String raça;
    private String humor;
    private String fome;
    private String limpo;
//------------------------------------------------------------------------------
    //Métodos
//------------------------------------------------------------------------------
    
    //método Contrutor
//------------------------------------------------------------------------------
    public Cachorro(String nome, String raça) {
        this.nome = nome;
        this.raça = raça;
    }
//------------------------------------------------------------------------------
    
    //Métodos personalizados
//------------------------------------------------------------------------------
    public void Status(){
        System.out.println("---------------Estado atual---------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Raça: " + this.getRaça());
        System.out.println("Humor: " + this.getHumor());
        System.out.println("Fome: " + this.getFome());
        System.out.println("Limpo: " + this.getLimpo());
        System.out.println("Saúde: " + this.getSaude() + " Pontos");
        if(this.getSaude() <= 33.4){
            System.out.println("Seu cachorro não está bem, cuide dele!");
        } else if (this.getSaude() <= 66.7){
            System.out.println("Seu cachorro está normal.");
        }else{
            System.out.println("Seu cachorro está ótimo, parabéns");
        }
        System.out.println("------------------------------------------------");
    }
    public void DarNome(String nome){
        this.setNome(nome);
    }
    public void Humor(String humor){
        this.setHumor(humor);
        if(this.getHumor() == "Feliz"){
            this.setSaude(this.getSaude() + 33.33f);
        }
    }
    public void Fome(String fome){
        this.setFome(fome);
        if (this.getFome() == "Saciado"){
            this.setSaude(this.getSaude() + 33.33f);
        }
    }
    public void Limpo(String limpo){
        this.setLimpo(limpo);
        if(this.getLimpo() == "Limpo"){
            this.setSaude(this.getSaude() + 33.33f);
        }
    }
//------------------------------------------------------------------------------
    
    //Métodos Getters and Setters
//------------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public String getFome() {
        return fome;
    }

    public void setFome(String fome) {
        this.fome = fome;
    }

    public String getLimpo() {
        return limpo;
    }

    public void setLimpo(String limpo) {
        this.limpo = limpo;
    }
    public float getSaude(){
       return saude; 
    }
    public void setSaude(float saude){
        this.saude = saude;
    }
//------------------------------------------------------------------------------  
}
