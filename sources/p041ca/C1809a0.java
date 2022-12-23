package p041ca;

import android.database.sqlite.SQLiteDatabase;
import p041ca.C1811b0;

/* renamed from: ca.a0 */
public final /* synthetic */ class C1809a0 implements C1811b0.C1812a {
    /* renamed from: a */
    public final void mo6630a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(C1811b0.f6311d);
    }
}
