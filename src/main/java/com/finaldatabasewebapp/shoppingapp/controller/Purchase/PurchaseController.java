package com.finaldatabasewebapp.shoppingapp.controller.Purchase;

import com.finaldatabasewebapp.shoppingapp.model.Purchase.Purchase;
import com.finaldatabasewebapp.shoppingapp.service.Purchase.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
@CrossOrigin
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/add")
    public List<Purchase> addOrder(@RequestBody List<Purchase> order){
        purchaseService.addOrder(order);
        return order;
    }

    @GetMapping("/getAll")
    public List<Purchase> getAllOrders() {return purchaseService.getAllOrders();}

    @PostMapping("/setCompleted")
    public String setCompleted(@RequestBody int id){
        purchaseService.setCompleted(id);
        return "Completed";
        //Purchase purchase = pur
    }
}
