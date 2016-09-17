<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link rel="stylesheet" href="css/bootstrap-theme.min.css"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/animate.css"/>
    <link rel="stylesheet" href="fancybox/jquery.fancybox.css"/>

    <link rel="stylesheet" href="css/acwg.textcss.css"/>
    <link rel="stylesheet" href="css/general.service-module.css"/>
    <link rel="stylesheet" href="css/service.mainmenu.css"/>
    <link rel="stylesheet" href="css/service.footer.css"/>

    <script src="js/jquery-1.12.0.min.js"></script>
    <script src="fancybox/jquery.fancybox.pack.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/wow.min.js"></script>
    <script src="js/general-scripts.js"></script>

    <title>Biomedis Online</title>

</head>

<body>

<div class="container-fluid main-block">

    ${}

    <div class="row user-header wow fadeInDown" data-wow-duration="0.5s" data-wow-delay="0.6s">
        <div class="col-lg-12">
            <div class="col-xs-6 col-sm-3 col-md-2 col-lg-2">
                <img src="imagesi/me.jpg" class="user-photo"/>
            </div>
            <div class="col-xs-6 col-sm-4 col-md-4 col-lg-4 user-info-block">
                <h3 class="user-name clr-white">Виктория Кравцова</h3>
                <h4 class="user-city clr-white">г. Санкт-Петербург</h4>
            </div>
            <div class="col-sm-3 col-md-4 col-lg-4 hidden-xs user-status">
                <div class="alg-center">
                    <h4>Пользователь <b>@vika86</b></h4>
                    <h4>Врач-диетолог</h4>
                </div>
            </div>
            <div class="col-lg-2 hidden-xs"></div>
            <div class="clearfix"></div>
            <div class="col-xs-6 visible-xs-block"></div>
            <div class="col-xs-6 col-sm-12 col-md-12 col-lg-12 alg-center user-navigation">
                <ul class="list-inline">
                    <li class="visible-xs-block  dropup active" style="width:60px;">
                        <a class="dropdown-toggle active" data-toggle="dropdown" href="#">меню</a>
                        <ul class="dropdown-menu" role="menu"  aria-labelledby="dLabel">
                            <li><a href="main.html" class="active">сервисы</a></li>
                            <li><a href="userdata.html">данные</a></li>
                            <li><a href="messages.hhrml">сообщения (3)</a> </li>
                            <li><a href="allsubscribes.html">подписки</a></li>
                        </ul>
                    </li>
                    <li class="active hidden-xs"><a href="main.html" class="active">сервисы</a></li>
                    <li class="hidden-xs"><a href="userdata.html">данные</a></li>
                    <li class="hidden-xs"><a href="messages.html">сообщения</a>&nbsp;<span class="badge" style="margin-bottom:3px;" title="У вас 3 новых сообщения">3</span></li>
                    <li class="hidden-xs"><a href="allsubscribes.html">подписки</a></li>
                </ul>
            </div>

        </div>
    </div>

    <div class="row wow fadeInDown" data-wow-duration="0.5s" data-wow-delay="0.2s">
        <div class="col-xs-12 col-sm-12 col-md-9 col-lg-9 left-container">
            <div class="row">
                ${content}
            </div>
        </div>
        <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 right-container">
            ${interesting_follows}
            ${popular_topics}
        </div>
    </div>

    ${footer_module}

</div>

${service_module}

</body>

</html>