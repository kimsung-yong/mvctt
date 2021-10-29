<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DONB06
  Date: 2021-10-29
  Time: 오전 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        textarea{width:100%; height: 100%;}

    </style>
</head>
<body>
        <table border="1" width="1000px" align="center" height="500px">
            <tr height="20%">
                <td>작성자</td>
                <td><c:out value="${vo.name}"/></td>
            </tr>
            <tr height="20%">
                <td>제목</td>
                <td><c:out value="${vo.title}"/></td>
            </tr>
            <tr height="50%">
                <td>내용</td>
                <td><textarea style="resize: none;"><c:out value="${vo.contents}"/> </textarea></td>
            </tr>
            <tr height="10%">
                <td>조회수</td>
                <td><c:out value="${vo.acount}"/></td>
            </tr>
        </table>

</body>
</html>
