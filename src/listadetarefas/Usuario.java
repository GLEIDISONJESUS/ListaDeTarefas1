/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetarefas;

/**
 *
 * @author Gleidson
 */
public class Usuario {
    String email;
    String senha;

    public String getEmail() {
        String email = "g@mail.com";
        return email;
    }

    public void setEmail(String email) {        
        this.email = email;
    }

    public String getSenha() {
        String senha = "123";
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
