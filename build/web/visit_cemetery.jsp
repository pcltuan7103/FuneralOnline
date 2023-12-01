<%@page contentType="text/html" import="model.*,java.util.*" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left.jsp" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="fh5co-narrow-content">
    <h2 class="fh5co-heading animate-box" data-animate-effect="fadeInLeft">Memorials</h2>
    <div class="row row-bottom-padded-md">
        <c:forEach items="${FULLLIST}" var="s">
            <div class="col-md-3 col-sm-6 col-padding animate-box" data-animate-effect="fadeInLeft">
                <div class="blog-entry">
                    <a href="#" class="blog-img"><img src="images/${s.getImgURL()}" class="img-responsive" alt="Free HTML5 Bootstrap Template by FreeHTML5.co"></a>
                    <div class="desc">
                        <h3><a href="#">${s.getName()}</a></h3>
                        <span><small>${s.getRange()} </small><small>/${s.getmId()} </small></span>
                        <p>${s.getShortdescript()}</p>
                        <a href="#" class="lead">Visit <i class="icon-arrow-right3"></i></a>
                    </div>
                </div>
            </div>
        </c:forEach>  
    </div>
    <div id="get-in-touch">
        <div class="fh5co-narrow-content">
            <div class="row">
                <div class="col-md-6 col-md-offset-3 col-md-pull-3 animate-box" data-animate-effect="fadeInLeft">
                    <a href="list?index=${tag-1}" class="btn btn-primary ${tag==1?"disabled":""}">Previous</a>
                    <c:forEach begin="1" end="${endP}" var="i">
                        <a href="list?index=${i}" class="btn btn-primary ${tag==i?"active":""}">${i}</a>
                    </c:forEach> 
                    <a href="list?index=${tag+1}" class="btn btn-primary ${tag==endP?"disabled":""}">Next</a>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="/includes/footer.jsp" %>