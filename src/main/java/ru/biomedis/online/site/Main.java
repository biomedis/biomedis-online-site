package ru.biomedis.online.site;

import org.anantacreative.webengine.webcore.Core;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.biomedis.online.site.WebService.BasicPageItems.ServiceMenuExtension;
import ru.biomedis.online.site.WebService.InnerServices.StartPage.StartPage;
import ru.biomedis.online.site.WebService.Services.ServiceMainPage.ServiceMainPage;

import java.io.IOException;


public class Main {
    public static final Logger logger = LogManager.getLogger("ru.biomedis.online.site");

    public static void main(String[] args)
    {
        //  Core.Config cfg=new Core.Config();

        Core.Config cfg= null;
        try {
            cfg = Core.Config.fromFile();
        } catch (IOException e) {
            logger.error("Не удалось создать Config из  INI файла",e);
            throw new RuntimeException(e);
        }

        Core core = Core.buildCore(cfg);


        try{
            core.addPage(new StartPage(core));
            core.addExtension(new ServiceMenuExtension(core));
            core.addPage(new ServiceMainPage(core));
        } catch (Exception e){
            logger.error(e.getMessage(),e);
        }

        try {
            Thread.currentThread().sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
