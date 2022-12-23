package p551hy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import c70.C13752e;
import com.moovit.app.useraccount.manager.UserAccountDataProvider;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p130j2.C5367a;
import p435de.C16596f;
import p452dv.C16724a;
import p476ev.C16883a;
import p476ev.C16884b;

/* renamed from: hy.a */
public final class C17515a implements UserAccountDataProvider<C16724a> {

    /* renamed from: a */
    public final Context f45087a;

    /* renamed from: b */
    public final UserAccountManager f45088b;

    /* renamed from: c */
    public final C13752e f45089c;

    /* renamed from: d */
    public final C17517b f45090d;

    /* renamed from: e */
    public C17516a f45091e;

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: hy.a$a */
    public class C17516a extends AsyncTask<Void, Void, Boolean> {
        public C17516a() {
        }

        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                ServerId b = C17515a.this.f45088b.mo46571b();
                C17515a aVar = C17515a.this;
                aVar.getClass();
                C16724a aVar2 = ((C16884b) new C16883a(b, aVar.f45089c).mo52626J()).f43907m;
                if (aVar2 == null) {
                    return Boolean.TRUE;
                }
                C17515a aVar3 = C17515a.this;
                C17517b bVar = aVar3.f45090d;
                synchronized (bVar) {
                    bVar.f45096d = aVar2;
                }
                Intent intent = new Intent();
                intent.setAction("com.moovit.useraccount.manager.promotions.user_promotions_update_success");
                C5367a.m13473a(aVar3.f45087a).mo21147c(intent);
                return Boolean.TRUE;
            } catch (ServerException | IOException e) {
                C16596f.m42113a().mo49364c(new ApplicationBugException("Update user promotions failure", e));
                return Boolean.FALSE;
            }
        }

        public final void onPostExecute(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            C17515a aVar = C17515a.this;
            synchronized (aVar) {
                if (bool.booleanValue()) {
                    str = "com.moovit.useraccount.manager.promotions.user_promotions_update_success";
                } else {
                    str = "com.moovit.useraccount.manager.promotions.user_promotions_update_failure";
                }
                Intent intent = new Intent();
                intent.setAction(str);
                C5367a.m13473a(aVar.f45087a).mo21147c(intent);
                aVar.f45091e = null;
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public C17515a(android.content.Context r2, com.moovit.app.useraccount.manager.UserAccountManager r3, c70.C13752e r4) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "context"
            ce0.C21100e.m49373x(r2, r0)
            android.content.Context r0 = r2.getApplicationContext()
            r1.f45087a = r0
            r1.f45088b = r3
            r1.f45089c = r4
            java.lang.Class<hy.b> r3 = p551hy.C17517b.class
            monitor-enter(r3)
            hy.b r4 = p551hy.C17517b.f45093e     // Catch:{ all -> 0x0031 }
            if (r4 != 0) goto L_0x002b
            monitor-enter(r3)     // Catch:{ all -> 0x0031 }
            hy.b r4 = p551hy.C17517b.f45093e     // Catch:{ all -> 0x0028 }
            if (r4 != 0) goto L_0x0026
            hy.b r4 = new hy.b     // Catch:{ all -> 0x0028 }
            r0 = 0
            r4.<init>((android.content.Context) r2, (int) r0)     // Catch:{ all -> 0x0028 }
            p551hy.C17517b.f45093e = r4     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r2     // Catch:{ all -> 0x0031 }
        L_0x002b:
            hy.b r2 = p551hy.C17517b.f45093e     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            r1.f45090d = r2
            return
        L_0x0031:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p551hy.C17515a.<init>(android.content.Context, com.moovit.app.useraccount.manager.UserAccountManager, c70.e):void");
    }

    /* renamed from: a */
    public final void mo46564a() {
    }

    /* renamed from: b */
    public final void mo46565b(Object obj) throws IOException, ServerException {
        C16724a aVar = (C16724a) obj;
        C17517b bVar = this.f45090d;
        synchronized (bVar) {
            bVar.f45096d = aVar;
        }
        Intent intent = new Intent();
        intent.setAction("com.moovit.useraccount.manager.promotions.user_promotions_update_success");
        C5367a.m13473a(this.f45087a).mo21147c(intent);
    }

    /* renamed from: c */
    public final Object mo46566c(ServerId serverId) throws IOException, ServerException {
        return ((C16884b) new C16883a(serverId, this.f45089c).mo52626J()).f43907m;
    }

    /* renamed from: d */
    public final void mo46567d() {
    }

    public final UserAccountDataProvider.ProviderType getType() {
        return UserAccountDataProvider.ProviderType.PROMOTIONS;
    }

    public final void load() {
    }
}
