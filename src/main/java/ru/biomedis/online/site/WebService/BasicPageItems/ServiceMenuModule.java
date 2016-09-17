package ru.biomedis.online.site.WebService.BasicPageItems;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spark.Request;
import spark.Response;

public class ServiceMenuModule extends BaseModule {
    public static final Logger logger = LogManager.getLogger(ServiceMenuModule.class.getName());

    public ServiceMenuModule(Core context) {
        super("BasicModules/service_menu.ftl", context);
    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }

    @Override
    protected void moduleLogic(Request request, Response response) {
        ServiceMenuExtension serviceMenuExtension = (ServiceMenuExtension) getContext().getExtension(ServiceMenuExtension.tag);
        getRoot().put("menu_items", serviceMenuExtension.getMenus());
    }
}
