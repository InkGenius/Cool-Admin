$(document).ready(function() {
    $('#defaultForm').formValidation({
        message: 'This value is not valid',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            username: {
                message: '用户名不符合要求！',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空！'
                    },
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: '用户名必须多于6个，少于30 个字符！'
                    },
                    //regexp: {
                    //    regexp: /^[a-zA-Z0-9_\.]+$/,
                    //    message: '用户名只能由字母，数字，下划线组成！'
                    //},
                    remote:{
                        url: '/admin/ajaxValidateUsername.html',
                        message: '用户名已存在！',
                        type: 'GET'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: '邮箱地址不能为空！'
                    },
                    emailAddress: {
                        message: '邮箱格式不正确！'
                    },
                    remote:{
                        url: '/admin/ajaxValidateEmail.html.html',
                        message: '邮箱已注册！',
                        type: 'POST'
                    }

                }
            },
            phoneNumber: {
                validators: {
                    notEmpty: {
                        message: '电话号码不能为空！'
                    },
                    phone: {
                        message: '输入不是一个合法的电话号码！',
                        country: 'CN'
                    }
                }
            },
            password: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空！'
                    }
                }
            },
            confirmPassword: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空！'
                    },
                    identical: {
                        field: 'password',
                        message: '密码不一致！'
                    }
                }
            }
        }
    });
});