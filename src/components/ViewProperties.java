package components;

/**
 * Created by Ashain on 5/4/2017.
 */
public class ViewProperties {

    public ViewProperties(String viewPath, double height, double width){
        //compulsory data
        this.viewPath=viewPath;
        this.height=height;
        this.width=width;
    }

    //all variable are publicly access, so need encapsulation
    public String title;
    public Object data;
    public String viewPath;
    public double height;
    public double width;
}
