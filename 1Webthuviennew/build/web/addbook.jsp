<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="zxx">
    <head>
        <!-- Meta Tag -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name='copyright' content=''>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Title Tag  -->
        <title>Thuthu</title>
        <!-- Favicon -->
        <link rel="icon" type="image/png" href="images/favicon.png">
        <!-- Web Font -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

        <!-- StyleSheet -->

        <!-- Bootstrap -->
         <link href="styles/main.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="css/font-awesome.css">
        <!-- Fancybox -->
        <link rel="stylesheet" href="css/jquery.fancybox.min.css">
        <!-- Themify Icons -->
        <link rel="stylesheet" href="css/themify-icons.css">
        <!-- Nice Select CSS -->
        <link rel="stylesheet" href="css/niceselect.css">
        <!-- Animate CSS -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Flex Slider CSS -->
        <link rel="stylesheet" href="css/flex-slider.min.css">
        <!-- Owl Carousel -->
        <link rel="stylesheet" href="css/owl-carousel.css">
        <!-- Slicknav -->
        <link rel="stylesheet" href="css/slicknav.min.css">

        <!-- Eshop StyleSheet -->
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/responsive.css">



    </head>
    <body class="js">



        <!-- Header -->
        <header class="header shop">
            <!-- Topbar -->
            <div class="topbar">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-5 col-md-12 col-12">
                            <!-- Top Left -->
                            <div class="top-left">
                                <ul class="list-main">
                                    <li><i class="ti-headphone-alt"></i> 0347268701</li>
                                    <li><i class="ti-email"></i> daotai2309@gmail.com</li>
                                </ul>
                            </div>
                            <!--/ End Top Left -->
                        </div>
                        <div class="col-lg-7 col-md-12 col-12">
                            <!-- Top Right -->
                            <div class="right-content">
                                <ul class="list-main">

                                    <li><i class="ti-alarm-clock"></i> <a href="#">Daily deal</a></li>
                                    <li><i class="ti-user"></i> <a href="#">My account</a></li>
                                    <li><i class="ti-power-off"></i><a href="index.html">Đăng xuất</a></li>
                                </ul>
                            </div>
                            <!-- End Top Right -->
                        </div>
                    </div>
                </div>
            </div>
            <!-- End Topbar -->

            <!-- Header Inner -->
            <div class="header-inner">
                <div class="container">
                    <div class="cat-nav-head">
                        <div class="row">

                            <div class="col-lg-9 col-12">
                                <div class="menu-area">
                                    <!-- Main Menu -->
                                    <nav class="navbar navbar-expand-lg">
                                        <div class="navbar-collapse">	
                                            <div class="nav-inner">	
                                                <ul class="nav main-menu menu navbar-nav">
                                                    <li class="active"><a href="thuthu.jsp">Trang chủ</a></li>
                                                    <li><a href="quanlisachthuthu">Quản lý sách</a></li>												
                                                    <li><a href="#">Quản lý mượn</a></li>

                                                    <li><a href="quanlidocgia">Quản lý độc giả</a></li>									

                                                    <li><a href="contact.html">Liên hệ</a></li>
                                                </ul>

                                            </div>
                                        </div>
                                    </nav>
                                    <!--/ End Main Menu -->	
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <section class="hero-slider">

            <div class="sign_up-1">
            
            <h1>Thêm sách</h1>
            <form action="addbook" method="post">
                <input type="text" class="input_box-1" placeholder="Mã sách" name="masach" required>
                <input type="text" class="input_box-1" placeholder="Tên sách" name="tensach" required>
                <input type="text" class="input_box-1" placeholder="Tác giả" name="tacgia" required>
                <input type="text" class="input_box-1" placeholder="Nhà xuất bản" name="nxb" required>
                <input type="text" class="input_box-1" placeholder="Thể loại" name="theloai" required>
              
                
              
                <input type = "submit" value = "Thêm vào kho sách" id = "submit" class="sign-btn"><br>
                <a href="quanlisachthuthu" class="sign_up-1-a">Hủy</a>
            </form>
        </div>

           



            

            


        </section>
            <!--/ End Header Inner -->
        </header>

        

        <script src="js/jquery.min.js"></script>
        <script src="js/jquery-migrate-3.0.0.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <!-- Popper JS -->
        <script src="js/popper.min.js"></script>
        <!-- Bootstrap JS -->
        <script src="js/bootstrap.min.js"></script>
        <!-- Color JS -->
        <script src="js/colors.js"></script>
        <!-- Slicknav JS -->
        <script src="js/slicknav.min.js"></script>
        <!-- Owl Carousel JS -->
        <script src="js/owl-carousel.js"></script>
        <!-- Magnific Popup JS -->
        <script src="js/magnific-popup.js"></script>
        <!-- Waypoints JS -->
        <script src="js/waypoints.min.js"></script>
        <!-- Countdown JS -->
        <script src="js/finalcountdown.min.js"></script>
        <!-- Nice Select JS -->
        <script src="js/nicesellect.js"></script>
        <!-- Flex Slider JS -->
        <script src="js/flex-slider.js"></script>
        <!-- ScrollUp JS -->
        <script src="js/scrollup.js"></script>
        <!-- Onepage Nav JS -->
        <script src="js/onepage-nav.min.js"></script>
        <!-- Easing JS -->
        <script src="js/easing.js"></script>
        <!-- Active JS -->
        <script src="js/active.js"></script>
    </body>
</html>