
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>게시물 목록</title>
<body>
	<form method="post">
	
		
		<div>
			<label>RPT_CD</label> <input type="text" name="RPT_CD" />
		</div>

		<div>
			<label>RPT_NM</label> <input type="text" name="RPT_NM" />
		</div>

		<div>
			<label>RPT_LNM </label> <input type="text" name="RPT_LNM" />
		</div>

		<div>
			<label>RPT_FNM</label> <input type="text" name="RPT_FNM" />
		</div>

		<div>
			<label>REMARKS</label> <input type="text" name="REMARKS" />
		</div>

		<div>
			<label>CRT_BY</label> <input type="text" name="CRT_BY" />
		</div>

		<div>
			<label>MOD_BY</label> <input type="text" name="MOD_BY" />
		</div>

		<div>
			<label>DEL_IF</label> <input type="text" name="DEL_IF"
				placeholder="number" />
		</div>



		<div>
			<button type="submit">submit</button>
			<button type="button" onclick="location.href='/board/list'">Back</button>
		</div>
	</form>

</body>
</html>