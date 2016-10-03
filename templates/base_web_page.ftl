<!DOCTYPE html>
<html>
<head>

    ${include_module}

        <link rel="stylesheet" href="css/general.service-module.css"/>

    <#if additional_includes??>
        ${additional_includes}
    </#if>

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