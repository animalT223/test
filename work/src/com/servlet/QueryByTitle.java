package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.WorkService;

/**
 * Servlet implementation class QueryByTitle
 */
public class QueryByTitle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryByTitle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		WorkService workService=new WorkService();
		String title=request.getParameter("title");
		System.out.println(title);
		int result=workService.queryByTitleService(title);
		System.out.println("result="+result);
		String ajax;
		if(result>0){
			ajax="yes";//Í«≥∆“—¥Ê‘⁄
		}else{
			ajax="no";
		}
		System.out.println(ajax);
		PrintWriter out=response.getWriter();
		out.print(ajax);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
