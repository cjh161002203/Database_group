package entity;
public class comment {
private int cid;//����ID
private String c_time;//����ʱ��
private String c_content;//��������
private String c_facility;//�����豸
private int useful_amount;//��������������

public comment()
{
	
}

public comment(int cid,String c_time,String c_content,String c_facility,int useful_amount)
{
	this.cid=cid;
	this.c_time=c_time;
	this.c_content=c_content;
	this.c_facility=c_facility;
	this.useful_amount=useful_amount;

}

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getC_time() {
	return c_time;
}
public void setC_time(String c_time) {
	this.c_time = c_time;
}
public String getC_content() {
	return c_content;
}
public void setC_content(String c_content) {
	this.c_content = c_content;
}
public String getC_facility() {
	return c_facility;
}
public void setC_facility(String c_facility) {
	this.c_facility = c_facility;
}
public int getUseful() {
	return useful_amount;
}
public void setUseful(int useful_amount) {
	this.useful_amount = useful_amount;
}

}
