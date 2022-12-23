package k10;

import aa0.C7524a;
import android.content.Context;
import android.content.Intent;
import c00.C13722f;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.gcm.GcmDismissIntentService;
import com.moovit.gcm.GcmNotificationActivity;
import com.moovit.gcm.popup.GcmPopup;
import com.usebutton.sdk.internal.api.AppActionRequest;
import f10.C16936g;
import g10.C17137a;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0016g;
import p241s0.C6302b;
import p269u2.C6677a;
import p304x.C7041e;
import p389bl.C13641g;
import p543hq.C17474b;
import p786rz.C19387a;
import p810sz.C19581f;
import p810sz.C19600l;
import p810sz.C19610m;
import p810sz.C19617r;
import p824tp.C19731i;

/* renamed from: k10.a */
public final class C17993a {

    /* renamed from: a */
    public static final C17993a f46075a = new C17993a();

    /* renamed from: b */
    public static final String f46076b = C13555b.m33969h(C17993a.class, new StringBuilder(), ".extra.gcm_payload_id");

    /* renamed from: k10.a$a */
    public static class C17994a implements C7524a<GcmPopup> {
        /* renamed from: a */
        public final Object mo23790a(MoovitActivity moovitActivity) throws Exception {
            Set<String> categories;
            boolean z;
            GcmPopup c;
            Class<C17993a> cls = C17993a.class;
            Intent intent = moovitActivity.getIntent();
            GcmPopup gcmPopup = null;
            if (!"android.intent.action.MAIN".equals(intent.getAction()) || (categories = intent.getCategories()) == null || !categories.contains("android.intent.category.LAUNCHER")) {
                return null;
            }
            String stringExtra = intent.getStringExtra(C17993a.f46076b);
            if ("suppress_popups".equals(stringExtra)) {
                return null;
            }
            if (stringExtra != null) {
                synchronized (cls) {
                    c = C17993a.m44615c(stringExtra, C17993a.m44616d(moovitActivity));
                }
                return c;
            }
            synchronized (cls) {
                List<GcmPopup> d = C17993a.m44616d(moovitActivity);
                Iterator<GcmPopup> it = d.iterator();
                while (true) {
                    boolean z2 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().f41610d != null) {
                        z2 = true;
                    }
                    if (!(!z2)) {
                        it.remove();
                    }
                }
                Iterator<GcmPopup> it2 = d.iterator();
                while (it2.hasNext()) {
                    if (it2.next().mo48118c()) {
                        it2.remove();
                    }
                }
                Iterator<GcmPopup> it3 = d.iterator();
                while (it3.hasNext()) {
                    C17137a next = it3.next();
                    if (next == null || !next.mo47961b().mo47939d1(moovitActivity)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        it3.remove();
                    }
                }
                if (!d.isEmpty()) {
                    gcmPopup = d.get(0);
                }
            }
            return gcmPopup;
        }

