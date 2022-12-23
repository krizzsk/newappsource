package com.moovit.app.useraccount.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import ce0.C21100e;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.manager.UserAccountDataProvider;
import com.moovit.app.useraccount.manager.accesstoken.AccessTokenManager;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p130j2.C5367a;
import p241s0.C6313h;
import p377ay.C13547a;
import p377ay.C13549b;
import p377ay.C13550c;
import p431cy.C16523a;
import p435de.C16596f;
import p455dy.C16753e;
import p479ey.C16902m;
import p479ey.C16904n;
import p479ey.C16905o;
import p479ey.C16906p;
import p503fy.C17125a;
import p527gy.C17258c;
import p527gy.C17259d;
import p527gy.C17261e;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p975zx.C20919a;

public final class UserAccountManager {

    /* renamed from: a */
    public final Context f40566a;

    /* renamed from: b */
    public final C13550c f40567b;

    /* renamed from: c */
    public final SparseBooleanArray f40568c = new SparseBooleanArray(2);

    /* renamed from: d */
    public final C6313h<UserAccountDataProvider.ProviderType, UserAccountDataProvider<?>> f40569d = new C6313h<>(UserAccountDataProvider.ProviderType.values().length);

    /* renamed from: e */
    public final C15592a f40570e = new C15592a();

    /* renamed from: f */
    public final C15593b f40571f = new C15593b();

    public enum Procedure {
        CONNECT("com.moovit.useraccount.user_connect_success", "com.moovit.useraccount.user_connect_failure"),
        DISCONNECT("com.moovit.useraccount.user_disconnect_success", "com.moovit.useraccount.user_disconnect_failure");
        
        private static C6313h<String, Procedure> eventToProcedure;
        public String[] completionEvents;

        /* access modifiers changed from: public */
        static {
            eventToProcedure = new C6313h<>();
            for (Procedure procedure : values()) {
                for (String put : procedure.completionEvents) {
                    eventToProcedure.put(put, procedure);
                }
            }
        }

        private Procedure(String... strArr) {
            this.completionEvents = strArr;
        }

