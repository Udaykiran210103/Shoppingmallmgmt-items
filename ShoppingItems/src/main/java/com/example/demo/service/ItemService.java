package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Item;

public interface ItemService {

	Item saveItem(Item item);

public	List<Item> fetchItemList();

public Item fetchItemtById(Long id);

public	void deleteItemById(Long id);

public Item updateItem(Long id, Item item);

}
