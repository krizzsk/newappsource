package p110h8;

import android.content.Context;
import com.facebook.appevents.C2316a;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p262t8.C6606a;
import p304x.C7078n;
import p988j$.util.concurrent.ConcurrentHashMap;
import uh0.C25081h;

/* renamed from: h8.e */
public final class C5141e {

    /* renamed from: s */
    public static final C5143b f17157s = new C5143b();

    /* renamed from: t */
    public static final AtomicBoolean f17158t = new AtomicBoolean(false);

    /* renamed from: u */
    public static C5141e f17159u;

    /* renamed from: v */
    public static final AtomicBoolean f17160v = new AtomicBoolean(false);

    /* renamed from: w */
    public static final ConcurrentHashMap f17161w = new ConcurrentHashMap();

    /* renamed from: x */
    public static final ConcurrentHashMap f17162x = new ConcurrentHashMap();

    /* renamed from: a */
    public final Context f17163a;

    /* renamed from: b */
    public final Object f17164b;

    /* renamed from: c */
    public final Class<?> f17165c;

    /* renamed from: d */
    public final Class<?> f17166d;

    /* renamed from: e */
    public final Class<?> f17167e;

    /* renamed from: f */
    public final Class<?> f17168f;

    /* renamed from: g */
    public final Class<?> f17169g;

    /* renamed from: h */
    public final Class<?> f17170h;

    /* renamed from: i */
    public final Class<?> f17171i;

    /* renamed from: j */
    public final Method f17172j;

    /* renamed from: k */
    public final Method f17173k;

    /* renamed from: l */
    public final Method f17174l;

    /* renamed from: m */
    public final Method f17175m;

    /* renamed from: n */
    public final Method f17176n;

    /* renamed from: o */
    public final Method f17177o;

    /* renamed from: p */
    public final Method f17178p;

    /* renamed from: q */
    public final C5150i f17179q;

    /* renamed from: r */
    public final CopyOnWriteArraySet f17180r;

    /* renamed from: h8.e$a */
    public static final class C5142a implements InvocationHandler {
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C6606a.m15601b(this)) {
                return null;
            }
            try {
                C24362h.m61211f(obj, "proxy");
                C24362h.m61211f(method, InneractiveMediationDefs.GENDER_MALE);
                if (C24362h.m61206a(method.getName(), "onBillingSetupFinished")) {
                    C5143b bVar = C5141e.f17157s;
                    C5143b.m13041c().set(true);
                } else {
                    String name = method.getName();
                    C24362h.m61210e(name, "m.name");
                    if (C25081h.m62836z(name, "onBillingServiceDisconnected", false)) {
                        C5143b bVar2 = C5141e.f17157s;
                        C5143b.m13041c().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
                return null;
            }
        }
    }

