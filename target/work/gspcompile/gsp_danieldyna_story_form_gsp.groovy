import org.daniel.domain.Story
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_danieldyna_story_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/story/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: storyInstance, field: 'link', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("story.link.label"),'default':("Link")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['type':("url"),'name':("link"),'required':(""),'value':(storyInstance?.link)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: storyInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("story.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textArea','g',18,['name':("description"),'cols':("40"),'rows':("5"),'maxlength':("1000"),'required':(""),'value':(storyInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: storyInstance, field: 'submittedOn', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("story.submittedOn.label"),'default':("Submitted On")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',26,['name':("submittedOn"),'precision':("day"),'value':(storyInstance?.submittedOn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: storyInstance, field: 'user', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("story.user.label"),'default':("User")],-1)
printHtmlPart(2)
invokeTag('select','g',34,['id':("user"),'name':("user.id"),'from':(org.daniel.domain.User.list()),'optionKey':("id"),'required':(""),'value':(storyInstance?.user?.id),'class':("many-to-one")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389006636212L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
