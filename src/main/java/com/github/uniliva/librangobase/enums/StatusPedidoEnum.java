package com.github.uniliva.librangobase.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusPedidoEnum {

	SOLICITADO(0, "Pedido solicitado"), PENDENTE(1, "Pedido pendente"), EM_PREPARACAO(2, "Pedido em preparação"),
	ENCAMINHADO(3, "Pedido encaminhado"), ENTREGUE(4, "Pedido entregue"), RECUSADO(5, "Pedido recusado");

	@JsonValue
	private Integer codigo;
	private String descricao;
	
	public static StatusPedidoEnum parse(final Integer codigo) {
		return Arrays.stream(values()).filter(e -> e.codigo.equals(codigo)).findFirst().orElse(null);
	}
}
