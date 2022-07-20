public class UiControl {
   boolean isEnabled = true;

//    public UiControl() {
//        System.out.println("Ui Control");
//    }

    public UiControl(boolean isEnabled) {
        System.out.println("Ui Control");
        this.isEnabled = isEnabled;
    }

    public void Enabled() {
         isEnabled = true;
    }

    public void Disabled(){
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
