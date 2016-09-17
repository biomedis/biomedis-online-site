package ru.biomedis.online.site.WebService.Services.ServiceMainPage;

import org.anantacreative.webengine.webcore.Core;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.Services.BaseWebPage;
import spark.Request;
import spark.Response;

public class ServiceMainPage extends BaseWebPage {
    public static final Logger logger = LogManager.getLogger(ServiceMainPage.class.getName());

    public ServiceMainPage(Core context) {
        super(context, "/main", "");
    }

    @Override
    public String getPageContent(Request request, Response response) {
        StringBuilder content = new StringBuilder();

        return null;
    }
}
