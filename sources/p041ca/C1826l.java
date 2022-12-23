package p041ca;

import android.database.sqlite.SQLiteDatabase;
import h60.C17327j1;
import p041ca.C1835u;

/* renamed from: ca.l */
public final /* synthetic */ class C1826l implements C1835u.C1836a {

    /* renamed from: b */
    public final /* synthetic */ C1835u f6327b;

    /* renamed from: c */
    public final /* synthetic */ long f6328c;

    public /* synthetic */ C1826l(C1835u uVar, long j) {
        this.f6327b = uVar;
        this.f6328c = j;
    }

    public final Object apply(Object obj) {
        C1835u uVar = this.f6327b;
        long j = this.f6328c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        uVar.getClass();
        String[] strArr = {String.valueOf(j)};
        C1835u.m5160w(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C17327j1(uVar, 4));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }
}
