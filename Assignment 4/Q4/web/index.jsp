<%--
  Created by IntelliJ IDEA.
  User: aritropaul
  Date: 03/11/19
  Time: 10:39 pm
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  import java.sql.*;
  import java.util.*;

  Class.forName("com.mysql.jdbc.Driver");
  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
  Statement statement = connection.createStatement();
  ResultSet resultSet = statement.executeQuery("SHOW DATABASES;");
  while (resultSet.next())
  System.out.println(resultSet.getString(1));
  connection.close();
  }
  catch (Exception e) {
  System.out.println(e);
  }

%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  </body>
</html>
