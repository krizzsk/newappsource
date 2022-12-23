package p041ca;

import android.database.sqlite.SQLiteDatabase;
import p041ca.C1811b0;

/* renamed from: ca.y */
public final /* synthetic */ class C1841y implements C1811b0.C1812a {
    /* renamed from: a */
    public final void mo6630a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
