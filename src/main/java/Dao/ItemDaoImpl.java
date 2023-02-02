package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import conn.Myconn;
import items.Items;

public class ItemDaoImpl implements ItemDao {
	private Myconn myconn;

	public ItemDaoImpl() {
	  myconn = new Myconn();
	}
	
  
	  

@Override
public void add(Items item) {
	 try {
		   Connection con = myconn.getConn();
		   PreparedStatement s = con.prepareStatement("insert into item(iname,price) values(?,?)");
		   s.setString(1, item.getiName());
		   s.setFloat(2, item.getPrice());
		   int i = s.executeUpdate();
			s.close();
			con.close();
		   }catch (ClassNotFoundException |SQLException e) {
			   e.printStackTrace();
		}
	   }


@Override
public List<Items> selectAll(int id) {
	// TODO Auto-generated method stub
	return null;
}
}
