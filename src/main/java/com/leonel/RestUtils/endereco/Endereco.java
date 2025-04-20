package com.leonel.RestUtils.endereco;


import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name = "enderecos")
@Entity
@EqualsAndHashCode(of = "cep")
public class Endereco {
    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + '}' +
                ", logradouro=" + logradouro + '}' +
                ", complemento=" + complemento + '}' +
                ", uf=" + uf + '}' +
                ", bairro=" + bairro + '}' +
                ", localidade=" + localidade + '}'+
                ", unidade=" + unidade + '}' +
                ", regiao=" + regiao + '}';
    }
}
