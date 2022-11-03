package com.finaldatabasewebapp.shoppingapp.service.Purchase;

import com.finaldatabasewebapp.shoppingapp.model.Purchase.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseService {
    public List<Purchase> addOrder(List<Purchase> order);
    public List<Purchase> getAllOrders();
    public void setCompleted(int id);
    public Optional<Purchase> getOrders(int id);
}
