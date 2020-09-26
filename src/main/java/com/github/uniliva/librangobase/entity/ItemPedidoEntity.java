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
public class ItemPedidoEntity {
	private Long codigo;
	private Long codRegistroPedido;
	private Long codProduto;
}
