package v00;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Serializable;

/* renamed from: v00.a */
public final class C20062a extends C20064c {
    public C20062a(String str, Boolean bool) {
        super(str, (Object) bool);
    }

    /* renamed from: d */
    public final void mo52324d(ContentValues contentValues, String str, Serializable serializable) {
        contentValues.put(str, (Boolean) serializable);
    }

    /* renamed from: e */
    public final Object mo52325e(Cursor cursor, int i) {
        int i2 = cursor.getInt(i);
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
