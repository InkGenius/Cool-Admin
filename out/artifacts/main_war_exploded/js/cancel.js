/**
 * Created with IntelliJ IDEA.
 * User: yifan
 * Date: 13-11-12
 * Time: 上午1:10
 * To change this template use File | Settings | File Templates.
 */

$(document).ready(function($){
    $(".cancel").click(function(e){

        $(this).parents().find(".modal").modal("hide");

        e.preventDefault();
    })
})($)