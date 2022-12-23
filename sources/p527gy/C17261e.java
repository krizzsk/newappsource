package p527gy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c70.C13752e;
import c70.C13756i;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14343z0;
import com.moovit.app.useraccount.manager.UserAccountDataProvider;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p130j2.C5367a;
import p389bl.C13641g;
import p401bz.C13712f;
import p479ey.C16907q;
import p479ey.C16908r;
import p567iq.C17635b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: gy.e */
public final class C17261e implements UserAccountDataProvider<C17258c> {

    /* renamed from: a */
    public final C17262a f44618a = new C17262a();

    /* renamed from: b */
    public final Context f44619b;

    /* renamed from: c */
    public final UserAccountManager f44620c;

    /* renamed from: d */
    public final C13752e f44621d;

    /* renamed from: e */
    public final C17264g f44622e;

    /* renamed from: gy.e$a */
    public class C17262a extends C20438i<C16907q, C16908r> {
        public C17262a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16907q qVar = (C16907q) cVar;
            C17259d dVar = ((C16908r) gVar).f43922m;
            if (dVar != null) {
                C17261e eVar = C17261e.this;
                eVar.f44622e.mo49807b(dVar);
                Intent intent = new Intent();
                intent.setAction("com.moovit.useraccount.manager.user_profile_update_success");
                C5367a.m13473a(eVar.f44619b).mo21147c(intent);
                return;
            }
            C17261e eVar2 = C17261e.this;
            eVar2.getClass();
            Intent intent2 = new Intent();
            intent2.setAction("com.moovit.useraccount.manager.user_profile_update_failure");
            C5367a.m13473a(eVar2.f44619b).mo21147c(intent2);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C16907q qVar = (C16907q) cVar;
            C17261e eVar = C17261e.this;
            eVar.getClass();
            Intent intent = new Intent();
            intent.setAction("com.moovit.useraccount.manager.user_profile_update_failure");
            C5367a.m13473a(eVar.f44619b).mo21147c(intent);
            return true;
        }
    }

    public C17261e(Context context, UserAccountManager userAccountManager, C13752e eVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f44619b = context.getApplicationContext();
        this.f44620c = userAccountManager;
        this.f44621d = eVar;
        this.f44622e = C17264g.m43277a(context);
    }

    /* renamed from: f */
    public static void m43265f(Context context, BroadcastReceiver broadcastReceiver, List<String> list) {
        C5367a a = C5367a.m13473a(context);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : list) {
            intentFilter.addAction(addAction);
        }
        a.mo21146b(broadcastReceiver, intentFilter);
    }

    /* renamed from: g */
    public static void m43266g(Context context, BroadcastReceiver broadcastReceiver) {
        m43265f(context, broadcastReceiver, Arrays.asList(new String[]{"com.moovit.useraccount.manager.user_profile_update_failure", "com.moovit.useraccount.manager.user_profile_update_success"}));
    }

    /* renamed from: h */
    public static void m43267h(Context context, BroadcastReceiver broadcastReceiver) {
        C5367a.m13473a(context).mo21148d(broadcastReceiver);
    }

    /* renamed from: a */
    public final void mo46564a() {
        C17259d dVar;
        C17259d dVar2;
        C14343z0 z0Var = C17635b.m43779f(this.f44619b).f50172b;
        C13712f[] fVarArr = new C13712f[2];
        C17264g gVar = this.f44622e;
        synchronized (gVar) {
            dVar = gVar.f44629b;
        }
        fVarArr[0] = new C17263f(this.f44619b, dVar.f44611j);
        C17264g gVar2 = this.f44622e;
        synchronized (gVar2) {
            dVar2 = gVar2.f44629b;
        }
        fVarArr[1] = new C17255a(this.f44619b, dVar2.f44613l.f40609c);
        z0Var.mo42914c(Arrays.asList(fVarArr), true);
    }

    /* renamed from: b */
    public final void mo46565b(Object obj) throws IOException, ServerException {
        this.f44622e.mo49807b((C17258c) obj);
    }

    /* renamed from: c */
    public final Object mo46566c(ServerId serverId) throws IOException, ServerException {
        return ((C16908r) new C16907q(serverId, this.f44621d).mo52626J()).f43922m;
    }

    /* renamed from: d */
    public final void mo46567d() {
    }

    /* renamed from: e */
    public final C17259d mo49805e() {
        C17259d dVar;
        C17264g gVar = this.f44622e;
        synchronized (gVar) {
            dVar = gVar.f44629b;
        }
        return dVar;
    }

    public final UserAccountDataProvider.ProviderType getType() {
        return UserAccountDataProvider.ProviderType.PROFILE;
    }

    /* renamed from: i */
    public final void mo49806i() {
        ServerId b = this.f44620c.mo46571b();
        C13756i a = C13756i.m34349a(this.f44619b);
        C16907q qVar = new C16907q(b, this.f44621d);
        RequestOptions c = a.mo40680c();
        c.f42909f = true;
        a.mo40684g("userProfileRequest", qVar, c, this.f44618a);
    }

    public final void load() {
        C17264g gVar = this.f44622e;
        synchronized (gVar) {
            C17259d dVar = (C17259d) C13641g.m34133v(gVar.f44628a, "user_profile.dat", C17259d.f44601q);
            if (dVar != null) {
                gVar.f44629b = dVar;
            }
        }
    }
}
