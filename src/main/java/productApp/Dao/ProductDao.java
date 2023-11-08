package productApp.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productApp.Model.Product;

@Component
public class ProductDao {
	
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//
//	@Transactional
//	public void saveOrUpdate(Product product) {
//		this.hibernateTemplate.saveOrUpdate(product);
//	}
//	
//	public Product getProduct(int id) {
//		return this.hibernateTemplate.get(Product.class,id);
//	}
//	
//	public List<Product> getAllProducts(){
//		return this.hibernateTemplate.loadAll(Product.class);
//	}
//	
//	@Transactional
//	public void delete(int id) {
//		Product product = getProduct(id);
//		this.hibernateTemplate.delete(product);
//	}
//	
//	public HibernateTemplate getHibernateTemplate() {
//		return hibernateTemplate;
//	}
//
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}
}
