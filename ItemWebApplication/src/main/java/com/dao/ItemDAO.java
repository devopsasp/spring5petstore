package com.dao;

import org.springframework.stereotype.Component;
import com.model.*;
import java.util.List;
@Component
public interface ItemDAO {
	public void addItem(Item item);
    public Item findItem(int id);
    public List<Item> findAllItem();
    public boolean updateItem(Item item);
    public boolean deleteItem(Item item);
}
