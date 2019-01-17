<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看笔记</title>
</head>
<body>
		<table>
			<tr>
				<td></td>
				<td>我的工作笔记</td>
			</tr>
			<tr>
				<td>标题:</td>
				<td>${work.getTitle()}</td>
			</tr>
			<tr>
				<td>内容:</td>
				<td>${work.getContent()}</td>
			</tr>
			<tr>
				<td>类别:</td>
				<c:if test="${work.getType()==1}">
				<td>技术</td>
				</c:if>
				<c:if test="${work.getType()==2}">
				<td>行政</td>
				</c:if>
				<c:if test="${work.getType()==3}">
				<td>人事</td>
				</c:if>
			</tr>
			<tr>
				<td>日期:</td>
				<td>${work.getCreateDate()}</td>
			</tr>
		</table>
		<form action="${pageContext.request.contextPath}/QueryAll">
			<input type="submit" value="返回">
		</form>
</body>
</html>