public class Pessoa {

    private int idade;
    private double altura;
    private double peso;
    private String nome;
    private String sexo;
    private String corOlhos;
    private String corCabelos;


    public Pessoa(){

    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(int idade, double altura, double peso, String nome, String sexo, String corOlhos,
                  String corCabelos) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        this.sexo = sexo;
        this.corOlhos = corOlhos;
        this.corCabelos = corCabelos;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public String getCorCabelos() {
        return corCabelos;
    }

}