package ru.biomedis.online.site.WebService.Services.UserList;

import com.google.gson.GsonBuilder;
import org.anantacreative.webengine.webcore.Base.BasePage;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.Services.BaseWebPage;
import ru.biomedis.online.site.WebService.Services.UserList.Modules.UserListIncludeModule;
import ru.biomedis.online.site.WebService.Services.UserList.Modules.UserListModule;
import spark.Request;
import spark.Response;

/**
 * Class to represent user list on the page. Used module with user list template and include. The class provides rendered content and includes
 */
public class UserListPage extends BaseWebPage {
    public static final Logger logger = LogManager.getLogger(UserListPage.class.getName());

    public UserListPage(Core context, String path, String ajaxPath) {
        super(context, path, ajaxPath);
    }

    public UserListPage(Core context) {
        super(context, "/users", "");
    }

    @Override
    public String getPageContent(Request request, Response response) {
        StringBuilder content = new StringBuilder();
        content.append(new UserListModule(getContext()).render(request, response));
        return content.toString();
    }

    @Override
    public String getAdditionalIncludes(Request request, Response response) {
        StringBuilder include = new StringBuilder();
        include.append(new UserListIncludeModule(getContext()).render(request, response));
        return include.toString();
    }
}
