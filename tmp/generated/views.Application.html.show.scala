
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object show extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(
	post:(models.Post,models.User,Seq[models.Comment]),
	pagination:(Option[models.Post],Option[models.Post])
):Html = {
                            try {
                                _display_ {

format.raw/*4.2*/("""
 
""")+_display_(/*6.2*/main(title = post._1.title)/*6.29*/ {format.raw/*6.31*/("""
    <ul id="pagination">
        """)+_display_(/*8.10*/pagination/*8.20*/._1.map/*8.27*/ { post =>format.raw/*8.37*/("""
            <li id="previous">
                <a href="""")+_display_(/*10.27*/action(controllers.Application.show(post.id())))+format.raw/*10.74*/("""">
                    """)+_display_(/*11.22*/post/*11.26*/.title)+format.raw/*11.32*/("""
                </a>
            </li>
        """)})+format.raw/*14.10*/("""
        """)+_display_(/*15.10*/pagination/*15.20*/._2.map/*15.27*/ { post =>format.raw/*15.37*/("""
            <li id="next">
                <a href="""")+_display_(/*17.27*/action(controllers.Application.show(post.id())))+format.raw/*17.74*/("""">
                    """)+_display_(/*18.22*/post/*18.26*/.title)+format.raw/*18.32*/("""
                </a>
            </li>
        """)})+format.raw/*21.10*/("""
    </ul>
    """)+_display_(/*23.6*/display(post, mode = "full"))+format.raw/*23.34*/("""
    
""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Oct 26 15:39:13 PDT 2011
                    SOURCE: /app/views/Application/show.scala.html
                    HASH: d15c2ebbbb80dfa6e4ed8e339bd65cd09f5d0fd9
                    MATRIX: 328->1|547->114|578->120|613->147|633->149|696->186|714->196|729->203|757->213|844->273|912->320|964->345|977->349|1004->355|1085->407|1123->418|1142->428|1158->435|1187->445|1270->501|1338->548|1390->573|1403->577|1430->583|1511->635|1555->653|1604->681
                    LINES: 10->1|17->4|19->6|19->6|19->6|21->8|21->8|21->8|21->8|23->10|23->10|24->11|24->11|24->11|27->14|28->15|28->15|28->15|28->15|30->17|30->17|31->18|31->18|31->18|34->21|36->23|36->23
                    -- GENERATED --
                */
            
