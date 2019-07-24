
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
			<label>RPT_CD</label> <input type="text" name="RPT_CD"
				value="${view.RPT_CD}" readonly="readonly" />
		</div>

		<div>
			<label>RPT_NM</label> <input type="text" name="RPT_NM"
				value="${view.RPT_NM}" readonly="readonly" />
		</div>

		<div>
			<label>RPT_LNM </label> <input type="text" name="RPT_LNM"
				value="${view.RPT_LNM}" readonly="readonly" />
		</div>

		<div>
			<label>RPT_FNM</label> <input type="text" name="RPT_FNM"
				value="${view.RPT_FNM}" readonly="readonly" />
		</div>

		<div>
			<label>REMARKS</label> <input type="text" name="REMARKS"
				value="${view.REMARKS}" readonly="readonly" />
		</div>

		<div>
			<label>CRT_BY</label> <input type="text" name="CRT_BY"
				value="${view.CRT_BY}" readonly="readonly" />
		</div>



		<div>
			<label>MOD_BY</label> <input type="text" name="MOD_BY"
				value="${view.MOD_BY}" readonly="readonly" />
		</div>




		<div>
			<button type="submit">Delete</button>
			<button type="button"
				onclick="location.href='/board/view?pk=${view.pk}'">Back</button>

		</div>



	</form>

</body>
</html>