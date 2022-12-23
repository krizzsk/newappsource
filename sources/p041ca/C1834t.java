package p041ca;

import android.database.Cursor;
import p041ca.C1835u;
import p325y9.C7353e;

/* renamed from: ca.t */
public final /* synthetic */ class C1834t implements C1835u.C1836a {

    /* renamed from: b */
    public final /* synthetic */ long f6350b;

    public /* synthetic */ C1834t(long j) {
        this.f6350b = j;
    }

    public final Object apply(Object obj) {
        long j = this.f6350b;
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new C7353e(cursor.getLong(0), j);
    }
}
