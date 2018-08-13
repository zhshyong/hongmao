<html>
<script type="text/javascript" src="static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="static/bootstrap/js/bootstrap.min.js"></script>
<link  rel="stylesheet" href="static/bootstrap/css/bootstrap.css"/>
<script type="text/javascript" src="js/index.js"></script>
<body>
<!-- Button to trigger modal -->
<a href="#loginModal" role="button" class="btn" data-toggle="modal">登录</a>

<!-- Modal -->
<div id="loginModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="loginModal" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">登录</h3>
    </div>
    <div class="modal-body">
        <form class="form-signin" id="loginFrom">
            <input type="text" name="userName" class="input-block-level" placeholder="UserName">
            <input type="password" name="passWord" class="input-block-level" placeholder="Password">
        </form>
    </div>
    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
        <button class="btn btn-primary" id="submitLogin">登录</button>
    </div>
</div>
</body>
</html>
