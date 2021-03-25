package io.github.feehsousa.clientes.exception;

public class UsuarioCadastradoExcepition extends  RuntimeException{
    public UsuarioCadastradoExcepition(String login){
        super("Usuario já Cadastrado para o login "+ login);
    }
}
