package ru.biomedis.online.site.WebService.Services.UserPage;

import org.anantacreative.webengine.webcore.Core;
import ru.biomedis.online.site.WebService.Services.BaseWebPage;
import ru.biomedis.online.site.WebService.Services.UserPage.Modules.UserIncludeModule;
import ru.biomedis.online.site.WebService.Services.UserPage.Modules.UserPageModule;
import spark.Request;
import spark.Response;

public class UserPage extends BaseWebPage {

    public UserPage(Core context, String path, String ajaxPath) {
        super(context, path, ajaxPath);
    }

    public UserPage(Core context) {
        super(context, "/userdata", "");
    }

    @Override
    public String getPageContent(Request request, Response response) {
        StringBuilder content = new StringBuilder();
        content.append(new UserPageModule(getContext()).render(request, response));
        return content.toString();
    }

    @Override
    public String getAdditionalIncludes(Request request, Response response) {
        StringBuilder includes = new StringBuilder();
        includes.append(new UserIncludeModule(getContext()).render(request, response));
        return includes.toString();
    }
}