        /* renamed from: b */
        public final void mo23791b(MoovitActivity moovitActivity, Object obj) {
            GcmPopup gcmPopup = (GcmPopup) obj;
            moovitActivity.getIntent().putExtra(C17993a.f46076b, "suppress_popups");
            if (moovitActivity.f37313z) {
                gcmPopup.mo48119d(moovitActivity);
                String str = GcmDismissIntentService.f41488b;
                MoovitExecutors.SINGLE.execute(new C7041e(15, moovitActivity, gcmPopup));
            }
        }
    }

    /* renamed from: k10.a$b */
    public static class C17995b implements C13722f<Map.Entry<String, Long>> {

        /* renamed from: b */
        public final long f46077b = System.currentTimeMillis();

        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            if (this.f46077b - ((Long) ((Map.Entry) obj).getValue()).longValue() <= 6048000000L) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m44613a(android.content.Context r9, com.moovit.gcm.popup.GcmPopup r10) {
        /*
            r0 = 0
            s0.b r1 = m44617e(r9)
            com.moovit.gcm.payload.GcmPayload r2 = r10.f41609c
            java.lang.String r2 = r2.f41546b
            boolean r1 = r1.containsKey(r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.String r0 = "popup_seen"
            goto L_0x004c
        L_0x0014:
            com.moovit.gcm.payload.GcmPayload r1 = r10.f41609c
            java.lang.String r1 = r1.mo47977c()
            java.lang.String r4 = "fb_invite"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = "popup_facebook_invite_rejected"
            goto L_0x004c
        L_0x0025:
            com.moovit.gcm.payload.GcmPayload r1 = r10.f41609c
            java.lang.String r1 = r1.mo47977c()
            java.lang.String r4 = "fb_like"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0036
            java.lang.String r0 = "popup_facebook_like_unsupported"
            goto L_0x004c
        L_0x0036:
            com.moovit.gcm.payload.GcmPayload r1 = r10.f41609c
            java.lang.String r1 = r1.mo47977c()
            java.lang.String r4 = "rate_us"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x004e
            boolean r1 = p583jk.C17884p.m44338I(r9)
            if (r1 != 0) goto L_0x004e
            java.lang.String r0 = "popup_rate_us_unsupported"
        L_0x004c:
            r1 = 0
            goto L_0x004f
        L_0x004e:
            r1 = 1
        L_0x004f:
            if (r0 == 0) goto L_0x0085
            tp.i r4 = p824tp.C19731i.m47197a(r9)
            u2.a r4 = r4.f50173c
            com.moovit.analytics.AnalyticsFlowKey r5 = com.moovit.analytics.AnalyticsFlowKey.PUSH
            hq.b[] r2 = new p543hq.C17474b[r2]
            hq.b$a r6 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r7 = com.moovit.analytics.AnalyticsEventKey.PUSH_REJECTED
            r6.<init>(r7)
            com.moovit.analytics.AnalyticsAttributeKey r7 = com.moovit.analytics.AnalyticsAttributeKey.PUSH_ID
            com.moovit.gcm.payload.GcmPayload r8 = r10.f41609c
            java.lang.String r8 = r8.f41546b
            r6.mo49939g(r7, r8)
            com.moovit.analytics.AnalyticsAttributeKey r7 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r10 = p001a0.C0016g.m23f(r10)
            r6.mo49939g(r7, r10)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.REASON
            r6.mo49939g(r10, r0)
            hq.b r10 = r6.mo49933a()
            r2[r3] = r10
            r4.getClass()
            p269u2.C6677a.m15759j(r9, r5, r3, r2)
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k10.C17993a.m44613a(android.content.Context, com.moovit.gcm.popup.GcmPopup):boolean");
    }

    /* renamed from: b */
    public static void m44614b(List list, GcmPopup gcmPopup) {
        GcmPopup c = m44615c(gcmPopup.f41609c.f41546b, list);
        if (c != null) {
            gcmPopup.f41609c.mo47977c();
            list.set(list.indexOf(c), gcmPopup);
            return;
        }
        gcmPopup.f41609c.mo47977c();
        list.add(gcmPopup);
    }

    /* renamed from: c */
    public static GcmPopup m44615c(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GcmPopup gcmPopup = (GcmPopup) it.next();
            if (gcmPopup.f41609c.f41546b.equals(str)) {
                return gcmPopup;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x001f A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List<com.moovit.gcm.popup.GcmPopup> m44616d(android.content.Context r5) {
        /*
            java.lang.Class<k10.a> r0 = k10.C17993a.class
            monitor-enter(r0)
            java.lang.String r1 = "gcm_popups.dat"
            sz.r r2 = f10.C16936g.f43955b     // Catch:{ all -> 0x0043 }
            r3 = 1
            sz.a r2 = p810sz.C19575a.m46957a(r2, r3)     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = p389bl.C13641g.m34133v(r5, r1, r2)     // Catch:{ all -> 0x0043 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x001b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0043 }
            r5.<init>(r3)     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
            return r5
        L_0x001b:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0043 }
        L_0x001f:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0043 }
            g10.a r4 = (g10.C17137a) r4     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x003a
            com.moovit.gcm.condition.GcmCondition r4 = r4.mo47961b()     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.mo47941i(r5)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r4 = 0
            goto L_0x003b
        L_0x003a:
            r4 = 1
        L_0x003b:
            if (r4 == 0) goto L_0x001f
            r2.remove()     // Catch:{ all -> 0x0043 }
            goto L_0x001f
        L_0x0041:
            monitor-exit(r0)
            return r1
        L_0x0043:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k10.C17993a.m44616d(android.content.Context):java.util.List");
    }

    /* renamed from: e */
    public static C6302b m44617e(Context context) {
        Map map = (Map) C13641g.m34133v(context, "gcm_seen_popup_ids.dat", new C19581f());
        if (map == null) {
            return new C6302b();
        }
        return C13723g.m34284e(map, new C17995b());
    }

    /* renamed from: f */
    public static void m44618f(Context context, GcmPopup gcmPopup) {
        gcmPopup.f41609c.mo47977c();
        C6302b e = m44617e(context);
        e.put(gcmPopup.f41609c.f41546b, Long.valueOf(System.currentTimeMillis()));
        C6302b e2 = C13723g.m34284e(e, new C17995b());
        C19600l.C19609i iVar = C19600l.f49790t;
        C19600l.C19605e eVar = C19600l.f49786p;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(context.openFileOutput("gcm_seen_popup_ids.dat", 0));
            try {
                new C19610m(bufferedOutputStream2).mo51966o(e2, iVar, eVar);
                C19387a.m46677i(bufferedOutputStream2);
            } catch (IOException unused) {
                bufferedOutputStream = bufferedOutputStream2;
                C19387a.m46677i(bufferedOutputStream);
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                C19387a.m46677i(bufferedOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            C19387a.m46677i(bufferedOutputStream);
        } catch (Throwable th2) {
            th = th2;
            C19387a.m46677i(bufferedOutputStream);
            throw th;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: g */
    public static void m44619g(android.content.Context r4, java.util.List r5) {
        /*
            f00.g$i r0 = f10.C16935f.f43949a
            java.lang.Class<f10.f> r0 = f10.C16935f.class
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x009a }
            f00.g$i r1 = f10.C16935f.f43950b     // Catch:{ all -> 0x0097 }
            android.content.SharedPreferences r2 = f10.C16935f.m42758a(r4)     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = r1.mo19759a(r2)     // Catch:{ all -> 0x0097 }
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x001c
            return
        L_0x001c:
            java.util.Iterator r0 = r5.iterator()
        L_0x0020:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()
            com.moovit.gcm.popup.GcmPopup r1 = (com.moovit.gcm.popup.GcmPopup) r1
            com.moovit.gcm.notification.GcmNotification r1 = r1.f41610d
            if (r1 == 0) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0020
            r0.remove()
            goto L_0x0020
        L_0x003a:
            java.util.Iterator r0 = r5.iterator()
        L_0x003e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r0.next()
            com.moovit.gcm.popup.GcmPopup r1 = (com.moovit.gcm.popup.GcmPopup) r1
            boolean r1 = r1.mo48118c()
            if (r1 == 0) goto L_0x003e
            r0.remove()
            goto L_0x003e
        L_0x0054:
            java.util.Iterator r0 = r5.iterator()
        L_0x0058:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r0.next()
            g10.a r1 = (g10.C17137a) r1
            if (r1 == 0) goto L_0x0072
            com.moovit.gcm.condition.GcmCondition r1 = r1.mo47961b()
            boolean r1 = r1.mo47939d1(r4)
            if (r1 == 0) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0058
            r0.remove()
            goto L_0x0058
        L_0x007a:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0082
            r5 = 0
            goto L_0x0088
        L_0x0082:
            java.lang.Object r5 = r5.get(r2)
            com.moovit.gcm.popup.GcmPopup r5 = (com.moovit.gcm.popup.GcmPopup) r5
        L_0x0088:
            if (r5 == 0) goto L_0x0096
            com.moovit.gcm.payload.GcmPayload r0 = r5.f41609c
            r0.mo47977c()
            i10.a r0 = i10.C17537a.f45127a
            com.moovit.gcm.notification.GcmNotification r5 = r5.f41610d
            r0.mo50003b(r4, r5)
        L_0x0096:
            return
        L_0x0097:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            throw r4     // Catch:{ all -> 0x009a }
        L_0x009a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k10.C17993a.m44619g(android.content.Context, java.util.List):void");
    }

    /* renamed from: h */
    public static void m44620h(Context context, GcmPopup gcmPopup) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.PUSH_PAYLOAD_DOWNLOADED);
        aVar.mo49939g(AnalyticsAttributeKey.PUSH_ID, gcmPopup.f41609c.f41546b);
        C17474b a = aVar.mo49933a();
        C6677a aVar2 = C19731i.m47197a(context).f50173c;
        aVar2.getClass();
        C6677a.m15759j(context, AnalyticsFlowKey.PUSH, false, a);
        gcmPopup.f41609c.mo47977c();
    }

    /* renamed from: i */
    public static void m44621i(Context context, GcmPopup gcmPopup) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.PUSH_POPUP_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.PUSH_ID, gcmPopup.f41609c.f41546b);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, C0016g.m23f(gcmPopup));
        C17474b a = aVar.mo49933a();
        C6677a aVar2 = C19731i.m47197a(context).f50173c;
        aVar2.getClass();
        C6677a.m15759j(context, AnalyticsFlowKey.PUSH, false, a);
        gcmPopup.f41609c.mo47977c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0030 A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m44622l(java.util.List r10) {
        /*
            com.moovit.MoovitApplication<?, ?, ?> r0 = com.moovit.MoovitApplication.f37317k
            c70.e r1 = r0.mo44560l()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x000e
            tp.a0 r4 = r1.f33853b
            if (r4 != 0) goto L_0x0028
        L_0x000e:
            boolean r1 = com.moovit.appdata.UserContextLoader.m40004l(r0)
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            lz.a r1 = r0.f37321e
            java.lang.String r4 = "USER_CONTEXT"
            java.lang.Object r1 = r1.mo50695h(r4, r3)
            tp.a0 r1 = (p824tp.C19722a0) r1
            if (r1 != 0) goto L_0x0022
            return
        L_0x0022:
            c70.e r4 = new c70.e
            r4.<init>(r0, r1, r2)
            r1 = r4
        L_0x0028:
            java.util.Locale r4 = p977zz.C20930c.m49020b(r0)
            java.util.Iterator r5 = r10.iterator()
        L_0x0030:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0086
            java.lang.Object r6 = r5.next()
            com.moovit.gcm.popup.GcmPopup r6 = (com.moovit.gcm.popup.GcmPopup) r6
            boolean r7 = r6.mo48118c()
            if (r7 == 0) goto L_0x0030
            f10.d r7 = new f10.d     // Catch:{ Exception -> 0x005c }
            com.moovit.gcm.payload.GcmPayload r8 = r6.f41609c     // Catch:{ Exception -> 0x005c }
            r7.<init>(r1, r8, r4)     // Catch:{ Exception -> 0x005c }
            wz.g r7 = r7.mo52626J()     // Catch:{ Exception -> 0x005c }
            f10.e r7 = (f10.C16934e) r7     // Catch:{ Exception -> 0x005c }
            if (r7 == 0) goto L_0x007e
            com.moovit.gcm.popup.GcmPopup r7 = r7.f43948m     // Catch:{ Exception -> 0x005c }
            if (r7 != 0) goto L_0x0056
            goto L_0x007e
        L_0x0056:
            android.content.Context r8 = r1.f33852a     // Catch:{ Exception -> 0x005c }
            m44620h(r8, r7)     // Catch:{ Exception -> 0x005c }
            goto L_0x007f
        L_0x005c:
            de.f r7 = p435de.C16596f.m42113a()
            java.lang.String r8 = "GCM payload id: "
            java.lang.StringBuilder r8 = p379.C13555b.m33972k(r8)
            com.moovit.gcm.payload.GcmPayload r9 = r6.f41609c
            java.lang.String r9 = r9.f41546b
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.mo49363b(r8)
            com.moovit.commons.utils.ApplicationBugException r8 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r9 = "Failed to download GCM payload."
            r8.<init>((java.lang.String) r9)
            r7.mo49364c(r8)
        L_0x007e:
            r7 = r2
        L_0x007f:
            if (r7 == 0) goto L_0x0030
            r3 = 1
            m44614b(r10, r6)
            goto L_0x0030
        L_0x0086:
            if (r3 == 0) goto L_0x008b
            m44623m(r0, r10)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k10.C17993a.m44622l(java.util.List):void");
    }

    /* renamed from: m */
    public static synchronized void m44623m(Context context, List<GcmPopup> list) {
        synchronized (C17993a.class) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            Iterator<GcmPopup> it = list.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                C17137a next = it.next();
                if (next == null || next.mo47961b().mo47941i(context)) {
                    z = true;
                }
                if (z) {
                    it.remove();
                }
            }
            C19617r rVar = C16936g.f43955b;
            C21100e.m49373x(rVar, "writer");
            BufferedOutputStream bufferedOutputStream = null;
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(context.openFileOutput("gcm_popups.dat", 0));
                try {
                    new C19610m(bufferedOutputStream2).mo51965h(list, rVar);
                    C19387a.m46677i(bufferedOutputStream2);
                } catch (IOException unused) {
                    bufferedOutputStream = bufferedOutputStream2;
                    C19387a.m46677i(bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    C19387a.m46677i(bufferedOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                C19387a.m46677i(bufferedOutputStream);
            } catch (Throwable th2) {
                th = th2;
                C19387a.m46677i(bufferedOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final synchronized void mo50494j(Context context, GcmPopup gcmPopup) {
        List<GcmPopup> d = m44616d(context);
        if (m44613a(context, gcmPopup)) {
            m44614b(d, gcmPopup);
            m44623m(context, d);
        }
        m44622l(d);
        m44619g(context, d);
    }

    /* renamed from: k */
    public final synchronized void mo50495k(GcmNotificationActivity gcmNotificationActivity, String str) {
        C21100e.m49355o();
        if (str != null) {
            List<GcmPopup> d = m44616d(gcmNotificationActivity);
            GcmPopup c = m44615c(str, d);
            if (c == null || !d.contains(c)) {
                m44622l(d);
                m44619g(gcmNotificationActivity, d);
            }
        }
    }
}
