package com.github.uniliva.librangobase.entity;

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
public class UsuarioEntity{

	private Long codigo;
	private String nome;
	private String email;
	private String telefone;
	private Integer sexo;

}
