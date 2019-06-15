<jsp:useBean id="user" class="com.jm2190309.model.User"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<jsp:setProperty property="type" name="user" value="Admin"/>

<%= user %> <br />
<jsp:getProperty property="age" name="user" /> 