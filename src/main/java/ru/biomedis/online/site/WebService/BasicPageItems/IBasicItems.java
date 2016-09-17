package ru.biomedis.online.site.WebService.BasicPageItems;

import org.anantacreative.webengine.webcore.Base.BaseModule;

public interface IBasicItems {
    public BaseModule getFooterModule();
    public BaseModule getHeaderModule();
    public BaseModule getIncludeModule();
    public BaseModule getInterestingFollowsModule();
    public BaseModule getPopularTopicsModule();
    public BaseModule getServiceModule();
    public BaseModule getServiceMenuModule();

}
