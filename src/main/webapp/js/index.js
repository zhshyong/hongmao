$(function(){
    $('#submitLogin')
        .on('click', function bindEventFunc() {
            console.log(1);
            var data = $('#loginFrom').serialize();
            console.log(data);
            $.ajax({
                url: "/hongmao/login.do",
                data: data,
                type: "POST",
                dataType : 'json',
                success: function (result) {
                    console.log(result);
                    if ('1' === result.code) {
                        $('#loginModal').modal('hide');
                        return;
                    }
                    alert(result.msg);
                },
                error : function() {
                    alert("请求错误！");
                }
            });
        });
});