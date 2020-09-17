package Entidades;

public class Aluno {      //classe
    public String nome;   //atributo
    public int idade;     //atributo
    public String sexo;      //atributo
    public String matricula;     //atributo
    public String endereco;     //atributo

    public void mostraDadosNaTela(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Matricula: " + matricula);
        System.out.println("Endereco: " + endereco);
    }
}
