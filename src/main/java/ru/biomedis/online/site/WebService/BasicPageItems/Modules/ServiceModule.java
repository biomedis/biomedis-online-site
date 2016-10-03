package ru.biomedis.online.site.WebService.BasicPageItems.Modules;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import spark.Request;
import spark.Response;

public class ServiceModule extends BaseModule {

    public ServiceModule(Core context) {
        super("BasicModules/service_module.ftl", context);
    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }

    @Override
    protected void moduleLogic(Request request, Response response) {

    }
}
