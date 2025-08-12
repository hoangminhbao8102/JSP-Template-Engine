# JSP-Template-Engine

## 📌 Giới thiệu
Dự án này minh họa cách xây dựng **template engine** bằng chính JSP thông qua **JSP Tag Files** trong Spring Boot.  
Thay vì dùng Thymeleaf hoặc FreeMarker, dự án sử dụng **layout.tag** để định nghĩa cấu trúc chung (header, navbar, footer) và truyền nội dung động qua `fragment`.

> Môn học: **Lập trình Java nâng cao**  
> Chủ đề: **JSP Template Engine**  
> Công nghệ: Spring Boot 3.3.2 + JSP + JSTL (Jakarta EE 10)

---

## 📂 Cấu trúc thư mục
```css
jsp-template-engine/
├─ pom.xml
├─ src/main/java/com/example/jspengine/
│ ├─ JspTemplateEngineApplication.java
│ ├─ controller/
│ │ ├─ HomeController.java
│ │ └─ ProductController.java
│ ├─ model/Product.java
│ └─ service/ProductService.java
├─ src/main/resources/application.properties
└─ src/main/webapp/WEB-INF/
├─ tags/layout.tag
└─ views/
├─ layouts/
│ ├─ _head.jspf
│ ├─ _navbar.jspf
│ └─ _footer.jspf
├─ home.jsp
├─ about.jsp
├─ products.jsp
└─ product-form.jsp
```

---

## ⚙️ Cài đặt

### 1. Yêu cầu môi trường
- **Java 17+**
- **Maven 3.9+**
- IDE: IntelliJ IDEA / Eclipse / NetBeans / VS Code

### 2. Clone dự án
```bash
git clone https://github.com/your-username/jsp-template-engine.git
cd jsp-template-engine
```

### 3. Chạy ứng dụng
```bash
mvn clean spring-boot:run
```
Mở trình duyệt tại:
```arduino
http://localhost:8080
```

---

## 🚀 Các trang chính
<table>
    <tr>
        <th>URL</th>
        <th>Chức năng</th>
    </tr>
    <tr>
        <td>`/` hoặc `/home`</td>
        <td>Trang chủ, giới thiệu layout</td>
    </tr>
    <tr>
        <td>`/about`</td>
        <td>Giới thiệu dự án</td>
    </tr>
    <tr>
        <td>`/products`</td>
        <td>Danh sách sản phẩm</td>
    </tr>
    <tr>
        <td>`/products/new`</td>
        <td>Thêm sản phẩm</td>
    </tr>
</table>
	
---

## 🛠 Công nghệ sử dụng
- Spring Boot 3.3.2
- Spring MVC
- JSP (Jakarta) + JSTL
- Tag Files để tạo layout (giống template engine)
- Validation API cho form

---

## 💡 Điểm nổi bật
- Tách layout: Sử dụng `layout.tag` để định nghĩa cấu trúc trang.
- Partial JSPF: `_head.jspf`, `_navbar.jspf`, `_footer.jspf` tái sử dụng được nhiều nơi.
- Fragment content: Truyền nội dung trang con vào layout mà không lặp lại HTML.
- JSTL (Jakarta): Sử dụng `<c:forEach>`, `<c:if>`, `<c:url>`...

---

## 📜 Giấy phép
Dự án được phân phối theo giấy phép MIT.
Xem chi tiết tại [LICENSE](LICENSE).

---

## 👨‍💻 Tác giả
- Họ tên: Hoàng Nghĩa Minh Bảo
- Email: minhbao8102@gmail.com
- Lớp / Khóa học: CTK44

---
