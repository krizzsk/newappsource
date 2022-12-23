package p922xr;

import android.content.Context;
import androidx.work.C1388b;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import ce0.C21100e;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.useraccount.manager.favorites.FavoritesSetterWorker;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.network.model.ServerId;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p081f3.C4648b;
import p081f3.C4658i;
import p092g3.C4763k;
import p241s0.C6302b;
import p389bl.C13641g;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19600l;
import p977zz.C20964s0;
import s00.C19390c;
import t00.C19622a;

/* renamed from: xr.a */
public final class C20559a extends C19622a {

    /* renamed from: h */
    public static final C19575a<ServerId, ArrayList<ServerId>> f51996h;

    /* renamed from: i */
    public static final C19576b<ServerId> f51997i;

    /* renamed from: j */
    public static final C19575a<ServerId, ArrayList<ServerId>> f51998j;

    /* renamed from: k */
    public static final C19576b<ServerId> f51999k;

    /* renamed from: l */
    public static final Pattern f52000l = Pattern.compile("favorite[a-z_]*([0-9]+)\\.dat");

    /* renamed from: m */
    public static final String[] f52001m = {"favorite_home_%s.dat", "favorite_work_%s.dat", "favorites_locations_%s.dat", "favorite_lines_%s.dat", "favorite_stops_%s.dat"};

    /* renamed from: b */
    public final C6302b f52002b = new C6302b();

    /* renamed from: c */
    public final C6302b f52003c = new C6302b();

    /* renamed from: d */
    public final C6302b f52004d = new C6302b();

    /* renamed from: e */
    public final C6302b f52005e = new C6302b();

    /* renamed from: f */
    public final C6302b f52006f = new C6302b();

    /* renamed from: g */
    public boolean f52007g;

    /* renamed from: xr.a$a */
    public static class C20560a<T> implements Callable<Boolean> {

        /* renamed from: b */
        public final Context f52008b;

        /* renamed from: c */
        public final String f52009c;

        /* renamed from: d */
        public final T f52010d;

        /* renamed from: e */
        public final C19600l<T> f52011e;

        public C20560a(Context context, String str, T t, C19600l<T> lVar) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f52008b = context.getApplicationContext();
            C21100e.m49373x(str, "fileName");
            this.f52009c = str;
            this.f52010d = t;
            C21100e.m49373x(lVar, "writer");
            this.f52011e = lVar;
        }

