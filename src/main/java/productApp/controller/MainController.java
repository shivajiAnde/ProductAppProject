package productApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productApp.Dao.ProductDao;
import productApp.Model.Product;

@Controller
public class MainController {
	
//	@Autowired
//	private ProductDao productDao;
//	
	@RequestMapping("/")
	public String home(Model model) {
//		List<Product> products=productDao.getAllProducts();
//		model.addAttribute("products",products);
		return "index";
	}
	
	@RequestMapping("/add_product")
	public String addProductForm() {
		return "add_product_form";
	}
	
	@RequestMapping(path = "/handler_product",method = RequestMethod.POST)
	public RedirectView addProduct(@ModelAttribute Product product,HttpServletRequest req) {
		
		RedirectView redirectView = new RedirectView();
//		productDao.saveOrUpdate(product);
		redirectView.setUrl(req.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int id,HttpServletRequest req) {
//		productDao.delete(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(req.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int id) {
//		Product product=productDao.getProduct(id);
//		model.addAttribute("product",product);
		return "update_form";
	}
}
