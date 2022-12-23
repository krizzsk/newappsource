package p664mu;

import aa0.C7543n;
import android.content.Context;
import c00.C13723g;
import com.moovit.commons.utils.CallableRunnable;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p451du.C16721r;
import p664mu.C18437c;
import p977zz.C20933d;

/* renamed from: mu.a */
public final /* synthetic */ class C18435a implements CallableRunnable {

    /* renamed from: b */
    public final /* synthetic */ C18437c f46994b;

    /* renamed from: c */
    public final /* synthetic */ Context f46995c;

    /* renamed from: d */
    public final /* synthetic */ ServerId f46996d;

    /* renamed from: e */
    public final /* synthetic */ ServerId f46997e;

    public /* synthetic */ C18435a(C18437c cVar, Context context, ServerId serverId, ServerId serverId2) {
        this.f46994b = cVar;
        this.f46995c = context;
        this.f46996d = serverId;
        this.f46997e = serverId2;
    }

    public final /* synthetic */ void onError(Throwable th) {
        C20933d.m49028c(this, th);
    }

    public final /* synthetic */ void run() {
        C20933d.m49029d(this);
    }

    public final void runSafe() {
        C18437c cVar = this.f46994b;
        Context context = this.f46995c;
        ServerId serverId = this.f46996d;
        ServerId serverId2 = this.f46997e;
        cVar.getClass();
        C7543n<List<C18437c.C18438a>> a = cVar.mo50885a(context.getApplicationContext());
        StringBuilder k = C13555b.m33972k("line_id_");
        k.append(serverId.f15142b);
        String sb = k.toString();
        List list = a.get(sb);
        if (list == null) {
            list = new ArrayList(1);
        }
        C18437c.C18438a aVar = (C18437c.C18438a) C13723g.m34286g(list, new C16721r(serverId2, 2));
        if (aVar == null) {
            list.add(new C18437c.C18438a(serverId2, 1, System.currentTimeMillis()));
        } else {
            aVar.f47006c++;
            aVar.f47007d = System.currentTimeMillis();
        }
        Collections.sort(list);
        a.put(sb, list);
        try {
            a.mo51040e();
        } catch (IOException unused) {
        }
    }
}