    /* renamed from: h8.e$b */
    public static final class C5143b {
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5 A[SYNTHETIC, Splitter:B:40:0x00a5] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00b0 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01c8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m13039a(android.content.Context r27) {
            /*
                java.lang.Class<h8.i> r1 = p110h8.C5150i.class
                java.lang.Class<h8.e> r2 = p110h8.C5141e.class
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                h8.i r0 = p110h8.C5150i.f17197g
                boolean r0 = p262t8.C6606a.m15601b(r1)
                if (r0 == 0) goto L_0x0010
            L_0x000e:
                r0 = 0
                goto L_0x0019
            L_0x0010:
                java.util.concurrent.atomic.AtomicBoolean r0 = p110h8.C5150i.f17198h     // Catch:{ all -> 0x0013 }
                goto L_0x0019
            L_0x0013:
                r0 = move-exception
                r5 = r0
                p262t8.C6606a.m15600a(r1, r5)
                goto L_0x000e
            L_0x0019:
                boolean r0 = r0.get()
                java.lang.String r5 = "build"
                java.lang.String r6 = "newBuilder"
                r7 = 0
                r8 = 1
                if (r0 == 0) goto L_0x0039
                boolean r0 = p262t8.C6606a.m15601b(r1)
                if (r0 == 0) goto L_0x002d
            L_0x002b:
                r0 = 0
                goto L_0x0036
            L_0x002d:
                h8.i r0 = p110h8.C5150i.f17197g     // Catch:{ all -> 0x0030 }
                goto L_0x0036
            L_0x0030:
                r0 = move-exception
                r9 = r0
                p262t8.C6606a.m15600a(r1, r9)
                goto L_0x002b
            L_0x0036:
                r1 = r0
                goto L_0x00ae
            L_0x0039:
                java.lang.String r0 = "com.android.billingclient.api.SkuDetailsParams"
                java.lang.Class r10 = p110h8.C5151j.m13064a(r0)
                java.lang.String r0 = "com.android.billingclient.api.SkuDetailsParams$Builder"
                java.lang.Class r11 = p110h8.C5151j.m13064a(r0)
                if (r10 == 0) goto L_0x008a
                if (r11 != 0) goto L_0x004a
                goto L_0x008a
            L_0x004a:
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.reflect.Method r12 = p110h8.C5151j.m13066c(r10, r6, r0)
                java.lang.Class[] r0 = new java.lang.Class[r8]
                r0[r7] = r3
                java.lang.String r9 = "setType"
                java.lang.reflect.Method r13 = p110h8.C5151j.m13066c(r11, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r8]
                java.lang.Class<java.util.List> r9 = java.util.List.class
                r0[r7] = r9
                java.lang.String r9 = "setSkusList"
                java.lang.reflect.Method r14 = p110h8.C5151j.m13066c(r11, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.reflect.Method r15 = p110h8.C5151j.m13066c(r11, r5, r0)
                if (r12 == 0) goto L_0x008a
                if (r13 == 0) goto L_0x008a
                if (r14 == 0) goto L_0x008a
                if (r15 != 0) goto L_0x0075
                goto L_0x008a
            L_0x0075:
                h8.i r0 = new h8.i
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15)
                boolean r9 = p262t8.C6606a.m15601b(r1)
                if (r9 == 0) goto L_0x0082
                goto L_0x008a
            L_0x0082:
                p110h8.C5150i.f17197g = r0     // Catch:{ all -> 0x0085 }
                goto L_0x008a
            L_0x0085:
                r0 = move-exception
                r9 = r0
                p262t8.C6606a.m15600a(r1, r9)
            L_0x008a:
                boolean r0 = p262t8.C6606a.m15601b(r1)
                if (r0 == 0) goto L_0x0092
            L_0x0090:
                r0 = 0
                goto L_0x009b
            L_0x0092:
                java.util.concurrent.atomic.AtomicBoolean r0 = p110h8.C5150i.f17198h     // Catch:{ all -> 0x0095 }
                goto L_0x009b
            L_0x0095:
                r0 = move-exception
                r9 = r0
                p262t8.C6606a.m15600a(r1, r9)
                goto L_0x0090
            L_0x009b:
                r0.set(r8)
                boolean r0 = p262t8.C6606a.m15601b(r1)
                if (r0 == 0) goto L_0x00a5
            L_0x00a4:
                goto L_0x002b
            L_0x00a5:
                h8.i r0 = p110h8.C5150i.f17197g     // Catch:{ all -> 0x00a8 }
                goto L_0x0036
            L_0x00a8:
                r0 = move-exception
                r9 = r0
                p262t8.C6606a.m15600a(r1, r9)
                goto L_0x00a4
            L_0x00ae:
                if (r1 != 0) goto L_0x00b1
                return
            L_0x00b1:
                java.lang.String r0 = "com.android.billingclient.api.BillingClient"
                java.lang.Class r12 = p110h8.C5151j.m13064a(r0)
                java.lang.String r0 = "com.android.billingclient.api.Purchase"
                java.lang.Class r14 = p110h8.C5151j.m13064a(r0)
                java.lang.String r0 = "com.android.billingclient.api.Purchase$PurchasesResult"
                java.lang.Class r13 = p110h8.C5151j.m13064a(r0)
                java.lang.String r0 = "com.android.billingclient.api.SkuDetails"
                java.lang.Class r15 = p110h8.C5151j.m13064a(r0)
                java.lang.String r0 = "com.android.billingclient.api.PurchaseHistoryRecord"
                java.lang.Class r11 = p110h8.C5151j.m13064a(r0)
                java.lang.String r0 = "com.android.billingclient.api.SkuDetailsResponseListener"
                java.lang.Class r17 = p110h8.C5151j.m13064a(r0)
                java.lang.String r0 = "com.android.billingclient.api.PurchaseHistoryResponseListener"
                java.lang.Class r18 = p110h8.C5151j.m13064a(r0)
                if (r12 == 0) goto L_0x0206
                if (r13 == 0) goto L_0x0206
                if (r14 == 0) goto L_0x0206
                if (r15 == 0) goto L_0x0206
                if (r17 == 0) goto L_0x0206
                if (r11 == 0) goto L_0x0206
                if (r18 != 0) goto L_0x00eb
                goto L_0x0206
            L_0x00eb:
                java.lang.Class[] r0 = new java.lang.Class[r8]
                r0[r7] = r3
                java.lang.String r9 = "queryPurchases"
                java.lang.reflect.Method r19 = p110h8.C5151j.m13066c(r12, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.String r9 = "getPurchasesList"
                java.lang.reflect.Method r20 = p110h8.C5151j.m13066c(r13, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.String r9 = "getOriginalJson"
                java.lang.reflect.Method r21 = p110h8.C5151j.m13066c(r14, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.reflect.Method r22 = p110h8.C5151j.m13066c(r15, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.reflect.Method r23 = p110h8.C5151j.m13066c(r11, r9, r0)
                r9 = 2
                java.lang.Class[] r10 = new java.lang.Class[r9]
                boolean r0 = p262t8.C6606a.m15601b(r1)
                if (r0 == 0) goto L_0x011b
                goto L_0x0123
            L_0x011b:
                java.lang.Class<?> r0 = r1.f17199a     // Catch:{ all -> 0x011e }
                goto L_0x0124
            L_0x011e:
                r0 = move-exception
                r4 = r0
                p262t8.C6606a.m15600a(r1, r4)
            L_0x0123:
                r0 = 0
            L_0x0124:
                r10[r7] = r0
                r10[r8] = r17
                java.lang.String r0 = "querySkuDetailsAsync"
                java.lang.reflect.Method r24 = p110h8.C5151j.m13066c(r12, r0, r10)
                java.lang.Class[] r0 = new java.lang.Class[r9]
                r0[r7] = r3
                r0[r8] = r18
                java.lang.String r3 = "queryPurchaseHistoryAsync"
                java.lang.reflect.Method r25 = p110h8.C5151j.m13066c(r12, r3, r0)
                if (r19 == 0) goto L_0x0206
                if (r20 == 0) goto L_0x0206
                if (r21 == 0) goto L_0x0206
                if (r22 == 0) goto L_0x0206
                if (r23 == 0) goto L_0x0206
                if (r24 == 0) goto L_0x0206
                if (r25 != 0) goto L_0x014a
                goto L_0x0206
            L_0x014a:
                java.lang.String r0 = "com.android.billingclient.api.BillingClient$Builder"
                java.lang.Class r0 = p110h8.C5151j.m13064a(r0)
                java.lang.String r3 = "com.android.billingclient.api.PurchasesUpdatedListener"
                java.lang.Class r3 = p110h8.C5151j.m13064a(r3)
                if (r0 == 0) goto L_0x01c4
                if (r3 != 0) goto L_0x015b
                goto L_0x01c4
            L_0x015b:
                java.lang.Class[] r4 = new java.lang.Class[r8]
                java.lang.Class<android.content.Context> r9 = android.content.Context.class
                r4[r7] = r9
                java.lang.reflect.Method r4 = p110h8.C5151j.m13066c(r12, r6, r4)
                java.lang.Class[] r6 = new java.lang.Class[r7]
                java.lang.String r9 = "enablePendingPurchases"
                java.lang.reflect.Method r6 = p110h8.C5151j.m13066c(r0, r9, r6)
                java.lang.Class[] r9 = new java.lang.Class[r8]
                r9[r7] = r3
                java.lang.String r10 = "setListener"
                java.lang.reflect.Method r9 = p110h8.C5151j.m13066c(r0, r10, r9)
                java.lang.Class[] r10 = new java.lang.Class[r7]
                java.lang.reflect.Method r5 = p110h8.C5151j.m13066c(r0, r5, r10)
                if (r4 == 0) goto L_0x01c4
                if (r6 == 0) goto L_0x01c4
                if (r9 == 0) goto L_0x01c4
                if (r5 != 0) goto L_0x0186
                goto L_0x01c4
            L_0x0186:
                java.lang.Object[] r10 = new java.lang.Object[r8]
                r10[r7] = r27
                r7 = 0
                java.lang.Object r4 = p110h8.C5151j.m13067d(r4, r12, r7, r10)
                if (r4 != 0) goto L_0x0194
                r16 = r7
                goto L_0x01c6
            L_0x0194:
                java.lang.ClassLoader r10 = r3.getClassLoader()
                java.lang.Class[] r7 = new java.lang.Class[r8]
                r8 = 0
                r7[r8] = r3
                h8.e$d r3 = new h8.e$d
                r3.<init>()
                java.lang.Object r3 = java.lang.reflect.Proxy.newProxyInstance(r10, r7, r3)
                r7 = 1
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r7[r8] = r3
                java.lang.Object r3 = p110h8.C5151j.m13067d(r9, r0, r4, r7)
                if (r3 != 0) goto L_0x01b2
                goto L_0x01c4
            L_0x01b2:
                java.lang.Object[] r4 = new java.lang.Object[r8]
                java.lang.Object r3 = p110h8.C5151j.m13067d(r6, r0, r3, r4)
                if (r3 != 0) goto L_0x01bb
                goto L_0x01c4
            L_0x01bb:
                java.lang.Object[] r4 = new java.lang.Object[r8]
                java.lang.Object r4 = p110h8.C5151j.m13067d(r5, r0, r3, r4)
                r16 = r4
                goto L_0x01c6
            L_0x01c4:
                r16 = 0
            L_0x01c6:
                if (r16 != 0) goto L_0x01c9
                return
            L_0x01c9:
                h8.e r0 = new h8.e
                r9 = r0
                r10 = r27
                r3 = r11
                r11 = r16
                r16 = r3
                r26 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                boolean r1 = p262t8.C6606a.m15601b(r2)
                if (r1 == 0) goto L_0x01df
                goto L_0x01e7
            L_0x01df:
                p110h8.C5141e.f17159u = r0     // Catch:{ all -> 0x01e2 }
                goto L_0x01e7
            L_0x01e2:
                r0 = move-exception
                r1 = r0
                p262t8.C6606a.m15600a(r2, r1)
            L_0x01e7:
                h8.e r0 = p110h8.C5141e.m13034a()
                if (r0 == 0) goto L_0x01fe
                boolean r1 = p262t8.C6606a.m15601b(r2)
                if (r1 == 0) goto L_0x01f4
                goto L_0x01fd
            L_0x01f4:
                r0.mo20861e()     // Catch:{ all -> 0x01f8 }
                goto L_0x01fd
            L_0x01f8:
                r0 = move-exception
                r1 = r0
                p262t8.C6606a.m15600a(r2, r1)
            L_0x01fd:
                return
            L_0x01fe:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper"
                r0.<init>(r1)
                throw r0
            L_0x0206:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p110h8.C5141e.C5143b.m13039a(android.content.Context):void");
        }

        /* renamed from: b */
        public static ConcurrentHashMap m13040b() {
            Class<C5141e> cls = C5141e.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    return C5141e.f17161w;
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
            return null;
        }

        /* renamed from: c */
        public static AtomicBoolean m13041c() {
            Class<C5141e> cls = C5141e.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    return C5141e.f17160v;
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
            return null;
        }
    }

