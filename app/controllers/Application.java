package controllers;

import models.Person;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
     
    public Result addPerson() {
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save(); 
        return (redirect(routes.Application.index()));
    }

}
 