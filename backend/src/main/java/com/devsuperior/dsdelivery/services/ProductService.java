package com.devsuperior.dsdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdelivery.dto.ProductDTO;
import com.devsuperior.dsdelivery.endities.Product;
import com.devsuperior.dsdelivery.repositories.ProductRepository;

@Service
public class ProductService {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Autowired
	private ProductRepository repository;

	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll() {
		//List<Product> list = repository.findAll();
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
	
}
