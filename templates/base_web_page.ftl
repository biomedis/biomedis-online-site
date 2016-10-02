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

    ${service_menu_module}
    ${header_module}


    <div class="row wow fadeInDown" data-wow-duration="0.5s" data-wow-delay="0.2s">
        <div class="col-xs-12 col-sm-12 col-md-9 col-lg-9 left-container">
            <div class="row">
                ${pageContent}
            </div>
        </div>
        <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 right-container">
            ${interesting_follows_module}
            ${popular_topics_module}
        </div>
    </div>

    ${footer_module}

</div>

${service_module}

</body>

</html>