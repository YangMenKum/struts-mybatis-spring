<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>用户列表</title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">   

  </head>
  
  <body>
    <center>
        <h2>用户列表</h2>
        <h3><s:a action="toadd" namespace="/user">添加新用户</s:a> </h3>
        
        <table width="90%" border="1">
            <tr>
                <th>用户id</th>
                <th>用户名称</th>
                <th>用户密码</th>
                <th>age</th>
                <th>email</th>
                <th>sex</th>
                <th>phone</th>
                <th>remark</th>
                <th>操作</th>
            </tr>
            <s:iterator value="userlist">
                <tr>
                    <td><s:property value="id"/> </td>
                    <td><s:property value="name"/> </td>
                    <td><s:property value="pwd"/> </td>
                    <td><s:property value="age"/> </td>
                    <td><s:property value="email"/> </td>
                    <td><s:property value="sex"/> </td>
                    <td><s:property value="phone"/> </td>
                    <td><s:property value="remark"/> </td>
                    <td>
                    <s:a action="toupdate" namespace="/user">
                    <s:param name="user.id" value="id"/>修改
                    </s:a>
                    &nbsp;&nbsp;
                    <s:a action="delete" namespace="/user">
                    <s:param name="user.id" value="id"/>删除
                    </s:a>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </center>
  </body>
</html>