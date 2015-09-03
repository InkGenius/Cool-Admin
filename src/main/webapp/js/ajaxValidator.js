/**
 * Created by Administrator on 2015/9/2.
 */

$(document).ready(function(){

    $("#username").blur(function(e){

        var username = $("input[id='username']").attr("value");
        if(username){

        }
        $.ajax({
            url: "/admin/ajaxValidateUsername.html",
            method:'post',
            data: "username="+username,
            dataType:'html',
            success:function(data){
                e.preventDefault();
                $("#myModal").html(data);
                $('#myModal').modal('show');
            }
        });
    });
});