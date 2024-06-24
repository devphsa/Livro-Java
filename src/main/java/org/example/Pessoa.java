package org.example;
public class Pessoa {

  String nome;
  Integer idade;
    //Pessoa é um construtor, pois recebe o mesmo nome da classe, não retorna valor nenhum e o seu principal objetivo é inicializar um objeto.
    //Aqui ele está sendo utilizado para inicializar o objeto Pessoa
    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    //exibirInfo é um método, pois executa uma tarefa e retorna valor.
    public void exibirInfo(){
        System.out.println("Nome: " + nome + "  Idade: " + idade);
    }

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Pedro", 18);
        Pessoa pessoa2 = new Pessoa("Manuela", 7);
        Pessoa pessoa3 = new Pessoa("Robson", 42);
        Pessoa pessoa4 = new Pessoa("Vanessa", 40);

        pessoa1.exibirInfo();
        pessoa2.exibirInfo();
        pessoa3.exibirInfo();
        pessoa4.exibirInfo();

    }
  
}
