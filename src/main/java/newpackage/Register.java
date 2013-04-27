package newpackage;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class Register extends ActionSupport implements SessionAware
{

    private static final long serialVersionUID = 1L;
    private Person personBean;
    private long time;
    private Map<String, Object> session;

    @Override
    public String execute() throws Exception
    {
        //call Service class to store personBean's state in database
        session.put("sessionUser", personBean);
        return SUCCESS;
    }

    public Person getPersonBean()
    {
        return personBean;
    }

    public void setPersonBean(Person person)
    {
        personBean = person;
    }

    @Override
    public void validate()
    {
        if (personBean.getFirstName().length() == 0)
        {
            addFieldError("personBean.firstName", "First name is required.");
        }
        if (personBean.getEmail().length() == 0)
        {
            addFieldError("personBean.email", "Email is required.");
        }
        if (personBean.getAge() < 18)
        {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }

    public Map<String, Object> getSession()
    {
        return session;
    }

    public void setSession(Map<String, Object> session)
    {
        this.session = session;
    }

    public long getTime()
    {
        return time;
    }

    public void setTime(long time)
    {
        this.time = time;
    }
}