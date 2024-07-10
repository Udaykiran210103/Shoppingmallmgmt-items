package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
@Autowired
ItemRepository ir;

@Override
public Item saveItem(Item item) {
	// TODO Auto-generated method stub
	return ir.save(item);
	}

@Override
public List<Item> fetchItemList() {
	// TODO Auto-generated method stub
	return ir.findAll();
}

@Override
public Item fetchItemtById(Long id) {
	// TODO Auto-generated method stub
	return ir.findById(id).get();
}

@Override
public void deleteItemById(Long id) {
	// TODO Auto-generated method stub
	ir.deleteById(id);
	
}

@Override
public Item updateItem(Long id, Item item) {
	// TODO Auto-generated method 

	 Item DB = ir.findById(id).get();

     if(Objects.nonNull(item.getName()) &&
     !"".equalsIgnoreCase(item.getName())) {
         DB.setName(item.getName());
     }

     if(Objects.nonNull(item.getprice())) {
         DB.setprice(item.getprice());
     }

     

	return ir.save(DB);
}






}

