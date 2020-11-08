<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Primeiro JSP</title>
		
		<style>
			table, tr, td {
				border: 1px solid black;
				border-collapse: collapse;
			}
		</style>
		
		<%! HashMap<String, Float> menu = new HashMap<>(); %>
	</head>
	<body>
		<%
			menu.put("Hamburguer", 20.00f);
			menu.put("Fritas", 10.00f);
			menu.put("Pizza", 40.00f);
		%>
		<table>
			<thead>
				<tr>
					<td>Chave</td>
					<td>Valor</td>
				</tr>
			</thead>
			<tbody>
				<%	
					for (Map.Entry<String, Float> item : menu.entrySet()) {
						out.print("<tr>");
						out.print("<td>");
						out.print(item.getKey());
						out.print("</td>");
						out.print("<td>");
						out.print(item.getValue());
						out.print("</td>");
						out.print("</tr>");
					}
				%>
			</tbody>
		</table>
	</body>
</html>