        public static Procedure getProcedure(String str) {
            return eventToProcedure.getOrDefault(str, null);
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.UserAccountManager$a */
    public class C15592a extends C20438i<C16902m, C16904n> {
        public C15592a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16902m mVar = (C16902m) cVar;
            C16904n nVar = (C16904n) gVar;
            UserAccountManager userAccountManager = UserAccountManager.this;
            C13547a aVar = nVar.f43920n;
            C17259d dVar = nVar.f43919m;
            if (nVar.f43921o) {
                userAccountManager.f40567b.mo40441a(aVar);
                C17261e eVar = (C17261e) userAccountManager.f40569d.getOrDefault(UserAccountDataProvider.ProviderType.PROFILE, null);
                if (eVar != null) {
                    eVar.f44622e.mo49807b(dVar);
                }
                Iterator it = EnumSet.of(UserAccountDataProvider.ProviderType.FAVORITES).iterator();
                while (it.hasNext()) {
                    userAccountManager.f40569d.getOrDefault((UserAccountDataProvider.ProviderType) it.next(), null).mo46564a();
                }
                userAccountManager.mo46570a("com.moovit.useraccount.user_connect_success", aVar.f33491b);
                return;
            }
            userAccountManager.getClass();
            new C15594c(EnumSet.of(UserAccountDataProvider.ProviderType.FAVORITES), aVar, dVar).execute(new Void[0]);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            UserAccountManager.this.mo46570a("com.moovit.useraccount.user_connect_failure", ((C16902m) cVar).f43917w);
            return true;
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.UserAccountManager$b */
    public class C15593b extends C20438i<C16905o, C16906p> {
        public C15593b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13547a aVar;
            C16905o oVar = (C16905o) cVar;
            C16906p pVar = (C16906p) gVar;
            UserAccountManager userAccountManager = UserAccountManager.this;
            C13550c cVar2 = userAccountManager.f40567b;
            synchronized (cVar2) {
                aVar = cVar2.f33494b;
            }
            if (aVar.f33491b.equals(ConnectProvider.MOOVIT)) {
                C20919a aVar2 = ((AccessTokenManager) userAccountManager.f40566a.getSystemService("access_token_manager_service")).f40581b;
                aVar2.getClass();
                C20919a.f52665b.mo49545d(aVar2.f52668a, "");
                C20919a.f52666c.mo49545d(aVar2.f52668a, Boolean.TRUE);
            }
            int i = 0;
            userAccountManager.f40566a.getSharedPreferences("events_tracker_store", 0).edit().remove(TrackingEvent.EDITOR_WELCOME_SCREEN_ACKNOWLEDGED.getPrefsKey()).apply();
            C13550c cVar3 = userAccountManager.f40567b;
            synchronized (cVar3) {
                cVar3.mo40441a(new C13547a());
            }
            while (true) {
                C6313h<UserAccountDataProvider.ProviderType, UserAccountDataProvider<?>> hVar = userAccountManager.f40569d;
                if (i < hVar.f19969d) {
                    hVar.mo22422l(i).mo46567d();
                    userAccountManager.f40569d.getClass();
                    i++;
                } else {
                    userAccountManager.mo46570a("com.moovit.useraccount.user_disconnect_success", (ConnectProvider) null);
                    return;
                }
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C16905o oVar = (C16905o) cVar;
            UserAccountManager.this.mo46570a("com.moovit.useraccount.user_disconnect_failure", (ConnectProvider) null);
            return true;
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.UserAccountManager$c */
    public class C15594c extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public final EnumSet<UserAccountDataProvider.ProviderType> f40574a;

        /* renamed from: b */
        public final C13549b f40575b;

        /* renamed from: c */
        public final C17258c f40576c;

        public C15594c(EnumSet enumSet, C13547a aVar, C17259d dVar) {
            this.f40574a = enumSet;
            this.f40575b = aVar;
            this.f40576c = dVar;
        }

        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                UserAccountManager.this.mo46577i(this.f40574a);
                return Boolean.TRUE;
            } catch (IOException e) {
                C16596f.m42113a().mo49364c(new ApplicationBugException("Update user account data on connect failure", e));
                return Boolean.FALSE;
            } catch (ServerException e2) {
                C16596f.m42113a().mo49364c(new ApplicationBugException("Update user account data on connect failure", e2));
                return Boolean.FALSE;
            }
        }

        public final void onPostExecute(Object obj) {
            UserAccountManager userAccountManager = UserAccountManager.this;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C13549b bVar = this.f40575b;
            C17258c cVar = this.f40576c;
            userAccountManager.getClass();
            ConnectProvider connectProvider = ((C13547a) bVar).f33491b;
            if (booleanValue) {
                userAccountManager.f40567b.mo40441a(bVar);
                C17261e eVar = (C17261e) userAccountManager.f40569d.getOrDefault(UserAccountDataProvider.ProviderType.PROFILE, null);
                if (eVar != null) {
                    eVar.f44622e.mo49807b(cVar);
                }
                userAccountManager.mo46570a("com.moovit.useraccount.user_connect_success", connectProvider);
                return;
            }
            userAccountManager.mo46570a("com.moovit.useraccount.user_connect_failure", connectProvider);
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
    public UserAccountManager(android.content.Context r3) {
        /*
            r2 = this;
            r2.<init>()
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            r1 = 2
            r0.<init>(r1)
            r2.f40568c = r0
            s0.h r0 = new s0.h
            com.moovit.app.useraccount.manager.UserAccountDataProvider$ProviderType[] r1 = com.moovit.app.useraccount.manager.UserAccountDataProvider.ProviderType.values()
            int r1 = r1.length
            r0.<init>((int) r1)
            r2.f40569d = r0
            com.moovit.app.useraccount.manager.UserAccountManager$a r0 = new com.moovit.app.useraccount.manager.UserAccountManager$a
            r0.<init>()
            r2.f40570e = r0
            com.moovit.app.useraccount.manager.UserAccountManager$b r0 = new com.moovit.app.useraccount.manager.UserAccountManager$b
            r0.<init>()
            r2.f40571f = r0
            java.lang.String r0 = "context"
            ce0.C21100e.m49373x(r3, r0)
            android.content.Context r3 = r3.getApplicationContext()
            r2.f40566a = r3
            java.lang.Class<ay.c> r0 = p377ay.C13550c.class
            monitor-enter(r0)
            ay.c r1 = p377ay.C13550c.f33492c     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0048
            monitor-enter(r0)     // Catch:{ all -> 0x004e }
            ay.c r1 = p377ay.C13550c.f33492c     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0043
            ay.c r1 = new ay.c     // Catch:{ all -> 0x0045 }
            r1.<init>(r3)     // Catch:{ all -> 0x0045 }
            p377ay.C13550c.f33492c = r1     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r3     // Catch:{ all -> 0x004e }
        L_0x0048:
            ay.c r3 = p377ay.C13550c.f33492c     // Catch:{ all -> 0x004e }
            monitor-exit(r0)
            r2.f40567b = r3
            return
        L_0x004e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.useraccount.manager.UserAccountManager.<init>(android.content.Context):void");
    }

    /* renamed from: h */
    public static void m39860h(Context context, BroadcastReceiver broadcastReceiver, List<String> list) {
        C5367a a = C5367a.m13473a(context);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : list) {
            intentFilter.addAction(addAction);
        }
        a.mo21146b(broadcastReceiver, intentFilter);
    }

    /* renamed from: a */
    public final void mo46570a(String str, ConnectProvider connectProvider) {
        Procedure procedure = Procedure.getProcedure(str);
        if (procedure != null) {
            this.f40568c.put(procedure.ordinal(), false);
        }
        Intent intent = new Intent();
        intent.setAction(str);
        if (connectProvider != null) {
            intent.putExtra("connect_provider", connectProvider);
        }
        C5367a.m13473a(this.f40566a).mo21147c(intent);
    }

    /* renamed from: b */
    public final ServerId mo46571b() {
        C13547a aVar;
        C13550c cVar = this.f40567b;
        synchronized (cVar) {
            aVar = cVar.f33494b;
        }
        return aVar.f33490a;
    }

    /* renamed from: c */
    public final C16523a mo46572c() {
        UserAccountDataProvider orDefault = this.f40569d.getOrDefault(UserAccountDataProvider.ProviderType.CAMPAIGNS, null);
        C21100e.m49373x(orDefault, "campaignsController");
        return (C16523a) orDefault;
    }

    /* renamed from: d */
    public final C16753e mo46573d() {
        UserAccountDataProvider orDefault = this.f40569d.getOrDefault(UserAccountDataProvider.ProviderType.FAVORITES, null);
        C21100e.m49373x(orDefault, "favoritesController");
        return (C16753e) orDefault;
    }

    /* renamed from: e */
    public final C17125a mo46574e() {
        UserAccountDataProvider orDefault = this.f40569d.getOrDefault(UserAccountDataProvider.ProviderType.NOTIFICATIONS, null);
        C21100e.m49373x(orDefault, "notificationsController");
        return (C17125a) orDefault;
    }

    /* renamed from: f */
    public final C17261e mo46575f() {
        UserAccountDataProvider orDefault = this.f40569d.getOrDefault(UserAccountDataProvider.ProviderType.PROFILE, null);
        C21100e.m49373x(orDefault, "userProfileManager");
        return (C17261e) orDefault;
    }

    /* renamed from: g */
    public final boolean mo46576g() {
        C13547a aVar;
        C13550c cVar = this.f40567b;
        synchronized (cVar) {
            aVar = cVar.f33494b;
        }
        if (aVar.f33490a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo46577i(Set<UserAccountDataProvider.ProviderType> set) throws IOException, ServerException {
        for (UserAccountDataProvider.ProviderType next : set) {
            UserAccountDataProvider orDefault = this.f40569d.getOrDefault(next, null);
            if (orDefault != null) {
                Object c = orDefault.mo46566c(mo46571b());
                if (c != null) {
                    orDefault.mo46565b(c);
                }
            } else {
                throw new IllegalArgumentException("Have you forgot to include: " + next + " in the constructor?");
            }
        }
    }
}
