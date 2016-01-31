/**
 * Created by Administrator on 2015/9/1.
 */
$(document).ready(function(){

    $(".addNewUser").click(function(e){
        var targetUrl = $(this).attr("data-target");
        $.ajax({
            url: targetUrl,
            method:'get',
            dataType:'html',
            success:function(data){
                e.preventDefault();
                $("#myModal").html(data);
                $('#myModal').modal('show');
            }
        });
    });

    $(".userDialogUpdate").click(function(e){
        var guid = "1";

        if($(this).attr("data-value")){
            guid = $(this).attr("data-value");
        }

        var targetUrl = $(this).attr("data-target");
        $.ajax({
            url: targetUrl,
            method:'get',
            data: "guid="+guid,
            dataType:'html',
            success:function(data){
                e.preventDefault();
                $("#myModal").html(data);
                $('#myModal').modal('show');
            }
        });
    });

    $(".order").click(function(){

        var dishes = $("input[name='checkbox']:checkbox").map(function(){
            if($(this).is(':checked')){
                return $(this).val();
            }
        }).get();

        var riches = $("#riches  option:selected").text();
        var targetUrl = $(this).attr("data-target");
        $.ajax({
            url: targetUrl,
            method:'post',
            traditional: true,
            data: {"dishes":dishes,"riches":riches},
            dataType:'html',
            success:function(data){
                $(".consumption").html(data);
            }
        });
    });
});