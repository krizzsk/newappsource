package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p081f3.C4656h;
import p081f3.C4658i;
import p092g3.C4763k;

public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        C4656h.m11961e("DiagnosticsRcvr");
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C4656h.m11960c().mo20176a(new Throwable[0]);
            try {
                C4763k.m12079g(context).mo20185a((C4658i) new C4658i.C4659a(DiagnosticsWorker.class).mo20190b());
            } catch (IllegalStateException e) {
                C4656h.m11960c().mo20177b(e);
            }
        }
    }
}
