<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DONB06
  Date: 2021-10-27
  Time: 오전 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head profile="http://www.w3.org/2005/10/profile" >
    <link rel="icon" type="image/png" href="http://example.com/myicon.png">
    <title>Title</title>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>



    <%--<script type="text/javascript">
        alert("test");
    </script>--%>
</head>
<body>
    <table width="1000" border="1" align="center" >
        <tr align="center">
            <td width="10%">작성자</td>
            <td width="80%">제목</td>
            <td width="10%">조회수</td>
        </tr>

        <form id="action" action="" method="post">
            <input type="hidden" name="name" value="">
            <input type="hidden" name="title" value="">
            <input type="hidden" name="contents" value="">
        </form>
            <c:forEach items="${list}" var="row">
                <tr align="center">
                    <td><c:out value="${row.name}"/> </td>
                    <td><a id="detailPage" href="<c:out value="${row.idx}"/>"><c:out value="${row.title}" /></a> </td>
                    <td><c:out value="${row.contents}"/></td>
                </tr>
            </c:forEach>

    </table>

    <script>
        $(document).ready(function () {
            var action = $("#action");

            $("a#detailPage").click(function (e) {
                e.preventDefault();
                action.attr("action","/get");
                action.append("<input type = 'hidden' name='idx' value='" + $(this).attr("href") + "'>");
                action.submit();
            });
        });
    </script>
</body>
</html>
