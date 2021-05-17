<%--
  Created by IntelliJ IDEA.
  User: Robinson
  Date: 15/05/2021
  Time: 10:47 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="./create-edition">
    <input type="hidden" id="bookId" name="bookId" value ="<%= request.getParameter("book_id") %>">

    Book description: <input type="text" id="description" name="description">
    <br />
    Book date: <input type="date" id="date" name="date">
    <br />
    <input type="submit" value="Create edition!">
</form>
<div class="contact">
    <h3>Delete edition</h3>
    <form method="get" action="./delete-edition">
        <div class="row">
            <div class="col-sm-12">
                <input class="contactus" placeholder="Edition id" type="text" name="editionId">
            </div>
            <div class="col-sm-12">
                <input class="send" type="submit" value="Delete edition">
            </div>
        </div>
    </form>
</div>

<div class="contact">
    <h3>Delete edition</h3>
    <form method="get" action="./update-edition">
        <div class="row">
            <div class="col-sm-12">
                <input class="contactus" placeholder="Edition id" type="text" name="editionId">
            </div>
            <div class="col-sm-12">
                <input class="contactus" placeholder="Description" type="text" name="description">
            </div>
            <div class="col-sm-12">
                <input class="contactus" placeholder="Year" type="date" name="date">
            </div>
            <div class="col-sm-12">
                <input class="send" type="submit" value="Delete edition">
            </div>
        </div>
    </form>
</div>
<div class="titlepage">
    <h2>List-Edition</h2>
    <table id="editionTbl" class="table table-dark table-striped table-bordered">
        <thead>
        <tr>
            <th>EditionId</th>
            <th>Description</th>
            <th>Date</th>
            <th>Delete edition</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</div>

<script>

    function printTable(elementId, servlet, columns, actions = []) {

        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4) {
                var data = JSON.parse(xhr.responseText);

                var tbodyRef = document.getElementById(elementId).getElementsByTagName('tbody')[0];

                data.map(d => {

                    var newRow = tbodyRef.insertRow();

                    columns.map(c => {
                        var cell = newRow.insertCell();
                        var text = document.createTextNode(d[c]);
                        cell.appendChild(text);
                    });

                    if (actions.includes('delete-edition')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./delete-edition?editionId=' + d['editionId'] + '";');
                        var text = document.createTextNode('Delete edition');
                        action.appendChild(text);
                        cell.appendChild(action);

                    }

                });

            }
        }
        xhr.open('GET', '${pageContext.request.contextPath}/' + servlet, true);
        xhr.send(null);

    }

    printTable(elementId = 'editionTbl', servlet = 'list-editions', columns = ['editionId', 'description', 'date'], actions = ['delete-edition']);
</script>
</body>
</html>
