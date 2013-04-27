package interceptors;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;
import newpackage.Person;

public class LoginInterceptor extends AbstractInterceptor
{

    public LoginInterceptor()
    {}
    

    @Override
    public void destroy()
    {}
    

    @Override
    public void init()
    {}
    

    @Override
    public String intercept(ActionInvocation myActionInvocation) throws Exception
    {
        Map<String, Object> mySession = ActionContext.getContext().getSession();
        //try and get/cast an object matching the username out of the session
        Person myUser = (Person) mySession.get("sessionUser");
        if (myUser == null) // if user object wasnt found, redirect to login
            return "intercepted";
        String result = myActionInvocation.invoke();
        return result;
    }
}

