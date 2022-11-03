package com.finaldatabasewebapp.shoppingapp.service.Item;

import com.finaldatabasewebapp.shoppingapp.model.Item.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    public Item addItem(Item item);
    public List<Item> getAllItems();
    public Optional<Item> getItem(int id);
}
