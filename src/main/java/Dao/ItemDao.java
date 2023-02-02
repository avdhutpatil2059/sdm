package Dao;

import java.util.List;

import items.Items;


public interface ItemDao {
	void add(Items item);
	List<Items> selectAll(int id);

}
