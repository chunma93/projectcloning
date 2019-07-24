

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>게시물 목록</title>
<style>
table, th, td {table , th, td;
	border: 1px solid #bcbcbc;
	border-collapse: collapse;
	font-size: 13px;
}
</style>
</head>
<body>

	<table align="center">
		<thead>
			<tr>
			
				
				<th>RPT_CD</th>
				<th>RPT_NM</th>
				<th>RPT_LNM</th>
				<th>RPT_FNM</th>
				<th>REMARKS</th>
				<th>CRT_BY</th>
				
				<th>MOD_BY</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td><a href="/board/view?pk=${list.pk}">${list.RPT_CD}</a></td>

				
					<td>${list.RPT_NM}</td>
					<td>${list.RPT_LNM}</td>
					<td>${list.RPT_FNM}</td>
					<td>${list.REMARKS}</td>
					<td>${list.CRT_BY}</td>
					
					<td>${list.MOD_BY}</td>
					









				</tr>
			</c:forEach>

		</tbody>

	</table>
	<div style="text-align: center">
		<p>
			<button type="button" onclick="location.href='/board/write'">Write</button>
		</p>
		<br />
	</div>
</body>
</html>