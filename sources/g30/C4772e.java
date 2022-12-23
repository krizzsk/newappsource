package g30;

import com.moovit.database.sqlite.SQLiteDatabase;
import g30.C4773f;
import p977zz.C20935e;
import s00.C19391d;

/* renamed from: g30.e */
public final /* synthetic */ class C4772e implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ C4773f.C4774a f16121b;

    /* renamed from: c */
    public final /* synthetic */ C19391d f16122c;

    /* renamed from: d */
    public final /* synthetic */ SQLiteDatabase f16123d;

    public /* synthetic */ C4772e(C4773f.C4774a aVar, C19391d dVar, SQLiteDatabase sQLiteDatabase) {
        this.f16121b = aVar;
        this.f16122c = dVar;
        this.f16123d = sQLiteDatabase;
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.lang.Object r9) {
        /*
            r8 = this;
            g30.f$a r0 = r8.f16121b
            s00.d r1 = r8.f16122c
            com.moovit.database.sqlite.SQLiteDatabase r2 = r8.f16123d
            java.lang.String[] r9 = (java.lang.String[]) r9
            r0.getClass()
            u00.p r1 = r1.mo51804f()
            g30.n$b r0 = r0.f16124b
            long r3 = r0.f16161b
            java.lang.String r0 = u00.C19850p.f50455e
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r6 = r1.mo52110g()
            r7 = 0
            r5[r7] = r6
            java.lang.String r1 = r1.mo52108e()
            r6 = 1
            r5[r6] = r1
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r3 = 2
            r5[r3] = r1
            int r1 = r9.length
            if (r1 <= 0) goto L_0x0044
            int r1 = r9.length
            java.lang.String r1 = com.moovit.database.DatabaseUtils.createInClausePlaceHolders(r1)
            java.lang.String r3 = " AND pattern_id NOT IN ("
            java.lang.String r4 = ");"
            java.lang.String r0 = p379.C25541a.m63882l(r0, r3, r1, r4)
            java.lang.Object[] r9 = mf0.C24361g.m61131A(r5, r9)
            r5 = r9
            java.lang.String[] r5 = (java.lang.String[]) r5
        L_0x0044:
            r2.beginTransactionNonExclusive()
            r2.execSQL(r0, r5)     // Catch:{ all -> 0x0051 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0051 }
            r2.endTransaction()
            return
        L_0x0051:
            r9 = move-exception
            r2.endTransaction()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g30.C4772e.invoke(java.lang.Object):void");
    }
}
