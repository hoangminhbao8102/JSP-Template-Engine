<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<t:layout title="${pageTitle}">
  <jsp:attribute name="body">
    <h1>Thêm s?n ph?m</h1>
    <form action="<c:url value='/products'/>" method="post">
      <div>
        <label>Tên</label><br/>
        <input type="text" name="name" value="${product.name}" required/>
      </div>
      <div>
        <label>Giá</label><br/>
        <input type="number" step="0.01" name="price" value="${product.price}" min="0" required/>
      </div>
      <p><button type="submit">L?u</button></p>
    </form>
  </jsp:attribute>
</t:layout>
