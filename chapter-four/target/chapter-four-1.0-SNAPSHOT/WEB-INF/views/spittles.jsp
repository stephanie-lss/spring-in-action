<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spitter</title>
    <%--    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >--%>
</head>
<body>
<%--<sf:form method="post" action="/spittles/sf">--%>
<%--    <sf:input path="id"/>--%>
<%--    <sf:input path="message"/>--%>
<%--    <sf:input path="time"/>--%>
<%--    <sf:input path="latitude"/>--%>
<%--    <sf:input path="longtitude"/>--%>
<%--</sf:form>--%>
<%--<form method="post" action="/spittles/sf">--%>
<%--    username:<input type="text" name="username" value="ha">--%>
<%--    <input type="submit" value="register" name="asd">--%>
<%--</form>--%>

<sf:form method="post" action="/spittles/sf" commandName="person">
    username:<sf:input path="username"/>
    <input type="submit" value="register" name="asd">
</sf:form>
<%--
<div class="spittleForm">
        <h1>Spit it out...</h1>
        <form method="POST" name="spittleForm">
            <input type="hidden" name="latitude">
            <input type="hidden" name="longitude">
            <textarea name="message" cols="80" rows="5"></textarea><br/>
            <input type="submit" value="Add" />
        </form>
    </div>
    <div class="listTitle">
        <h1>Recent Spittles</h1>
        <ul class="spittleList">
            <c:forEach items="${spittleList}" var="spittle" >
                <li id="spittle_<c:out value="spittle.id"/>">
                    <div class="spittleMessage"><c:out value="${spittle.message}" /></div>
                    <div>
                        <span class="spittleTime"><c:out value="${spittle.time}" /></span>
                        <span class="spittleLocation">(<c:out value="${spittle.latitude}" />, <c:out value="${spittle.longitude}" />)</span>
                    </div>
                </li>
            </c:forEach>
        </ul>
        <c:if test="${fn:length(spittleList) gt 20}">
            <hr />
            <s:url value="/spittles?count=${nextCount}" var="more_url" />
            <a href="${more_url}">Show more</a>
        </c:if>
    </div>--%>
</body>
</html>