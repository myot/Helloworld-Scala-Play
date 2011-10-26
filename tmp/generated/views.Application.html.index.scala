
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object index extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(
    front:Option[(models.Post,models.User,Seq[models.Comment])], 
    older:Seq[(models.Post,models.User,Seq[models.Comment])]
):Html = {
                            try {
                                _display_ {

format.raw/*4.2*/("""
 
""")+_display_(/*6.2*/main(title = "Home")/*6.22*/ {format.raw/*6.24*/("""
    
    """)+_display_(/*8.6*/front/*8.11*/.map/*8.15*/ { front =>format.raw/*8.26*/("""
 		
 		""")+_display_(/*10.5*/display(front, mode="home"))+format.raw/*10.32*/("""
 		
        """)+_display_(/*12.10*/Option(older)/*12.23*/.filterNot(_.isEmpty).map/*12.48*/ { posts =>format.raw/*12.59*/("""
 
            <div class="older-posts">    
                <h3>Older posts <span class="from">from this blog</span></h3>
 
                """)+_display_(/*17.18*/posts/*17.23*/.map/*17.27*/ { post =>format.raw/*17.37*/("""
                    """)+_display_(/*18.22*/display(post, mode="teaser"))+format.raw/*18.50*/("""
                """)})+format.raw/*19.18*/("""
            </div> 
        """)})+format.raw/*21.10*/("""
    """)}/*22.6*/.getOrElse/*22.16*/ {format.raw/*22.18*/("""
        <div class="empty">
            There is currently nothing to read here.
        </div>
    """)})+format.raw/*26.6*/("""
""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Oct 26 15:31:26 PDT 2011
                    SOURCE: /app/views/Application/index.scala.html
                    HASH: f382f9bfc67b149ae806966cf6622c927bf4d3d3
                    MATRIX: 329->1|565->131|594->135|622->155|642->157|678->168|691->173|703->177|732->188|767->197|815->224|856->238|878->251|912->276|942->287|1111->429|1125->434|1138->438|1167->448|1216->470|1265->498|1312->516|1371->546|1393->552|1412->562|1433->564|1563->666
                    LINES: 10->1|17->4|19->6|19->6|19->6|21->8|21->8|21->8|21->8|23->10|23->10|25->12|25->12|25->12|25->12|30->17|30->17|30->17|30->17|31->18|31->18|32->19|34->21|35->22|35->22|35->22|39->26
                    -- GENERATED --
                */
            
