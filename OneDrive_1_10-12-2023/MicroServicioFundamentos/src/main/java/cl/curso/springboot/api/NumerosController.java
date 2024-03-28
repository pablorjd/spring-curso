package cl.curso.springboot.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.curso.springboot.pojo.ResultadoOperacion;

@RestController
@RequestMapping("/numeros")
public class NumerosController {

	@PostMapping(value = "/oper/{n1}/{n2}")
	public List<Long> operacionesAritmeticas(@PathVariable("n1") Long num1, @PathVariable("n2") Long num2){
		List<Long> listaResultados = new ArrayList<>();
		
		listaResultados.add(num1 + num2);
		listaResultados.add(num1 - num2);
		listaResultados.add(num1 * num2);
		listaResultados.add(num1 / num2);
		
		return listaResultados;
	}
	
	@PostMapping("/opera/{n1}/{n2}/{op}")
	public ResultadoOperacion operacionNuemrica(@PathVariable("n1") Integer num1, @PathVariable("n2") Integer num2, @PathVariable("op") String opera) {
		Integer res = 0;
		
		if(opera.equalsIgnoreCase("+")) {
			res = num1 + num2;
		}
		if(opera.equalsIgnoreCase("-")) {
			res = num1 - num2;
		}
		if(opera.equalsIgnoreCase("*")) {
			res = num1 * num2;
		}
		if(opera.equalsIgnoreCase("/")) {
			res = num1 / num2;
		}
		
		ResultadoOperacion ro	=	new ResultadoOperacion(num1, num2, opera, res);
		return ro;
	}
}
