package com.github.g8sman.app;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.g8sman.app.domain.model.ItemType;
import com.github.g8sman.app.domain.model.StockItem;

@Repository
public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}
