package ru.biomedis.online.site.WebService.Services;

import com.google.gson.GsonBuilder;
import org.anantacreative.webengine.webcore.Base.BasePage;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.BasicPageItems.BasicPageItems;
import spark.Request;
import spark.Response;

/**
 * Page super class. We use the class for service pages (excepted StartPage)
 */
public abstract class BaseWebPage extends BasePage{

    public static final Logger logger = LogManager.getLogger(BaseWebPage.class.getName());

    public BaseWebPage(Core context, String path, String ajaxPath) {
        super("base_web_page.ftl", context, path, ajaxPath);
    }

    @Override
    public void pageLogic(Request request, Response response) {
        BasicPageItems basicPageItems = new BasicPageItems();

        getRoot().put("include_module", basicPageItems.getIncludeModule().render(request, response));

        getRoot().put("footer_module", basicPageItems.getFooterModule().render(request, response));
        getRoot().put("header_module", basicPageItems.getHeaderModule().render(request, response));
        getRoot().put("service_module", basicPageItems.getServiceModule().render(request, response));
        getRoot().put("service_menu_module", basicPageItems.getServiceMenuModule().render(request, response));

        getRoot().put("interesting_follows_module", basicPageItems.getInterestingFollowsModule().render(request, response));
        getRoot().put("popular_topics_module", basicPageItems.getPopularTopicsModule().render(request, response));



        getRoot().put("pageContent", getPageContent(request, response));
    }

    @Override
    protected void gsonBuilderInit(GsonBuilder gsonBuilder) {

    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }

    public abstract String getPageContent(Request request, Response response);
}
