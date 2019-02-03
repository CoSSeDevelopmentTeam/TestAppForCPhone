package itsu.java.test;

import net.comorevi.cphone.cphone.application.ApplicationManifest;
import net.comorevi.cphone.cphone.model.Bundle;
import net.comorevi.cphone.cphone.model.Response;
import net.comorevi.cphone.cphone.service.ServiceManager;
import net.comorevi.cphone.cphone.widget.activity.ReturnType;
import net.comorevi.cphone.cphone.widget.activity.base.ModalActivity;

/**
 * 従来のあれ。
 */
public class MyActivity extends ModalActivity {

    public MyActivity(ApplicationManifest manifest) {
        super(manifest);
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.setTitle("TestAppForCPhone");
        this.setContent("Content");
        this.setButton1Text("Yes");
        this.setButton2Text("No");

        //bundleにデータを乗せて渡す。
        bundle.put("data", "This is a test.");
        ServiceManager.startService(new MyService("MyService", bundle));
    }

    @Override
    public ReturnType onStop(Response response) {
        return ReturnType.TYPE_IGNORE;
    }

}
