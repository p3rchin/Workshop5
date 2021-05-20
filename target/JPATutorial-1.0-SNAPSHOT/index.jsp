<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Manager</title>

    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
    <!-- basic -->
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
<body class="main-layout">
<div class="loader_bg">
    <div class="loader"><img type="image" src="images/loading.gif" alt="#"/></div>
</div>
<!-- end loader -->
<!-- header -->
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
                                    <li><a href="form-library.jsp">Libreries</a></li>
                                    <li><a href="form-author.jsp">Authors</a></li>
                                    <li><a href="form-customer.jsp">Customers</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end header inner -->
</header>
<!-- end header -->

<section class="slider_section">
    <div id="myCarousel" class="carousel slide banner-main" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="first-slide" type="image" src="images/banner2.jpg" alt="First slide">
                <div class="container">
                    <div class="carousel-caption relative">
                        <h1>The administration of a library at your hands</h1>
                        <p>This portal will help you to manage a library, with different options that
                            you will find below on the following pages.</p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="second-slide" type="image" src="images/banner3.jpg" alt="Second slide">
                <div class="container">
                    <div class="carousel-caption relative">
                        <h1> Options: <br></h1>
                        <p align="left">
                            1. Create / modify / delete an author.<br>
                            2. Create / modify / delete a book associated with an author. During creation, you must
                            also create a first edition for the book.<br>
                            3. Create / modify / delete an edition associated with a book.<br>
                            4. Create / modify / delete a library.<br>
                        </p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="third-slide" type="image" src="images/banner4.jpg" alt="Third slide">
                <div class="container">
                    <div class="carousel-caption relative">
                        <h1>Options:<br></h1>
                        <p align="left"> 5. Associate / disassociate a book edition with a bookstore.<br>
                            6. Create / modify / delete a customer.<br>
                            7. Rent an edition of a book.<br>
                            8. List all the books rented by a user in a range of dates.<br>
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
            <i class='fa fa-angle-left'></i>
        </a>
        <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
            <i class='fa fa-angle-right'></i>
        </a>
    </div>
</section>


</div>
<div id="about" class="about top_layer">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="titlepage">
                    <h2>Libreries</h2>

                    <table id="librariesTbl" class="table table-dark table-striped table-bordered">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Edition</th>
                            <th>Delete Library</th>
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


<div id="service" class="service">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="titlepage">
                    <h2>Authors</h2>

                    <table id="authorsTbl" class="table table-dark table-striped table-bordered">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Country</th>
                            <th>Number of books</th>
                            <th>Books</th>
                            <th>Delete Author</th>
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


<div id="about" class="about top_layer">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="titlepage">
                    <h2>Customer</h2>

                    <table id="customersTbl" class="table table-dark table-striped table-bordered">
                        <thead>
                        <tr>
                            <th>Email</th>
                            <th>Name</th>
                            <th>Lastname</th>
                            <th>Gender</th>
                            <th>Age</th>
                            <th>Number of rents</th>
                            <th>Rents</th>
                            <th>Delete Customer</th>
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
<div id="rent" class="testimonial">
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
                            <img class="first-slide" src="images/library.jpg">
                            <div class="container">
                                <div class="carousel-caption relat">
                                    <h3>Search rents</h3>
                                    <p>In this space you can search rents.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                <div class="contact">
                    <h3>Search rents</h3>
                    <form method="get" action="list-rentsCustomer">
                        <div class="row">

                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Email customer" type="email" id="title"
                                       name="email" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Date1" type="date" id="date1" name="date1"
                                       required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Date2" type="date" id="date2"
                                       name="date2" required="">
                            </div>

                            <div class="col-sm-12">
                                <input class="send" type="submit" value="View info">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


<div id="about" class="about top_layer">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="titlepage">
                    <h2>Rents customer</h2>

                    <table id="rentByCustomerTbl" class="table table-dark table-striped table-bordered">
                        <thead>
                        <tr>
                            <th>Rent ID</th>
                            <th>Email</th>
                            <th>Year</th>
                            <th>Month</th>
                            <th>Day</th>

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

                    if (actions.includes('editions')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./form-editionLibrary.jsp?libraryId=' + d['libraryId'] + '";');
                        var text = document.createTextNode('Editions');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }
                    if (actions.includes('deleteLibrary')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./delete-library?libraryId=' + d['libraryId'] + '";');
                        var text = document.createTextNode('Delete Library');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }

                    if (actions.includes('books')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./form-book.jsp?authorId=' + d['authorId'] + '";');
                        var text = document.createTextNode('Books');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }

                    if (actions.includes('deleteAuthor')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./delete-author?authorId=' + d['authorId'] + '";');
                        var text = document.createTextNode('Delete Author');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }
                    if (actions.includes('rents')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./form-rent.jsp?email=' + d['email'] + '";');
                        var text = document.createTextNode('Rents');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }
                    if (actions.includes('deleteCustomer')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./delete-customer?email=' + d['email'] + '";');
                        var text = document.createTextNode('Delete Customer');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }

                });

            }
        }
        xhr.open('GET', '${pageContext.request.contextPath}/' + servlet, true);
        xhr.send(null);

    }

    // Printing libraries
    printTable(elementId = 'librariesTbl', servlet = 'list-libraries', columns = ['libraryId', 'name'], actions = ['editions', 'deleteLibrary']);

    // Printing authors
    printTable(elementId = 'authorsTbl', servlet = 'list-authors', columns = ['authorId', 'name', 'country', 'numBooks'], actions = ['deleteAuthor','books']);

    // Printing customers
    printTable(elementId = 'customersTbl', servlet = 'list-customers', columns = ['email', 'firtsName', 'lastName', 'gender', 'age', 'numeroRentas'], actions = ['deleteCustomer', 'rents', ]);

    printTable(elementId = 'rentByCustomerTbl', servlet = 'list-rentsCustomer', columns = ['rentId','email', 'year', 'month', 'day'], actions = [''])
</script>
<script>
     function mostrarTabla(){
        var data = ${jason}
            console.log(data);
    }
    mostrarTabla();
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