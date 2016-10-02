package ru.biomedis.online.site.WebService.BasicPageItems;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spark.Request;
import spark.Response;

public class PopularTopicsModule extends BaseModule {
    public static final Logger logger = LogManager.getLogger(PopularTopicsModule.class.getName());


    public PopularTopicsModule(Core context) {
        super("BasicModules/popular_topics.ftl", context);
    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }

    @Override
    protected void moduleLogic(Request request, Response response) {

    }
}
