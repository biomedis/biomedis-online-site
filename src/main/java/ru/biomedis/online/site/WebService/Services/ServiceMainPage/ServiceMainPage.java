package ru.biomedis.online.site.WebService.Services.ServiceMainPage;

import org.anantacreative.webengine.webcore.Core;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.Services.BaseWebPage;
import ru.biomedis.online.site.WebService.Services.ServiceMainPage.Modules.MainPageModule;
import spark.Request;
import spark.Response;

public class ServiceMainPage extends BaseWebPage {
    public static final Logger logger = LogManager.getLogger(ServiceMainPage.class.getName());

    public ServiceMainPage(Core context) {
        super(context, "/mainservice", "");
    }

    @Override
    public String getPageContent(Request request, Response response) {
        StringBuilder content = new StringBuilder();
        content.append(new MainPageModule(getContext()).render(request, response));
        return content.toString();
    }

    @Override
    public String getAdditionalIncludes(Request request, Response response) {
        return null;
    }


}
