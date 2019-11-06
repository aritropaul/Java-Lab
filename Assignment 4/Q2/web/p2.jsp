<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%
    String s[] = request.getParameterValues("item");
    int page2total=0;
    for(int i=0;i<s.length;i++){
    page2total+=Integer.parseInt(s[i]);
    }
    int page1total = Integer.parseInt(session.getAttribute("page1total").toString());
%> 
<table border=1> 
    <tr><td><b>Page 1 total price: </b></td><td>Rs.<%=page1total%>/-</td></tr> 
    <tr><td><b>Page 2 total price: </b></td><td>Rs.<%=page2total%>/-</td></tr> 
    <tr><td><b>Grand Total Amount: </b></td><td>Rs.<%=page1total+page2total%>/-</td></tr> 
</table>
