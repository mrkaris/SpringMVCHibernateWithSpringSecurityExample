<%-- 
    Document   : brands
    Created on : Jul 5, 2019, 12:08:35 PM
    Author     : thanosparaskevas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Brands</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.6/css/uikit.min.css" />
         <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
        <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>  
        
        <script type="text/javascript">
            $(document).ready(function () {
                $('#brands').DataTable();
            });
        </script>

    </head>
    <body>
        <div class="uk-section uk-section-medium uk-section-muted ">
            <div class="uk-container uk-container-expand">
                <h2 class=" uk-padding-small uk-text-center">Brands</h2>
                <span class="green" uk-icon="user">Admin</span>

                <!--        <p> </p>-->
                <table id="brands" class="uk-table uk-table-hover uk-table-divider">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Info</th>

                            <th width="100"></th>
                            <th width="100"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${brands}" var="brand">
                            <tr>
                                <td>${brand.brandId}</td>
                                <td>${brand.name}</td>
                                <td>${brand.info}</td>

                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
       <script src="/static/js/uikit-icons.js"></script>
    </body>
</html>

