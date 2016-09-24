package ru.biomedis.online.site.WebService.Services;

import ru.biomedis.online.site.WebService.Services.ServiceMainPage.TestModule;

import static org.anantacreative.webengine.webcore.Core.getContext;

public class Modules {
    public Modules() {

    }

    public TestModule getNewTestModule(){
        return new TestModule(getContext());
    }
}
