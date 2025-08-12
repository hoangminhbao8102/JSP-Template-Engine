<%@ tag description="Main layout" pageEncoding="UTF-8" %>
<%@ attribute name="title" required="true" %>
<%@ attribute name="body" fragment="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <jsp:include page="/WEB-INF/views/layouts/_head.jspf"/>
    <title><c:out value="${title}"/></title>
</head>
<body>
<jsp:include page="/WEB-INF/views/layouts/_navbar.jspf"/>

<main class="container" style="max-width: 1000px;">
    <jsp:invoke fragment="body"/>
</main>

<jsp:include page="/WEB-INF/views/layouts/_footer.jspf"/>
</body>
</html>
