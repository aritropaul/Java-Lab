<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
    <%
    String s[] = request.getParameterValues("item");
    int total=0;
    for(int i=0;i<s.length;i++){
        total+=Integer.parseInt(s[i]);
    }
    session.setAttribute("page1total", total);
    response.sendRedirect("Page2.html");
    %>