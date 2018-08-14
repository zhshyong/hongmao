<html>
<script type="text/javascript" src="static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="static/bootstrap/js/bootstrap.min.js"></script>
<link  rel="stylesheet" href="static/bootstrap/css/bootstrap.css"/>
<script type="text/javascript" src="js/index.js"></script>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="brand" href="/hongmao/index.do">主页</a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                </ul>
                <form class="navbar-form pull-right">
                    <a href="#loginModal" role="button" class="btn" data-toggle="modal">登录</a>
                </form>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>
<div class="container">

    <!-- Main hero unit for a primary marketing message or call to action -->
    <div class="hero-unit">
        <h1>红猫</h1>
        <p>欢迎来到红猫！</p>
    </div>

    <!-- Example row of columns -->
    <div class="row">
        <div class="span4">
            <h2>Heading</h2>
            <p></p>
            <p><a href="#betLet" role="button" class="btn" data-toggle="modal"></a></p>
        </div>
        <div class="span4">
            <h2>Heading</h2>
            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
            <p><a class="btn" href="#">View details »</a></p>
        </div>
        <div class="span4">
            <h2>Heading</h2>
            <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
            <p><a class="btn" href="#">View details »</a></p>
        </div>
    </div>

    <hr>

    <footer>
        <p>© Company 2018</p>
    </footer>

</div>
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
