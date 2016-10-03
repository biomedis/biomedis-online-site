package ru.biomedis.online.site.WebService.Services;

import com.google.gson.GsonBuilder;
import org.anantacreative.webengine.webcore.Base.BasePage;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.BasicPageItems.Modules.*;
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

        getRoot().put("include_module", new IncludeModule(getContext()).render(request, response));

        if(getAdditionalIncludes(request, response) != null){
            getRoot().put("additional_includes", getAdditionalIncludes(request, response));
        }


        getRoot().put("footer_module", new FooterModule(getContext()).render(request, response));
        getRoot().put("header_module", new HeaderModule(getContext()).render(request, response));
        getRoot().put("service_module", new ServiceModule(getContext()).render(request, response));
        getRoot().put("service_menu_module", new ServiceMenuModule(getContext()).render(request, response));

        getRoot().put("interesting_follows_module", new InterestingFollowsModule(getContext()).render(request, response));
        getRoot().put("popular_topics_module", new PopularTopicsModule(getContext()).render(request, response));



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

    public abstract String getAdditionalIncludes(Request request, Response response);
}
