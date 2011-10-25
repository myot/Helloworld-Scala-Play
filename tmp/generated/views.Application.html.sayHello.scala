
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object sayHello extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(name:String):Html = {
                            try {
                                _display_ {

format.raw/*1.15*/("""
 
""")+_display_(/*3.2*/main(title = "Hello")/*3.23*/ {format.raw/*3.25*/("""
    
    <h1>Hello """)+_display_(/*5.16*/(name ?: "Guest"))+format.raw/*5.33*/("""!</h1>
    
    <a href="""")+_display_(/*7.15*/action(controllers.Application.index))+format.raw/*7.52*/("""">Back to form</a>
    
""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Tue Oct 25 15:58:50 PDT 2011
                    SOURCE: /app/views/Application/sayHello.scala.html
                    HASH: c2c57a7c359a4b3c97b80692dff261e76b8fff2c
                    MATRIX: 332->1|452->14|483->20|512->41|532->43|581->66|618->83|672->111|729->148
                    LINES: 10->1|14->1|16->3|16->3|16->3|18->5|18->5|20->7|20->7
                    -- GENERATED --
                */
            
