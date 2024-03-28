package cl.curso.springboot.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.curso.springboot.pojo.ResultadoOperacion;

@RestController
@RequestMapping(value = "/numeros")
public class NumerosController {

	@PostMapping(value = "/operaciones/{num1}/{num2}")
	public List<Long> operaciones(@PathVariable("num1") Long num1, @PathVariable("num2") Long num2) {
		List<Long> listaResultados = new ArrayList<>();

		listaResultados.add(num1 + num2);
		listaResultados.add(num1 - num2);
		listaResultados.add(num1 * num2);
		listaResultados.add(num1 / num2);
		listaResultados.add(num1 % num2);

		return listaResultados;
	}

	@PostMapping(value = "/opera/{num1}/{num2}/{op}")
	public ResultadoOperacion operacionNumericas(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2,
			@PathVariable("op") String op) {

		Integer resultado = 0;

		switch (op) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;

		}
		ResultadoOperacion operacion = new ResultadoOperacion(num1, num2, op, resultado);

		return operacion;
	}

	/*
	 * Determinar si un numero double es integer
	 */

	@PostMapping(value = "/decimaIsEntero/{num}")
	public Boolean isInteger(@PathVariable("num") Double num) {
		return (num % 1 == 0) ? true : false;
	}
	
	@PostMapping(value = "/decimaIsEnteroOther/{num}")
	public Boolean isIntegerOther(@PathVariable("num") Double num) {
		if(Math.floor(num) == Math.ceil(num)) {
			return true;
		}
		return false;
	}

}