        public final Object call() throws Exception {
            T t = this.f52010d;
            if (t == null) {
                return Boolean.valueOf(this.f52008b.deleteFile(this.f52009c));
            }
            return Boolean.valueOf(C13641g.m34136y(this.f52008b, this.f52009c, t, this.f52011e));
        }
    }

    /* renamed from: xr.a$b */
    public static class C20561b implements OnSuccessListener<Boolean> {

        /* renamed from: b */
        public final Context f52012b;

        /* renamed from: c */
        public final ServerId f52013c;

        public C20561b(Context context, ServerId serverId) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f52012b = context.getApplicationContext();
            C21100e.m49373x(serverId, "metroId");
            this.f52013c = serverId;
        }

        public final void onSuccess(Object obj) {
            if (Boolean.TRUE.equals((Boolean) obj)) {
                Context context = this.f52012b;
                ServerId serverId = this.f52013c;
                StringBuilder k = C13555b.m33972k("favorites_setter_worker_");
                k.append(serverId.f15142b);
                String sb = k.toString();
                HashMap hashMap = new HashMap();
                hashMap.put("metro_id", serverId.mo19751c());
                C1388b bVar = new C1388b(hashMap);
                C1388b.m3716c(bVar);
                C4648b.C4649a aVar = new C4648b.C4649a();
                aVar.f15887c = NetworkType.CONNECTED;
                C4648b bVar2 = new C4648b(aVar);
                C4763k.m12079g(context).mo20186b(sb, ExistingWorkPolicy.KEEP, (C4658i) ((C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) new C4658i.C4659a(FavoritesSetterWorker.class).mo20189a("favorites_setter_worker")).mo20189a(sb)).mo20194h(bVar)).mo20192f(bVar2)).mo20193g(20, TimeUnit.SECONDS)).mo20190b());
            }
        }
    }

    /* renamed from: xr.a$c */
    public static class C20562c implements Callable<Boolean> {

        /* renamed from: b */
        public final List<Task<Boolean>> f52014b;

        public C20562c(ArrayList arrayList) {
            this.f52014b = arrayList;
        }

        public final Object call() throws Exception {
            Tasks.await(Tasks.whenAll((Collection<? extends Task<?>>) this.f52014b));
            boolean z = true;
            for (Task<Boolean> result : this.f52014b) {
                z &= Boolean.TRUE.equals(result.getResult());
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        ServerId.C4255c cVar = ServerId.f15141f;
        f51996h = C19575a.m46957a(cVar, false);
        ServerId.C4254b bVar = ServerId.f15140e;
        f51997i = C19576b.m46958a(bVar);
        f51998j = C19575a.m46957a(cVar, false);
        f51999k = C19576b.m46958a(bVar);
    }

    public C20559a(C19390c cVar) {
        super(cVar);
    }

    /* renamed from: j */
    public static String m48301j(ServerId serverId, String str) {
        Object[] objArr = {serverId.mo19751c()};
        String str2 = C20964s0.f52718a;
        return String.format((Locale) null, str, objArr);
    }

    /* renamed from: d */
    public final synchronized void mo52761d(Context context, ServerId serverId) {
        C21100e.m49373x(serverId, "metroId");
        this.f52004d.put(serverId, null);
        this.f52005e.put(serverId, null);
        this.f52002b.put(serverId, null);
        this.f52003c.put(serverId, null);
        this.f52006f.put(serverId, null);
        for (String j : f52001m) {
            context.deleteFile(m48301j(serverId, j));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.moovit.app.useraccount.manager.favorites.LocationFavorite} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.moovit.app.useraccount.manager.favorites.LocationFavorite mo52762e(android.content.Context r3, com.moovit.network.model.ServerId r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            s0.b r0 = r2.f52004d     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "metroId"
            ce0.C21100e.m49373x(r4, r1)     // Catch:{ all -> 0x0027 }
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r4, r1)     // Catch:{ all -> 0x0027 }
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r0 = (com.moovit.app.useraccount.manager.favorites.LocationFavorite) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "favorite_home_%s.dat"
            java.lang.String r0 = m48301j(r4, r0)     // Catch:{ all -> 0x0027 }
            com.moovit.app.useraccount.manager.favorites.LocationFavorite$c r1 = com.moovit.app.useraccount.manager.favorites.LocationFavorite.f40598f     // Catch:{ all -> 0x0027 }
            java.lang.Object r3 = p389bl.C13641g.m34133v(r3, r0, r1)     // Catch:{ all -> 0x0027 }
            r0 = r3
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r0 = (com.moovit.app.useraccount.manager.favorites.LocationFavorite) r0     // Catch:{ all -> 0x0027 }
            s0.b r3 = r2.f52004d     // Catch:{ all -> 0x0027 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r2)
            return r0
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p922xr.C20559a.mo52762e(android.content.Context, com.moovit.network.model.ServerId):com.moovit.app.useraccount.manager.favorites.LocationFavorite");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.util.List<com.moovit.network.model.ServerId>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.moovit.network.model.ServerId> mo52763f(android.content.Context r3, com.moovit.network.model.ServerId r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            s0.b r0 = r2.f52002b     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "metroId"
            ce0.C21100e.m49373x(r4, r1)     // Catch:{ all -> 0x0038 }
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r4, r1)     // Catch:{ all -> 0x0038 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "favorite_lines_%s.dat"
            java.lang.String r0 = m48301j(r4, r0)     // Catch:{ all -> 0x0038 }
            sz.a<com.moovit.network.model.ServerId, java.util.ArrayList<com.moovit.network.model.ServerId>> r1 = f51996h     // Catch:{ all -> 0x0038 }
            java.lang.Object r3 = p389bl.C13641g.m34133v(r3, r0, r1)     // Catch:{ all -> 0x0038 }
            r0 = r3
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0038 }
            s0.b r3 = r2.f52002b     // Catch:{ all -> 0x0038 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0038 }
        L_0x0025:
            if (r0 != 0) goto L_0x0030
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0038 }
            s0.b r3 = r2.f52002b     // Catch:{ all -> 0x0038 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0038 }
        L_0x0030:
            r4.mo19751c()     // Catch:{ all -> 0x0038 }
            r0.size()     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            return r0
        L_0x0038:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p922xr.C20559a.mo52763f(android.content.Context, com.moovit.network.model.ServerId):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.util.List<com.moovit.app.useraccount.manager.favorites.LocationFavorite>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.moovit.app.useraccount.manager.favorites.LocationFavorite> mo52764g(android.content.Context r4, com.moovit.network.model.ServerId r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            s0.b r0 = r3.f52006f     // Catch:{ all -> 0x0035 }
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r5, r1)     // Catch:{ all -> 0x0035 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "favorites_locations_%s.dat"
            java.lang.String r0 = m48301j(r5, r0)     // Catch:{ all -> 0x0035 }
            com.moovit.app.useraccount.manager.favorites.LocationFavorite$c r1 = com.moovit.app.useraccount.manager.favorites.LocationFavorite.f40598f     // Catch:{ all -> 0x0035 }
            r2 = 0
            sz.a r1 = p810sz.C19575a.m46957a(r1, r2)     // Catch:{ all -> 0x0035 }
            java.lang.Object r4 = p389bl.C13641g.m34133v(r4, r0, r1)     // Catch:{ all -> 0x0035 }
            r0 = r4
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0035 }
            s0.b r4 = r3.f52006f     // Catch:{ all -> 0x0035 }
            r4.put(r5, r0)     // Catch:{ all -> 0x0035 }
        L_0x0025:
            if (r0 != 0) goto L_0x0030
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0035 }
            s0.b r4 = r3.f52006f     // Catch:{ all -> 0x0035 }
            r4.put(r5, r0)     // Catch:{ all -> 0x0035 }
        L_0x0030:
            r0.size()     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)
            return r0
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p922xr.C20559a.mo52764g(android.content.Context, com.moovit.network.model.ServerId):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.util.List<com.moovit.network.model.ServerId>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.moovit.network.model.ServerId> mo52765h(android.content.Context r3, com.moovit.network.model.ServerId r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            s0.b r0 = r2.f52003c     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "metroId"
            ce0.C21100e.m49373x(r4, r1)     // Catch:{ all -> 0x0035 }
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r4, r1)     // Catch:{ all -> 0x0035 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "favorite_stops_%s.dat"
            java.lang.String r0 = m48301j(r4, r0)     // Catch:{ all -> 0x0035 }
            sz.a<com.moovit.network.model.ServerId, java.util.ArrayList<com.moovit.network.model.ServerId>> r1 = f51998j     // Catch:{ all -> 0x0035 }
            java.lang.Object r3 = p389bl.C13641g.m34133v(r3, r0, r1)     // Catch:{ all -> 0x0035 }
            r0 = r3
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0035 }
            s0.b r3 = r2.f52003c     // Catch:{ all -> 0x0035 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0035 }
        L_0x0025:
            if (r0 != 0) goto L_0x0030
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0035 }
            s0.b r3 = r2.f52003c     // Catch:{ all -> 0x0035 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0035 }
        L_0x0030:
            r0.size()     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r0
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p922xr.C20559a.mo52765h(android.content.Context, com.moovit.network.model.ServerId):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.moovit.app.useraccount.manager.favorites.LocationFavorite} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.moovit.app.useraccount.manager.favorites.LocationFavorite mo52766i(android.content.Context r3, com.moovit.network.model.ServerId r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            s0.b r0 = r2.f52005e     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "metroId"
            ce0.C21100e.m49373x(r4, r1)     // Catch:{ all -> 0x0027 }
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r4, r1)     // Catch:{ all -> 0x0027 }
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r0 = (com.moovit.app.useraccount.manager.favorites.LocationFavorite) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "favorite_work_%s.dat"
            java.lang.String r0 = m48301j(r4, r0)     // Catch:{ all -> 0x0027 }
            com.moovit.app.useraccount.manager.favorites.LocationFavorite$c r1 = com.moovit.app.useraccount.manager.favorites.LocationFavorite.f40598f     // Catch:{ all -> 0x0027 }
            java.lang.Object r3 = p389bl.C13641g.m34133v(r3, r0, r1)     // Catch:{ all -> 0x0027 }
            r0 = r3
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r0 = (com.moovit.app.useraccount.manager.favorites.LocationFavorite) r0     // Catch:{ all -> 0x0027 }
            s0.b r3 = r2.f52005e     // Catch:{ all -> 0x0027 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r2)
            return r0
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p922xr.C20559a.mo52766i(android.content.Context, com.moovit.network.model.ServerId):com.moovit.app.useraccount.manager.favorites.LocationFavorite");
    }

    /* renamed from: k */
    public final synchronized HashSet mo52767k(Context context) {
        HashSet hashSet;
        String group;
        hashSet = new HashSet();
        for (String matcher : context.getFilesDir().list()) {
            Matcher matcher2 = f52000l.matcher(matcher);
            if (matcher2.matches() && (group = matcher2.group(1)) != null) {
                hashSet.add(ServerId.m11392b(group));
            }
        }
        return hashSet;
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
    /* renamed from: l */
    public final synchronized void mo52768l(android.content.Context r5, p455dy.C16749b r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.moovit.network.model.ServerId r0 = r6.f43607a     // Catch:{ all -> 0x0063 }
            boolean r1 = r4.f52007g     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0010
            r2 = 1
            monitor-enter(r4)     // Catch:{ all -> 0x0063 }
            r4.f52007g = r2     // Catch:{ all -> 0x000d }
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            goto L_0x0010
        L_0x000d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            throw r5     // Catch:{ all -> 0x0063 }
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0063 }
            r3 = 5
            r2.<init>(r3)     // Catch:{ all -> 0x0063 }
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r3 = r6.f43611e     // Catch:{ all -> 0x0063 }
            com.google.android.gms.tasks.Task r3 = r4.mo52769m(r5, r0, r3)     // Catch:{ all -> 0x0063 }
            r2.add(r3)     // Catch:{ all -> 0x0063 }
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r3 = r6.f43612f     // Catch:{ all -> 0x0063 }
            com.google.android.gms.tasks.Task r3 = r4.mo52773q(r5, r0, r3)     // Catch:{ all -> 0x0063 }
            r2.add(r3)     // Catch:{ all -> 0x0063 }
            java.util.List<com.moovit.app.useraccount.manager.favorites.LocationFavorite> r3 = r6.f43610d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.tasks.Task r3 = r4.mo52771o(r5, r0, r3)     // Catch:{ all -> 0x0063 }
            r2.add(r3)     // Catch:{ all -> 0x0063 }
            java.util.List<com.moovit.network.model.ServerId> r3 = r6.f43608b     // Catch:{ all -> 0x0063 }
            com.google.android.gms.tasks.Task r3 = r4.mo52770n(r5, r0, r3)     // Catch:{ all -> 0x0063 }
            r2.add(r3)     // Catch:{ all -> 0x0063 }
            java.util.List<com.moovit.network.model.ServerId> r6 = r6.f43609c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.tasks.Task r6 = r4.mo52772p(r5, r0, r6)     // Catch:{ all -> 0x0063 }
            r2.add(r6)     // Catch:{ all -> 0x0063 }
            java.util.concurrent.ExecutorService r6 = com.moovit.MoovitExecutors.SINGLE     // Catch:{ all -> 0x0063 }
            xr.a$c r3 = new xr.a$c     // Catch:{ all -> 0x0063 }
            r3.<init>(r2)     // Catch:{ all -> 0x0063 }
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.call(r6, r3)     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0061
            r1 = 0
            monitor-enter(r4)     // Catch:{ all -> 0x0063 }
            r4.f52007g = r1     // Catch:{ all -> 0x005e }
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            xr.a$b r1 = new xr.a$b     // Catch:{ all -> 0x0063 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x0063 }
            r2.addOnSuccessListener((java.util.concurrent.Executor) r6, r1)     // Catch:{ all -> 0x0063 }
            goto L_0x0061
        L_0x005e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            throw r5     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r4)
            return
        L_0x0063:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p922xr.C20559a.mo52768l(android.content.Context, dy.b):void");
    }

    /* renamed from: m */
    public final synchronized Task<Boolean> mo52769m(Context context, ServerId serverId, LocationFavorite locationFavorite) {
        Task<Boolean> call;
        C6302b bVar = this.f52004d;
        C21100e.m49373x(serverId, "metroId");
        bVar.put(serverId, locationFavorite);
        String j = m48301j(serverId, "favorite_home_%s.dat");
        ExecutorService executorService = MoovitExecutors.SINGLE;
        call = Tasks.call(executorService, new C20560a(context, j, locationFavorite, LocationFavorite.f40597e));
        if (!this.f52007g) {
            call.addOnSuccessListener((Executor) executorService, (OnSuccessListener<? super Boolean>) new C20561b(context, serverId));
        }
        return call;
    }

    /* renamed from: n */
    public final synchronized Task<Boolean> mo52770n(Context context, ServerId serverId, List<ServerId> list) {
        Task<Boolean> call;
        if (list != null) {
            list.size();
        }
        C6302b bVar = this.f52002b;
        C21100e.m49373x(serverId, "metroId");
        bVar.put(serverId, list);
        String j = m48301j(serverId, "favorite_lines_%s.dat");
        ExecutorService executorService = MoovitExecutors.SINGLE;
        call = Tasks.call(executorService, new C20560a(context, j, list, f51997i));
        if (!this.f52007g) {
            call.addOnSuccessListener((Executor) executorService, (OnSuccessListener<? super Boolean>) new C20561b(context, serverId));
        }
        return call;
    }

    /* renamed from: o */
    public final synchronized Task<Boolean> mo52771o(Context context, ServerId serverId, List<LocationFavorite> list) {
        Task<Boolean> call;
        if (list != null) {
            list.size();
        }
        C6302b bVar = this.f52006f;
        C21100e.m49373x(serverId, "metroId");
        bVar.put(serverId, list);
        String j = m48301j(serverId, "favorites_locations_%s.dat");
        ExecutorService executorService = MoovitExecutors.SINGLE;
        call = Tasks.call(executorService, new C20560a(context, j, list, C19576b.m46958a(LocationFavorite.f40597e)));
        if (!this.f52007g) {
            call.addOnSuccessListener((Executor) executorService, (OnSuccessListener<? super Boolean>) new C20561b(context, serverId));
        }
        return call;
    }

    /* renamed from: p */
    public final synchronized Task<Boolean> mo52772p(Context context, ServerId serverId, List<ServerId> list) {
        Task<Boolean> call;
        if (list != null) {
            list.size();
        }
        C6302b bVar = this.f52003c;
        C21100e.m49373x(serverId, "metroId");
        bVar.put(serverId, list);
        String j = m48301j(serverId, "favorite_stops_%s.dat");
        ExecutorService executorService = MoovitExecutors.SINGLE;
        call = Tasks.call(executorService, new C20560a(context, j, list, f51999k));
        if (!this.f52007g) {
            call.addOnSuccessListener((Executor) executorService, (OnSuccessListener<? super Boolean>) new C20561b(context, serverId));
        }
        return call;
    }

    /* renamed from: q */
    public final synchronized Task<Boolean> mo52773q(Context context, ServerId serverId, LocationFavorite locationFavorite) {
        Task<Boolean> call;
        C6302b bVar = this.f52005e;
        C21100e.m49373x(serverId, "metroId");
        bVar.put(serverId, locationFavorite);
        String j = m48301j(serverId, "favorite_work_%s.dat");
        ExecutorService executorService = MoovitExecutors.SINGLE;
        call = Tasks.call(executorService, new C20560a(context, j, locationFavorite, LocationFavorite.f40597e));
        if (!this.f52007g) {
            call.addOnSuccessListener((Executor) executorService, (OnSuccessListener<? super Boolean>) new C20561b(context, serverId));
        }
        return call;
    }
}
