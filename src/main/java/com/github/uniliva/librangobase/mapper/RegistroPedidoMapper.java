package com.github.uniliva.librangobase.mapper;

import org.springframework.stereotype.Component;

import com.github.uniliva.librangobase.dto.PedidoDTO;
import com.github.uniliva.librangobase.entity.RegistroPedidoEntity;

@Component
public class RegistroPedidoMapper {
	
	public RegistroPedidoEntity mappear(PedidoDTO pedido) {
		RegistroPedidoEntity entity = new RegistroPedidoEntity();
		entity.setCodStatus(pedido.getStatus().getCodigo());
		entity.setCodUsuario(pedido.getUsuario().getCodigo().intValue());
		entity.setDtSolicitacao(pedido.getDtSolicitacao());
		
		return entity;		
	}

}
