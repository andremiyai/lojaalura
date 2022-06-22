package br.com.alura.loja.orcamento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemOrcamento implements Orcavel{

    private BigDecimal valor;
}
