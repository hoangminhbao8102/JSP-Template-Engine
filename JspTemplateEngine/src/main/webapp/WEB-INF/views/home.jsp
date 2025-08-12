<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<t:layout title="${pageTitle}">
  <jsp:attribute name="body">
    <h1>JSP Template Engine</h1>
    <p>${message}</p>
    <ul>
      <li>D�ng <strong>JSP Tag Files</strong> ?? t?o layout (header/nav/footer).</li>
      <li>Trang ch? c?n n?p <code>&lt;t:layout&gt;</code> v� truy?n fragment n?i dung.</li>
      <li>JSTL (Jakarta) d�ng URI <code>jakarta.tags.core</code>.</li>
    </ul>
  </jsp:attribute>
</t:layout>
