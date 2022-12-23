package com.cubic.umo.pass.prefs;

import android.content.SharedPreferences;
import bf0.C21049c;
import com.cubic.umo.pass.model.AgencyInformation;
import com.squareup.moshi.C8017o;
import java.util.List;
import kotlin.C23812a;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import nb0.C12949m;

public final class Cache {

    /* renamed from: d */
    public static final C21049c<Cache> f8326d = C23812a.m58432b(Cache$Companion$sCacheStore$2.f8330f);

    /* renamed from: a */
    public final C21049c f8327a = C23812a.m58432b(Cache$prefs$2.f8331f);

    /* renamed from: b */
    public final C8017o f8328b = new C8017o(new C8017o.C8018a());

    /* renamed from: c */
    public List<AgencyInformation> f8329c;

    /* renamed from: com.cubic.umo.pass.prefs.Cache$a */
    public static final class C2259a {
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ad  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.cubic.umo.pass.prefs.Cache m6090a(com.cubic.umo.Environment r10) {
            /*
                java.lang.String r0 = "environment"
                mf0.C24362h.m61211f(r10, r0)
                long r1 = java.lang.System.currentTimeMillis()
                r3 = 86400000(0x5265c00, double:4.2687272E-316)
                long r1 = r1 - r3
                com.cubic.umo.pass.prefs.Cache r3 = m6091b()
                android.content.SharedPreferences r3 = r3.mo11825b()
                r4 = 0
                java.lang.String r0 = r3.getString(r0, r4)
                r3 = 0
                if (r0 != 0) goto L_0x001e
                goto L_0x0035
            L_0x001e:
                com.cubic.umo.Environment[] r5 = com.cubic.umo.Environment.values()
                int r6 = r5.length
                r7 = 0
            L_0x0024:
                if (r7 >= r6) goto L_0x0035
                r8 = r5[r7]
                int r7 = r7 + 1
                java.lang.String r9 = r8.getBaseUrl()
                boolean r9 = android.text.TextUtils.equals(r9, r0)
                if (r9 == 0) goto L_0x0024
                goto L_0x0036
            L_0x0035:
                r8 = r4
            L_0x0036:
                if (r8 == r10) goto L_0x0040
                com.cubic.umo.pass.prefs.Cache r0 = m6091b()
                com.cubic.umo.pass.prefs.Cache.m6088a(r0, r4)
                goto L_0x005b
            L_0x0040:
                com.cubic.umo.pass.prefs.Cache r0 = m6091b()
                android.content.SharedPreferences r0 = r0.mo11825b()
                r5 = 0
                java.lang.String r7 = "cached_time"
                long r5 = r0.getLong(r7, r5)
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x005b
                com.cubic.umo.pass.prefs.Cache r0 = m6091b()
                com.cubic.umo.pass.prefs.Cache.m6088a(r0, r4)
            L_0x005b:
                com.cubic.umo.pass.prefs.Cache r0 = m6091b()
                android.content.SharedPreferences r1 = r0.mo11825b()
                java.lang.String r2 = "agencies"
                java.lang.String r1 = r1.getString(r2, r4)
                r5 = 1
                if (r1 != 0) goto L_0x006d
                goto L_0x0095
            L_0x006d:
                java.lang.Class<java.util.List> r6 = java.util.List.class
                java.lang.reflect.Type[] r7 = new java.lang.reflect.Type[r5]     // Catch:{ Exception -> 0x0086 }
                java.lang.Class<com.cubic.umo.pass.model.AgencyInformation> r8 = com.cubic.umo.pass.model.AgencyInformation.class
                r7[r3] = r8     // Catch:{ Exception -> 0x0086 }
                ob0.b$b r6 = nb0.C12949m.m32790d(r6, r7)     // Catch:{ Exception -> 0x0086 }
                com.squareup.moshi.o r7 = r0.f8328b     // Catch:{ Exception -> 0x0086 }
                com.squareup.moshi.k r6 = r7.mo25081b(r6)     // Catch:{ Exception -> 0x0086 }
                java.lang.Object r1 = r6.mo25049b(r1)     // Catch:{ Exception -> 0x0086 }
                java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0086 }
                goto L_0x0096
            L_0x0086:
                android.content.SharedPreferences r0 = r0.mo11825b()
                android.content.SharedPreferences$Editor r0 = r0.edit()
                android.content.SharedPreferences$Editor r0 = r0.putString(r2, r4)
                r0.apply()
            L_0x0095:
                r1 = r4
            L_0x0096:
                if (r1 == 0) goto L_0x009e
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L_0x009f
            L_0x009e:
                r3 = 1
            L_0x009f:
                if (r3 == 0) goto L_0x00ad
                bi0.d r0 = p335z7.C7492a.f22973b
                com.cubic.umo.pass.prefs.Cache$Companion$getInstance$1 r1 = new com.cubic.umo.pass.prefs.Cache$Companion$getInstance$1
                r1.<init>(r10, r4)
                r10 = 3
                wh0.C25177g.m63218b(r0, r4, r1, r10)
                goto L_0x00b3
            L_0x00ad:
                com.cubic.umo.pass.prefs.Cache r10 = m6091b()
                r10.f8329c = r1
            L_0x00b3:
                com.cubic.umo.pass.prefs.Cache r10 = m6091b()
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.prefs.Cache.C2259a.m6090a(com.cubic.umo.Environment):com.cubic.umo.pass.prefs.Cache");
        }

        /* renamed from: b */
        public static Cache m6091b() {
            return Cache.f8326d.getValue();
        }
    }

    public Cache() {
        EmptyList emptyList = EmptyList.f60173b;
    }

    /* renamed from: a */
    public static final void m6088a(Cache cache, List list) {
        cache.getClass();
        cache.mo11825b().edit().putString("agencies", cache.f8328b.mo25081b(C12949m.m32790d(List.class, AgencyInformation.class)).mo25051d(list)).apply();
    }

    /* renamed from: b */
    public final SharedPreferences mo11825b() {
        Object value = this.f8327a.getValue();
        C24362h.m61210e(value, "<get-prefs>(...)");
        return (SharedPreferences) value;
    }
}
