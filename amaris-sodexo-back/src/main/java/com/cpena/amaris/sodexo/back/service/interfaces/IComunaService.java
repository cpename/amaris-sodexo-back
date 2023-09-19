package com.cpena.amaris.sodexo.back.service.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.cpena.amaris.sodexo.back.config.FeignClientConfiguration;
import com.cpena.amaris.sodexo.back.service.dtos.ComunaDto;

@FeignClient(name = "${spring.external.server.mock.name}", url = "${spring.external.server.mock.base-url}",
	configuration = FeignClientConfiguration.class )
public interface IComunaService {
	
		@GetMapping( value = "/comunas" , consumes = MediaType.APPLICATION_JSON_VALUE)
		List<ComunaDto> getComunas();
		
		@GetMapping( value = "/comunas/{code}", produces = MediaType.APPLICATION_JSON_VALUE )
		ComunaDto getComunaByCode( String id);
}
