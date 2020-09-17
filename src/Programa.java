import Entidades.Aluno;

public class Programa {                 //runnable (executavel)
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro";            //Aluno é a classe de nome Aluno. -- inicializando uma variavel --> objeto --> instancia de uma classe
        aluno1.idade = 15;                //seria a mesma coisa que String nome = "";
        aluno1.sexo = "M";
        aluno1.matricula = "1921";
        aluno1.endereco = "Rua Pries, 2";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";            //aluno1 é o nome de uma variavel.
        aluno2.idade = 13;
        aluno2.sexo = "F";
        aluno2.matricula = "1910";
        aluno2.endereco = "Rua Carlos, 5";



        aluno1.mostraDadosNaTela();
        aluno2.mostraDadosNaTela();

        //System.out.println("Nome do Aluno1: " + aluno1.nome); //get (getter)
        //System.out.println("Idade do Aluno1: " + aluno1.idade);

        //System.out.println("Nome do Aluno2: " + aluno2.nome);
        //System.out.println("Idade do Aluno2: " + aluno2.idade);
    }
}