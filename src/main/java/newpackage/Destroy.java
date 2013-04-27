package newpackage;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.ServletActionContext;

public class Destroy extends ActionSupport
{

    private static final long serialVersionUID = 1L;
    private Map<String, Object> session;

    @Override
    public String execute() throws Exception
    {
        ServletActionContext.getRequest().getSession().invalidate();
        return SUCCESS;
    }

    public Map<String, Object> getSession()
    {
        return session;
    }

    public void setSession(Map<String, Object> session)
    {
        this.session = session;
    }
}