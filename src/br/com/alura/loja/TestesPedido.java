package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.LogDePedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedido {

    public static void main (String[] args){

        String cliente = "Ana da Silva";
        BigDecimal valorOrcamento = new BigDecimal(745.99);
        int quantidadeItens = 3;

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList( new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido(), new LogDePedido()));
        handler.executa(gerador);


    }

}
