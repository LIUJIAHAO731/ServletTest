<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="bean.Product"%>
<%Product p = (Product)request.getAttribute("product"); %>
<p>氏名：<%=p.getName() %>様</p>
<p>会社：<%=p.getCom() %><p>
<p>メールアドレス：<%=p.getMail() %><p>
<p>お問い合わせ内容</p>
<%=p.getContent() %><br>
<%if(p.getMagazine()!=null){ %>
<p>お選びいただいたメルマガ</p>
<%for(String m : p.getMagazine()){ %>は<%m %><br><%} %>
<%}else{ %>
<p>配信を希望しない</p><%} %>

<p><%=p.getData() %></p>
</body>
</html>