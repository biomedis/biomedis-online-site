package ru.biomedis.online.site.WebService.Services.UserPage;

import org.anantacreative.webengine.webcore.Core;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.Services.BaseWebPage;
import ru.biomedis.online.site.WebService.Services.UserPage.Modules.EditUserDataModule;
import ru.biomedis.online.site.WebService.Services.UserPage.Modules.UserIncludeModule;
import spark.Request;
import spark.Response;

public class EditUserData extends BaseWebPage {

    public static final Logger logger = LogManager.getLogger(EditUserData.class.getName());

    public EditUserData(Core context, String path, String ajaxPath) {
        super(context, path, ajaxPath);
    }

    public EditUserData(Core context) {
        super(context, "/editdata", "");
    }

    @Override
    public String getPageContent(Request request, Response response) {
        StringBuilder content = new StringBuilder();
        content.append(new EditUserDataModule(getContext()).render(request, response));
        return content.toString();
    }

    @Override
    public String getAdditionalIncludes(Request request, Response response) {
        StringBuilder includes = new StringBuilder();
        includes.append(new UserIncludeModule(getContext()).render(request, response));
        return includes.toString();
    }
}
