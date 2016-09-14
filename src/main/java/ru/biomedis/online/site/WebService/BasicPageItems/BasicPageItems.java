package ru.biomedis.online.site.WebService.BasicPageItems;

import org.anantacreative.webengine.webcore.Core;

public class BasicPageItems {
    private FooterModule footerModule;

    public BasicPageItems(){
        this.footerModule = null;
    }

    public FooterModule getFooterModule(){
        return new FooterModule(Core.getContext());
    }
}
