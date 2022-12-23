package p530hd;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.C0262r;
import com.appsflyer.ServerParameters;
import com.google.android.play.core.splitinstall.zzo;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p037c5.C1790k;
import p458ed.C16809c;

/* renamed from: hd.k */
public final class C17386k extends C16809c {

    /* renamed from: j */
    public static C17386k f44780j;

    /* renamed from: g */
    public final Handler f44781g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public final C17380e f44782h;

    /* renamed from: i */
    public final LinkedHashSet f44783i = new LinkedHashSet();

    public C17386k(Context context, zzo zzo) {
        super(new C0262r("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f44782h = zzo;
    }

    /* renamed from: a */
    public final void mo42763a(Context context, Intent intent) {
        Intent intent2 = intent;
        Bundle bundleExtra = intent2.getBundleExtra("session_state");
        if (bundleExtra != null) {
            C17378c cVar = new C17378c(bundleExtra.getInt(GetBrowserSessionContextCommand.KEY_SESSION_ID), bundleExtra.getInt(ServerParameters.STATUS), bundleExtra.getInt("error_code"), bundleExtra.getLong("bytes_downloaded"), bundleExtra.getLong("total_bytes_to_download"), bundleExtra.getStringArrayList("module_names"), bundleExtra.getStringArrayList("languages"), (PendingIntent) bundleExtra.getParcelable("user_confirmation_intent"), bundleExtra.getParcelableArrayList("split_file_intents"));
            this.f43762a.mo974a("ListenerRegistryBroadcastReceiver.onReceive: %s", cVar);
            C17381f zza = this.f44782h.zza();
            if (cVar.f44765b != 3 || zza == null) {
                mo49856d(cVar);
            } else {
                zza.mo49343a(cVar.f44772i, new C1790k(this, cVar, intent2, context));
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo49856d(C17378c cVar) {
        Iterator it = new LinkedHashSet(this.f44783i).iterator();
        while (it.hasNext()) {
            ((C17377b) it.next()).mo49479a(cVar);
        }
        mo49482c(cVar);
    }
}
