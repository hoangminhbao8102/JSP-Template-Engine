<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<t:layout title="${pageTitle}">
  <jsp:attribute name="body">
    <h1>Danh s�ch s?n ph?m</h1>

    <p>
      <a href="<c:url value='/products/new'/>">+ Th�m s?n ph?m</a>
    </p>

    <c:if test="${empty products}">
      <p><em>Ch?a c� s?n ph?m.</em></p>
    </c:if>

    <c:if test="${not empty products}">
      <table>
        <thead><tr><th>ID</th><th>T�n</th><th>Gi�</th><th></th></tr></thead>
        <tbody>
        <c:forEach var="p" items="${products}">
          <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td><c:out value="${p.price}"/></td>
            <td>
              <form action="<c:url value='/products/${p.id}/delete'/>" method="post" style="display:inline">
                <button type="submit">Xo�</button>
              </form>
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </c:if>
  </jsp:attribute>
</t:layout>
