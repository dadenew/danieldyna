import org.daniel.domain.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_danieldyna_usershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (userInstance?.email)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(userInstance),'field':("email")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.fullName)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("user.fullName.label"),'default':("Full Name")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(userInstance),'field':("fullName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.stories)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("user.stories.label"),'default':("Stories")],-1)
printHtmlPart(21)
for( s in (userInstance.stories) ) {
printHtmlPart(22)
createTagBody(4, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',49,['controller':("story"),'action':("show"),'id':(s.id)],4)
printHtmlPart(23)
}
printHtmlPart(24)
}
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
createTagBody(3, {->
invokeTag('message','g',58,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',58,['class':("edit"),'action':("edit"),'resource':(userInstance)],3)
printHtmlPart(27)
invokeTag('actionSubmit','g',59,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(28)
})
invokeTag('form','g',61,['url':([resource:userInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389006320011L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
