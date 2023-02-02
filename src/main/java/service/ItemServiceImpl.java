package service;

import java.util.List;

import Dao.ItemDao;
import Dao.ItemDaoImpl;
import items.Items;


public class ItemServiceImpl implements ItemService{

	   private ItemDao itemDao;

		public void ItemServiceImpl() {
			itemDao = new ItemDaoImpl();
		}

		public void add(Items item) {
			itemDao.add(item);
		}

		public List<Items> getAll(int id) {
			return null;
		}

	 

}
