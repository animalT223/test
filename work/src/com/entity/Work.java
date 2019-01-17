package com.entity;
/**
 * 实体类
 * @author 刘诗樱
 *
 */
public class Work {
	public int id;//工作笔记编号
	public String title;//工作笔记标题
	public String content;//工作笔记内容
	public String createDate;//日期，默认为系统时间
	public int type;//工作笔记类型
	
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
	//构造方法
	public Work(){}
	public Work(String title, String content, int type) {
		super();
		this.title = title;
		this.content = content;
		this.type = type;
	}
	
}
