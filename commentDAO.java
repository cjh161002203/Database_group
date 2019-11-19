package dao;

import entity.comment;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by FuCongchong on 2019/11/12  22:34
 */
public interface commentDAO {
    public boolean insertComment(comment comm);
    public boolean insertBe_Comment(comment comm,int mID);
    public boolean updateComment(comment comm);
    public boolean deleteComment(int cid);
    public comment getComment(int cid);
    public ArrayList<comment> getComment();
    public ArrayList<comment> getByMID(ArrayList<Integer> comms,int mid);//ͨ�������cid�����comment�ĸ�����Ϣ�ҵ�
    public ArrayList<Integer> getComments(int mid);//ͨ����ӰID������-��Ӱ��ϵ���У���ȡĳһ����Ӱ��Ӧ����������
    public ArrayList<comment> getCommentByMID(int mid);//����һ��mid��ֱ�ӻ�ȡ��֮��Ӧ���������۵ĸ�����Ϣ
}
