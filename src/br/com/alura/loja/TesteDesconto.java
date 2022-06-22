package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args){

        Orcamento orcamento = new Orcamento();
        orcamento.setValor(new BigDecimal(100));
        orcamento.setQuantidadeItens(6);

        Orcamento orcamento2 = new Orcamento();
        orcamento2.setValor(new BigDecimal(1000));
        orcamento2.setQuantidadeItens(5);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamento));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));
    }
}
