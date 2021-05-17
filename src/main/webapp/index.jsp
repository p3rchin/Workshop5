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
    <title>Pet Citizens</title>
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
                                    <li class="active"><a href="index.jsp">Inicio</a></li>
                                    <li><a href="form-library.jsp">Librerías</a></li>
                                    <li><a href="form-author.jsp">Autores</a></li>
                                    <li><a href="form-customer.jsp">Clientes</a></li>
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
                        <h1>La administración de una biblioteca a tus manos</h1>
                        <p>Este portal te servirá para la gestión de una librería, con diferentes opciones que
                            encontrarás a continuación en las siguientes páginas.</p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="second-slide" type="image" src="images/banner3.jpg" alt="Second slide">
                <div class="container">
                    <div class="carousel-caption relative">
                        <h1> Opciones: <br></h1>
                        <p align="left"> 1. Crear / modificar / eliminar un autor.<br>
                            2. Crear / modificar / eliminar un libro asociado a un autor. Durante la creación, se debe
                            también crear una primera edición para el libro.<br>
                            3. Crear / modificar / eliminar una edición asociada a un libro.<br>
                            4. Crear / modificar / eliminar una librería.<br>
                        </p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="third-slide" type="image" src="images/banner4.jpg" alt="Third slide">
                <div class="container">
                    <div class="carousel-caption relative">
                        <h1>Opciones:<br></h1>
                        <p align="left"> 5. Asociar / desasociar una edición de un libro a una librería.<br>
                            6. Crear / modificar / eliminar un cliente.<br>
                            7. Rentar una edició de un libro.<br>
                            8. Listar todos los libros rentados por un usuario en un rango de fechas.<br>
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
<div id="about" class="about top_layer">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="titlepage">
                    <h2>Libreries</h2>

                    <table id="librariesTbl" class="table table-dark table-striped table-bordered">
                        <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
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
                            <th>Id</th>
                            <th>Name</th>
                            <th>Country</th>
                            <th># Books</th>
                            <th>Books</th>
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
                            <th># Rents</th>
                            <th>Rents</th>
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

                    if (actions.includes('books')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./form-book.jsp?authorId=' + d['authorId'] + '";');
                        var text = document.createTextNode('Books');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }
                    if (actions.includes('create-customer')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./form-rent.jsp?email=' + d['email'] + '";');
                        var text = document.createTextNode('Rents');
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
    printTable(elementId = 'librariesTbl', servlet = 'list-libraries', columns = ['libraryId', 'name']);

    // Printing authors
    printTable(elementId = 'authorsTbl', servlet = 'list-authors', columns = ['authorId', 'name','country', 'numBooks'], actions = ['books']);

    // Printing authors
    printTable(elementId = 'customersTbl', servlet = 'list-customers', columns = ['email', 'firtsName', 'lastName', 'gender', 'age', 'numeroRentas'], actions = ['create-customer']);

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