    /* renamed from: h8.e$c */
    public final class C5144c implements InvocationHandler {

        /* renamed from: a */
        public Runnable f17181a;

        /* renamed from: b */
        public final /* synthetic */ C5141e f17182b;

        public C5144c(C5141e eVar, C7078n nVar) {
            C24362h.m61211f(eVar, "this$0");
            this.f17182b = eVar;
            this.f17181a = nVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[SYNTHETIC, Splitter:B:21:0x0036] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0049 A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x004c A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004f A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0050 A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0075 A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x000f A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo20863a(java.util.List<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "productId"
                java.lang.Class<h8.e> r1 = p110h8.C5141e.class
                boolean r2 = p262t8.C6606a.m15601b(r7)
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00a2 }
            L_0x000f:
                boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00a2 }
                if (r2 == 0) goto L_0x009c
                java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00a2 }
                int r3 = p110h8.C5151j.f17205a     // Catch:{ Exception -> 0x000f }
                h8.e r3 = r7.f17182b     // Catch:{ Exception -> 0x000f }
                boolean r4 = p262t8.C6606a.m15601b(r1)     // Catch:{ Exception -> 0x000f }
                r5 = 0
                if (r4 == 0) goto L_0x0025
                goto L_0x002c
            L_0x0025:
                java.lang.Class<?> r3 = r3.f17169g     // Catch:{ all -> 0x0028 }
                goto L_0x002d
            L_0x0028:
                r3 = move-exception
                p262t8.C6606a.m15600a(r1, r3)     // Catch:{ Exception -> 0x000f }
            L_0x002c:
                r3 = r5
            L_0x002d:
                h8.e r4 = r7.f17182b     // Catch:{ Exception -> 0x000f }
                boolean r6 = p262t8.C6606a.m15601b(r1)     // Catch:{ Exception -> 0x000f }
                if (r6 == 0) goto L_0x0036
                goto L_0x003d
            L_0x0036:
                java.lang.reflect.Method r4 = r4.f17176n     // Catch:{ all -> 0x0039 }
                goto L_0x003e
            L_0x0039:
                r4 = move-exception
                p262t8.C6606a.m15600a(r1, r4)     // Catch:{ Exception -> 0x000f }
            L_0x003d:
                r4 = r5
            L_0x003e:
                r6 = 0
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x000f }
                java.lang.Object r2 = p110h8.C5151j.m13067d(r4, r3, r2, r6)     // Catch:{ Exception -> 0x000f }
                boolean r3 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x000f }
                if (r3 == 0) goto L_0x004c
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x000f }
                goto L_0x004d
            L_0x004c:
                r2 = r5
            L_0x004d:
                if (r2 != 0) goto L_0x0050
                goto L_0x000f
            L_0x0050:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x000f }
                r3.<init>(r2)     // Catch:{ Exception -> 0x000f }
                h8.e r2 = r7.f17182b     // Catch:{ Exception -> 0x000f }
                boolean r4 = p262t8.C6606a.m15601b(r1)     // Catch:{ Exception -> 0x000f }
                if (r4 == 0) goto L_0x005e
                goto L_0x0065
            L_0x005e:
                android.content.Context r2 = r2.f17163a     // Catch:{ all -> 0x0061 }
                goto L_0x0066
            L_0x0061:
                r2 = move-exception
                p262t8.C6606a.m15600a(r1, r2)     // Catch:{ Exception -> 0x000f }
            L_0x0065:
                r2 = r5
            L_0x0066:
                java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x000f }
                java.lang.String r4 = "packageName"
                r3.put(r4, r2)     // Catch:{ Exception -> 0x000f }
                boolean r2 = r3.has(r0)     // Catch:{ Exception -> 0x000f }
                if (r2 == 0) goto L_0x000f
                java.lang.String r2 = r3.getString(r0)     // Catch:{ Exception -> 0x000f }
                h8.e r4 = r7.f17182b     // Catch:{ Exception -> 0x000f }
                boolean r6 = p262t8.C6606a.m15601b(r1)     // Catch:{ Exception -> 0x000f }
                if (r6 == 0) goto L_0x0082
                goto L_0x0089
            L_0x0082:
                java.util.concurrent.CopyOnWriteArraySet r5 = r4.f17180r     // Catch:{ all -> 0x0085 }
                goto L_0x0089
            L_0x0085:
                r4 = move-exception
                p262t8.C6606a.m15600a(r1, r4)     // Catch:{ Exception -> 0x000f }
            L_0x0089:
                r5.add(r2)     // Catch:{ Exception -> 0x000f }
                h8.e$b r4 = p110h8.C5141e.f17157s     // Catch:{ Exception -> 0x000f }
                j$.util.concurrent.ConcurrentHashMap r4 = p110h8.C5141e.C5143b.m13040b()     // Catch:{ Exception -> 0x000f }
                java.lang.String r5 = "skuID"
                mf0.C24362h.m61210e(r2, r5)     // Catch:{ Exception -> 0x000f }
                r4.put(r2, r3)     // Catch:{ Exception -> 0x000f }
                goto L_0x000f
            L_0x009c:
                java.lang.Runnable r8 = r7.f17181a     // Catch:{ all -> 0x00a2 }
                r8.run()     // Catch:{ all -> 0x00a2 }
                return
            L_0x00a2:
                r8 = move-exception
                p262t8.C6606a.m15600a(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p110h8.C5141e.C5144c.mo20863a(java.util.List):void");
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            List list;
            if (C6606a.m15601b(this)) {
                return null;
            }
            try {
                C24362h.m61211f(obj, "proxy");
                C24362h.m61211f(method, "method");
                if (C24362h.m61206a(method.getName(), "onPurchaseHistoryResponse")) {
                    if (objArr == null) {
                        list = null;
                    } else {
                        list = objArr[1];
                    }
                    if (list != null && (list instanceof List)) {
                        mo20863a(list);
                    }
                }
                return null;
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
                return null;
            }
        }
    }

    /* renamed from: h8.e$d */
    public static final class C5145d implements InvocationHandler {
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C6606a.m15601b(this)) {
                return null;
            }
            try {
                C24362h.m61211f(obj, "proxy");
                C24362h.m61211f(method, InneractiveMediationDefs.GENDER_MALE);
                return null;
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
                return null;
            }
        }
    }

    /* renamed from: h8.e$e */
    public final class C5146e implements InvocationHandler {

        /* renamed from: a */
        public Runnable f17183a;

        /* renamed from: b */
        public final /* synthetic */ C5141e f17184b;

        public C5146e(C5141e eVar, Runnable runnable) {
            C24362h.m61211f(eVar, "this$0");
            this.f17184b = eVar;
            this.f17183a = runnable;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[SYNTHETIC, Splitter:B:21:0x0036] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0049 A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x004c A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004f A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0050 A[Catch:{ Exception -> 0x000f }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo20866a(java.util.List<?> r8) {
            /*
                r7 = this;
                java.lang.Class<h8.e> r0 = p110h8.C5141e.class
                java.lang.String r1 = "productId"
                boolean r2 = p262t8.C6606a.m15601b(r7)
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x007e }
            L_0x000f:
                boolean r2 = r8.hasNext()     // Catch:{ all -> 0x007e }
                if (r2 == 0) goto L_0x0078
                java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x007e }
                int r3 = p110h8.C5151j.f17205a     // Catch:{ Exception -> 0x000f }
                h8.e r3 = r7.f17184b     // Catch:{ Exception -> 0x000f }
                boolean r4 = p262t8.C6606a.m15601b(r0)     // Catch:{ Exception -> 0x000f }
                r5 = 0
                if (r4 == 0) goto L_0x0025
                goto L_0x002c
            L_0x0025:
                java.lang.Class<?> r3 = r3.f17168f     // Catch:{ all -> 0x0028 }
                goto L_0x002d
            L_0x0028:
                r3 = move-exception
                p262t8.C6606a.m15600a(r0, r3)     // Catch:{ Exception -> 0x000f }
            L_0x002c:
                r3 = r5
            L_0x002d:
                h8.e r4 = r7.f17184b     // Catch:{ Exception -> 0x000f }
                boolean r6 = p262t8.C6606a.m15601b(r0)     // Catch:{ Exception -> 0x000f }
                if (r6 == 0) goto L_0x0036
                goto L_0x003d
            L_0x0036:
                java.lang.reflect.Method r4 = r4.f17175m     // Catch:{ all -> 0x0039 }
                goto L_0x003e
            L_0x0039:
                r4 = move-exception
                p262t8.C6606a.m15600a(r0, r4)     // Catch:{ Exception -> 0x000f }
            L_0x003d:
                r4 = r5
            L_0x003e:
                r6 = 0
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x000f }
                java.lang.Object r2 = p110h8.C5151j.m13067d(r4, r3, r2, r6)     // Catch:{ Exception -> 0x000f }
                boolean r3 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x000f }
                if (r3 == 0) goto L_0x004c
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x000f }
                goto L_0x004d
            L_0x004c:
                r2 = r5
            L_0x004d:
                if (r2 != 0) goto L_0x0050
                goto L_0x000f
            L_0x0050:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x000f }
                r3.<init>(r2)     // Catch:{ Exception -> 0x000f }
                boolean r2 = r3.has(r1)     // Catch:{ Exception -> 0x000f }
                if (r2 == 0) goto L_0x000f
                java.lang.String r2 = r3.getString(r1)     // Catch:{ Exception -> 0x000f }
                h8.e$b r4 = p110h8.C5141e.f17157s     // Catch:{ Exception -> 0x000f }
                boolean r4 = p262t8.C6606a.m15601b(r0)     // Catch:{ Exception -> 0x000f }
                if (r4 == 0) goto L_0x0068
                goto L_0x006f
            L_0x0068:
                j$.util.concurrent.ConcurrentHashMap r5 = p110h8.C5141e.f17162x     // Catch:{ all -> 0x006b }
                goto L_0x006f
            L_0x006b:
                r4 = move-exception
                p262t8.C6606a.m15600a(r0, r4)     // Catch:{ Exception -> 0x000f }
            L_0x006f:
                java.lang.String r4 = "skuID"
                mf0.C24362h.m61210e(r2, r4)     // Catch:{ Exception -> 0x000f }
                r5.put(r2, r3)     // Catch:{ Exception -> 0x000f }
                goto L_0x000f
            L_0x0078:
                java.lang.Runnable r8 = r7.f17183a     // Catch:{ all -> 0x007e }
                r8.run()     // Catch:{ all -> 0x007e }
                return
            L_0x007e:
                r8 = move-exception
                p262t8.C6606a.m15600a(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p110h8.C5141e.C5146e.mo20866a(java.util.List):void");
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            List list;
            if (C6606a.m15601b(this)) {
                return null;
            }
            try {
                C24362h.m61211f(obj, "proxy");
                C24362h.m61211f(method, InneractiveMediationDefs.GENDER_MALE);
                if (C24362h.m61206a(method.getName(), "onSkuDetailsResponse")) {
                    if (objArr == null) {
                        list = null;
                    } else {
                        list = objArr[1];
                    }
                    if (list != null && (list instanceof List)) {
                        mo20866a(list);
                    }
                }
                return null;
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
                return null;
            }
        }
    }

    public C5141e() {
        throw null;
    }

    public C5141e(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C5150i iVar) {
        this.f17163a = context;
        this.f17164b = obj;
        this.f17165c = cls;
        this.f17166d = cls2;
        this.f17167e = cls3;
        this.f17168f = cls4;
        this.f17169g = cls5;
        this.f17170h = cls6;
        this.f17171i = cls7;
        this.f17172j = method;
        this.f17173k = method2;
        this.f17174l = method3;
        this.f17175m = method4;
        this.f17176n = method5;
        this.f17177o = method6;
        this.f17178p = method7;
        this.f17179q = iVar;
        this.f17180r = new CopyOnWriteArraySet();
    }

    /* renamed from: a */
    public static final /* synthetic */ C5141e m13034a() {
        Class<C5141e> cls = C5141e.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            return f17159u;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo20858b(C2316a aVar) {
        List list;
        String str;
        if (!C6606a.m15601b(this)) {
            try {
                int i = C5151j.f17205a;
                Object d = C5151j.m13067d(this.f17173k, this.f17166d, C5151j.m13067d(this.f17172j, this.f17165c, this.f17164b, "inapp"), new Object[0]);
                if (d instanceof List) {
                    list = (List) d;
                } else {
                    list = null;
                }
                if (list != null) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Object next : list) {
                            int i2 = C5151j.f17205a;
                            Object d2 = C5151j.m13067d(this.f17174l, this.f17167e, next, new Object[0]);
                            if (d2 instanceof String) {
                                str = (String) d2;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                    arrayList.add(string);
                                    ConcurrentHashMap concurrentHashMap = f17161w;
                                    C24362h.m61210e(string, "skuID");
                                    concurrentHashMap.put(string, jSONObject);
                                }
                            }
                        }
                        mo20860d(arrayList, aVar);
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: c */
    public final void mo20859c(C7078n nVar) {
        if (!C6606a.m15601b(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.f17171i.getClassLoader(), new Class[]{this.f17171i}, new C5144c(this, nVar));
                int i = C5151j.f17205a;
                Class<?> cls = this.f17165c;
                C5151j.m13067d(this.f17178p, cls, this.f17164b, "inapp", newProxyInstance);
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: d */
    public final void mo20860d(ArrayList arrayList, Runnable runnable) {
        if (!C6606a.m15601b(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.f17170h.getClassLoader(), new Class[]{this.f17170h}, new C5146e(this, runnable));
                Object a = this.f17179q.mo20883a(arrayList);
                int i = C5151j.f17205a;
                Class<?> cls = this.f17165c;
                C5151j.m13067d(this.f17177o, cls, this.f17164b, a, newProxyInstance);
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: e */
    public final void mo20861e() {
        Method c;
        if (!C6606a.m15601b(this)) {
            try {
                Class<?> a = C5151j.m13064a("com.android.billingclient.api.BillingClientStateListener");
                if (a != null && (c = C5151j.m13066c(this.f17165c, BillingClientBridgeCommon.startConnectionMethodName, a)) != null) {
                    Object newProxyInstance = Proxy.newProxyInstance(a.getClassLoader(), new Class[]{a}, new C5142a());
                    C5151j.m13067d(c, this.f17165c, this.f17164b, newProxyInstance);
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
