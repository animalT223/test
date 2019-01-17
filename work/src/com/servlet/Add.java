package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Work;
import com.service.WorkService;

/**
 * Servlet implementation class Add
 */
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		int type=Integer.valueOf(request.getParameter("type"));
		if(title==""||title==null){
			out.print("<script type='text/javascript'>alert('标题不能为空');location='add.jsp'</script>");
			return;
		}
		if(content==""||content==null){
			out.print("<script type='text/javascript'>alert('内容不能为空');location='add.jsp'</script>");
			return;
		}
		if(type<1){
			out.print("<script type='text/javascript'>alert('请选择类型');location='add.jsp'</script>");
			return;
		}

		Work work=new Work(title,content,type);
		WorkService works=new WorkService();
		int result=works.addWorkService(work);
		if(result>0){
			out.print("<script type='text/javascript'>alert('新增成功');location='QueryAll'</script>");
			//response.sendRedirect("index.jsp");
		}else{
			out.print("<script type='text/javascript'>alert('新增失败');location='add.jsp'</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
