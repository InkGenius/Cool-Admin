/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-11-22
 * Time: 下午2:18
 * To change this template use File | Settings | File Templates.
 */

$(document).ready(function($){

    $(".dropdown-menu li").on("click",function(){
        var selectedText = $(this).text();
        var $input = $(this).parent().siblings("#roleText");
        $input.val(selectedText);
    });

    //button 在表单提交时不会提交role的信息，要添加一个隐藏的input元素
    //$("form").on("submit",function(){
    //    var $rolename = $(this).find("#role");
    //    var $input = $("<input>").attr("type","hidden").attr("name","roleText").attr("value",$rolename.text());
    //    $(this).append($input);
    //});
})($);