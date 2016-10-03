package ru.biomedis.online.site.WebService.Services.ServiceMainPage.Modules;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import spark.Request;
import spark.Response;

public class MainPageIncludeModule extends BaseModule {

    public MainPageIncludeModule(Core context) {
        super("ServiceMainPage/include.ftl", context);
    }

    public MainPageIncludeModule(String tplName, Core context) {
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
