package ru.biomedis.online.site.WebService.InnerServices.SignUpPage;

import com.google.gson.GsonBuilder;
import org.anantacreative.webengine.webcore.Base.BasePage;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.BasicPageItems.Modules.BasicMenuModule;
import ru.biomedis.online.site.WebService.BasicPageItems.Modules.FooterModule;
import ru.biomedis.online.site.WebService.BasicPageItems.Modules.IncludeModule;
import ru.biomedis.online.site.WebService.BasicPageItems.Modules.ServiceModule;
import spark.Request;
import spark.Response;

public class SignUpPage extends BasePage {
    public static final Logger logger = LogManager.getLogger(SignUpPage.class.getName());

    public SignUpPage(Core context) {
        super("SingUp/sign_up.ftl", context, "/signup", "");
    }

    public SignUpPage(String tplName, Core context, String path, String ajaxPath) {
        super(tplName, context, path, ajaxPath);
    }

    @Override
    public void pageLogic(Request request, Response response) {
        getRoot().put("include_module", new IncludeModule(getContext()).render(request, response));
        getRoot().put("service_module", new ServiceModule(getContext()).render(request, response));
        getRoot().put("footer_module", new FooterModule(getContext()).render(request, response));
        getRoot().put("menu_basic", new BasicMenuModule(getContext()).render(request, response));

    }

    @Override
    protected void gsonBuilderInit(GsonBuilder gsonBuilder) {

    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }
}
