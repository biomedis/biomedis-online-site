<!DOCTYPE html>
<html>
<head>

    ${include_module}
    <link rel="stylesheet" href="css/service.registration.css"/>

</head>

<body>

<div class="container-fluid main-block">

    ${menu_basic}


    <div class="row reg-main-block wow fadeInUp" data-wow-duration="0.6s" data-wow-delay="0.0s">
        <div class="col-lg-12">
            <h2 class="alg-center clr-darkviolet txt-bold">регистрация</h2>
            <h3 class="alg-center clr-darkviolet txt-bold">Мы будем рады познакомиться с вами</h3>
            <p class="visible-xs-block mgn-top-30 pdng-top-5"></p>
            <div class="row reg-container">
                <div class="col-lg-12">
                    <div>
                        <img src="imagesi/registration/women.png" class="woman"/>
                        <form class="registration-form">
                            <section>
                                <h3 class="alg-left clr-lightgray">Как нам к вам обращаться?</h3>
                                <div class="form-inline alg-center">
                                    <input type="text" class="form-control input-lg" name="firstName" placeholder="Введите ваше имя">
                                    <input type="text" class="form-control input-lg" name="lastName" placeholder="Введите вашу фамилию">
                                    <button type="button" disabled="disabled" class="btn btn-primary next-button btn-lg">Принять</button>
                                </div>

                                <div class="message"></div>
                            </section>

                            <section class="invisible">
                                <h3 class="alg-left clr-lightgray">Придумайте себе короткий логин, чтобы можно было быстрее заходить на сайт</h3>
                                <div class="form-inline">
                                    <input type="text" class="form-control input-lg" name="login" placeholder="Введите логин"/>
                                    <button type="button" disabled="disabled" class="btn btn-primary next-button btn-lg">Принять</button>
                                </div>

                                <div class="message"></div>
                            </section>

                            <section class="invisible">
                                <h3 class="alg-left clr-lightgray">Теперь, когда мызнакомы нам необходимо узнать ваш адрес электронной почты</h3>
                                <div class="form-inline">
                                    <input type="email" class="form-control input-lg" name="email" placeholder="Введите ваш e-mail"/>
                                    <button type="button" disabled="disabled" class="btn btn-primary next-button btn-lg">Принять</button>
                                </div>

                                <div class="message"></div>
                            </section>

                            <section class="invisible">
                                <h3 class="alg-left clr-lightgray">А сейчас придумайте себе хороший пароль, с помощью которого вы будете заходить на сайт</h3>
                                <div class="form-inline">
                                    <input type="password" class="form-control input-lg" name="password" placeholder="Введите пароль"/>
                                    <input type="password" class="form-control input-lg" disabled="disabled" name="passwordCheck" placeholder="Повторите пароль"/>
                                    <button type="button" disabled="disabled" class="btn btn-primary next-button btn-lg">Принять</button>
                                </div>

                                <div class="message"></div>
                            </section>
                            <section class="invisible alg-center">
                                <h3 class="alg-left clr-darkviolet"><b>Отлично!</b> Ваша базовая анкета заполнена. Теперь вы можете зарегистрироваться</h3>
                                <a href="main.html" class="btn btn-lg btn-success">Зарегистрироваться</a>
                                <h5 class="alg-center clr-lightgray">Вы всегда сможете изменить информацию о себе в личном кабинете</h5>
                            </section>
                        </form>


                    </div>
                </div>
            </div>
        </div>
    </div>



    ${footer_module}


</div>

${service_module}

</body>

</html>