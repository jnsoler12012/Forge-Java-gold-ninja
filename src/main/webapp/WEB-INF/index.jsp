<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session = "true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/index.css">
    <title>Document</title>
</head>
<body class="justify-center-flex">
    <div class="container">
        <div class="gold">
            <p>Your Gold: </p><p class="gold_value"><c:out value="${gold}" /></p>
        </div>
        <div class="options justify-center-flex">
            <form action="/" method="post" class="options_form">
                <div class="each_option">
                    <h3>Farm</h3>
                    <p>(earns 10-20 gold)</p>
                    <button class="button_submit" id="tea-submit" type="submit" name="value" value="farm">Find Gold!</button>
                </div>
            </form>
            <form action="/" method="post" class="options_form">
                <div class="each_option">
                    <h3>Cave</h3>
                    <p>(earns 5-10 gold)</p>
                    <button class="button_submit" id="tea-submit" type="submit" name="value" value="cave">Find Gold!</button>
                </div>
            </form>
            <form action="/" method="post" class="options_form">
                <div class="each_option">
                    <h3>House</h3>
                    <p>(earns 2-5 gold)</p>
                    <button class="button_submit" id="tea-submit" type="submit" name="value" value="house">Find Gold!</button>
                </div>
            </form>
            <form action="/" method="post" class="options_form">
                <div class="each_option">
                    <h3>Casino!</h3>
                    <p>(earns/takes 0-50 gold)</p>
                    <button class="button_submit" id="tea-submit" type="submit" name="value" value="casino">Find Gold!</button>
                </div>
            </form>
        </div>
        <div class="logger">
            <h3>Activities:</h3>
            <div class="logger_div">
                <pre>
                    <c:out value="${logger_info}" />
                </pre>
                
            </div>
        </div>
    </div>
</body>
</html>