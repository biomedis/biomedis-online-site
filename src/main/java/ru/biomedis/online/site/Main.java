package ru.biomedis.online.site;

import org.anantacreative.webengine.webcore.Core;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.BasicPageItems.Extensions.BasicMenuExtension;
import ru.biomedis.online.site.WebService.BasicPageItems.Extensions.ServiceMenuExtension;
import ru.biomedis.online.site.WebService.InnerServices.LoginPage.LoginPage;
import ru.biomedis.online.site.WebService.InnerServices.SignUpPage.SignUpPage;
import ru.biomedis.online.site.WebService.InnerServices.StartPage.StartPage;
import ru.biomedis.online.site.WebService.Services.ServiceMainPage.ServiceMainPage;
import ru.biomedis.online.site.WebService.Services.UserList.UserListPage;
import ru.biomedis.online.site.WebService.Services.UserPage.EditUserData;
import ru.biomedis.online.site.WebService.Services.UserPage.UserPage;

import java.io.IOException;


public class Main {
    public static final Logger logger = LogManager.getLogger("ru.biomedis.online.site");

    public static void main(String[] args) {
        Core.Config cfg = getConfigFromINI();
        addServiceItemsToCore(cfg);
        sleepCurrentThread();
    }

    private static Core.Config getConfigFromINI(){
        Core.Config cfg;
        try {
            cfg = Core.Config.fromFile();
        } catch (IOException e) {
            logger.error("Не удалось создать Config из  INI файла",e);
            throw new RuntimeException(e);
        }
        return cfg;
    }

    private static void addServiceItemsToCore(Core.Config cfg){
        Core core = Core.buildCore(cfg);
        try{
            addPages(core);
            addExtensions(core);
        } catch (Exception e){
            logger.error(e.getMessage(),e);
        }
    }

    private static void addPages(Core core) throws Exception{
        core.addPage(new StartPage(core));
        core.addPage(new LoginPage(core));
        core.addPage(new SignUpPage(core));

        core.addPage(new ServiceMainPage(core));
        core.addPage(new UserPage(core));
        core.addPage(new EditUserData(core));
        core.addPage(new UserListPage(core));
    }

    private static void addExtensions(Core core) throws Exception{
        core.addExtension(new BasicMenuExtension(core));
        core.addExtension(new ServiceMenuExtension(core));
    }

    private static void sleepCurrentThread(){
        try {
            Thread.currentThread().sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
