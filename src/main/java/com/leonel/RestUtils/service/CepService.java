package com.leonel.RestUtils.service;

import com.leonel.RestUtils.endereco.Endereco;
import com.leonel.RestUtils.endereco.EnderecoRepository;
import com.leonel.RestUtils.handler.CepInvalidoException;
import com.leonel.RestUtils.handler.CepNaoExisteException;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    private final EnderecoRepository enderecoRepository;
    private final ViaCepService viaCepService;
    public CepService(EnderecoRepository enderecoRepository, ViaCepService viaCepService) {
        this.enderecoRepository = enderecoRepository;
        this.viaCepService = viaCepService;
    }

    public Endereco getEndereco(String cep) {
        String cepLimpo = limparCep(cep);
        if (cepLimpo.length() != 8) {throw new CepInvalidoException("O CEP deve conter 8 digitos");}

        return enderecoRepository.findById(cepLimpo).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cepLimpo);
            if (novoEndereco == null) {
                throw new CepNaoExisteException(cep);
            }
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
    }

    private String limparCep(String cep) {
        return cep.replaceAll("[^0-9]", "");
    }
}
