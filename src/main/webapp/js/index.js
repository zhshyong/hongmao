$(function(){

    showGame();
    function showGame(){
        $.ajax({
            url: "/hongmao/getGameList.do",
            type: "GET",
            dataType : 'json',
            success: function (result) {
                console.log(result);
                var ctx = "";
                for (var i = 0; i < result.length; i++) {
                     ctx += "<div class=\"row\">\n" +
                        "            <div class=\"span4\">\n" +
                        "                <h1>" + result[i].gameA + "vs" +result[i].gameB+ "</h1>" +
                        "                <h1>" + result[i].gameA + ":  1比"  +result[i].oddsA+ "</h1>" +
                        "                <h1>" + result[i].gameB + ":  1比"  +result[i].oddsB+ "</h1>" +
                        "                <h2>\n" +
                        "                    <a href=\"#betLet\" role=\"button\" class=\"btn\" data-toggle=\"modal\" style=\"width: 300px;height: 50px;\">\n" +
                        "                        <span style=\"line-height: 50px;\">"+result[i].gameA+"</span>\n" +
                        "                    </a>\n" +
                        "                    <a href=\"#betLet\" role=\"button\" class=\"btn\" data-toggle=\"modal\" style=\"width: 300px;height: 50px; margin-left: 40px;\">\n" +
                        "                        <span style=\"line-height: 50px;\">"+result[i].gameB+"</span>\n" +
                        "                    </a>\n" +
                        "                </h2>\n" +
                        "            </div>\n" +
                        "        </div>"
                }
                $('#context').html("");
                $('#context').html(ctx);
            },
            error : function() {
            }
        });
    };

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