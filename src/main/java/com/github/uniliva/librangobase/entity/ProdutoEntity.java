package com.github.uniliva.librangobase.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProdutoEntity {
	
	private Long codigo;
	private String nome;
	private String descricao;
	private BigDecimal valor;
	private Integer codCategoria;

}
