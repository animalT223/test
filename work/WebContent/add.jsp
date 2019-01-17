<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增笔记</title>
<script src="http://localhost:8080/pet/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function isok(){
		var title=$("#title").val();
		 $.post("${pageContext.request.contextPath}/QueryByTitle","title="+title, function(date){
             //msg返回值，可以为json或者字符串
					if(date=="yes"){
						document.getElementById("btn").disabled=true;
						$("#DivName").html("标题已被使用");
					}else{
						document.getElementById("btn").disabled=false;
						$("#DivName").html("标题可以使用");
					}
     	});
	}
</script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/Add" method="post">
		<table>
			<tr>
				<td></td>
				<td><h2>我的工作笔记</h2></td>
			</tr>
			<tr>
				<td>标题:</td>
				<td><input type="text" name="title" onblur="isok()" id="title"><span style="color:red;" id="DivName"></span></td>
			</tr>
			<tr>
				<td>内容:</td>
				<td><textarea name="content"></textarea></td>
			</tr>
			<tr>
				<td>类别:</td>
				<td>
					<select name="type">
						<option value="0">请选择类别</option>
						<option value="1">技术</option>
						<option value="2">行政</option>
						<option value="3">人事</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" id="btn"></td>
			</tr>
		</table>
		
	</form>
		
</body>
</html>