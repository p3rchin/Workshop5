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
<body class="main-layout">
<div class="loader_bg">
    <div class="loader"><img type="image" src="images/loading.gif" alt="#"/></div>
</div>


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
                                    <li><a href="#rent">Rent</a></li>
                                    <li><a href="#deleteRent">Delete rent</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end header inner -->
</header>


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
                                    <h3>Rent a book</h3>
                                    <p>In this space you can rent a book edtion.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                <div class="contact">
                    <h3>Make rent</h3>
                    <form method="get" action="create-rent">
                        <div class="row">
                            <input type="hidden" id="email" name="email" value="<%= request.getParameter("email") %>">

                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Edition ID" type="number" id="editionId" name="editionId" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Rent date" type="date" pattern="dd/MM/yyyy" id="date" name="date" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="send" type="submit" value="Make rent">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="deleteRent" class="testimonial">
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
                                    <h3>Delete a rent</h3>
                                    <p>In this space you can delete a rent.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                <div class="contact">
                    <h3>Delete rent</h3>
                    <form method="get" action="delete-rent">
                        <div class="row">

                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Edition ID" type="number" id="rentId" name="rentId" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="send" type="submit" value="Delete rent">
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

                    <table id="rentTbl" class="table table-dark table-striped table-bordered">
                        <thead>
                        <tr>
                            <th>Rent ID</th>
                            <th>Email</th>
                            <th>Year</th>
                            <th>Month</th>
                            <th>Day</th>
                            <th>Delete</th>

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
<footr>
    <div class="footer">
        <div class="container">
            <div class="row">
            </div>
        </div>
    </div>
</footr>
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

                    if (actions.includes('deleteRent')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        action.setAttribute('onclick', 'location.href="./delete-rent?rentId=' + d['rentId'] + '";');
                        var text = document.createTextNode('Delete rent');
                        action.appendChild(text);
                        cell.appendChild(action);

                    }

                });

            }
        }
        xhr.open('GET', '${pageContext.request.contextPath}/' + servlet, true);
        xhr.send(null);

    }

    printTable(elementId = 'rentTbl', servlet = 'list-rents', columns = ['rentId','email', 'year', 'month', 'day'], actions = ['deleteRent'])
</script>
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
