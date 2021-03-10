<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.Dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
PlayerDao pd=new PlayerDao();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player Number</th>
<th>Player Name</th>
<th>Country</th>
<th></th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%=p.getPlayer_id() %></td>
<td><%=p.getName() %></td>
<td><%=p.getDateOfBirth() %></td>
<td><a href="editplayer.jsp?id=<%=p.getPlayerId()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>