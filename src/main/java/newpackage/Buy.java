package newpackage;

import com.opensymphony.xwork2.ActionSupport;

public class Buy extends ActionSupport
{
    @Override
    public String execute() throws Exception
    {
        //do some fancy database stuff here
        return SUCCESS;
    }   
}
