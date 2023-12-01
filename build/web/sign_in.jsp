<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left.jsp" %>
<div class="fh5co-narrow-content animate-box" data-animate-effect="fadeInLeft">

    <div class="row">
        <div class="col-md-4">
            <h2>Login Page</h2>
            <label style="color:red;">${msg}</label>
        </div>
    </div>                           
    <form action="login" method="POST">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <input type="email" class="form-control" placeholder="Email" name="email" >
                        </div>
                        <div class="form-group">
                            <a href="register.jsp" class="btn btn-primary btn-md" role="button">Register</a>
                        </div>

                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Password" name="password" >
                        </div>

                        <div class="form-group">
                            <input type="submit" class="btn btn-primary btn-md" value="Sign in">
                        </div>
                    </div>

                </div>
            </div>

        </div>
    </form>
</div>

<%@ include file="/includes/footer.jsp" %>