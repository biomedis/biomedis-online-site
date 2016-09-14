package ru.biomedis.online.site.WebService.StartPage;

import com.google.gson.GsonBuilder;
import org.anantacreative.webengine.webcore.Base.BasePage;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.BasicPageItems.BasicPageItems;
import ru.biomedis.online.site.WebService.BasicPageItems.FooterModule;
import spark.Request;
import spark.Response;

public class StartPage extends BasePage {
    public static final Logger logger = LogManager.getLogger(StartPage.class.getName());

    public StartPage(String tplName, Core context, String path, String ajaxPath) {
        super(tplName, context, path, ajaxPath);
    }

    public StartPage(Core context) {
        this("StartPage/start_page.ftl", context, "/", "");
    }

    @Override
    public void pageLogic(Request request, Response response) {
        BasicPageItems basicPageItems = new BasicPageItems();
        renderBasicModules(request, response, basicPageItems);
    }

    private void renderBasicModules(Request request, Response response, BasicPageItems basicPageItems){
        getRoot().put("footer_module", basicPageItems.getFooterModule().render(request, response));
    }

    @Override
    protected void gsonBuilderInit(GsonBuilder gsonBuilder) {

    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }
}
