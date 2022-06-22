package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Pedido {

    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }
}
