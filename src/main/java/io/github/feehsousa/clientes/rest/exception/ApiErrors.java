package io.github.feehsousa.clientes.rest.exception;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class ApiErrors {
    @Getter
    //Lista de erros

    private List<String> errors;

    //Lista para tratamento de erros
    public ApiErrors(List<String> errors){
        this.errors = errors;
    }
    //Lista para tratamento de mensagens dinâmicas
    public ApiErrors (String message){
        this.errors = Arrays.asList(message);
    }
}
