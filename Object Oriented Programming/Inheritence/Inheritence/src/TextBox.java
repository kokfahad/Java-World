public class TextBox extends UiControl{
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public TextBox(String text) {
        super(true);
        System.out.println("TextBox");
        this.text = text;
    }

    public void setText(String text){
       this.text = text;
    }

    public void clear(){
        this.text = "";
    }
}
