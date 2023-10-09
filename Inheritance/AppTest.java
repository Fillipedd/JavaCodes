public class AppTest {

    public static void main(String[] args){
        AndroidApp app = new AndroidApp("Browser");
        app.runAndroidApp();
        app.AppInfo();


        IphoneApp app2 = new IphoneApp("Browser");
        app2.runIphoneApp();
        app2.AppInfo();

    }

}
