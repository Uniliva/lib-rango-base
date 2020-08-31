package com.github.uniliva.librangobase.dto;

import javax.validation.constraints.NotNull;

import com.github.uniliva.commonsutils.dto.BaseDTO;
import com.github.uniliva.librangobase.enums.SexoEnum;

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
public class UsuarioDTO extends BaseDTO {
	private static final long serialVersionUID = 1L;

	private Long codigo;

	@NotNull
	private String nome;

	@NotNull
	private String email;

	@NotNull
	private String telefone;

	@NotNull
	private SexoEnum sexo;

}
