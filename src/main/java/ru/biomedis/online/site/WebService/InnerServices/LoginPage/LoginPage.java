package ru.biomedis.online.site.WebService.InnerServices.LoginPage;

import com.google.gson.GsonBuilder;
import org.anantacreative.webengine.webcore.Base.BasePage;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.BasicPageItems.Modules.IncludeModule;
import spark.Request;
import spark.Response;

public class LoginPage extends BasePage {
    public static final Logger logger = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(Core context) {
        super("LoginPage/login_page.ftl", context, "/login", "");
    }

    public LoginPage(String tplName, Core context, String path, String ajaxPath) {
        super(tplName, context, path, ajaxPath);
    }

    @Override
    public void pageLogic(Request request, Response response) {
        getRoot().put("include_module", new IncludeModule(getContext()).render(request, response));
    }

    @Override
    protected void gsonBuilderInit(GsonBuilder gsonBuilder) {

    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }
}
