
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left.jsp" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<aside id="fh5co-hero" class="js-fullheight">
    <div class="flexslider js-fullheight">
        <ul class="slides">
            <li style="background-image: url(images/rip.jpg);">
                <div class="overlay"></div>
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2 text-center js-fullheight slider-text">
                            <div class="slider-text-inner">
                                <h1><strong>Online Cemetery</strong></h1>
                                <h1>Welcome${VID}</h1>

                            </div>
                        </div>
                    </div>
                </div>
            </li>
            <li style="background-image: url(images/img_bg_2.jpg);">
                <div class="overlay"></div>
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2 text-center js-fullheight slider-text">
                            <div class="slider-text-inner">
                                <h1>A modern online cemetery & memorial site</h1>
                                <h2>Since 2023</h2>

                            </div>
                        </div>
                    </div>
                </div>
            </li>
            <li style="background-image: url(images/rip1.jpg);">
                <div class="overlay"></div>
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2 text-center js-fullheight slider-text">
                            <div class="slider-text-inner">
                                <h1>Visit the cemetery with no password, no recurring fees or membership, no advertisements.</h1>
                                <c:set var = "login" value = "${VID}"/>
                                <c:if test = "${login==null}">
                                    <h2>To Purchase a Memorial please : </h2>
                                    <p><a class="btn btn-primary btn-demo popup-vimeo" href="register.jsp"> <i class="icon-monitor"></i> Register </a> <a class="btn btn-primary btn-learn" href="sign_in.jsp"> Sign In <i class="icon-air-play"></i></a></p>
                                </c:if>	

                            </div>
                        </div>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</aside>

<div class="fh5co-narrow-content">
    <h2 class="fh5co-heading animate-box" data-animate-effect="fadeInLeft">Services</h2>
    <div class="row">
        <div class="col-md-6">
            <div class="fh5co-feature animate-box" data-animate-effect="fadeInLeft">
                <div class="fh5co-icon">
                    <i class="icon-settings"></i>
                </div>
                <div class="fh5co-text">
                    <h3>Strategy</h3>
                    <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. </p>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="fh5co-feature animate-box" data-animate-effect="fadeInLeft">
                <div class="fh5co-icon">
                    <i class="icon-search4"></i>
                </div>
                <div class="fh5co-text">
                    <h3>Explore</h3>
                    <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. </p>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="fh5co-feature animate-box" data-animate-effect="fadeInLeft">
                <div class="fh5co-icon">
                    <i class="icon-paperplane"></i>
                </div>
                <div class="fh5co-text">
                    <h3>Direction</h3>
                    <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. </p>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="fh5co-feature animate-box" data-animate-effect="fadeInLeft">
                <div class="fh5co-icon">
                    <i class="icon-params"></i>
                </div>
                <div class="fh5co-text">
                    <h3>Expertise</h3>
                    <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. </p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="fh5co-narrow-content">
    <h2 class="fh5co-heading animate-box" data-animate-effect="fadeInLeft">Recent Blog</h2>
    <div class="row row-bottom-padded-md">
        <div class="col-md-3 col-sm-6 col-padding animate-box" data-animate-effect="fadeInLeft">
            <div class="blog-entry">
                <a href="#" class="blog-img"><img src="images/img-1.jpg" class="img-responsive" alt="Free HTML5 Bootstrap Template by FreeHTML5.co"></a>
                <div class="desc">
                    <h3><a href="#">Inspirational Website</a></h3>
                    <span><small>by Admin </small> / <small> Web Design </small> / <small> <i class="icon-comment"></i> 14</small></span>
                    <p>Design must be functional and functionality must be translated into visual aesthetics</p>
                    <a href="#" class="lead">Read More <i class="icon-arrow-right3"></i></a>
                </div>
            </div>
        </div>
        <div class="col-md-3 col-sm-6 col-padding animate-box" data-animate-effect="fadeInLeft">
            <div class="blog-entry">
                <a href="#" class="blog-img"><img src="images/img-2.jpg" class="img-responsive" alt="Free HTML5 Bootstrap Template by FreeHTML5.co"></a>
                <div class="desc">
                    <h3><a href="#">Inspirational Website</a></h3>
                    <span><small>by Admin </small> / <small> Web Design </small> / <small> <i class="icon-comment"></i> 14</small></span>
                    <p>Design must be functional and functionality must be translated into visual aesthetics</p>
                    <a href="#" class="lead">Read More <i class="icon-arrow-right3"></i></a>
                </div>
            </div>
        </div>
        <div class="col-md-3 col-sm-6 col-padding animate-box" data-animate-effect="fadeInLeft">
            <div class="blog-entry">
                <a href="#" class="blog-img"><img src="images/img-3.jpg" class="img-responsive" alt="Free HTML5 Bootstrap Template by FreeHTML5.co"></a>
                <div class="desc">
                    <h3><a href="#">Inspirational Website</a></h3>
                    <span><small>by Admin </small> / <small> Web Design </small> / <small> <i class="icon-comment"></i> 14</small></span>
                    <p>Design must be functional and functionality must be translated into visual aesthetics</p>
                    <a href="#" class="lead">Read More <i class="icon-arrow-right3"></i></a>
                </div>
            </div>
        </div>
        <div class="col-md-3 col-sm-6 col-padding animate-box" data-animate-effect="fadeInLeft">
            <div class="blog-entry">
                <a href="#" class="blog-img"><img src="images/img-4.jpg" class="img-responsive" alt="Free HTML5 Bootstrap Template by FreeHTML5.co"></a>
                <div class="desc">
                    <h3><a href="#">Inspirational Website</a></h3>
                    <span><small>by Admin </small> / <small> Web Design </small> / <small> <i class="icon-comment"></i> 14</small></span>
                    <p>Design must be functional and functionality must be translated into visual aesthetics</p>
                    <a href="#" class="lead">Read More <i class="icon-arrow-right3"></i></a>
                </div>
            </div>
        </div>
    </div>
</div>

<div id="get-in-touch">
    <div class="fh5co-narrow-content">
        <div class="row">
            <div class="col-md-4 animate-box" data-animate-effect="fadeInLeft">
                <h1 class="fh5co-heading-colored">Get in touch</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 col-md-offset-3 col-md-pull-3 animate-box" data-animate-effect="fadeInLeft">
                <p class="fh5co-lead">Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
                <p><a href="#" class="btn btn-primary">Learn More</a></p>
            </div>

        </div>
    </div>
</div>
</div>


<%@ include file="/includes/footer.jsp" %>

