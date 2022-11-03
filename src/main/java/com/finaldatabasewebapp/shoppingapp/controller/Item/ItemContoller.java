package com.finaldatabasewebapp.shoppingapp.controller.Item;

import com.finaldatabasewebapp.shoppingapp.model.Item.Item;
import com.finaldatabasewebapp.shoppingapp.model.Purchase.Purchase;
import com.finaldatabasewebapp.shoppingapp.service.Item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemContoller {
    @Autowired
    private ItemService itemService;

    @GetMapping("/getAll")
    public List<Item> getAllItems() {return itemService.getAllItems();}


}
