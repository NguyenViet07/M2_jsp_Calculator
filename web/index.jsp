<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 10/6/2019
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form method="post" action="/calculator">
    <h2>Calculator</h2>
    <table>
      <tr>
        <td>First Operand</td>
        <td><input type="text" id="num1" name="num1" placeholder="Enter first operand"></td>
      </tr>
      <tr>
        <td>Operator</td>
        <td>
          <select name="Operator">
            <option value="+"> Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>Second Operand</td>
        <td><input type="text" id="num2" name="num2" placeholder="Enter second operand"></td>
      </tr>
      <tr>
        <td> &nbsp;</td>
        <td> <input type="submit" id="calculate" value="Calculate"></td>
      </tr>
    </table>
  </form>
  </body>
</html>
