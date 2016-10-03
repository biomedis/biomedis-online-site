<div class="col-lg-12 title-data-user">
    <ul class="list-inline alg-center">
        <li>
            <h4 class="clr-darkviolet text-uppercase">редактирование данных</h4>
        </li>
    </ul>

</div>

<ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#panel1">Основные</a></li>
    <li><a data-toggle="tab" href="#panel2">Дополнительные</a></li>
    <li class="dropdown">
        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
            Настройки
            <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
            <li><a data-toggle="tab" href="#panel3">Безопаность</a></li>
            <li><a data-toggle="tab" href="#panel4">Приватность</a></li>
            <li><a data-toggle="tab" href="#panel6">Уведомления</a></li>
            <li><a data-toggle="tab" href="#panel5">Настройки блога</a></li>
        </ul>
    </li>
</ul>

<div class="tab-content edit-tabs">
    <div id="panel1" class="tab-pane fade in active">
        <h3>Основные данные</h3>
        <form>
            <div class="col-lg-12 edit-item">
                <div class="form-group form-inline">
                    <label class="input-lg col-xs-12 col-sm-3 col-md-3 col-lg-3">Логин</label> <input type="text" class="form-control input-lg" placeholder="Введите логин" name="login"value="vika86"/>
                </div>
            </div>

            <div class="col-lg-12 edit-item">
                <div class="form-group form-inline">
                    <label class="input-lg col-xs-12 col-sm-3 col-md-3 col-lg-3">Имя, фамилия</label> <input type="text" class="form-control input-lg" placeholder="Введите имя" value="Виктория" name="firstName"/>
                    <input type="text" name="lastName" class="form-control input-lg" placeholder="Введите фамилию" value="Кравцова"/>
                </div>
            </div>

            <div class="col-lg-12 edit-item">
                <div class="form-group form-inline">
                    <label class="input-lg col-xs-12 col-sm-3 col-md-3 col-lg-3">Город или регион</label>
                    <select name="town" class="input-lg" style="max-width:100%;">
                        <option>Санкт-Петербург</option>
                        <option>Москва</option>
                        <option>Московская область</option>
                        <option>Калуга</option>
                        <option>Архангельск</option>
                        <option>Изенгард</option>
                        <option>Мордор</option>
                        <option>Штормград</option>
                        <option>Минас-Тирит Благословенный</option>
                    </select>
                </div>
            </div>
            <button class="btn btn-primary btn-lg center-block"><span class="glyphicon glyphicon-ok"></span> Сохранить изменения</button>
        </form>
    </div>
    <div id="panel2" class="tab-pane fade">
        <h3>Дополнительные данные</h3>
        <form>

            <div class="col-lg-12 edit-item bottom-border top-border">
                <div class="form-group form-inline">

                    <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3">
                        <img src="imagesi/me.jpg" class="data-user-photo"/>
                    </div>
                    <div class="col-xs-12 col-sm-9 col-md-9 col-lg-9 alg-center" style="margin-top:30px; padding-top:20px;">
                        <label class="input-lg">Выбрать новую фотографию</label>
                        <input type="file" accept="image/jpeg, image/png/ image/gif" class="center-block" name="new-photo"/>
                        <label class="input-sm">Поддерживается загрузка изображений JPG, GIF, PNG</label>
                    </div>
                </div>
            </div>

            <div class="col-lg-12 edit-item">
                <div class="form-group form-inline">
                    <label class="input-lg col-xs-12 col-sm-3 col-md-3 col-lg-3">Должность</label>
                    <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
                        <input type="text" class="form-control input-lg" name="position" placeholder="Введите должность на вашей работе" value="Врач-диетолог"/>
                    </div>
                    <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2">
                        <input type="text" class="input-lg form-control" name="user-exp" placeholder="0" value="3" style="width:100px;"/> (опыт в годах)
                    </div>
                </div>
            </div>
            <div class="col-lg-12 edit-item">
                <div class="form-group form-inline">
                    <label class="input-lg col-xs-12 col-sm-3 col-md-3 col-lg-3">О себе</label>

                    <div class="col-xs-12 col-sm-9 col-md-9 col-lg-9">
                                        <textarea rows="12" class="form-control input-lg" name="about-user" style="width:100%;" placeholder="Введите должность на вашей работе">В детстве гуляла по стройке, увидела строителя и поняла, что хочу стать врачом-диетологом. Это довольно забавно, но я знаю, что это моё призвание. Я должна донести до мира, как надо правильно питаться. Я помогу всем и я это знаю. Я всегда иду всем на помощь и готова выйти на связь.

В детстве гуляла по стройке, увидела строителя и поняла, что хочу стать врачом-диетологом. Это довольно забавно, но я знаю, что это моё призвание. Я должна донести до мира, как надо правильно питаться. Я помогу всем и я это знаю. Я всегда иду всем на помощь и готова выйти на связь.
                                        </textarea>
                    </div>
                </div>
            </div>
            <br/>
            <button class="btn btn-primary btn-lg center-block"><span class="glyphicon glyphicon-ok"></span> Сохранить изменения</button>
        </form>
    </div>
    <div id="panel3" class="tab-pane fade">
        <h3>Настройки безопаноости</h3>
        <form>
            <div class="edit-item">
                <div class="form-group form-inline">
                    <label class="input-lg col-xs-12 col-sm-3 col-md-3 col-lg-3">Поменять E-mail</label>
                    <input name="email" type="email" placeholder="Новый E-mail" class="form-control input-lg"/>
                    <input type="email" placeholder="Повторите e-mail" class="form-control input-lg"/>
                </div>

            </div>
            <div class="edit-item">
                <div class="form-group form-inline">
                    <label class="input-lg col-xs-12 col-sm-3 col-md-3 col-lg-3">Новый пароль</label>
                    <input name="password" type="password" placeholder="Новый пароль" class="form-control input-lg"/>
                    <input type="password" placeholder="Повторите пароль" class="form-control input-lg"/>
                </div>

            </div>
            <button class="btn btn-primary btn-lg center-block"><span class="glyphicon glyphicon-ok"></span> Сохранить изменения</button>
        </form>
    </div>
    <div id="panel4" class="tab-pane fade">
        <h3>Настройки приватности</h3>

    </div>
    <div id="panel5" class="tab-pane fade">
        <h3>Настройки блога</h3>

    </div>
</div>