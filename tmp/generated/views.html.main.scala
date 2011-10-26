
                    package views.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object main extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(title:String = "")(body: => Html):Html = {
                            try {
                                _display_ {

format.raw/*1.36*/("""
 
<!DOCTYPE html>
<html>
    <head>
        <title>""")+_display_(/*6.17*/title)+format.raw/*6.22*/("""</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" media="screen" href="""")+_display_(/*8.54*/asset("public/stylesheets/main.css"))+format.raw/*8.90*/("""">
        <link rel="shortcut icon" type="image/png" href="""")+_display_(/*9.59*/asset("public/images/favicon.png"))+format.raw/*9.93*/("""">
        <script src="""")+_display_(/*10.23*/asset("public/javascripts/jquery-1.5.2.min.js"))+format.raw/*10.70*/("""" type="text/javascript"></script>
    </head>
    <body>
         
        <div id="header">
            <div id="logo">
                play scala.
            </div>
            <ul id="tools">
                <li>
                    <a href="#">Log in to write something</a>
                </li>
            </ul>
            <div id="title">
                <span class="about">About this blog</span>
                <h1>
			        <a href="""")+_display_(/*26.22*/action(controllers.Application.index))+format.raw/*26.59*/("""">
			            """)+_display_(/*27.17*/play/*27.21*/.Play.configuration.get("blog.title"))+format.raw/*27.58*/("""
			        </a>
			    </h1>
			    <h2>""")+_display_(/*30.13*/play/*30.17*/.Play.configuration.get("blog.baseline"))+format.raw/*30.57*/("""</h2>
            </div>
        </div>
        
        <div id="main">
            """)+_display_(/*35.14*/body)+format.raw/*35.18*/("""
        </div>
        
        <p id="footer">
            Yabe is a (not that) powerful blog engine built with the 
            <a href="http://www.playframework.org">Play framework</a>
            as a tutorial application.
        </p>
        
    </body>
</html>""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Oct 26 15:39:13 PDT 2011
                    SOURCE: /app/views/main.scala.html
                    HASH: 1aef21e20eefd35efcb6700db4d1a3181cc36853
                    MATRIX: 316->1|457->35|536->88|561->93|726->232|782->268|869->329|923->363|975->388|1043->435|1520->885|1578->922|1624->941|1637->945|1695->982|1764->1024|1777->1028|1838->1068|1951->1154|1976->1158
                    LINES: 10->1|14->1|19->6|19->6|21->8|21->8|22->9|22->9|23->10|23->10|39->26|39->26|40->27|40->27|40->27|43->30|43->30|43->30|48->35|48->35
                    -- GENERATED --
                */
            
