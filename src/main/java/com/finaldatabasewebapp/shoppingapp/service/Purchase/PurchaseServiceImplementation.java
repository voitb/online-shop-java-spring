package com.finaldatabasewebapp.shoppingapp.service.Purchase;

import com.finaldatabasewebapp.shoppingapp.model.Purchase.Purchase;
import com.finaldatabasewebapp.shoppingapp.repository.Purchase.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseServiceImplementation implements PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public List<Purchase> addOrder(@RequestBody List<Purchase> order) {
        return purchaseRepository.saveAll(order);
    }

    @Override
    public void setCompleted(@RequestBody int id){
         purchaseRepository.findById(id).ifPresent(purchase -> {
             purchase.setStatus("completed");
             purchaseRepository.save(purchase);
         });
    }

    @Override
    public List<Purchase> getAllOrders() {
        return purchaseRepository.findAll();
    }

    @Override
    public Optional<Purchase> getOrders(int id) {
        return purchaseRepository.findById(id);
    }
}
