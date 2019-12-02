/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetarefas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gleidson
 */
public class ListaDeTarefas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Usuario> Usuarios = new ArrayList();
        ArrayList<Tarefa> Tarefas = new ArrayList();

        for (int i = 0; i < 1; i++) {

            System.out.println("");
            System.out.println("===Primeiro Menu===");
            System.out.println("[1] - Digite 1 para login");
            System.out.println("[2] - Digite 2 para Cadastro");
            System.out.println("[3] - Sair do programa");
            System.out.print("Menu: ");
            int Menu = teclado.nextInt();
            teclado.nextLine();

            if (Menu == 1) {
                if (Menu == 2) {
                    System.out.println("");
                    System.out.println("===Cadastro de usuario===");
                }
                if (Menu == 3) {
                    System.out.println("programa encerrado");
                }
                boolean x = true;
                while (x == true) {
                    System.out.print("Digite seu email ");
                    String email = teclado.nextLine();
                    System.out.print("Digite sua senha ");
                    String senha = teclado.nextLine();

                    Usuario U = new Usuario();
                    
                    if (email.equals(U.getEmail()) == true) {
                        System.out.println("");
                        System.out.println("Email e senha confere");
                        x = false;

                        if (true) {
                            Tarefa T = new Tarefa();
                            System.out.println("");
                            System.out.println("===Segundo Menu===");
                            System.out.println("Tarefas concluida?");
                        }
                    } else {

                        System.out.println("");
                        System.out.println("Email ou senha não confere");
                        System.out.println("");

                        
                        U.setEmail(email);
                        U.setSenha(senha);
                        Usuarios.add(U);

                    }

                }
            }

        }

    }
}
