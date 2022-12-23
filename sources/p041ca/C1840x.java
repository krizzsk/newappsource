package p041ca;

import android.database.sqlite.SQLiteDatabase;
import p041ca.C1811b0;

/* renamed from: ca.x */
public final /* synthetic */ class C1840x implements C1811b0.C1812a {
    /* renamed from: a */
    public final void mo6630a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
