
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object display extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(post:(models.Post,models.User,Seq[models.Comment]), mode: String = "full"):Html = {
                            try {
                                _display_ {
def /*3.2*/commentsTitle/*3.15*/ = {

format.raw/*3.19*/("""
    """)+_display_(/*4.6*/if(post._3)/*4.17*/ {format.raw/*4.19*/("""
        """)+_display_(/*5.10*/post/*5.14*/._3.size)+format.raw/*5.22*/(""" comments, latest by """)+_display_(/*5.44*/post/*5.48*/._3(0).author)+format.raw/*5.61*/("""
    """)}/*6.7*/else/*6.12*/{format.raw/*6.13*/("""
        no comments
    """)})+format.raw/*8.6*/("""
""")};
format.raw/*1.77*/("""
 
""")+format.raw/*9.2*/("""
  
<div class="post """)+_display_(/*11.19*/mode)+format.raw/*11.23*/("""">
    <h2 class="post-title">
        <a href="""")+_display_(/*13.19*/action(controllers.Application.show(post._1.id())))+format.raw/*13.69*/("""">
	        """)+_display_(/*14.11*/post/*14.15*/._1.title)+format.raw/*14.24*/("""
	    </a>
	</h2>
    <div class="post-metadata">
        <span class="post-author">by """)+_display_(/*18.39*/post/*18.43*/._2.fullname)+format.raw/*18.55*/("""</span>,
        <span class="post-date">
            """)+_display_(/*20.14*/post/*20.18*/._1.postedAt.format("dd MMM yy"))+format.raw/*20.50*/("""
        </span>
        """)+_display_(/*22.10*/if(mode != "full")/*22.28*/ {format.raw/*22.30*/("""
            <span class="post-comments">
                """)+_display_(/*24.18*/commentsTitle)+format.raw/*24.31*/("""
            </span>
        """)})+format.raw/*26.10*/("""
    </div>
    """)+_display_(/*28.6*/if(mode != "teaser")/*28.26*/ {format.raw/*28.28*/("""
        <div class="post-content">
            <div class="about">Detail: </div>
            """)+_display_(/*31.14*/Html(post._1.content.replace("\n", "<br>")))+format.raw/*31.57*/("""
        </div>
    """)})+format.raw/*33.6*/("""
</div>
 
""")+_display_(/*36.2*/if(mode == "full")/*36.20*/ {format.raw/*36.22*/("""
    
    <div class="comments">
        <h3>
            """)+_display_(/*40.14*/commentsTitle)+format.raw/*40.27*/("""
        </h3>
        
        """)+_display_(/*43.10*/post/*43.14*/._3.map/*43.21*/ { comment =>format.raw/*43.34*/("""
            <div class="comment">
                <div class="comment-metadata">
                    <span class="comment-author">by """)+_display_(/*46.54*/comment/*46.61*/.author)+format.raw/*46.68*/(""",</span>
                    <span class="comment-date">
                        """)+_display_(/*48.26*/comment/*48.33*/.postedAt.format("dd MMM yy"))+format.raw/*48.62*/("""
                    </span>
                </div>
                <div class="comment-content">
                    <div class="about">Detail: </div>
                    """)+_display_(/*53.22*/Html(comment.content.replace("\n", "<br>")))+format.raw/*53.65*/("""
                </div>
            </div>
        """)})+format.raw/*56.10*/("""
        
    </div>
    
""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Oct 26 15:34:34 PDT 2011
                    SOURCE: /app/views/Application/display.scala.html
                    HASH: e8d124c63c7447d673b9591fdd9e10a8f58e252a
                    MATRIX: 331->1|505->82|526->95|550->99|582->106|601->117|621->119|658->130|670->134|698->142|746->164|758->168|791->181|813->189|825->194|844->195|899->223|930->76|961->226|1012->250|1037->254|1115->305|1186->355|1227->369|1240->373|1270->382|1389->474|1402->478|1435->490|1519->547|1532->551|1585->583|1640->611|1667->629|1688->631|1776->692|1810->705|1871->737|1916->756|1945->776|1966->778|2091->876|2155->919|2206->942|2246->956|2273->974|2294->976|2384->1039|2418->1052|2481->1088|2494->1092|2510->1099|2542->1112|2707->1250|2723->1257|2751->1264|2862->1348|2878->1355|2928->1384|3133->1562|3197->1605|3281->1660
                    LINES: 10->1|13->3|13->3|15->3|16->4|16->4|16->4|17->5|17->5|17->5|17->5|17->5|17->5|18->6|18->6|18->6|20->8|22->1|24->9|26->11|26->11|28->13|28->13|29->14|29->14|29->14|33->18|33->18|33->18|35->20|35->20|35->20|37->22|37->22|37->22|39->24|39->24|41->26|43->28|43->28|43->28|46->31|46->31|48->33|51->36|51->36|51->36|55->40|55->40|58->43|58->43|58->43|58->43|61->46|61->46|61->46|63->48|63->48|63->48|68->53|68->53|71->56
                    -- GENERATED --
                */
            
