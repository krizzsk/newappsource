package p158l7;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.cubic.umo.auth.database.AuthDatabase;
import java.util.concurrent.atomic.AtomicBoolean;
import p170m7.C5714a;
import p217q2.C6162k;
import p269u2.C6685f;

/* renamed from: l7.d */
public final class C5634d implements C5631a {

    /* renamed from: a */
    public final RoomDatabase f18382a;

    /* renamed from: b */
    public final C5632b f18383b;

    /* renamed from: c */
    public final C5633c f18384c;

    public C5634d(AuthDatabase authDatabase) {
        this.f18382a = authDatabase;
        this.f18383b = new C5632b(authDatabase);
        new AtomicBoolean(false);
        this.f18384c = new C5633c(authDatabase);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: m7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: m7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: m7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: m7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: m7.a} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p170m7.C5714a mo21486a(java.lang.String r33) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            r2 = 1
            java.lang.String r3 = "SELECT * FROM account WHERE cubic_id == ?"
            q2.k r3 = p217q2.C6162k.m14718a(r2, r3)
            if (r0 != 0) goto L_0x0011
            r3.bindNull(r2)
            goto L_0x0014
        L_0x0011:
            r3.bindString(r2, r0)
        L_0x0014:
            androidx.room.RoomDatabase r0 = r1.f18382a
            r0.mo5186b()
            androidx.room.RoomDatabase r0 = r1.f18382a
            r4 = 0
            android.database.Cursor r5 = r0.mo5193i(r3)
            java.lang.String r0 = "_id"
            int r0 = p243s2.C6419b.m15327a(r5, r0)     // Catch:{ all -> 0x013d }
            java.lang.String r6 = "cubic_id"
            int r6 = p243s2.C6419b.m15327a(r5, r6)     // Catch:{ all -> 0x013d }
            java.lang.String r7 = "session_state"
            int r7 = p243s2.C6419b.m15327a(r5, r7)     // Catch:{ all -> 0x013d }
            java.lang.String r8 = "email_is_verified"
            int r8 = p243s2.C6419b.m15327a(r5, r8)     // Catch:{ all -> 0x013d }
            java.lang.String r9 = "preferred_username"
            int r9 = p243s2.C6419b.m15327a(r5, r9)     // Catch:{ all -> 0x013d }
            java.lang.String r10 = "pass_id"
            int r10 = p243s2.C6419b.m15327a(r5, r10)     // Catch:{ all -> 0x013d }
            java.lang.String r11 = "card_number"
            int r11 = p243s2.C6419b.m15327a(r5, r11)     // Catch:{ all -> 0x013d }
            java.lang.String r12 = "account_key"
            int r12 = p243s2.C6419b.m15327a(r5, r12)     // Catch:{ all -> 0x013d }
            java.lang.String r13 = "mobile_is_verified"
            int r13 = p243s2.C6419b.m15327a(r5, r13)     // Catch:{ all -> 0x013d }
            java.lang.String r14 = "media_id"
            int r14 = p243s2.C6419b.m15327a(r5, r14)     // Catch:{ all -> 0x013d }
            java.lang.String r15 = "user_token"
            int r15 = p243s2.C6419b.m15327a(r5, r15)     // Catch:{ all -> 0x013d }
            java.lang.String r2 = "mobile_number"
            int r2 = p243s2.C6419b.m15327a(r5, r2)     // Catch:{ all -> 0x013d }
            boolean r17 = r5.moveToFirst()     // Catch:{ all -> 0x013d }
            if (r17 == 0) goto L_0x0136
            long r19 = r5.getLong(r0)     // Catch:{ all -> 0x013d }
            boolean r0 = r5.isNull(r6)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x007c
            r21 = r4
            goto L_0x0082
        L_0x007c:
            java.lang.String r0 = r5.getString(r6)     // Catch:{ all -> 0x013d }
            r21 = r0
        L_0x0082:
            boolean r0 = r5.isNull(r7)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x008b
            r22 = r4
            goto L_0x0091
        L_0x008b:
            java.lang.String r0 = r5.getString(r7)     // Catch:{ all -> 0x013d }
            r22 = r0
        L_0x0091:
            int r0 = r5.getInt(r8)     // Catch:{ all -> 0x013d }
            r6 = 0
            if (r0 == 0) goto L_0x009b
            r23 = 1
            goto L_0x009d
        L_0x009b:
            r23 = 0
        L_0x009d:
            boolean r0 = r5.isNull(r9)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x00a6
            r24 = r4
            goto L_0x00ac
        L_0x00a6:
            java.lang.String r0 = r5.getString(r9)     // Catch:{ all -> 0x013d }
            r24 = r0
        L_0x00ac:
            boolean r0 = r5.isNull(r10)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x00b5
            r25 = r4
            goto L_0x00bf
        L_0x00b5:
            int r0 = r5.getInt(r10)     // Catch:{ all -> 0x013d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x013d }
            r25 = r0
        L_0x00bf:
            boolean r0 = r5.isNull(r11)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x00c8
            r26 = r4
            goto L_0x00ce
        L_0x00c8:
            java.lang.String r0 = r5.getString(r11)     // Catch:{ all -> 0x013d }
            r26 = r0
        L_0x00ce:
            boolean r0 = r5.isNull(r12)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x00d7
            r27 = r4
            goto L_0x00dd
        L_0x00d7:
            java.lang.String r0 = r5.getString(r12)     // Catch:{ all -> 0x013d }
            r27 = r0
        L_0x00dd:
            boolean r0 = r5.isNull(r13)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x00e5
            r0 = r4
            goto L_0x00ed
        L_0x00e5:
            int r0 = r5.getInt(r13)     // Catch:{ all -> 0x013d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x013d }
        L_0x00ed:
            if (r0 != 0) goto L_0x00f2
            r28 = r4
            goto L_0x0103
        L_0x00f2:
            int r0 = r0.intValue()     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x00fb
            r16 = 1
            goto L_0x00fd
        L_0x00fb:
            r16 = 0
        L_0x00fd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x013d }
            r28 = r0
        L_0x0103:
            boolean r0 = r5.isNull(r14)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x010c
            r29 = r4
            goto L_0x0112
        L_0x010c:
            java.lang.String r0 = r5.getString(r14)     // Catch:{ all -> 0x013d }
            r29 = r0
        L_0x0112:
            boolean r0 = r5.isNull(r15)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x011b
            r30 = r4
            goto L_0x0121
        L_0x011b:
            java.lang.String r0 = r5.getString(r15)     // Catch:{ all -> 0x013d }
            r30 = r0
        L_0x0121:
            boolean r0 = r5.isNull(r2)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x012a
        L_0x0127:
            r31 = r4
            goto L_0x012f
        L_0x012a:
            java.lang.String r4 = r5.getString(r2)     // Catch:{ all -> 0x013d }
            goto L_0x0127
        L_0x012f:
            m7.a r4 = new m7.a     // Catch:{ all -> 0x013d }
            r18 = r4
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x013d }
        L_0x0136:
            r5.close()
            r3.release()
            return r4
        L_0x013d:
            r0 = move-exception
            r5.close()
            r3.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p158l7.C5634d.mo21486a(java.lang.String):m7.a");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: m7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: m7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: m7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: m7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: m7.a} */
    /* JADX WARNING: type inference failed for: r17v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p170m7.C5714a mo21487b() {
        /*
            r32 = this;
            r1 = r32
            r0 = 0
            java.lang.String r2 = "SELECT * FROM account WHERE _id == -1"
            q2.k r2 = p217q2.C6162k.m14718a(r0, r2)
            androidx.room.RoomDatabase r3 = r1.f18382a
            r3.mo5186b()
            androidx.room.RoomDatabase r3 = r1.f18382a
            android.database.Cursor r3 = r3.mo5193i(r2)
            java.lang.String r4 = "_id"
            int r4 = p243s2.C6419b.m15327a(r3, r4)     // Catch:{ all -> 0x0130 }
            java.lang.String r5 = "cubic_id"
            int r5 = p243s2.C6419b.m15327a(r3, r5)     // Catch:{ all -> 0x0130 }
            java.lang.String r6 = "session_state"
            int r6 = p243s2.C6419b.m15327a(r3, r6)     // Catch:{ all -> 0x0130 }
            java.lang.String r7 = "email_is_verified"
            int r7 = p243s2.C6419b.m15327a(r3, r7)     // Catch:{ all -> 0x0130 }
            java.lang.String r8 = "preferred_username"
            int r8 = p243s2.C6419b.m15327a(r3, r8)     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = "pass_id"
            int r9 = p243s2.C6419b.m15327a(r3, r9)     // Catch:{ all -> 0x0130 }
            java.lang.String r10 = "card_number"
            int r10 = p243s2.C6419b.m15327a(r3, r10)     // Catch:{ all -> 0x0130 }
            java.lang.String r11 = "account_key"
            int r11 = p243s2.C6419b.m15327a(r3, r11)     // Catch:{ all -> 0x0130 }
            java.lang.String r12 = "mobile_is_verified"
            int r12 = p243s2.C6419b.m15327a(r3, r12)     // Catch:{ all -> 0x0130 }
            java.lang.String r13 = "media_id"
            int r13 = p243s2.C6419b.m15327a(r3, r13)     // Catch:{ all -> 0x0130 }
            java.lang.String r14 = "user_token"
            int r14 = p243s2.C6419b.m15327a(r3, r14)     // Catch:{ all -> 0x0130 }
            java.lang.String r15 = "mobile_number"
            int r15 = p243s2.C6419b.m15327a(r3, r15)     // Catch:{ all -> 0x0130 }
            boolean r16 = r3.moveToFirst()     // Catch:{ all -> 0x0130 }
            r17 = 0
            if (r16 == 0) goto L_0x0129
            long r19 = r3.getLong(r4)     // Catch:{ all -> 0x0130 }
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x0072
            r21 = r17
            goto L_0x0078
        L_0x0072:
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x0130 }
            r21 = r4
        L_0x0078:
            boolean r4 = r3.isNull(r6)     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x0081
            r22 = r17
            goto L_0x0087
        L_0x0081:
            java.lang.String r4 = r3.getString(r6)     // Catch:{ all -> 0x0130 }
            r22 = r4
        L_0x0087:
            int r4 = r3.getInt(r7)     // Catch:{ all -> 0x0130 }
            r5 = 1
            if (r4 == 0) goto L_0x0091
            r23 = 1
            goto L_0x0093
        L_0x0091:
            r23 = 0
        L_0x0093:
            boolean r4 = r3.isNull(r8)     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x009c
            r24 = r17
            goto L_0x00a2
        L_0x009c:
            java.lang.String r4 = r3.getString(r8)     // Catch:{ all -> 0x0130 }
            r24 = r4
        L_0x00a2:
            boolean r4 = r3.isNull(r9)     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x00ab
            r25 = r17
            goto L_0x00b5
        L_0x00ab:
            int r4 = r3.getInt(r9)     // Catch:{ all -> 0x0130 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0130 }
            r25 = r4
        L_0x00b5:
            boolean r4 = r3.isNull(r10)     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x00be
            r26 = r17
            goto L_0x00c4
        L_0x00be:
            java.lang.String r4 = r3.getString(r10)     // Catch:{ all -> 0x0130 }
            r26 = r4
        L_0x00c4:
            boolean r4 = r3.isNull(r11)     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x00cd
            r27 = r17
            goto L_0x00d3
        L_0x00cd:
            java.lang.String r4 = r3.getString(r11)     // Catch:{ all -> 0x0130 }
            r27 = r4
        L_0x00d3:
            boolean r4 = r3.isNull(r12)     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x00dc
            r4 = r17
            goto L_0x00e4
        L_0x00dc:
            int r4 = r3.getInt(r12)     // Catch:{ all -> 0x0130 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0130 }
        L_0x00e4:
            if (r4 != 0) goto L_0x00e9
            r28 = r17
            goto L_0x00f6
        L_0x00e9:
            int r4 = r4.intValue()     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x00f0
            r0 = 1
        L_0x00f0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0130 }
            r28 = r0
        L_0x00f6:
            boolean r0 = r3.isNull(r13)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x00ff
            r29 = r17
            goto L_0x0105
        L_0x00ff:
            java.lang.String r0 = r3.getString(r13)     // Catch:{ all -> 0x0130 }
            r29 = r0
        L_0x0105:
            boolean r0 = r3.isNull(r14)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x010e
            r30 = r17
            goto L_0x0114
        L_0x010e:
            java.lang.String r0 = r3.getString(r14)     // Catch:{ all -> 0x0130 }
            r30 = r0
        L_0x0114:
            boolean r0 = r3.isNull(r15)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x011d
        L_0x011a:
            r31 = r17
            goto L_0x0122
        L_0x011d:
            java.lang.String r17 = r3.getString(r15)     // Catch:{ all -> 0x0130 }
            goto L_0x011a
        L_0x0122:
            m7.a r17 = new m7.a     // Catch:{ all -> 0x0130 }
            r18 = r17
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0130 }
        L_0x0129:
            r3.close()
            r2.release()
            return r17
        L_0x0130:
            r0 = move-exception
            r3.close()
            r2.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p158l7.C5634d.mo21487b():m7.a");
    }

    /* renamed from: c */
    public final void mo21488c(C5714a aVar) {
        this.f18382a.mo5186b();
        this.f18382a.mo5187c();
        try {
            this.f18383b.mo22125e(aVar);
            this.f18382a.mo5194j();
        } finally {
            this.f18382a.mo5191g();
        }
    }

    /* renamed from: d */
    public final String mo21489d(long j) {
        String str;
        C6162k a = C6162k.m14718a(1, "SELECT cubic_id FROM account WHERE _id == ?");
        a.bindLong(1, j);
        this.f18382a.mo5186b();
        Cursor i = this.f18382a.mo5193i(a);
        try {
            if (i.moveToFirst()) {
                if (!i.isNull(0)) {
                    str = i.getString(0);
                    return str;
                }
            }
            str = null;
            return str;
        } finally {
            i.close();
            a.release();
        }
    }

    /* renamed from: e */
    public final void mo21490e(C5714a aVar) {
        C5633c cVar;
        C6685f a;
        this.f18382a.mo5186b();
        this.f18382a.mo5187c();
        try {
            cVar = this.f18384c;
            a = cVar.mo22151a();
            cVar.mo21493d(a, aVar);
            a.executeUpdateDelete();
            cVar.mo22152c(a);
            this.f18382a.mo5194j();
            this.f18382a.mo5191g();
        } catch (Throwable th) {
            this.f18382a.mo5191g();
            throw th;
        }
    }
}
