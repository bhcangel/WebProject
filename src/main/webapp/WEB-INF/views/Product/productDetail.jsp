<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <script src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="https://unpkg.com/swiper/swiper-bundle.js"></script>
    <script src="${pageContext.request.contextPath}/js/detailProducts.js"></script>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/utilProduct.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/all.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/detailProducts.css">

</head>

<body>

    <header>
        사이트 이름 뭐 넣냐~~~
    </header>

    <!--이미지-->
    <div class="gallery-items">
        <div class="gallery-items-large">
        </div>
        <div class="gallery-items-small">
            <div class="gallery-item-box test1">

            </div>
            <div class="gallery-item-box test2">
            </div>
        </div>
    </div>



    <div class="item row">
        <div>
            <!--슬라이드 메뉴-->
            <div class="sticky-tab">
                <div>클래스 소개</div>
                <div>커리큘럼</div>
                <div>패키지</div>
                <div>수강후기</div>
            </div>
            <!--강의 본문-->
            <div class="item-content">
                <div class="item-content-introduce">
                    <div class="content-title">
                        <h2>강의 소개</h2>
                        <hr>
                    </div>
                    <div class="item-content-info">
                        <div>클래스 분량 <span>11개 챕터, 33개 세부강의</span></div>
                        <div>수강 신청일 <span>2020.08.18(화)</span> ~ <span>2020.08.31(화)</span></div>
                        <div>자막포함여부 <span>포함</span></div>
                        <hr>
                    </div>
                    <div class="item-content-title">
                        <div class="item-content-title-decorate">❝</div>
                        <span></span>
                    </div>
                    <div class="item-content-class-name">그 누구보다, 빠르게 집에 가는 법.</div>
                    <div class="item-content-class-period">
                        <div><span class="info">수업기간</span><br><span class="time"><b>20주</b></span></div>
                        <div><span class="info">수업횟수</span><br><span class="time"><b>40회</b></span></div>
                    </div>
                </div>
                <div class="item-content-curriculum">
                    <span class="content-title">
                        <h2>강의 설명</h2>
                        <hr>
                    </span>
                    <div class="summary-space">
                        <div class="summary-img">
                            <img src="../img/detailProductsImg/1440xauto.jpg">
                        </div>
                        <div class="summary-content">
                            <span>이미지는 상욱이오빠가 준비해줬어요<br>짱짱~</span>
                        </div>

                        <div class="summary-img">
                            <img src="../img/detailProductsImg/1440xauto (1).jpg">
                        </div>
                        <div class="summary-content">
                            <span>이 수업은 집에빠르게 가는 법을 알려주는 강의인데요</span>
                        </div>

                        <div class="summary-img">
                            <img src="../img/detailProductsImg/1440xauto (3).jpg">
                        </div>
                        <div class="summary-content">
                            <span>그건 바로 5시 50분이 땡 치자마자 집에 가버리는거랍니다~ 정말 쉽죠?</span>
                        </div>

                    </div>
                </div>
                <div class="item-content-package">
                    <span class="content-title">
                        <h2>강좌 QnA</h2>
                        <hr>
                    </span>
                    
                    <div class="qna-box-space">
                        <div class="qna-box">
                            <div>
                                Q : <span class="qSpan">무엇을 배우나요?</span><br>
                            </div>
                            <div>
                                A : <span class="aSpan">빠른 탈주방법을 배웁니다</span>
                            </div>
                        </div>

                        <div class="qna-box">
                            <div>
                                Q : <span class="qSpan">집에가면 뭘 하나요?</span><br>
                            </div>
                            <div>
                                A : <span class="aSpan">과자를 사갑니다.</span>
                            </div>
                        </div>

                        <div class="qna-box">
                            <div>
                                Q : <span class="qSpan">장래희망이 뭔가요?</span><br>
                            </div>
                            <div>
                                A : <span class="aSpan">호카게입니다</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item-content-postscript">
                    <span class="content-title">
                        <h2>수강후기</h2>
                        <hr>
                    </span>
                    <div class="review-box-space">
                        <div class="review-box">
                            <span class="review-writer"><b>김첨지</b></span> <span class="review-star">★★★☆☆</span>
                            <span class="review-content">빠르게 집가다 설렁탕을 다 쏟았네요. 만족합니다^^</span>
                        </div>
                        <div class="review-box">
                            <span class="review-writer"><b>박침대</b></span> <span class="review-star">★★★★☆</span>
                            <span class="review-content">침대짱</span>
                        </div>
                        <div class="review-write-box">
                            <form>
                                <span class="review-write-guide">"수강 후기를 작성해주세요!"</span><br>
                                <label>만족도:</label>
                                <select>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                                <input type="text" placeholder="후기는 몇자이내?" size="80">
                                <button type="button">후기 작성하기</button><br>
                            </form>
                        </div>
                    </div>
                </div>

                <div class="item-content-suggest">

                    <span class="content-title">
                        <h2>같은 카테고리의 다른 강좌</h2>
                        <hr>
                    </span>
                    <div class="content-suggest-space">
                        <div class="swiper-container">
                            <div class="swiper-wrapper">
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                                <div class="class-view-minibox swiper-slide">
                                    <div class="class-minibox-img"><img src="../img/banner3.jpg" /></div>
                                    <div class="class-minibox-info">
                                        <span class="class-minibox-cartegory">요리</span><br />
                                        <span class="class-minobox-name">계란으로 만드는 20가지 브런치</span><br />
                                        <hr />
                                        <span class="class-minibox-price">월 32,000원</span><span>(3개월)</span>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-button-next"></div>
                            <div class="swiper-button-prev"></div>
                        </div>
                    </div>
                </div>

            </div>

        </div>
        <!-- 강의 관리 -->
        <div class="info-item">
            <span class="info-class-cartrgory">이것이 진정한 칼퇴</span><br>
            <span class="info-class-name">빠르게 집가기</span><br>
            <span class="info-creator-name">By.철수</span><hr>
            <span class="info-class-price">서울지하철 1300원</span>
            <span>추가금 100원</span><span>지하철 1300원</span>
            <span>왕복 2800원</span>
            <div>뭔가..있ㅇㅁ..</div>
            <div>뭐적지</div>
            <hr>
            <div class="info-class-btns">
                <button type="button" class="info-class-apply-btn">클래스 신청하기</button>
                <button type="button" class="info-class-apply-btn">공유하기</button>
            </div>
        </div>
    </div>
</body>

</html>