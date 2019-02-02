package itsu.java.test;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.player.PlayerJoinEvent;
import net.comorevi.cphone.presenter.SharingData;

/**
 * アプリ読み込み時（プラグイン起動時）に読み込まれるクラス。
 * ApplicationManifest.xmlのapplicationタグ内にinitializeとしてクラスを指定することで指定可能。
 * Nukkitにイベントの登録等をすることが用途。
 */
public class Initializer extends net.comorevi.cphone.cphone.application.Initializer implements cn.nukkit.event.Listener {

    public Initializer() {

    }

    public void initialize() {
        SharingData.server.getPluginManager().registerEvents(this, SharingData.pluginInstance);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("This is a test message.");
    }

}
