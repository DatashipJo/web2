<html>
  <head>
    <!-- Required meta tags -->
   <%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>서울치킨지도</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="assets/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <link rel="stylesheet" href="assets/vendors/jvectormap/jquery-jvectormap.css">
    <link rel="stylesheet" href="assets/vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="assets/vendors/owl-carousel-2/owl.carousel.min.css">
    <link rel="stylesheet" href="assets/vendors/owl-carousel-2/owl.theme.default.min.css">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <!-- endinject -->
    <!-- Layout styles -->
    <link rel="stylesheet" href="../css/style.css">
    <!-- End layout styles -->
    <link rel="shortcut icon" href="assets/images/favicon.png" />
    
    
    <style>
  body{
      background-color: #251D3A;
      color: #ffffff;
		}

 	th, td{
 		border-bottom: 1px solid #44444;
 		padding: 10px;
 		color: #ffffff;
 		}
 		
 	card {
		display: flex;
	 	justify-content: space-between;
        margin: 0 70px;
        margin-top: 65px;
        flex-wrap: wrap;
        {#float: left;#}
 	}
    </style>
       
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" 
			integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" 
			crossorigin="anonymous"></script>
	</script>

<!--  
<script>

$(document).ready(function(){
	var oldListCnt = '${oldListCnt}';
	// 조회 인덱스
	var startIndex = 1;	// 인덱스 초기값
	var searchStep = 5;	// 5개씩 로딩
	
	// 페이지 로딩 시 첫 실행
	readOldNotify(startIndex);
	
	// 더보기 클릭시
	$('#searchMoreNotify').click(function(){
		startIndex += searchStep;
		readOldNotify(startIndex);
	}
		
	// 더보기 실행함수 **
	function readOldNotify(index){
		let _endIndex = index+searchStep-1;	// endIndex설정
		$.ajax({
			type: "post",
			async: "true",
			dataType: "json",
			data: {
				startIndex: index,
				endIndex: _endIndex
			},
			url: "${contextPath}/member/searchMoreNotify.do",
			success: function (data, textStatus) {
				let NodeList = "";
				for(i = 0; i < data.length; i++){
					let newNode = "<div style='display: none;' class='card form-group col-sm-10 mx-auto p-0' onClick='window.open('"+data[i].n_url+"')>";
					newNode += "<div class='card-body pt-3'><div class='row px-3 mb-2'>";
					newNode += "<strong class='d-block text-gray-dark'>"+data[i].n_type+"</strong>";
					newNode += "</div><span>"+data[i].n_content+"</span></div></div>";
					NodeList += newNode;
				}
				$(NodeList).appendTo($("#oldList")).slideDown();

				// 더보기 버튼 삭제
				if(startIndex + searchStep > oldListCnt){
					$('#searchMoreNotify').remove();
				}				
			}
		});
	}
});
 

</script>	
-->	
  </head>
  
  <form id="page_test"  onsubmit="page_test();">
  <body>
    <div class="container-scroller">
      <!-- partial:partials/_sidebar.html -->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <div class="sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top">
          <a class="sidebar-brand brand-logo" href="index.html"><img src="../images/kkokko.png" alt="logo" /></a>
          <a class="sidebar-brand brand-logo-mini" href="index.html"><img src="../images/kkokko.png" alt="logo" /></a>
        </div>
        <ul class="nav">
        </ul>
      </nav>
      
      <!-- partial -->
      <div class="container-fluid page-body-wrapper">
        <!-- partial:partials/_navbar.html -->
        <nav class="navbar p-0 fixed-top d-flex flex-row">
          <div class="navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center">
            <a class="navbar-brand brand-logo-mini" href="index.html"><img src="../images/kkokko.png" alt="logo" /></a>
          </div>
          <div class="navbar-menu-wrapper flex-grow d-flex align-items-stretch">
            <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
              <span class="mdi mdi-menu"></span>
            </button>
            <ul class="navbar-nav w-100">
              <li class="nav-item w-100">
                <form class="nav-link mt-2 mt-md-0 d-none d-lg-flex search">
                  <input type="text" class="form-control" placeholder="Search">
                </form>
              </li>
            </ul>
          </div>
        </nav>
        <!-- partial -->
        <div class="main-panel">
          <div class="content-wrapper">
            <div class="row">
              <div class="col-12 grid-margin stretch-card">
                <div class="card corona-gradient-card">
                  <div class="card-body py-0 px-0 px-sm-3">
                    <div class="row align-items-center">
                      <div class="col-4 col-sm-3 col-xl-2">
                        <img src="../images/bhc.png" class="gradient-corona-img img-fluid" alt="">
                      </div>
                      <div class="col-5 col-sm-7 col-xl-8 p-0">
                        <h3 class="mb-1 mb-sm-0"> <span th:text="${list.store}"></span> </h3>
                        <p class="mb-0 font-weight-normal d-none d-sm-block"></p>
                      </div>
                      <div class="col-3 col-sm-2 col-xl-2 pl-0 text-center">
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-md-6 col-xl-4 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <div class="d-flex flex-row justify-content-between">
                      <h4 class="card-title">Review</h4>
                    </div>
                    <div class="preview-list">
                      <div class="preview-item border-bottom">
                        <div class="preview-thumbnail">
                       
                        <!-- 리뷰어 프로필 -->
						<tr th:each="list : ${tableList}">	
                          <img src="../images/head.png" alt="image" class="rounded-circle" />
                        </div>
                        <div class="preview-item-content d-flex flex-grow">
                          <div class="flex-grow">
                            <div class="d-flex d-md-block d-xl-flex justify-content-between">
                              <h6 class="preview-subject">
                              <span th:text="${list.id}"></span>
                              </h6>
                            </div>
                            <p class="text-muted">
                            <span th:text="${list.review}"></span>
                            </p>
                          </div>
                        </div>
                      </div>
                      <div class="preview-item border-bottom">
                        <div class="preview-thumbnail">
                          <img src="../images/head.png" alt="image" class="rounded-circle" />
                        </div>
                        <div class="preview-item-content d-flex flex-grow">
                          <div class="flex-grow">
                            <div class="d-flex d-md-block d-xl-flex justify-content-between">
                              <h6 class="../images/head.png">
                              <span th:text="${list.id}"></span>
                              </h6>
                            </div>
                            <p class="text-muted">
                            <span th:text="${list.review}"></span>
                            </p>
                          </div>
                        </div>
                      </div>
                      <div class="preview-item border-bottom">
                        <div class="preview-thumbnail">
                          <img src="../images/head.png" alt="image" class="rounded-circle" />
                        </div>
                        <div class="preview-item-content d-flex flex-grow">
                          <div class="flex-grow">
                            <div class="d-flex d-md-block d-xl-flex justify-content-between">
                              <h6 class="preview-subject">
                              <span th:text="${list.id}"></span>
                              </h6>
                            </div>
                            <p class="text-muted">
                            <span th:text="${list.review}"></span>
                            </p>
                          </div>
                        </div>
                      </div>
                      <div class="preview-item border-bottom">
                        <div class="preview-thumbnail">
                          <img src="../images/head.png" alt="image" class="rounded-circle" />
                        </div>
                        <div class="preview-item-content d-flex flex-grow">
                          <div class="flex-grow">
                            <div class="d-flex d-md-block d-xl-flex justify-content-between">
                              <h6 class="preview-subject">
                              <span th:text="${list.id}"></span>
                              </h6>
                            </div>
                            <p class="text-muted">
                            <span th:text="${list.review}"></span>
                            </p>
                          	</div>
		                   </div>
                        </div>
                      </div>
                      <div class="preview-item border-bottom">
                        <div class="preview-thumbnail">
                          <img src="../images/head.png" alt="image" class="rounded-circle" />
                        </div>
                        <div class="preview-item-content d-flex flex-grow">
                          <div class="flex-grow">
                            <div class="d-flex d-md-block d-xl-flex justify-content-between">
                              <h6 class="preview-subject">
                              <span th:text="${list.id}"></span>
                              </h6>
                            </div>
                            <p class="text-muted">
                            <span th:text="${list.review}"></span>
                          	</div>
		                   </div>
                        </div>
                      </div>
      
	                <div class="card">
	                  <div class="card-body">
	                    <div class="d-flex flex-row justify-content-between">
	                      <h4 class="card-rating">Rating</h4>
	                  	  </div>
              			</div>
              			</div>
              			</div>
              			</div>
              			</div>
              			</tr>
              			
              			
              			
              			<!-- 더보기 버튼 넣기 -->
						<button id="searchMoreNotify" class="btn btn-outline-primary btn-block col-sm-10 mx-auto">더 보기</button>
                	 </div>       
          <!-- content-wrapper ends -->
          <!-- partial:partials/_footer.html -->
          <footer class="footer">
            <div class="d-sm-flex justify-content-center justify-content-sm-between">
              <span class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright © bootstrapdash.com 2020</span>
              <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center"> Free <a href="https://www.bootstrapdash.com/bootstrap-admin-template/" target="_blank">Bootstrap admin templates</a> from Bootstrapdash.com</span>
            </div>
          </footer>
          <!-- partial -->
        </div>
        <!-- main-panel ends -->
      </div>
      <!-- page-body-wrapper ends -->
    </div>
    <!-- container-scroller -->
    <!-- plugins:js -->
    <script src="assets/vendors/js/vendor.bundle.base.js"></script>
    <!-- endinject -->
    <!-- Plugin js for this page -->
    <script src="assets/vendors/chart.js/Chart.min.js"></script>
    <script src="assets/vendors/progressbar.js/progressbar.min.js"></script>
    <script src="assets/vendors/jvectormap/jquery-jvectormap.min.js"></script>
    <script src="assets/vendors/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <script src="assets/vendors/owl-carousel-2/owl.carousel.min.js"></script>
    <!-- End plugin js for this page -->
    <!-- inject:js -->
    <script src="assets/js/off-canvas.js"></script>
    <script src="assets/js/hoverable-collapse.js"></script>
    <script src="assets/js/misc.js"></script>
    <script src="assets/js/settings.js"></script>
    <script src="assets/js/todolist.js"></script>
    <!-- endinject -->
    <!-- Custom js for this page -->
    <script src="assets/js/dashboard.js"></script>
    <!-- End custom js for this page -->
  </body>
</html>