package com.github.uniliva.librangobase.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.github.uniliva.commonsutils.dto.BaseDto;
import com.github.uniliva.librangobase.enums.StatusPedidoEnum;

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
public class PedidoDTO extends BaseDto {
	private static final long serialVersionUID = 1L;
	private Long codigo;

	@NotEmpty
	private List<ProdutoDTO> produtos;

	@NotNull
	private StatusPedidoEnum status;

	@NotNull
	private UsuarioDTO usuario;

	@NotNull
	private LocalDateTime dtSolicitacao;

}
