package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args){

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal(200)));

        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal(1000)));

        Orcamento orcamento3 = new Orcamento();
        orcamento3.adicionarItem(new ItemOrcamento(new BigDecimal(500)));

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamento));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));
        System.out.println(calculadoraDeDescontos.calcular(orcamento3));
    }
}
