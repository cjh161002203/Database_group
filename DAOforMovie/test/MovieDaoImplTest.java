package test;

import java.util.ArrayList;
import java.util.Iterator;

import dao.DAOFactory;
import daoImpl.*;
import entity.*;

public class MovieDaoImplTest {

	protected static void testInsert() {
		MovieDAOImpl movieDAO = (MovieDAOImpl) DAOFactory.getMovieDAO();
		Movie movie = new Movie();
		movie.setmID(3);
		movie.setMname("3name");
		movie.setMovieLanguage("cn");
		movie.setDuration("100.59");
		movie.setArea("AS");
		movie.setReleaseTime("2020-01-01");
		movie.setOtherName("zzz/zz");
		movie.setContent("content");
		movie.setPrice(40);
		movieDAO.insert(movie);
	}
	
	protected static void testDelete() {
		MovieDAOImpl movieDAO = (MovieDAOImpl) DAOFactory.getMovieDAO();
		movieDAO.delete(3);
	}
	
	// �������ƻ�ȡmid
	protected static void testCasePart1(String movieName) {
		MovieDAOImpl movieDAO = (MovieDAOImpl) DAOFactory.getMovieDAO();
		ArrayList<Integer> mids = movieDAO.getMIDByName(movieName);
		Iterator<Integer> iter = mids.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	// ����������ʾ������ϸ��Ϣ
	protected static void testCasePart2(int mid) {
		MovieDAOImpl movieDAO = (MovieDAOImpl) DAOFactory.getMovieDAO();
		Movie movie = movieDAO.get(mid);
		WorkerDAOImpl workerDAO = (WorkerDAOImpl) DAOFactory.getWorkerDAO();
		TagDAOImpl tagDAO = (TagDAOImpl) DAOFactory.getTagDAO();
		TypeDAOImpl typeDAO = (TypeDAOImpl) DAOFactory.getTypeDAO();
		ArrayList<Worker> directors = workerDAO.getDirectorByMID(1);
		ArrayList<Worker> author = workerDAO.getAuthorByMID(1);
		ArrayList<Worker> actor = workerDAO.getActorByMID(1);
		ArrayList<Tag> tags = tagDAO.getTagByMID(mid);
		ArrayList<Type> type = typeDAO.getTypeByMID(mid);
		System.out.println("��ӰID��" + movie.getmID());
		System.out.print("���ݣ�");
		Iterator<Worker> iter = directors.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next().getName() + " ");
		}
		System.out.print("\n��磺");
		iter = author.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next().getName() + " ");
		}
		System.out.print("\n��Ա��");
		iter = actor.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next().getName() + " ");
		}
		System.out.println("\n���ԣ�" + movie.getMovieLanguage());
		System.out.println("ʱ����" + movie.getDuration());
		System.out.println("������" + movie.getArea());
		System.out.println("��ӳ���ڣ�" + movie.getReleaseTime());
		System.out.println("������" + movie.getArea());
		System.out.print("��ǩ��");
		Iterator<Tag> ti = tags.iterator();
		while(ti.hasNext()) {
			System.out.print(ti.next().getTag() + " ");
		}
		System.out.print("\n���");
		Iterator<Type> tpi = type.iterator();
		while(tpi.hasNext()) {
			System.out.print(tpi.next().getTypename() + " ");
		}
		System.out.println("\nƱ�ۣ�" + movie.getPrice());
		System.out.println("��飺" + movie.getContent());
	}

	public static void main(String[] args) {
		MovieDAOImpl movieDAO = (MovieDAOImpl) DAOFactory.getMovieDAO();
		Movie movie = movieDAO.get(1);
		System.out.println(movie.getContent());
		//testInsert();
		//testDelete();
		
		//movie.setContent("content");
		//movie.setPrice(39.99);
		//movieDAO.update(movie);
		
		testCasePart1("m1");
		testCasePart2(1);
	}

}
