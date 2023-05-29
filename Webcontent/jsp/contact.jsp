<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../header.html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>フォームの項目</p>


<form action="../servlet/contact" method="post">
<p>氏名<input type="text" name="name" required></p>




<p>会社<input type="text" name="com"></p>




<p>メールアドレス<input type="email" name="mail"></p>


<p>お問い合せ内容</p>
<p><textarea name="content" cols="30" rows="5"></textarea></p>


<p>メルマガをお選びください</p>
<p>
<input type="checkbox" name="magazine">総合案内
<input type="checkbox" name="magazine">セミナー案内
<input type="checkbox" name="magazine">求人情報
</p>		
		
<p>資料請求希望</p>
<p>
<input type="radio" name="data" value="yes" checked>yes
<input type="radio" name="data" value="no" >no
</p>

<p><input type="submit" value="確定"></p>
</form>

<%@include file="../footer.html" %>
</body>
</html>