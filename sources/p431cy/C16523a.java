package p431cy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import c70.C13752e;
import com.moovit.app.useraccount.campaigns.Campaign;
import com.moovit.app.useraccount.manager.UserAccountDataProvider;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p130j2.C5367a;
import p435de.C16596f;
import p479ey.C16891c;
import p479ey.C16892d;

/* renamed from: cy.a */
public final class C16523a implements UserAccountDataProvider<List<Campaign>> {

    /* renamed from: a */
    public final Context f43136a;

    /* renamed from: b */
    public final UserAccountManager f43137b;

    /* renamed from: c */
    public final C13752e f43138c;

    /* renamed from: d */
    public final C16525b f43139d;

    /* renamed from: e */
    public C16524a f43140e;

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: cy.a$a */
    public class C16524a extends AsyncTask<Void, Void, Boolean> {
        public C16524a() {
        }

        public final Object doInBackground(Object[] objArr) {
            List list;
            Void[] voidArr = (Void[]) objArr;
            try {
                ServerId b = C16523a.this.f43137b.mo46571b();
                C16523a aVar = C16523a.this;
                aVar.getClass();
                Campaign campaign = ((C16892d) new C16891c(b, aVar.f43138c).mo52626J()).f43913m;
                if (campaign != null) {
                    list = Collections.singletonList(campaign);
                } else {
                    list = Collections.emptyList();
                }
                if (list == null) {
                    return Boolean.TRUE;
                }
                C16523a aVar2 = C16523a.this;
                C16525b bVar = aVar2.f43139d;
                synchronized (bVar) {
                    bVar.f43144b = list;
                }
                Intent intent = new Intent();
                intent.setAction("com.moovit.useraccount.manager.campaigns.user_campaigns_update_success");
                C5367a.m13473a(aVar2.f43136a).mo21147c(intent);
                return Boolean.TRUE;
            } catch (IOException e) {
                e = e;
                C16596f.m42113a().mo49364c(new ApplicationBugException("Update user campaigns failure", e));
                return Boolean.FALSE;
            } catch (ServerException e2) {
                e = e2;
                C16596f.m42113a().mo49364c(new ApplicationBugException("Update user campaigns failure", e));
                return Boolean.FALSE;
            }
        }

        public final void onPostExecute(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            C16523a aVar = C16523a.this;
            synchronized (aVar) {
                if (bool.booleanValue()) {
                    str = "com.moovit.useraccount.manager.campaigns.user_campaigns_update_success";
                } else {
                    str = "com.moovit.useraccount.manager.campaigns.user_campaigns_update_failure";
                }
                Intent intent = new Intent();
                intent.setAction(str);
                C5367a.m13473a(aVar.f43136a).mo21147c(intent);
                aVar.f43140e = null;
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
    public C16523a(android.content.Context r2, com.moovit.app.useraccount.manager.UserAccountManager r3, c70.C13752e r4) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "context"
            ce0.C21100e.m49373x(r2, r0)
            android.content.Context r0 = r2.getApplicationContext()
            r1.f43136a = r0
            r1.f43137b = r3
            r1.f43138c = r4
            java.lang.Class<cy.b> r3 = p431cy.C16525b.class
            monitor-enter(r3)
            cy.b r4 = p431cy.C16525b.f43142c     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x002a
            monitor-enter(r3)     // Catch:{ all -> 0x0030 }
            cy.b r4 = p431cy.C16525b.f43142c     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x0025
            cy.b r4 = new cy.b     // Catch:{ all -> 0x0027 }
            r4.<init>((android.content.Context) r2)     // Catch:{ all -> 0x0027 }
            p431cy.C16525b.f43142c = r4     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r2     // Catch:{ all -> 0x0030 }
        L_0x002a:
            cy.b r2 = p431cy.C16525b.f43142c     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)
            r1.f43139d = r2
            return
        L_0x0030:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p431cy.C16523a.<init>(android.content.Context, com.moovit.app.useraccount.manager.UserAccountManager, c70.e):void");
    }

    /* renamed from: a */
    public final void mo46564a() {
    }

    /* renamed from: b */
    public final void mo46565b(Object obj) throws IOException, ServerException {
        List list = (List) obj;
        C16525b bVar = this.f43139d;
        synchronized (bVar) {
            bVar.f43144b = list;
        }
        Intent intent = new Intent();
        intent.setAction("com.moovit.useraccount.manager.campaigns.user_campaigns_update_success");
        C5367a.m13473a(this.f43136a).mo21147c(intent);
    }

    /* renamed from: c */
    public final Object mo46566c(ServerId serverId) throws IOException, ServerException {
        Campaign campaign = ((C16892d) new C16891c(serverId, this.f43138c).mo52626J()).f43913m;
        if (campaign != null) {
            return Collections.singletonList(campaign);
        }
        return Collections.emptyList();
    }

    /* renamed from: d */
    public final void mo46567d() {
    }

    public final UserAccountDataProvider.ProviderType getType() {
        return UserAccountDataProvider.ProviderType.CAMPAIGNS;
    }

    public final void load() {
    }
}
