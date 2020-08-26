package com.github.uniliva.librangobase.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SexoEnum {

	NAO_DEFINIDO(0, "Não definido"), FEMININO(1, "Feminino"), MASCULINO(2, "Masculino");

	@JsonValue
	private Integer codigo;
	private String nome;

}
