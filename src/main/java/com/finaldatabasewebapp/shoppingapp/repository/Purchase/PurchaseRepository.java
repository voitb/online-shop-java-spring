package com.finaldatabasewebapp.shoppingapp.repository.Purchase;

import com.finaldatabasewebapp.shoppingapp.model.Purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
}
