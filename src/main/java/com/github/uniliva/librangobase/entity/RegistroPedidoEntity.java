package com.github.uniliva.librangobase.entity;

import java.time.LocalDateTime;

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
public class RegistroPedidoEntity{
	private Long codigo;
	private Integer codStatus;
	private Integer codUsuario;
	private LocalDateTime dtSolicitacao;

}
