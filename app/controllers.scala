package controllers

import play._
import play.mvc._

object Application extends Controller {
    
    import views.Application._
    
    def index = {
        html.index()
    }
    
    def sayHello = {
       val myName = params.get("myName")
	   if(myName == "") {
	        flash += ("error" -> "Oops, please enter your name!")
	        Action(index)
	   } else {
	        html.sayHello(params.get("myName"))
	   }
    }
}
