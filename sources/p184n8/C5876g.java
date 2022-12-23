package p184n8;

import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import mf0.C24362h;
import p085f8.C4714d;
import p262t8.C6606a;
import uh0.C25081h;

/* renamed from: n8.g */
public final class C5876g implements View.OnClickListener {

    /* renamed from: f */
    public static final HashSet f18881f = new HashSet();

    /* renamed from: b */
    public final View.OnClickListener f18882b;

    /* renamed from: c */
    public final WeakReference<View> f18883c;

    /* renamed from: d */
    public final WeakReference<View> f18884d;

    /* renamed from: e */
    public final String f18885e;

    /* renamed from: n8.g$a */
    public static final class C5877a {
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final boolean m14330a(java.lang.String r3, java.lang.String r4) {
            /*
                java.util.HashSet r0 = p184n8.C5876g.f18881f
                n8.b r0 = p184n8.C5870b.f18863a
                java.lang.Class<n8.b> r0 = p184n8.C5870b.class
                boolean r1 = p262t8.C6606a.m15601b(r0)
                if (r1 == 0) goto L_0x000d
                goto L_0x0020
            L_0x000d:
                java.util.LinkedHashMap r1 = p184n8.C5870b.f18864b     // Catch:{ all -> 0x001c }
                boolean r2 = r1.containsKey(r3)     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x0020
                java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x001c }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x001c }
                goto L_0x0021
            L_0x001c:
                r3 = move-exception
                p262t8.C6606a.m15600a(r0, r3)
            L_0x0020:
                r3 = 0
            L_0x0021:
                r0 = 1
                if (r3 != 0) goto L_0x0026
                r0 = 0
                goto L_0x003c
            L_0x0026:
                java.lang.String r1 = "other"
                boolean r1 = mf0.C24362h.m61206a(r3, r1)
                if (r1 != 0) goto L_0x003c
                com.facebook.appevents.r r1 = new com.facebook.appevents.r
                r1.<init>(r3, r4, r0)
                com.facebook.internal.f0 r3 = com.facebook.internal.C2397f0.f8630a
                java.util.concurrent.Executor r3 = p009a8.C0115o.m212c()     // Catch:{ Exception -> 0x003c }
                r3.execute(r1)     // Catch:{ Exception -> 0x003c }
            L_0x003c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p184n8.C5876g.C5877a.m14330a(java.lang.String, java.lang.String):boolean");
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x008a A[SYNTHETIC, Splitter:B:40:0x008a] */
        /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m14331b(android.view.View r5, android.view.View r6, java.lang.String r7) {
            /*
                java.lang.String r0 = "hostView"
                mf0.C24362h.m61211f(r5, r0)
                int r0 = r5.hashCode()
                java.util.HashSet r1 = p184n8.C5876g.f18881f
                java.lang.Class<n8.g> r1 = p184n8.C5876g.class
                boolean r1 = p262t8.C6606a.m15601b(r1)
                r2 = 0
                if (r1 == 0) goto L_0x0016
            L_0x0014:
                r1 = r2
                goto L_0x0020
            L_0x0016:
                java.util.HashSet r1 = p184n8.C5876g.f18881f     // Catch:{ all -> 0x0019 }
                goto L_0x0020
            L_0x0019:
                r1 = move-exception
                java.lang.Class<n8.g> r3 = p184n8.C5876g.class
                p262t8.C6606a.m15600a(r3, r1)
                goto L_0x0014
            L_0x0020:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                boolean r1 = r1.contains(r3)
                if (r1 != 0) goto L_0x009a
                f8.d r1 = p085f8.C4714d.f16001a
                n8.g r1 = new n8.g
                r1.<init>(r5, r6, r7)
                java.lang.Class<f8.d> r6 = p085f8.C4714d.class
                boolean r7 = p262t8.C6606a.m15601b(r6)
                if (r7 == 0) goto L_0x003a
                goto L_0x0081
            L_0x003a:
                java.lang.String r7 = "android.view.View"
                java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0057 }
                java.lang.String r3 = "mListenerInfo"
                java.lang.reflect.Field r7 = r7.getDeclaredField(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0057 }
                java.lang.String r3 = "android.view.View$ListenerInfo"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0053 }
                java.lang.String r4 = "mOnClickListener"
                java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0053 }
                goto L_0x005a
            L_0x0053:
                goto L_0x0059
            L_0x0055:
                r5 = move-exception
                goto L_0x007e
            L_0x0057:
                r7 = r2
            L_0x0059:
                r3 = r2
            L_0x005a:
                if (r7 == 0) goto L_0x007a
                if (r3 != 0) goto L_0x005f
                goto L_0x007a
            L_0x005f:
                r4 = 1
                r7.setAccessible(r4)     // Catch:{ Exception -> 0x0081, all -> 0x0055 }
                r3.setAccessible(r4)     // Catch:{ Exception -> 0x0081, all -> 0x0055 }
                r7.setAccessible(r4)     // Catch:{ IllegalAccessException -> 0x006e }
                java.lang.Object r7 = r7.get(r5)     // Catch:{ IllegalAccessException -> 0x006e }
                goto L_0x0070
            L_0x006e:
                r7 = r2
            L_0x0070:
                if (r7 != 0) goto L_0x0076
                r5.setOnClickListener(r1)     // Catch:{ Exception -> 0x0081, all -> 0x0055 }
                goto L_0x0081
            L_0x0076:
                r3.set(r7, r1)     // Catch:{ Exception -> 0x0081, all -> 0x0055 }
                goto L_0x0081
            L_0x007a:
                r5.setOnClickListener(r1)     // Catch:{ Exception -> 0x0081, all -> 0x0055 }
                goto L_0x0081
            L_0x007e:
                p262t8.C6606a.m15600a(r6, r5)
            L_0x0081:
                java.lang.Class<n8.g> r5 = p184n8.C5876g.class
                boolean r5 = p262t8.C6606a.m15601b(r5)
                if (r5 == 0) goto L_0x008a
                goto L_0x0093
            L_0x008a:
                java.util.HashSet r2 = p184n8.C5876g.f18881f     // Catch:{ all -> 0x008d }
                goto L_0x0093
            L_0x008d:
                r5 = move-exception
                java.lang.Class<n8.g> r6 = p184n8.C5876g.class
                p262t8.C6606a.m15600a(r6, r5)
            L_0x0093:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                r2.add(r5)
            L_0x009a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p184n8.C5876g.C5877a.m14331b(android.view.View, android.view.View, java.lang.String):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m14332c(java.lang.String r7, java.lang.String r8, float[] r9) {
            /*
                java.lang.Class<n8.d> r0 = p184n8.C5872d.class
                n8.d r1 = p184n8.C5872d.f18869a
                boolean r1 = p262t8.C6606a.m15601b(r0)
                r2 = 0
                java.lang.String r3 = "event"
                if (r1 == 0) goto L_0x000e
                goto L_0x001c
            L_0x000e:
                mf0.C24362h.m61211f(r7, r3)     // Catch:{ all -> 0x0018 }
                java.util.LinkedHashSet r1 = p184n8.C5872d.f18871c     // Catch:{ all -> 0x0018 }
                boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x0018 }
                goto L_0x001d
            L_0x0018:
                r1 = move-exception
                p262t8.C6606a.m15600a(r0, r1)
            L_0x001c:
                r1 = 0
            L_0x001d:
                r4 = 0
                if (r1 == 0) goto L_0x004d
                android.content.Context r9 = p009a8.C0115o.m210a()
                com.facebook.appevents.j r0 = new com.facebook.appevents.j
                r0.<init>((android.content.Context) r9, (java.lang.String) r4)
                boolean r9 = p262t8.C6606a.m15601b(r0)
                if (r9 == 0) goto L_0x0031
                goto L_0x00c8
            L_0x0031:
                android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x0047 }
                r9.<init>()     // Catch:{ all -> 0x0047 }
                java.lang.String r1 = "_is_suggested_event"
                java.lang.String r2 = "1"
                r9.putString(r1, r2)     // Catch:{ all -> 0x0047 }
                java.lang.String r1 = "_button_text"
                r9.putString(r1, r8)     // Catch:{ all -> 0x0047 }
                r0.mo12484d(r9, r7)     // Catch:{ all -> 0x0047 }
                goto L_0x00c8
            L_0x0047:
                r7 = move-exception
                p262t8.C6606a.m15600a(r0, r7)
                goto L_0x00c8
            L_0x004d:
                n8.d r1 = p184n8.C5872d.f18869a
                boolean r1 = p262t8.C6606a.m15601b(r0)
                if (r1 == 0) goto L_0x0056
                goto L_0x0064
            L_0x0056:
                mf0.C24362h.m61211f(r7, r3)     // Catch:{ all -> 0x0060 }
                java.util.LinkedHashSet r1 = p184n8.C5872d.f18872d     // Catch:{ all -> 0x0060 }
                boolean r0 = r1.contains(r7)     // Catch:{ all -> 0x0060 }
                goto L_0x0065
            L_0x0060:
                r1 = move-exception
                p262t8.C6606a.m15600a(r0, r1)
            L_0x0064:
                r0 = 0
            L_0x0065:
                if (r0 == 0) goto L_0x00c8
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "event_name"
                r0.putString(r1, r7)     // Catch:{ JSONException -> 0x00c8 }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c8 }
                r7.<init>()     // Catch:{ JSONException -> 0x00c8 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00c8 }
                r1.<init>()     // Catch:{ JSONException -> 0x00c8 }
                int r3 = r9.length     // Catch:{ JSONException -> 0x00c8 }
                r5 = 0
            L_0x007d:
                if (r5 >= r3) goto L_0x008c
                r6 = r9[r5]     // Catch:{ JSONException -> 0x00c8 }
                int r5 = r5 + 1
                r1.append(r6)     // Catch:{ JSONException -> 0x00c8 }
                java.lang.String r6 = ","
                r1.append(r6)     // Catch:{ JSONException -> 0x00c8 }
                goto L_0x007d
            L_0x008c:
                java.lang.String r9 = "dense"
                java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x00c8 }
                r7.put(r9, r1)     // Catch:{ JSONException -> 0x00c8 }
                java.lang.String r9 = "button_text"
                r7.put(r9, r8)     // Catch:{ JSONException -> 0x00c8 }
                java.lang.String r8 = "metadata"
                java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x00c8 }
                r0.putString(r8, r7)     // Catch:{ JSONException -> 0x00c8 }
                java.lang.String r7 = com.facebook.GraphRequest.f8425j     // Catch:{ JSONException -> 0x00c8 }
                java.util.Locale r7 = java.util.Locale.US     // Catch:{ JSONException -> 0x00c8 }
                java.lang.String r8 = "%s/suggested_events"
                r9 = 1
                java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x00c8 }
                java.lang.String r3 = p009a8.C0115o.m211b()     // Catch:{ JSONException -> 0x00c8 }
                r1[r2] = r3     // Catch:{ JSONException -> 0x00c8 }
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r1, r9)     // Catch:{ JSONException -> 0x00c8 }
                java.lang.String r7 = java.lang.String.format(r7, r8, r9)     // Catch:{ JSONException -> 0x00c8 }
                java.lang.String r8 = "java.lang.String.format(locale, format, *args)"
                mf0.C24362h.m61210e(r7, r8)     // Catch:{ JSONException -> 0x00c8 }
                com.facebook.GraphRequest r7 = com.facebook.GraphRequest.C2281c.m6138h(r4, r7, r4, r4)     // Catch:{ JSONException -> 0x00c8 }
                r7.f8431d = r0     // Catch:{ JSONException -> 0x00c8 }
                r7.mo11903c()     // Catch:{ JSONException -> 0x00c8 }
            L_0x00c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p184n8.C5876g.C5877a.m14332c(java.lang.String, java.lang.String, float[]):void");
        }
    }

    static {
        new C5877a();
    }

    public C5876g(View view, View view2, String str) {
        this.f18882b = C4714d.m12015e(view);
        this.f18883c = new WeakReference<>(view2);
        this.f18884d = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f18885e = C25081h.m62833D(lowerCase, "activity", "", false);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21752a() {
        /*
            r6 = this;
            boolean r0 = p262t8.C6606a.m15601b(r6)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.ref.WeakReference<android.view.View> r0 = r6.f18883c     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005f }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x005f }
            java.lang.ref.WeakReference<android.view.View> r1 = r6.f18884d     // Catch:{ all -> 0x005f }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x005f }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005e
            if (r1 != 0) goto L_0x001c
            goto L_0x005e
        L_0x001c:
            java.lang.String r2 = p184n8.C5871c.m14320d(r1)     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = p184n8.C5870b.m14316b(r1, r2)     // Catch:{ Exception -> 0x005e }
            if (r3 != 0) goto L_0x0027
            return
        L_0x0027:
            boolean r4 = p184n8.C5876g.C5877a.m14330a(r3, r2)     // Catch:{ Exception -> 0x005e }
            if (r4 == 0) goto L_0x002e
            return
        L_0x002e:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x005e }
            r4.<init>()     // Catch:{ Exception -> 0x005e }
            java.lang.String r5 = "view"
            org.json.JSONObject r0 = p184n8.C5871c.m14319b(r0, r1)     // Catch:{ Exception -> 0x005e }
            r4.put(r5, r0)     // Catch:{ Exception -> 0x005e }
            java.lang.String r0 = "screenname"
            java.lang.String r1 = r6.f18885e     // Catch:{ Exception -> 0x005e }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x005e }
            boolean r0 = p262t8.C6606a.m15601b(r6)     // Catch:{ Exception -> 0x005e }
            if (r0 == 0) goto L_0x004b
            goto L_0x005e
        L_0x004b:
            n8.f r0 = new n8.f     // Catch:{ all -> 0x005a }
            r0.<init>(r4, r2, r6, r3)     // Catch:{ all -> 0x005a }
            com.facebook.internal.f0 r1 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x005a }
            java.util.concurrent.Executor r1 = p009a8.C0115o.m212c()     // Catch:{  }
            r1.execute(r0)     // Catch:{  }
            goto L_0x005e
        L_0x005a:
            r0 = move-exception
            p262t8.C6606a.m15600a(r6, r0)     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            return
        L_0x005f:
            r0 = move-exception
            p262t8.C6606a.m15600a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p184n8.C5876g.mo21752a():void");
    }

    public final void onClick(View view) {
        if (!C6606a.m15601b(this)) {
            try {
                if (!C6606a.m15601b(this)) {
                    C24362h.m61211f(view, Promotion.ACTION_VIEW);
                    View.OnClickListener onClickListener = this.f18882b;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    mo21752a();
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
