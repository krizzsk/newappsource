package p041ca;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import p041ca.C1835u;

/* renamed from: ca.m */
public final /* synthetic */ class C1827m implements C1835u.C1836a {

    /* renamed from: b */
    public final /* synthetic */ String f6329b;

    /* renamed from: c */
    public final /* synthetic */ LogEventDropped.Reason f6330c;

    /* renamed from: d */
    public final /* synthetic */ long f6331d;

    public /* synthetic */ C1827m(long j, LogEventDropped.Reason reason, String str) {
        this.f6329b = str;
        this.f6330c = reason;
        this.f6331d = j;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        boolean z;
        String str = this.f6329b;
        LogEventDropped.Reason reason = this.f6330c;
        long j = this.f6331d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
        try {
            if (rawQuery.getCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            rawQuery.close();
            if (!valueOf.booleanValue()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(reason.getNumber()));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
            } else {
                sQLiteDatabase.execSQL(C16530d.m42012e("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(reason.getNumber())});
            }
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
