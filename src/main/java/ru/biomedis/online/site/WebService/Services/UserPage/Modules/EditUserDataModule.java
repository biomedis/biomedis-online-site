package ru.biomedis.online.site.WebService.Services.UserPage.Modules;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.Services.UserPage.EditUserData;
import spark.Request;
import spark.Response;

public class EditUserDataModule extends BaseModule {

    public static final Logger logger = LogManager.getLogger(EditUserData.class.getName());

    public EditUserDataModule(Core context) {
        super("User/edit_user_data.ftl", context);
    }

    public EditUserDataModule(String tplName, Core context) {
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
