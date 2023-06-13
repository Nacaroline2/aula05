package app;

import java.util.Scanner;

import model.Endereco;
import model.Pessoa;
import model.Usuario;


public class App {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome, cpf, rua, cidade, email, senha, login, senha2;
        int idade, numero;
       // char genero;

    
    System.out.println("***Tela de cadastro***");
    System.out.println("Informe o seu nome: ");
    nome = leia.nextLine();
    System.out.println("Informe seu CPF: ");
    cpf = leia.nextLine();
    System.out.println("Informe a sua idade: ");
    idade = leia.nextInt();

    Pessoa p = new Pessoa(nome, cpf, idade, cpf);    

    System.out.println("***Agora será solicitado seu dados residênciais***");
    System.out.println("Informe o nome da sua rua: ");
    leia.nextLine();
    rua = leia.nextLine();
    System.out.println("Informe o número da sua casa: ");
    numero = leia.nextInt();
    leia.nextLine();
    System.out.println("Informe a sua cidade: ");
    cidade = leia.nextLine();

    Endereco e = new Endereco(rua, numero, cidade, cidade);

    System.out.println("***Criação de usuário***");
    System.out.println("Informe um e-mail válido:");
    email = leia.nextLine();
    System.out.println("Informe uma senha: ");
    senha = leia.nextLine();

    Usuario u = new Usuario(email, senha, p);

    System.out.println("### Bem vindo a tela de login ###");
    System.out.println("Informe o seu email cadastrado: ");
    login = leia.nextLine();
    System.out.println("Informe a sua senha cadastrada: ");
    senha2 = leia.nextLine();

    if (u.autenticar(email, senha2)) {
        System.out.println("Login efetuado com sucesso!!");
    } else {
        System.out.println("Email ou senha inválido!!!");
        
    }

    }
    
}
