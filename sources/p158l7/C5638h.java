package p158l7;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.cubic.umo.auth.database.AuthDatabase;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p170m7.C5716c;
import p217q2.C6162k;
import p243s2.C6419b;
import p269u2.C6685f;

/* renamed from: l7.h */
public final class C5638h implements C5635e {

    /* renamed from: a */
    public final RoomDatabase f18385a;

    /* renamed from: b */
    public final C5636f f18386b;

    /* renamed from: c */
    public final C5637g f18387c;

    public C5638h(AuthDatabase authDatabase) {
        this.f18385a = authDatabase;
        this.f18386b = new C5636f(authDatabase);
        new AtomicBoolean(false);
        this.f18387c = new C5637g(authDatabase);
    }

    /* renamed from: a */
    public final void mo21494a(C5716c cVar) {
        this.f18385a.mo5186b();
        this.f18385a.mo5187c();
        try {
            this.f18386b.mo22125e(cVar);
            this.f18385a.mo5194j();
        } finally {
            this.f18385a.mo5191g();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: m7.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: m7.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: m7.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: m7.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: m7.c} */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p170m7.C5716c mo21495b(long r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = 1
            java.lang.String r2 = "SELECT * FROM token WHERE account_id == ?"
            q2.k r2 = p217q2.C6162k.m14718a(r0, r2)
            r3 = r22
            r2.bindLong(r0, r3)
            androidx.room.RoomDatabase r0 = r1.f18385a
            r0.mo5186b()
            androidx.room.RoomDatabase r0 = r1.f18385a
            android.database.Cursor r3 = r0.mo5193i(r2)
            java.lang.String r0 = "account_id"
            int r0 = p243s2.C6419b.m15327a(r3, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r4 = "access_token"
            int r4 = p243s2.C6419b.m15327a(r3, r4)     // Catch:{ all -> 0x0088 }
            java.lang.String r5 = "access_expire_time"
            int r5 = p243s2.C6419b.m15327a(r3, r5)     // Catch:{ all -> 0x0088 }
            java.lang.String r6 = "refresh_expire_time"
            int r6 = p243s2.C6419b.m15327a(r3, r6)     // Catch:{ all -> 0x0088 }
            java.lang.String r7 = "refresh_token"
            int r7 = p243s2.C6419b.m15327a(r3, r7)     // Catch:{ all -> 0x0088 }
            java.lang.String r8 = "token_type"
            int r8 = p243s2.C6419b.m15327a(r3, r8)     // Catch:{ all -> 0x0088 }
            boolean r9 = r3.moveToFirst()     // Catch:{ all -> 0x0088 }
            r10 = 0
            if (r9 == 0) goto L_0x0081
            long r12 = r3.getLong(r0)     // Catch:{ all -> 0x0088 }
            boolean r0 = r3.isNull(r4)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0051
            r14 = r10
            goto L_0x0056
        L_0x0051:
            java.lang.String r0 = r3.getString(r4)     // Catch:{ all -> 0x0088 }
            r14 = r0
        L_0x0056:
            long r15 = r3.getLong(r5)     // Catch:{ all -> 0x0088 }
            long r17 = r3.getLong(r6)     // Catch:{ all -> 0x0088 }
            boolean r0 = r3.isNull(r7)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0067
            r19 = r10
            goto L_0x006d
        L_0x0067:
            java.lang.String r0 = r3.getString(r7)     // Catch:{ all -> 0x0088 }
            r19 = r0
        L_0x006d:
            boolean r0 = r3.isNull(r8)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0076
        L_0x0073:
            r20 = r10
            goto L_0x007b
        L_0x0076:
            java.lang.String r10 = r3.getString(r8)     // Catch:{ all -> 0x0088 }
            goto L_0x0073
        L_0x007b:
            m7.c r10 = new m7.c     // Catch:{ all -> 0x0088 }
            r11 = r10
            r11.<init>(r12, r14, r15, r17, r19, r20)     // Catch:{ all -> 0x0088 }
        L_0x0081:
            r3.close()
            r2.release()
            return r10
        L_0x0088:
            r0 = move-exception
            r3.close()
            r2.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p158l7.C5638h.mo21495b(long):m7.c");
    }

    /* renamed from: c */
    public final ArrayList mo21496c() {
        String str;
        String str2;
        String str3;
        C6162k a = C6162k.m14718a(0, "SELECT * FROM token");
        this.f18385a.mo5186b();
        Cursor i = this.f18385a.mo5193i(a);
        try {
            int a2 = C6419b.m15327a(i, "account_id");
            int a3 = C6419b.m15327a(i, "access_token");
            int a4 = C6419b.m15327a(i, "access_expire_time");
            int a5 = C6419b.m15327a(i, "refresh_expire_time");
            int a6 = C6419b.m15327a(i, "refresh_token");
            int a7 = C6419b.m15327a(i, "token_type");
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                long j = i.getLong(a2);
                if (i.isNull(a3)) {
                    str = null;
                } else {
                    str = i.getString(a3);
                }
                long j2 = i.getLong(a4);
                long j3 = i.getLong(a5);
                if (i.isNull(a6)) {
                    str2 = null;
                } else {
                    str2 = i.getString(a6);
                }
                if (i.isNull(a7)) {
                    str3 = null;
                } else {
                    str3 = i.getString(a7);
                }
                arrayList.add(new C5716c(j, str, j2, j3, str2, str3));
            }
            return arrayList;
        } finally {
            i.close();
            a.release();
        }
    }

    /* renamed from: d */
    public final void mo21497d(C5716c cVar) {
        C5637g gVar;
        C6685f a;
        this.f18385a.mo5186b();
        this.f18385a.mo5187c();
        try {
            gVar = this.f18387c;
            a = gVar.mo22151a();
            gVar.mo21498d(a, cVar);
            a.executeUpdateDelete();
            gVar.mo22152c(a);
            this.f18385a.mo5194j();
            this.f18385a.mo5191g();
        } catch (Throwable th) {
            this.f18385a.mo5191g();
            throw th;
        }
    }
}
