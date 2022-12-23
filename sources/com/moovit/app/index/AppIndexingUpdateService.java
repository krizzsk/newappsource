package com.moovit.app.index;

import android.content.Intent;
import c00.C13717b;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppJobIntentService;
import java.util.List;
import p435de.C16596f;
import p735pt.C18981b;
import p735pt.C18982c;
import p735pt.C18985f;
import p908xd.C20459c;

public class AppIndexingUpdateService extends MoovitAppJobIntentService {

    /* renamed from: l */
    public static final /* synthetic */ int f38434l = 0;

    /* renamed from: h */
    public final void mo44581h(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            if (action.equals("REMOVE_ALL_APP_INDEXING")) {
                C20459c.m48080a(getApplicationContext()).mo52649b().continueWith(MoovitExecutors.f37327IO, new C18985f.C18986a());
            } else if (action.equals("UPDATE_APP_INDEXING_FROM_STORE")) {
                C18981b f = C18981b.m46094f(this);
                f.mo51499b();
                List<T> e = f.f48438c.mo40647e();
                if (!C13717b.m34258e(e)) {
                    e.size();
                    Task<Void> c = C18985f.m46097c(getApplicationContext(), e);
                    if (c == null) {
                        C16596f.m42113a().mo49363b("periodic update app indexing - task equal to null");
                    } else {
                        c.addOnCompleteListener(new C18982c(0));
                    }
                }
            }
        }
    }
}
