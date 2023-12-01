<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left.jsp" %>
<div class="fh5co-narrow-content animate-box" data-animate-effect="fadeInLeft">

    <div class="row">
        <div class="col-md-4">
            <h2>Purchase a new Memorial</h2>
        </div>
    </div>                           
    <form action="create" method="POST" enctype="multipart/form-data">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Name of the Deceased at Death" name="name" >
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Date of Birth" name="date_of_birth" >
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Place of Birth" name="place_of_birth" >
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Date of Death" name="date_of_death" >
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Place of Death" name="place_of_death" >
                        </div>
                  
                        <div class="form-group">
                            <textarea name="description" id="message" cols="30" rows="6" class="form-control" placeholder="EPITAPH, OBITUARY, or EULOGY"></textarea>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-primary btn-md" value="Purchase ">
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <input type="text" class="form-control" name="resting_place" placeholder="Resting Place">
                        </div>                          
                        <div class="form-group">
                            <label>Photo</label>
                            <input type="file" class="btn-md" name="imgURL">
                        </div>
                    </div>

                </div>
            </div>

        </div>
    </form>
    <form action="donate.jsp" method="post" target="_blank">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-6">
                        <input type="hidden" name="vId" value="${VID}">
                        <input type="hidden" name="fund" value="90"/>
                        <div class="form-group">
                            <input type="submit" class="btn btn-primary btn-md" value="Contribute">
                        </div>
                    </div>
                    <div class="col-md-6">
                        
                    </div>

                </div>
            </div>

        </div>
    </form>
</div>

<%@ include file="/includes/footer.jsp" %>