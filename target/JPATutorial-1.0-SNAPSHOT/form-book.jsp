<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Manager</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <!-- style css -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <!-- Responsive-->
    <link rel="stylesheet" type="text/css" href="css/responsive.css">
    <!-- fevicon -->
    <link rel="icon" type="text/css" href="images/fevicon.png" type="image/gif"/>
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" type="text/css" href="css/jquery.mCustomScrollbar.min.css">
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
          media="screen">
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<body>
<div>

    <header>
        <!-- header inner -->
        <div class="header">
            <div class="container">
                <div class="row">
                    <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                        <div class="full">
                            <div class="center-desk">
                                <div class="logo"><a href="index.jsp">Library Manager</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                        <div class="menu-area">
                            <div class="limit-box">
                                <nav class="main-menu">
                                    <ul class="menu-area-main">
                                        <li class="active"><a href="index.jsp">Home</a></li>
                                        <li><a href="#addbook">Add book</a></li>
                                        <li><a href="#deletebook">Delete book</a></li>
                                        <li><a href="#updatebook">Update book</a></li>
                                        <li><a href="#info">Info</a></li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- end header inner -->
    </header>

    <div id="addbook" class="testimonial">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                </div>
            </div>
            <div class="row">
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                    <div id="testimonial_slider" class="carousel slide banner-bg" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img class="first-slide" src="images/books.jpg">
                                <div class="container">
                                    <div class="carousel-caption relat">
                                        <h3>Add books to your library</h3>
                                        <p>In this space you can add books for your library.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                    <div class="contact">
                        <h3>Add a book</h3>
                        <form method="get" action="./create-book">
                            <div class="row">

                                <input type="hidden" id="authorId" name="authorId" value="<%= request.getParameter("authorId") %>">

                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book title" type="text" id="title"
                                           name="title" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book ISBN" type="text" id="isbn" name="isbn" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book genre" type="text" id="genre"
                                           name="genre" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book description" type="text" id="description"
                                           name="description" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book date" type="date" id="date" name="date" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input type="hidden" id="bookId" name="bookId" value="14">
                                </div>
                                <div class="col-sm-12">
                                    <input class="send" type="submit" value="Create book">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- end Testimonial -->

    <div id="deletebook" class="testimonial">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                </div>
            </div>
            <div class="row">
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                    <div id="testimonial_slider" class="carousel slide banner-bg" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img class="first-slide" src="images/deletebook.jpg">
                                <div class="container">
                                    <div class="carousel-caption relat">
                                        <h3>Removing books from your bookstore</h3>
                                        <p>In this space you can delete a book from your library.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                    <div class="contact">
                        <h3>Delete a book</h3>
                        <form method="get" action="./delete-book">
                            <div class="row">
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book ID" type="text" name="book_id" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input class="send" type="submit" value="Delete book">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- end Testimonial -->

    <div id="updatebook" class="testimonial">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                </div>
            </div>
            <div class="row">
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                    <div id="testimonial_slider" class="carousel slide banner-bg" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img class="first-slide" src="images/updatebook.jpg">
                                <div class="container">
                                    <div class="carousel-caption relat">
                                        <h3>Modification of books for your bookstore</h3>
                                        <p>In this space you can modify a book from the bookstore.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                    <div class="contact">
                        <h3>Modify a book</h3>
                        <form method="get" action="./update-book">
                            <div class="row">
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book ID" type="number" name="bookId" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book title" type="text" name="title" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book ISBN" type="text" name="isbn" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Book genre" type="text" name="genre" required="">
                                </div>
                                <div class="col-sm-12">
                                    <input type="hidden" name="bookId" value="0">
                                </div>
                                <div class="col-sm-12">
                                    <input class="send" type="submit" value="Update book">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div>
        <%--        <form method="get" action="./list-books">--%>
        <%--            <div class="row">--%>
        <%--                <input type="hidden" id="" name="authorId" value="<%= request.getParameter("authorId") %>">--%>

        <%--                <div class="col-sm-12">--%>
        <%--                    <input class="send" type="submit" value="View book info" onclick="printTable(elementId = 'bookTbl', servlet = 'list-books', columns = ['book_id', 'title', 'ibsn_number', 'genre', 'numeroEdiciones'], actions = ['create-edition','delete-book'])">--%>
        <%--                </div>--%>
        <%--            </div>--%>
        <%--        </form>--%>
        <div id="info" class="about top_layer">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="titlepage">
                            <h2>List of books</h2>
                            <table id="bookTbl" class="table table-dark table-striped table-bordered">
                                <thead>
                                <tr>
                                    <th>Book ID</th>
                                    <th>Title</th>
                                    <th>ISBN number</th>
                                    <th>Genre</th>
                                    <th>Number of edition</th>
                                    <th>Editions</th>
                                    <th>Delete book</th>
                                </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
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
                            if (actions.includes('delete-book')) {
                                var cell = newRow.insertCell();
                                var action = document.createElement('button');
                                action.setAttribute('onclick', 'location.href="./delete-book?book_id=' + d['book_id'] + '";');
                                var text = document.createTextNode('Delete book');
                                action.appendChild(text);
                                cell.appendChild(action);

                            }

                        });

                    }
                }
                xhr.open('GET', '${pageContext.request.contextPath}/' + servlet, true);
                xhr.send(null);

            }

            printTable(elementId = 'bookTbl', servlet = 'list-books', columns = ['book_id', 'title', 'ibsn_number', 'genre', 'numeroEdiciones'], actions = ['create-edition', 'delete-book'])
        </script>

        <footr>
            <div class="footer">
                <div class="container">
                    <div class="row">
                    </div>
                </div>
            </div>
        </footr>

        <!-- Javascript files-->
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="js/jquery-3.0.0.min.js"></script>
        <script type="text/javascript" src="js/plugin.js"></script>
        <!-- sidebar -->
        <script type="text/javascript" src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script type="text/javascript" src="js/custom.js"></script>
        <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
        <script>
            $(document).ready(function () {
                $(".fancybox").fancybox({
                    openEffect: "none",
                    closeEffect: "none"
                });

                $(".zoom").hover(function () {

                    $(this).addClass('transition');
                }, function () {

                    $(this).removeClass('transition');
                });
            });

        </script>

</body>
</html>
