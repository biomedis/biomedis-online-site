package ru.biomedis.online.site.WebService.BasicPageItems.Extensions;

import org.anantacreative.webengine.webcore.Base.BaseExtension;
import org.anantacreative.webengine.webcore.Core;
import org.anantacreative.webengine.webcore.data.CoreData.MenuItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class BasicMenuExtension extends BaseExtension{
    private Core context;

    public static final Logger logger = LogManager.getLogger(BasicMenuExtension.class.getClass());
    public static final String tag = "basic_menu";

    public BasicMenuExtension(Core context) {
        super(context);
        this.context = context;
        if(!context.getModel().getMenuModel().hasTag(tag)){
            boolean res = context.getModel().getMenuModel().createRoot("Главное меню на стартовой странице", "Допустим только один уровень вложенности", tag);
            if(!res){
                logger.error("Menu root creation error");
            }
        }
    }

    public List<MenuItem> getMenus(){
        return getContext().getModel().getMenuModel().findRootMenuItemsByTag(getTag());
    }

    @Override
    public String getTag() {
        return tag;
    }
}
