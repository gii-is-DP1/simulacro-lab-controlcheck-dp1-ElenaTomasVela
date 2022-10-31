package org.springframework.samples.petclinic.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping("/product/create")
	public ModelAndView productForm() {
		ModelAndView result = new ModelAndView("products/createOrUpdateProductForm");
		Product product = new Product();
		result.addObject("product", product);
		return result;
	}

	@Transactional
	@PostMapping("/product/create")
	public ModelAndView saveProduct(@Valid Product product, BindingResult br) {
		ModelAndView result;
		if (br.hasErrors()) {
			result = new ModelAndView("products/createOrUpdateProductForm");
		} else {
			result = new ModelAndView("welcome");
			service.save(product);
			result.addObject("message", "Añadido con exito");
		}


		return result;
	}
}
