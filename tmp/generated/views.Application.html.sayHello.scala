
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object sayHello extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(name:String)(implicit flash:play.mvc.Scope.Flash):Html = {
                            try {
                                _display_ {

format.raw/*1.52*/("""

""")+_display_(/*3.2*/if(flash.get("error"))/*3.24*/ {format.raw/*3.26*/("""
    <p style="color:#c00">
        """)+_display_(/*5.10*/flash/*5.15*/.get("error"))+format.raw/*5.28*/("""
    </p>
""")})+format.raw/*7.2*/("""
 
""")+_display_(/*9.2*/main(title = "Hello")/*9.23*/ {format.raw/*9.25*/("""
    
    <h1>Hello """)+_display_(/*11.16*/(name ?: "Guest"))+format.raw/*11.33*/("""!</h1>
    
    <form action="""")+_display_(/*13.20*/action(controllers.Application.sayHello))+format.raw/*13.60*/("""" method="GET">
        <input type="text" name="myName" /> 
        <input type="submit" value="Say hello!" />
    </form>
    
    <a href="""")+_display_(/*18.15*/action(controllers.Application.index))+format.raw/*18.52*/("""">Back to form</a>
    
""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Oct 26 15:27:13 PDT 2011
                    SOURCE: /app/views/Application/sayHello.scala.html
                    HASH: fd449f724365aba1d3735e198047fc3671176496
                    MATRIX: 332->1|489->51|519->56|549->78|569->80|634->119|647->124|680->137|720->150|751->156|780->177|800->179|850->202|888->219|948->252|1009->292|1184->440|1242->477
                    LINES: 10->1|14->1|16->3|16->3|16->3|18->5|18->5|18->5|20->7|22->9|22->9|22->9|24->11|24->11|26->13|26->13|31->18|31->18
                    -- GENERATED --
                */
            
