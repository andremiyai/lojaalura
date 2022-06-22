package br.com.alura.loja.orcamento;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
}
