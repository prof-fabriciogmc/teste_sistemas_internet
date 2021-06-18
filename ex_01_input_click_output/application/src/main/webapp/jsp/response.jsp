<%-- 
    Author: Fabrício Galende Marques de Carvalho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Retorno da verificação</title>
        <style>
            p{
                width: 50%;
                margin: auto;
                text-align: center;     
            }
            #isEvenParagraph{
                color: red;
            }
        </style>
    </head>
    <body>
        <p id="description"> O número é par? (0 = não; 1 = sim) </p>
        <p id="isEvenParagraph">
            <%=request.getAttribute("isEven")%>
        </p>
    </body>
</html>
