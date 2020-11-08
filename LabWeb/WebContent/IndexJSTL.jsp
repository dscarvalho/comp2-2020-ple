<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="br.ufrj.dcc.comp2.ple.aula_danilo.web.ExemploJSTLController" %>
<%@ page import="br.ufrj.dcc.comp2.ple.aula_danilo.web.model.ItemCardapio" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Exemplo JSP</title>
		
		<style>
			table, th, td {
			  border: 1px solid black;
			  border-collapse: collapse;
			}
		</style>
		
		<%
			String caminhoArquivoMenu = getServletContext().getRealPath(ExemploJSTLController.arquivoMenu);
			ExemploJSTLController controller = new ExemploJSTLController(caminhoArquivoMenu);
			List<ItemCardapio> menu = controller.getMenu();
			
			request.setAttribute("menu", menu);
		%>
	</head>
	<body>
		<table>
			<thead>
				<tr>
					<td>Item</td>
					<td>Preço</td>
				</tr>
			</thead>
			<tbody>
				<fmt:setLocale value="pt_BR" />
				<c:forEach items="${menu}" var="item">
					<tr <c:if test="${item.desconto > 0}">style="background-color: yellow;"</c:if>>
						<td>
							<c:out value="${item.nome}" />
						</td>
						<td>
							<fmt:formatNumber type="currency" value="${item.valor - item.desconto}" /> 
							<c:if test="${item.desconto > 0}">
								(-<b style="color: red;"><fmt:formatNumber type="currency" value="${item.desconto}" /></b>)
							 </c:if>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>