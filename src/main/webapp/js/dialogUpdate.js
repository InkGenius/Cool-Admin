/**
 * Created by Administrator on 2015/9/1.
 */
$(document).ready(function(){
    $(".userDialogUpdate").click(function(e){
        var id = "1";

        if($(this).attr("data-value")){
            id = $(this).attr("data-value");
        }

        var targetUrl = $(this).attr("data-target");
        $.ajax({
            url: targetUrl,
            method:'get',
            data: "id="+id,
            dataType:'html',
            success:function(data){
                e.preventDefault();
                $("#myModal").html(data);
                $('#myModal').modal('show');
            }
        });
    });
});