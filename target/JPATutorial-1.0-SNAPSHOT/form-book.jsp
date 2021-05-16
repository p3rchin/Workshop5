<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JPA Tutorial</title>
</head>
<body>
<div>
    <form action="./create-book">
        <input type="hidden" id="authorId" name="authorId" value ="<%= request.getParameter("authorId") %>">
        Book title: <input type="text" id="title" name="title">
        <br />
        Book ISBN: <input type="text" id="isbn" name="isbn">
        <br />
        Book genre: <input type="text" id="genre" name="genre">
        <br />
        Book description: <input type="text" id="description" name="description">
        <br />
        Book date: <input type="date" id="date" name="date">
        <br />
        <input type="hidden" id="bookId" name="bookId" value ="0">
        <input type="submit" value="Create book!">
    </form>
</div>

<div>
    <form action="./delete-book">
        Book title: <input type="text" name="bookId">
        <br />
        <input type="submit" value="Delete book!">
    </form>
</div>

<div>
    <table id="bookTbl" class="table table-dark table-striped table-bordered">
        <thead>
        <tr>
            <th>BookId</th>
            <th>Title</th>
            <th>ibsn_number</th>
            <th>Genre</th>
            <th>#Editions</th>
            <th>Author Id</th>
            <th>Actions</th>
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

                    if (actions.includes('create-edition')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./form-edition.jsp?book_id=' + d['book_id'] + '";');
                        var text = document.createTextNode('Create edition');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }

                });

            }
        }
        xhr.open('GET', '${pageContext.request.contextPath}/' + servlet, true);
        xhr.send(null);

    }
    printTable(elementId = 'bookTbl', servlet = 'list-books', columns = ['book_id', 'title','ibsn_number','genre','numeroEdiciones'], actions = ['create-edition']);


</script>


</body>
</html>
