<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="buy" items="${buys}">
  <table>
    <thead>
      <tr>
        <th>Column 1</th>
        <th>Column 2</th>
        <th>Column 3</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${buy.pm_id}</td>
        <td>${buy.pm_b_price}</td>
        <td>${buy.pm_b_name}</td>
        <td>${buy.pm_date}</td>
      </tr>
    </tbody>
  </table>
</c:forEach>
</body>
</html>