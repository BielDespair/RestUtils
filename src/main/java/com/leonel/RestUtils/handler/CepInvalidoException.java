package com.leonel.RestUtils.handler;

public class CepInvalidoException extends BusinessException {
  public CepInvalidoException(String field) {
    super("O cep %s não é válido.", field);
  }
}
