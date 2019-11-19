package test; 

import dao.DAOFactory;




import dao.commentDAO;
import daoImpl.commentDAOImpl;
import entity.comment;


import java.util.ArrayList;

public class CommentDAOImplTest {

    commentDAO commDAO=DAOFactory.getCommentDAO();

    public void testInsertComment() throws Exception {
    //����һ�����۵�ͬʱ�����Բ�������-��Ӱ��Ӧ�Ĺ�ϵ��
    	comment comm1=new comment(1107,"2019-11-12","�ǳ��õ�һ����Ӱ","phone",200,9.3,"����");
        boolean b=commDAO.insertComment(comm1);
        boolean b1=commDAO.insertBe_Comment(comm1, 189981);
    }

    /**
    *
    * Method: updateComment(comment comm)
    *
    */
    public void testUpdateComment() throws Exception {
    //TODO: Test goes here...
        boolean b=commDAO.updateComment(new comment(1108,"2019-10-2","��˵�����ݵúܰ�","computer",301,8.9,"û����"));
     
    }

    /**
    *
    * Method: deleteComment(int cid)
    *
    */
    public void testDeleteComment() throws Exception {
        boolean b=commDAO.deleteComment(102);
        
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getComment(int cid)
    *
    */
    public void testGetComment() throws Exception {
    //TODO: Test goes here...
        comment comm=commDAO.getComment(102);
        System.out.println("cid:"+comm.getCid());
        System.out.println("c_time:"+comm.getC_time());
        System.out.println("c_content:"+comm.getC_content());
        System.out.println("c_facility:"+comm.getC_facility());
        System.out.println("useful_amount:"+comm.getUseful());
        System.out.println("c_score:"+comm.getC_score());
        System.out.println("see_movie_status:"+comm.getSee_movie_status());
    }

    /**
    *
    * Method: getComment()
    *
    */
    public void testGetComment2() throws Exception {
    //TODO: Test goes here...
        ArrayList<comment> list=commDAO.getComment();
        System.out.println(list.size());
        for(comment comm:list){
            System.out.println(comm.getC_time());
        }
    }
    
    
    public void testGetCommentByMID() throws Exception{
    	int mID1=189981;
    	commentDAOImpl cdi=new commentDAOImpl();
    	ArrayList<comment> list=null;
        list=cdi.getCommentByMID(mID1);
    	for(comment comm:list)
    	{
    		System.out.println(comm.getC_time()+"		"+comm.getC_content());//����mIDΪ189981��Ӱ��Ӧ���������۵�����ʱ�����������
    	}
    }
    		
    

} 
