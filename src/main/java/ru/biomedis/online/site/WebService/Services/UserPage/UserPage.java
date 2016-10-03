package ru.biomedis.online.site.WebService.Services.UserPage;

import org.anantacreative.webengine.webcore.Core;
import ru.biomedis.online.site.WebService.Services.BaseWebPage;
import ru.biomedis.online.site.WebService.Services.Modules;
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
        Modules modules = new Modules();
        StringBuilder content = new StringBuilder();
        content.append(modules.getUserPageModule().render(request, response));
        return content.toString();
    }
}
