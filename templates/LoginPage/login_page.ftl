<!DOCTYPE html>
<html>
<head>

    ${include_module}
    <link rel="stylesheet" href="css/general.css"/>


</head>

<body>
<div class="back-home"><a href="index.html"><span class="glyphicon glyphicon-chevron-left"></span>Главная</a></div>
<div class="container-fluid" style="background-color:#e9e9e9; padding-bottom:30px;">
    <div class="row">
        <div class="col-lg-12 login-container">
            <div class="login-window">
                <img src="imagesi/logo.png" class="img-responsive center-block wow fadeIn" data-wow-duration="0.8s" data-wow-delay="0.0s"/>
                <br/>
                <div class="fadeIn wow" data-wow-duration="1.4s" data-wow-delay="0.5s">
                    <h3 class="alg-center clr-gray">Зайдите на сайт под своим логином</h3>
                    <form class="login-group form-horizontal">
                        <div class="form-group">
                            <input type="text" required class="form-control input-lg" placeholder="Введите логин" value="vika86">
                        </div>
                        <div class="form-group">
                            <input type="password" required class="form-control input-lg" placeholder="Введите пароль" value="****">
                        </div>
                        <div class="form-group">
                            <div class="col-xs-4 col-sm-3 col-md-3 col-lg-3">
                                <!--<button type="submit" class="btn btn-primary btn-lg">Войти</button>-->
                                <a href="/mainservice" class="btn btn-primary btn-lg">Войти</a>
                            </div>
                            <a href="#" class="col-xs-8  col-sm-9 col-md-9 col-lg-9" style="padding-top:11px;">Забыли пароль?</a>

                        </div>
                    </form>
                    <div class="col-lg-12" style="border-bottom:1px solid #c7c7c7;"></div>
                    <h3 class="alg-center clr-gray">или</h3>
                    <div class="col-lg-12" style="border-bottom:1px solid #c7c7c7;"></div>
                    <div class="alg-center mgn-top-25">
                        <a href="/signup" class="btn btn-success get-started-btn btn-lg">Зарегистрируйтесь</a>
                    </div>

                    <div class="col-lg-12 clr-gray alg-just mgn-top-30">
                        <span class="glyphicon glyphicon-warning-sign"></span> На нашем сервисе у вас не получится зайти, используя учетные данные с сайта <b>biomedis.ru</b>. Поэтому вам необходимо зарегестрироваться, если вы ещё этого не сделали.
                    </div>
                    <div class="col-lg-12 alg-center mgn-top-30 pdng-20" style=background-color:#d5d5d7;">
                        <ul class="list-inline" style="margin:0px; padding:0px;">
                            <li><a href="#">Условия и соглашения</a></li>
                            <li><a href="#">Помощь</a></li>
                            <li><a href="#">Политика конфиденциальности</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>