<%-- 
    Document   : register
    Created on : Jul 8, 2019, 9:35:55 AM
    Author     : thanosparaskevas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Entry</title>
        <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
        <link href="<c:url value='/static/css/uikit.css' />" rel="stylesheet"></link>
        <link href="<c:url value='/static/css/uikit-rtl.css' />" rel="stylesheet"></link>
        <link href="https://fonts.googleapis.com/css?family=Audiowide&amp;display=swap" rel="stylesheet">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.6/js/uikit.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.6/js/uikit-icons.min.js"></script>
    </head>
    <body>

        <div class="uk-section uk-section-medium uk-section-muted ">
            <div class="uk-container uk-container-expand">

                <h3></h3>

                <div class="uk-grid-match  uk-height-1-1" uk-grid>
                    <div >
                        <p></p>
                    </div>
                    <div class="uk-height-1-1 uk-align-center   ">
                        <h2 class="uk-heading-small uk-text-center ">Add new</h2>

                        <div class="">
                            <form:form method="POST"  action="save" modelAttribute="brand" class="uk-form-horizontal uk-margin-large">
                                <div class="uk-margin">


                                    <form:input type="hidden" path="brandId" id="name" class="uk-input"  />



                                </div>
                            </div>

                            <div class="uk-margin">
                                <label class="uk-form-label" for="form-horizontal-text">Name*</label>
                                <div class="uk-form-controls">
                                    <form:input type="text" path="name" id="name" class="uk-input" required="required" />

                                    <span class="required"></span>

                                </div>
                            </div>
                            <div class="uk-margin">
                                <label class="uk-form-label" for="form-horizontal-text">Surname*</label>
                                <div class="uk-form-controls">
                                    <form:input type="text" path="info" id="info" class="uk-input" required="required" />


                                    <span class="required"></span>
                                </div>
                            </div>


                            <div class="uk-margin">
                                <label class="uk-form-label" for="form-horizontal-text"></label>
                                <div class="uk-form-controls">

                                    <input class="uk-input uk-form-width-small uk-button uk-button-primary " value="new"  type="Submit" />
                                </div>
                            </div>

                        </form:form>

                    </div>
                </div>
                <div>
                    <p></p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
