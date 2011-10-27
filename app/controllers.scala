package controllers

import play._
import play.mvc._
import models._
import play.data.validation._

object Application extends Controller {
    
    import views.Application._
    
    def index = {
        val allPosts = Post.allWithAuthorAndComments
        html.index(
	        front = allPosts.headOption, 
	        older = allPosts.drop(1)
	    )
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
    
    def show(id: Long) = {
	    Post.byIdWithAuthorAndComments(id).map { post =>
	        html.show(post, post._1.prevNext)
	    } getOrElse {
	        NotFound("No such Post")
	    }
	}
    
    def postComment(postId:Long) = {
	    val author = params.get("author")
	    val content = params.get("content")
	    Validation.required("author", author)
	    Validation.required("content", content)
	    if(Validation.hasErrors) {
	        show(postId)
	    } else {
	        Comment.create(Comment(postId, author, content))
	        flash += "success" -> ("Thanks for posting " + author)
	        Action(show(postId))
	    }
	}
}
