package com.leonel.RestUtils.handler;

public class CepNaoExisteException extends BusinessException {
    public CepNaoExisteException(String field) {
        super("O cep %s não existe.", field);

    }
}
