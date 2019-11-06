<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<div style="text-align: center;">
        <%
        Boolean status = (Boolean) request.getAttribute("success");
        if (status == true) {
            out.println("<h1> Success </h1>");
        }
        else {
            out.println("<h1> Failure </h1>");
        }
        %>
</body>
</html>