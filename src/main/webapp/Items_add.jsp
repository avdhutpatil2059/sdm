<%@ page import="service.ItemServiceImpl" %>
<%@ page import="service.ItemService" %>

 <jsp:useBean id="item" class="items.Items"></jsp:useBean>
 <jsp:setProperty property="*" name="item"/>
 
 
<%
ItemService itemService = new ItemServiceImpl();
  itemService.add(item);
  response.sendRedirect("items_add_form.jsp");
%>