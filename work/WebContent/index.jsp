<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>笔记列表</title>
</head>
<body>
	<h2>工作笔记</h2>
	<a href="add.jsp">添加笔记</a>
	
	<table border="1px">
		<tr align="center" style="background-color:rgb(219,241,212);">
			<th>笔记标题</th>
			<th>笔记分类</th>
			<th>编写时间</th>
			<th>操作</th>
		</tr>
		<c:forEach var="list" items="${list}" varStatus="status">
		<tr align="center" <c:if test="${status.index%2==1}">style="background-color:rgb(219,241,212);"</c:if>>
			<td>${list.getTitle()}</td>
			<c:if test="${list.getType()==1}">
				<td>技术</td>
			</c:if>
			<c:if test="${list.getType()==2}">
				<td>行政</td>
			</c:if>
			<c:if test="${list.getType()==3}">
				<td>人事</td>
			</c:if>
			<td>${list.getCreateDate()}</td>
			<td><a href="${pageContext.request.contextPath}/QueryById?id=${list.getId()}">查看</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>