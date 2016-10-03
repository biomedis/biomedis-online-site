package ru.biomedis.online.site.WebService.Services;

import ru.biomedis.online.site.WebService.Services.ServiceMainPage.MainPageModule;
import ru.biomedis.online.site.WebService.Services.UserPage.EditUserData;
import ru.biomedis.online.site.WebService.Services.UserPage.Modules.EditUserDataModule;
import ru.biomedis.online.site.WebService.Services.UserPage.Modules.UserPageModule;

import static org.anantacreative.webengine.webcore.Core.getContext;

public class Modules {
    public Modules() {

    }

    public MainPageModule getMainPageModule(){
        return new MainPageModule(getContext());
    }
    public UserPageModule getUserPageModule(){
        return new UserPageModule(getContext());
    }

    public EditUserDataModule getEditUserDataModule(){
        return new EditUserDataModule(getContext());
    }
}
