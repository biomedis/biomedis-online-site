
var main = {
    initialize:
        function(){
            new WOW().init();
            $(".dropdown-toggle-js").dropdown();
            $(".dropdown-toggle").dropdown();

            $("a.fancyimage").fancybox();

            $(".scrollup").unbind().click(function(e){
                $('html, body').animate({scrollTop:0},1000);
            });
            $(window).scroll(function() {

                if ($(this).scrollTop()>200) $('.scrollup').fadeIn();
                else $('.scrollup').fadeOut();

            });
            this.registration.initSections();
            this.registration.sectionsListeners.initNameListener();
            this.registration.sectionsListeners.initLoginListener();
        },
    registration: {
        sections: {
            sectionName: "",
            sectionLogin: "",
            sectionEmail: "",
            sectionPassword: "",
            sectionFinish: ""
        },

        initSections: function(){
            this.sections.sectionName = $(".registration-form > section:nth-child(1)");
            this.sections.sectionLogin = $(".registration-form > section:nth-child(2)");
            this.sections.sectionEmail = $(".registration-form > section:nth-child(3)");
            this.sections.sectionPassword = $(".registration-form > section:nth-child(4)");
            this.sections.sectionFinish = $(".registration-form > section:nth-child(5)");
        },

        sectionsListeners: {
            initNameListener: function(){
                var names = $("[name = firstName], [name = lastName]");
                var firstName = $("[name = firstName]");
                var lastName = $("[name = lastName]");
                var nextButton = $("section:nth-child(1) > div.form-inline > button.next-button");
                names.keyup(function(){
                    if(firstName.val()!="" && lastName.val()!=""){
                        nextButton.removeAttr("disabled");
                    } else {
                        nextButton.attr("disabled", "disabled");
                    }
                });
                nextButton.click(function(){
                    nextButton.attr("disabled", "disabled");
                    $("section:nth-child(1) > div.message").append("Приятно познакомиться, <b>" + firstName.val() + " " + lastName.val() + "</b>").fadeIn(600);
                    main.registration.showSection(main.registration.sections.sectionLogin);
                })
            },

            initLoginListener: function(){
                var login = $("[name = login]");
                var message = $("section:nth-child(2) > div.message");
                var nextButton = $("section:nth-child(2) > div.form-inline > button.next-button");

                login.keyup(function(){
                    if(login.val()==""){
                        nextButton.attr("disabled", "disabled");
                        return;
                    }
                    if(main.registration.verifications.isLoginExist(login.val())){
                        nextButton.attr("disabled", "disabled");
                        if(login.hasClass("success")){
                            login.removeClass("success");
                        }
                        if(!login.hasClass("error")){
                            login.addClass("error");
                        }
                        message.hide();
                        message.empty();
                        message.append("Ой, кажется, у кого-то уже есть такой логин! Надо придумать другой...").fadeIn(600);;
                    } else {
                        message.hide();
                        message.empty();
                        if(login.hasClass("error")){
                            login.removeClass("error");
                        }
                        if(!login.hasClass("success")){
                            login.addClass("success");
                        }
                        nextButton.removeAttr("disabled");
                    }

                    nextButton.click(function(){
                        nextButton.attr("disabled", "disabled");
                        message.hide().empty();
                        message.append("Вы придумали отличный логин!").fadeIn(600);
                        main.registration.showSection(main.registration.sections.sectionLogin);
                    })
                })
            }
        },

        showSection: function(section){
                if(section.hasClass("invisible")){
                    section.hide();
                    section.removeClass("invisible");
                    section.slideDown(1300);
                } else {
                    /* добавить фигню для проверки открытия блока и перевижения фокуса */
                    return;
                }
        },

        verifications: {
            /**
             * Заглушка под проверку логина
             * @param login
             * @returns {boolean}
             */
            isLoginExist: function(login){
                if(login=="exist"){
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}


$(document).ready(function(){
    main.initialize();
});