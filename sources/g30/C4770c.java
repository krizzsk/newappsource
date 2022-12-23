package g30;

import com.moovit.database.sqlite.SQLiteDatabase;
import g30.C4773f;
import p977zz.C20935e;
import s00.C19391d;

/* renamed from: g30.c */
public final /* synthetic */ class C4770c implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ C4773f.C4774a f16115b;

    /* renamed from: c */
    public final /* synthetic */ C19391d f16116c;

    /* renamed from: d */
    public final /* synthetic */ SQLiteDatabase f16117d;

    public /* synthetic */ C4770c(C4773f.C4774a aVar, C19391d dVar, SQLiteDatabase sQLiteDatabase) {
        this.f16115b = aVar;
        this.f16116c = dVar;
        this.f16117d = sQLiteDatabase;
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.lang.Object r10) {
        /*
            r9 = this;
            g30.f$a r0 = r9.f16115b
            s00.d r1 = r9.f16116c
            com.moovit.database.sqlite.SQLiteDatabase r2 = r9.f16117d
            java.lang.String[] r10 = (java.lang.String[]) r10
            r0.getClass()
            u00.q r1 = r1.mo51806h()
            g30.n$b r0 = r0.f16124b
            long r3 = r0.f16161b
            java.lang.String r0 = u00.C19853q.f50467g
            java.lang.String r5 = u00.C19853q.f50468h
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r7 = r1.mo52110g()
            r8 = 0
            r6[r8] = r7
            java.lang.String r1 = r1.mo52108e()
            r7 = 1
            r6[r7] = r1
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r3 = 2
            r6[r3] = r1
            int r1 = r10.length
            if (r1 <= 0) goto L_0x004a
            int r1 = r10.length
            java.lang.String r1 = com.moovit.database.DatabaseUtils.createInClausePlaceHolders(r1)
            java.lang.String r3 = " AND stop_id NOT IN ("
            java.lang.String r4 = ");"
            java.lang.String r0 = p379.C25541a.m63882l(r0, r3, r1, r4)
            java.lang.String r5 = p379.C25541a.m63882l(r5, r3, r1, r4)
            java.lang.Object[] r10 = mf0.C24361g.m61131A(r6, r10)
            r6 = r10
            java.lang.String[] r6 = (java.lang.String[]) r6
        L_0x004a:
            r2.beginTransactionNonExclusive()
            r2.execSQL(r0, r6)     // Catch:{ all -> 0x005a }
            r2.execSQL(r5, r6)     // Catch:{ all -> 0x005a }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x005a }
            r2.endTransaction()
            return
        L_0x005a:
            r10 = move-exception
            r2.endTransaction()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g30.C4770c.invoke(java.lang.Object):void");
    }
}
