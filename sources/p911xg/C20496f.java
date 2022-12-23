package p911xg;

import com.google.protobuf.GeneratedMessageLite;

/* renamed from: xg.f */
public final class C20496f implements C20504l {

    /* renamed from: a */
    public static final C20496f f51889a = new C20496f();

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p911xg.C20503k mo52685a(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.Class<com.google.protobuf.GeneratedMessageLite> r0 = com.google.protobuf.GeneratedMessageLite.class
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x002a
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch:{ Exception -> 0x0019 }
            com.google.protobuf.GeneratedMessageLite r0 = com.google.protobuf.GeneratedMessageLite.m36501o(r0)     // Catch:{ Exception -> 0x0019 }
            com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ Exception -> 0x0019 }
            java.lang.Object r0 = r0.mo43546n(r1)     // Catch:{ Exception -> 0x0019 }
            xg.k r0 = (p911xg.C20503k) r0     // Catch:{ Exception -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r4 = p379.C25541a.m63876f(r4, r2)
            r1.<init>(r4, r0)
            throw r1
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r4 = p379.C25541a.m63876f(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p911xg.C20496f.mo52685a(java.lang.Class):xg.k");
    }

    /* renamed from: b */
    public final boolean mo52686b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
