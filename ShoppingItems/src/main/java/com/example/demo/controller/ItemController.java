package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;



@RestController
public class ItemController {
	@Autowired
	ItemService is1;
	 
	 @PostMapping("/items")
	 public Item saveItem(@RequestBody Item item) {
	 	
	 	return is1.saveItem(item);

}
	 @GetMapping("/items")
	    public List<Item> fetchItemList() {
	        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
	        return is1.fetchItemList();
	    }
	    


	    @GetMapping("/items/{id}")
	    public Item fetchItemById(@PathVariable("id") Long id)
	            {
	        return is1.fetchItemtById(id);
	    }
	    
	    @DeleteMapping("/items/{id}")
	    public String deleteItemById(@PathVariable("id") Long id) {
	        is1.deleteItemById(id);
	        return "Item deleted Successfully!!";
	    }
	    @PutMapping("/items/{id}")
	    public Item updateItem(@PathVariable("id") Long id,
	                                       @RequestBody Item item) {
	        return is1.updateItem(id,item);
	    }
}
