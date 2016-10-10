package ru.biomedis.online.site.WebService.Services.UserList.Modules;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.ajaxresponse.SimpleAjaxJSONResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spark.Request;
import spark.Response;

public class UserListModule extends BaseModule {
    public static final Logger logger = LogManager.getLogger(UserListModule.class.getName());

    public UserListModule(String tplName, Core context) {
        super(tplName, context);
    }

    public UserListModule(Core context) {
        super("UserList/users.ftl", context);
    }

    @Override
    public SimpleAjaxJSONResponse moduleLogicJSON(Request request, Response response) throws Exception {
        return null;
    }

    @Override
    protected void moduleLogic(Request request, Response response) {

    }
}
