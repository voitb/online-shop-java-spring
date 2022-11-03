package com.finaldatabasewebapp.shoppingapp.service.Item;

import com.finaldatabasewebapp.shoppingapp.model.Item.Item;
import com.finaldatabasewebapp.shoppingapp.repository.Item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImplementation implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item item){
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> getItem(int id) {
        return itemRepository.findById(id);
    }
}
