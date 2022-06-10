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
													<li><a href="quanliphieumuon">Quản lý mượn</a></li>
													
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
		<!--/ End Header Inner -->
	</header>
	
	<section class="hero-slider">
		
                 <nav >
                    
            <div class="tv">
            <h2>Quản Lý Phiếu Mượn</h2>
            </div>
                   
        </nav>            																						                                     		
                                                                
                       
            <style>
                
                .tv{
                    
                    height: 70px;
                    text-align: center;
                }
                .h2{
                    text-align: center; 
                }
            .table th,.table td{
                border: 0px solid #ddd;
                text-align: center;
                padding: 12px 12px;
            }
            form{
                text-align: center;             
            }
            table{
                width: 90%;
                
                
                color: #898989;
                border-collapse: collapse;
                box-sizing: border-box;             
            }
            .table th{
                background-color: orange;
                color: #F6F6F6;
            }
            .table tbody tr:nth-child(even){
                background-color: #ddd;
            }
            .tb{
                margin: 0 auto;
                width: 90%;
            }
            .xoa{
                color: red;
            }
            .sua{
                color: #0062cc;
            }
        </style>
        
        
            
        <div class="tb">
                                                <table class="table" boder="1">
                                                    <thead>
                                                        <tr>
                                                           
                                                            <th>Mã sách</th>
                                                            <th>Tên sách</th>
                                                            <th>Thể loại</th>
                                                            <th>Nhà xuất bản</th>
                                                            <th>Xóa</th>
                                                           
                                                            
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                    <c:forEach items="${listBook}" var="E">
                                                        <tr>
                                                            <td>${E.tendn}</td>
                                                            <td>${E.id}</td>
                                                            <td>${E.masach}</td>
                                                            <td>${E.tensach}</td> 
                                                            <td class="xoa"><a href="deletepm?txtid=${E.id}">Xóa </a></td>  
                                                           
                                                            
                                                        </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>

        </div>
     
		
	</section>
	
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