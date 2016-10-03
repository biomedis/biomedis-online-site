package ru.biomedis.online.site.WebService.Services.ServiceMainPage;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import spark.Request;
import spark.Response;

public class MainPageModule extends BaseModule {

    public MainPageModule(String tplName, Core context) {
        super(tplName, context);
    }

    public MainPageModule(Core context) {
        super("ServiceMainPage/main_page.ftl", context);
    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }

    @Override
    protected void moduleLogic(Request request, Response response) {

    }
}
