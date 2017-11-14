package br.com.gestao.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/livros")
public class LivrosController {
	
//	@Autowired
//	private Livros livros;
	
	@RequestMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaLivros");
//		modelAndView.addObject("livros", livros.findAll());
		return modelAndView;
	}

}
