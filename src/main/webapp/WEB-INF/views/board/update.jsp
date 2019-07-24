
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>게시물 목록</title>
<body>
	<form method="post">
		<input type="hidden" name="pk" value="${view.pk}" />


		<div>
			<label>RPT_CD</label> <input type="text" name="RPT_CD"
				value="${view.RPT_CD}" />
		</div>

		<div>
			<label>RPT_NM</label> <input type="text" name="RPT_NM"
				value="${view.RPT_NM}" />
		</div>

		<div>
			<label>RPT_LNM </label> <input type="text" name="RPT_LNM"
				value="${view.RPT_LNM}" />
		</div>

		<div>
			<label>RPT_FNM</label> <input type="text" name="RPT_FNM"
				value="${view.RPT_FNM}" />
		</div>

		<div>
			<label>REMARKS</label> <input type="text" name="REMARKS"
				value="${view.REMARKS}" />
		</div>

		<div>
			<label>CRT_BY</label> <input type="text" name="CRT_BY"
				value="${view.CRT_BY}" />
		</div>



		<div>
			<label>MOD_BY</label> <input type="text" name="MOD_BY"
				value="${view.MOD_BY}" />
		</div>
		<div>
			<label>MOD_DT</label><fmt:formatDate value="${view.MOD_DT}" pattern="EEE, d MMM yyyy HH:mm:ss"/>
		
		</div>





		<div>
			<button type="submit">Modify</button>
			<button type="button" onclick="location.href='/board/view?pk=${view.pk}'">Back</button>
		</div>



	</form>

</body>
</html>