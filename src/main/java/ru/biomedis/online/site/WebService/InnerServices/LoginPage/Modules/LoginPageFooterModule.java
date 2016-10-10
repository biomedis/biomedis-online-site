package ru.biomedis.online.site.WebService.InnerServices.LoginPage.Modules;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spark.Request;
import spark.Response;

public class LoginPageFooterModule extends BaseModule {
    public static final Logger logger = LogManager.getLogger(LoginPageFooterModule.class.getName());

    public LoginPageFooterModule(Core context) {
        super("LoginPage/footer_module.ftl", context);
    }

    public LoginPageFooterModule(String tplName, Core context) {
        super(tplName, context);
    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }

    @Override
    protected void moduleLogic(Request request, Response response) {

    }
}
