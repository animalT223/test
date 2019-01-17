package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Work;

/**
 * ҵ���
 * 
 * @author ��ʫӣ
 *
 */
public class WorkDao extends BaseDao {
	// ��ѯ���еĹ����ʼǼ�¼
	public List<Work> queryAll() {
		List<Work> list = new ArrayList<Work>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = super.getConnection();// ������
			String sql = "SELECT * FROM working ORDER BY createDate DESC";// ��дSQL���
			stmt = conn.createStatement();// ����ִ�ж���
			rs = stmt.executeQuery(sql);// ִ��SQL���
			while (rs.next()) {
				Work work = new Work();
				work.setId(rs.getInt("id"));
				work.setTitle(rs.getString("title"));
				work.setContent(rs.getString("content"));
				work.setCreateDate(rs.getString("createDate"));
				work.setType(rs.getInt("type"));
				list.add(work);
			}
		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			this.closeAll(conn, stmt, rs);
		}
		return list;
	}

	// ���ݱ����ѯ�����ʼǼ�¼��
	public int queryByTitle(String title) {
		int result=0;
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			conn=super.getConnection();
			stmt=conn.createStatement();
			String sql="SELECT COUNT(*) FROM working WHERE title='"+title+"'";
			System.out.println(sql);
			rs=stmt.executeQuery(sql);
			if(rs.next()){
				result=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}finally {
			this.closeAll(conn, stmt, rs);
		}
		System.out.println("result="+result);
		return result;
	}

	// ���ݱʼǱ�Ų�ѯָ�������ʼ���Ϣ
	public Work queryById(int id) {
		Work work = new Work();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = super.getConnection();// ������
			String sql = "SELECT * FROM working WHERE id="+id;// ��дSQL���
			stmt = conn.createStatement();// ����ִ�ж���
			rs = stmt.executeQuery(sql);// ִ��SQL���
			if (rs.next()) {
				work.setId(rs.getInt("id"));
				work.setTitle(rs.getString("title"));
				work.setContent(rs.getString("content"));
				work.setCreateDate(rs.getString("createDate"));
				work.setType(rs.getInt("type"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			this.closeAll(conn, stmt, rs);
		}
		return work;
	}

	// ��ӹ����ʼ�
	public int addWork(Work work) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		try {
			conn = super.getConnection();
			String sql = "INSERT INTO working (title,content,createDate,type) VALUE('" + work.getTitle() + "','"
					+ work.getContent() + "',now()," + work.getType() + ")";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			this.closeAll(conn, stmt, null);
		}
		return result;
	}

}
