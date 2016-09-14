package ru.biomedis.online.site.WebService.BasicPageItems;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import spark.Request;
import spark.Response;

public class FooterModule extends BaseModule {

    public FooterModule(String tplName, Core context) {
        super(tplName, context);
    }

    public FooterModule(Core context) {
        this("BasicModules/footer.ftl", context);
    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }

    @Override
    protected void moduleLogic(Request request, Response response) {

    }
}
