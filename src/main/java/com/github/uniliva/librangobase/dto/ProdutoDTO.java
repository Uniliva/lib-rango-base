package com.github.uniliva.librangobase.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.github.uniliva.commonsutils.dto.BaseDto;

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
public class ProdutoDTO extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long codigo;

	@NotNull
	private String nome;

	@NotNull
	private String descricao;

	@NotNull
	private CategoriaDTO categoria;

	@NotNull
	private BigDecimal valor;

}
