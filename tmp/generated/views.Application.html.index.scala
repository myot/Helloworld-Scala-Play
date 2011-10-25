
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object index extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/()(implicit flash:play.mvc.Scope.Flash):Html = {
                            try {
                                _display_ {

format.raw/*1.41*/("""

""")+_display_(/*3.2*/if(flash.get("error"))/*3.24*/ {format.raw/*3.26*/("""
    <p style="color:#c00">
        """)+_display_(/*5.10*/flash/*5.15*/.get("error"))+format.raw/*5.28*/("""
    </p>
""")})+format.raw/*7.2*/("""

""")+_display_(/*9.2*/main(title = "Home")/*9.22*/ {format.raw/*9.24*/("""
    <form action="""")+_display_(/*10.20*/action(controllers.Application.sayHello))+format.raw/*10.60*/("""" method="GET">
        <input type="text" name="myName" /> 
        <input type="submit" value="Say hello!" />
    </form>
""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Tue Oct 25 16:06:26 PDT 2011
                    SOURCE: /app/views/Application/index.scala.html
                    HASH: 207ac231dcb297b98da740f05fbb744681b543f0
                    MATRIX: 329->1|475->40|503->43|533->65|553->67|616->104|629->109|662->122|700->133|728->136|756->156|776->158|823->178|884->218
                    LINES: 10->1|14->1|16->3|16->3|16->3|18->5|18->5|18->5|20->7|22->9|22->9|22->9|23->10|23->10
                    -- GENERATED --
                */
            
