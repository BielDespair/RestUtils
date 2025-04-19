package com.leonel.RestUtils.handler;

public class FieldRequiredException extends BusinessException {
    public FieldRequiredException(String field) {
        super("O campo %s é obrigatório", field);

    }
}
