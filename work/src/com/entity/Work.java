package com.entity;
/**
 * ʵ����
 * @author ��ʫӣ
 *
 */
public class Work {
	public int id;//�����ʼǱ��
	public String title;//�����ʼǱ���
	public String content;//�����ʼ�����
	public String createDate;//���ڣ�Ĭ��Ϊϵͳʱ��
	public int type;//�����ʼ�����
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	//���췽��
	public Work(){}
	public Work(String title, String content, int type) {
		super();
		this.title = title;
		this.content = content;
		this.type = type;
	}
	
}
