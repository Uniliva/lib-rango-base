package com.github.uniliva.librangobase.dto;

import javax.validation.constraints.NotNull;

import com.github.uniliva.commonsutils.dto.BaseDTO;

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
public class CategoriaDTO extends BaseDTO {
	private static final long serialVersionUID = 1L;

	private Long codigo;

	@NotNull
	private String nome;
}
