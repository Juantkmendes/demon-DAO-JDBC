package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDAO;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDao = DaoFactory.createSellerDAO();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		

	}

}
