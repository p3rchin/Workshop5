<%--
  Created by IntelliJ IDEA.
  User: Robinson
  Date: 13/05/2021
  Time: 10:09 p. m.
  To change this template use File | Settings | File Templates.
--%>
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
                                    <li><a href="index.jsp">Home</a></li>
                                    <li><a href="form-library.jsp">Libreries</a></li>
                                    <li><a href="form-author.jsp">Authors</a></li>
                                    <li  class="active"><a href="form-customer.jsp">Customers</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</header>

<div id="testimonial" class="testimonial">
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
                            <img class="first-slide" src="images/customer.jpg">
                            <div class="container">
                                <div class="carousel-caption relat">
                                    <h3>Add a customer</h3>
                                    <p>In this space you can create a client of your bookstore.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                <div class="contact">
                    <h3>Add a customer</h3>
                    <form method="get" action="create-customer">
                        <div class="row">
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Customer email" type="text" id="email" name="email" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Customer name" type="text" id="firtsName" name="firtsName" required=""
                            </div>
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Customer lastname" type="text" id="lastName" name="lastName" required="">
                            </div>
                            <div class="col-sm-12">
                                <p>Please select your gender:</p>
                                <input type="radio" id="M" name="gender" value="M" required="required">
                                <label for="male">Male</label><br>
                                <input type="radio" id="F" name="gender" value="F" required="required">
                                <label for="female">Female</label><br>
                                <input type="radio" id="O" name="gender" value="O" required="required">
                                <label for="other">Other</label>

                            </div>
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Customer age" type="text" id="age" name="age" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="send" type="submit" value="Create customer">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


<div id="testimonial" class="testimonial">
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
                            <img class="first-slide" src="images/deletecustomer.jpg">
                            <div class="container">
                                <div class="carousel-caption relat">
                                    <h3>Elimination of clients for your bookstore</h3>
                                    <p>In this space you can delete a client from your bookstore.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                <div class="contact">
                    <h3>Delete a customer</h3>
                    <form method="get" action="delete-customer">
                        <div class="row">
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Customer email" type="email" name="customerEmail" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="send" type="submit" value="Delete customer">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<div id="testimonial" class="testimonial">
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
                            <img class="first-slide" src="images/updatecustomer.jpg">
                            <div class="container">
                                <div class="carousel-caption relat">
                                    <h3>Modification of customers of your bookstore</h3>
                                    <p>In this space you can modify a customer of the bookstore.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                <div class="contact">
                    <h3>Modify a customer</h3>
                    <form method="get" action="update-customer">
                        <div class="row">
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Customer email" type="text" name="email" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Customer name" type="text"  name="firtsName" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Customer lastname" type="text" name="lastName" required="">
                            </div>
                            <div class="col-sm-12">
                                <p>Please select your gender:</p>
                                <input type="radio" id="M" name="gender" value="M" required="required">
                                <label for="male">Male</label><br>
                                <input type="radio" id="F" name="gender" value="F" required="required">
                                <label for="female">Female</label><br>
                                <input type="radio" id="O" name="gender" value="O" required="required">
                                <label for="other">Other</label>
                            </div>
                            <div class="col-sm-12">
                                <input class="contactus" placeholder="Customer age" type="text" name="age" required="">
                            </div>
                            <div class="col-sm-12">
                                <input class="send" type="submit" value="Update customer">
                            </div>
                        </div>
                    </form>
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
