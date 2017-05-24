package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import beans.User;
import service.IUserService;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    
    @Resource
    private IUserService userService;
    
    private User user;
    
    private List<User> userlist;
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public String execute() throws Exception {
        System.out.println("execute");
        return SUCCESS;
    }

    public String addUser() {
        userService.addUser(user);
        return SUCCESS;
    }

    public String deleteUser() {
        userService.deleteUser(user.getId());
        return SUCCESS;
    }

    public String queryAllUser() {
        userlist = userService.queryAllUser();
        return "list";
    }

    public void validate() {
        System.out.println("validate()会对action中的所有方法进行校验");
//        if(this.user.getName() == null || this.user.getName().trim().equals("")) {  
//            this.addFieldError("name", "用户名不能为空！");  
//        }  
    } 
    
    //直接返回一个字符串
    public String queryUserNameByID() throws IOException{
        HttpServletResponse response = ServletActionContext.getResponse();  
        response.setContentType("text/html;charset=UTF-8");
        //response.sendError(401,"timeout");
        PrintWriter out = response.getWriter();  
        out.println("luangeng123");//返回的字符串数据 
        out.flush();
        out.close();
        return null;  
    }

}