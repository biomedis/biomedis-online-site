package ru.biomedis.online.site.WebService.BasicPageItems;

import org.anantacreative.webengine.webcore.Base.BaseModule;
import ru.biomedis.online.site.WebService.BasicPageItems.Modules.*;

import static org.anantacreative.webengine.webcore.Core.getContext;

public class BasicPageItems implements IBasicItems{

    @Override
    public BaseModule getFooterModule() {
        return new FooterModule(getContext());
    }

    @Override
    public BaseModule getHeaderModule() {
        return new HeaderModule(getContext());
    }

    @Override
    public BaseModule getIncludeModule() {
        return new IncludeModule(getContext());
    }

    @Override
    public BaseModule getInterestingFollowsModule() {
        return new InterestingFollowsModule(getContext());
    }

    @Override
    public BaseModule getPopularTopicsModule() {
        return new PopularTopicsModule(getContext());
    }

    @Override
    public BaseModule getServiceModule() {
        return new ServiceModule(getContext());
    }

    @Override
    public BaseModule getServiceMenuModule() {
        return new ServiceMenuModule(getContext());
    }
}
