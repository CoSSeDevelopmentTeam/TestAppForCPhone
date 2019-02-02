package itsu.java.test;

import net.comorevi.cphone.cphone.model.Bundle;
import net.comorevi.cphone.cphone.service.AbstractService;

/**
 * 別スレッドで処理を行うServiceクラス。
 * AbstractServiceを継承して以下のコンストラクタとonStartをオーバーライドする。
 */
public class MyService extends AbstractService {

    public MyService(String name, Bundle bundle) {
        super(name, bundle);
    }

    @Override
    public void onStart(Bundle bundle) {
        bundle.getCPhone().getPlayer().sendMessage(String.valueOf(bundle.getData().get("data")));
    }

}
