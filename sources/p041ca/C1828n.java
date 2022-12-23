package p041ca;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p041ca.C1835u;
import p086fa.C4715a;
import p275u9.C6751s;

/* renamed from: ca.n */
public final /* synthetic */ class C1828n implements C1835u.C1836a {

    /* renamed from: b */
    public final /* synthetic */ long f6332b;

    /* renamed from: c */
    public final /* synthetic */ C6751s f6333c;

    public /* synthetic */ C1828n(long j, C6751s sVar) {
        this.f6332b = j;
        this.f6333c = sVar;
    }

    public final Object apply(Object obj) {
        long j = this.f6332b;
        C6751s sVar = this.f6333c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sVar.mo22910b(), String.valueOf(C4715a.m12025a(sVar.mo22912d()))}) < 1) {
            contentValues.put("backend_name", sVar.mo22910b());
            contentValues.put("priority", Integer.valueOf(C4715a.m12025a(sVar.mo22912d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
