package test;

import dao.DAOFactory;
import daoImpl.TypeDAOImpl;
import entity.Type;

public class TypeDAOImplTest {
	static Type type = new Type();
	static TypeDAOImpl typeDAO = (TypeDAOImpl) DAOFactory.getTypeDAO();
	
	protected static void testInsert() {
		type.setTypename("���");
		typeDAO.insert(type);
	}
	
	protected static void testGet() {
		System.out.println(typeDAO.get("���").getTypename());
	}
	
	protected static void testDelete() {
		typeDAO.delete("���");
	}
	
	public static void main(String[] args) {
		// testInsert();
		// testGet();
		testDelete();
	}
}
