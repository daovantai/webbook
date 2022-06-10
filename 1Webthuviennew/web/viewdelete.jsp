<%-- 
    Document   : chitietsach
    Created on : Apr 27, 2022, 3:06:21 PM
    Author     : VAN TAI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <title>ThuVienSach</title>
        <meta charset="UTF-8">
        <link href="styles/main_1.css" rel="stylesheet" type="text/css"/>
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/fontawesome-free-6.0.0-web/css/all.min.css">
        <link rel="icon" type="image/png" href="images/favicon.png">
        <!-- Web Font -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

        <!-- StyleSheet -->

        <!-- Bootstrap -->
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
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;600;700&family=Roboto:wght@300;400;500;700&display=swap" rel="stylesheet">
    </head>
    <body>
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
                                    <li><i class="ti-user"></i> <a href="thuthu.jsp">My account</a></li>
                                    <li><i class="ti-power-off"></i><a href="Dangnhap.html">Đăng nhập</a></li>
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






                    <nav class="navbar navbar-expand-lg">
                        <div class="navbar-collapse">	
                            <div class="nav-inner">	
                                <ul class="nav main-menu menu navbar-nav">
                                    <li class="active"><a href="index.html">Trang chủ</a></li>
                                    <li><a href="thuvienservlet">Thư viện</a></li>												
                                    <li><a href="#">Giới thiệu</a></li>
                                    <li><a href="#">Shop<i class="ti-angle-down"></i><span class="new">New</span></a>
                                        <ul class="dropdown">
                                            <li><a href="cart.html">Giỏ sách</a></li>
                                            <li><a href="checkout.html">Mượn</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="https://www.facebook.com/me/">Pages</a></li>									

                                    <li><a href="contact.html">Liên hệ</a></li>
                                </ul>
                            </div>
                        </div>
                    </nav>




                </div>
            </div>
            <style>
                .header{
                    text-align: center;
                  
                }
                .cl{
                    color: red;
                }
            </style>
            <section class="header">
                <nav >

                    

                </nav> 
                <h1>Xác nhận xóa sách</h1>
                Mã sách: ${b.masach}<br>
                Tên sách:${b.tensach}<br>
                Tác giả:${b.tacgia}<br>
                Nhà xuất bản:${b.nxb}<br>
                Thể loại:${b.namxb}<br>
                <a  href="updatedelete?txtiD=${b.masach}">YES</a><br>
                <a  href="quanlisachthuthu">NO</a>      


            </section>
        </header>



    </body>
</html>

