<%@ include file="/includes/header.jsp" %>
<jsp:useBean id="d" class="model.Donation" scope="session" />
<jsp:setProperty name="d" property="*" />
<div class="container">
    <div class="panel panel-success">
        <form action="donate" method="POST">
            <h2> Donate 90$</h2>

            <input type="submit" value="Donate" />
            
        </form>

    </div>

</div>



<%@ include file="/includes/footer.jsp" %>