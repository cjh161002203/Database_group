package test;

import dao.DAOFactory;
import dao.TagDAO;
import daoImpl.TagDAOImpl;
import entity.Tag;

public class TagDAOImplTest {
	static Tag tag = new Tag();
	static TagDAOImpl tagDAO = (TagDAOImpl) DAOFactory.getTagDAO();
	
	protected static void testInsert() {
		tag.setTag("����");
		tagDAO.insert(tag);
	}
	
	protected static void testGet() {
		System.out.println(tagDAO.get("����").getTag());
	}
	
	protected static void testDelete() {
		tagDAO.delete("����");
	}
	
	public static void main(String[] args) {
		//testInsert();
		//testGet();
		testDelete();
	}
}
