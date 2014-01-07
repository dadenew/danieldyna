import org.daniel.domain.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_danieldyna_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'email', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['type':("email"),'name':("email"),'required':(""),'value':(userInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'fullName', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("user.fullName.label"),'default':("Full Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("fullName"),'maxlength':("100"),'required':(""),'value':(userInstance?.fullName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'stories', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("user.stories.label"),'default':("Stories")],-1)
printHtmlPart(6)
for( s in (userInstance?.stories) ) {
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',29,['controller':("story"),'action':("show"),'id':(s.id)],2)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'story.label', default: 'Story')]))
})
invokeTag('link','g',32,['controller':("story"),'action':("create"),'params':(['user.id': userInstance?.id])],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389006320398L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
