package controllers;

import play.*;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;

import views.html.*;

import java.util.List;
import models.Person;

import static play.libs.Json.toJson;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result addPerson() {
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save();

        return redirect(routes.Application.index());
    }

    public static Result getPersons() {
        List<Person> persons = new Model.Finder(String.class, Person.class).all();

        return ok(toJson(persons));
    }

    public static Result getPersonsXML(Long id) {
        Person person = (Person) new Model.Finder(String.class, Person.class).byId(id);

        return ok(toJson(person));
    }

}
