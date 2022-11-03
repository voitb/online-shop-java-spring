package com.finaldatabasewebapp.shoppingapp.repository.Item;

import com.finaldatabasewebapp.shoppingapp.model.Item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
