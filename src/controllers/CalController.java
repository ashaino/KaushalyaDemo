package controllers;

import components.ViewProperties;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public final class CalController extends Controller{

    @FXML
    private TextField tbx01;
    @FXML private TextField tbx02;
    @FXML private Label lblErrorMsg;
    @FXML private TextArea textareaResult;

    public void  calculateSquarsAction(){
        this.lblErrorMsg.setText("");

        String st = tbx01.getText().trim();
        String ed = tbx02.getText().trim();

        if(st.isEmpty() || ed.isEmpty()){
            this.lblErrorMsg.setText("Please fill both fields");
        }else{
            try {
                int start = Integer.parseInt(st);//may throw errors
                int end = Integer.parseInt(ed);//may throw errors

                if(start < end){
                    String result="";
                    for(int x = start; x<=end; x++){
                        result+=x+" "+x*x+"\n";
                    }
                    this.textareaResult.setText(result);
                }else{
                    this.lblErrorMsg.setText("Start value should be less than end value");
                }


            }catch(Exception e){
                this.lblErrorMsg.setText("Not a valid value entered");
            }
        }
    }

    public void  claarFieldsAction(){
        this.textareaResult.setText("");
        this.tbx01.setText("");
        this.tbx02.setText("");
        this.lblErrorMsg.setText("");
    }

    /**
     * default window
     * */
    public void index(){
        ViewProperties p = new ViewProperties("../views/CalView.fxml",275, 330);
        p.title="Square Calculator";
        this.render(p);
    }
}
