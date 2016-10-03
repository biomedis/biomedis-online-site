package ru.biomedis.online.site.WebService.BasicPageItems.Modules;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import ru.biomedis.online.site.WebService.BasicPageItems.Extensions.BasicMenuExtension;
import ru.biomedis.online.site.WebService.BasicPageItems.Extensions.ServiceMenuExtension;
import spark.Request;
import spark.Response;

public class BasicMenuModule extends BaseModule {

    public BasicMenuModule(Core context) {
        super("BasicModules/menu_basic.ftl", context);
    }

    public BasicMenuModule(String tplName, Core context) {
        super(tplName, context);
    }


    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }

    @Override
    protected void moduleLogic(Request request, Response response) {
        BasicMenuExtension basicMenuExtension = (BasicMenuExtension) getContext().getExtension(BasicMenuExtension.tag);
        getRoot().put("menu_items", basicMenuExtension.getMenus());
    }
}
