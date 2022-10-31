<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="product">

    <form:form modelAttribute="product">

        <petclinic:inputField label="Nombre del producto" name="name"/>
        <petclinic:inputField label="Precio del producto" name="price"/>
        <petclinic:inputField label="Tipo del producto" name="productType"/>

        <button type="submit">Submit</button>
    </form:form>

</petclinic:layout>
