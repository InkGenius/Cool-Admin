/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-12-24
 * Time: 12:20
 * To change this template use File | Settings | File Templates.
 */

$(document).ready(function($){
    $(".cancel").click(function(e){

        $(this).parents().find(".modal").modal("hide");

        e.preventDefault();
    })
});