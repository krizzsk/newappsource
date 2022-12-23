package od0;

import android.content.ContentValues;
import td0.C24931b;

/* renamed from: od0.f */
public final class C24555f implements C24931b<C24554e> {
    /* renamed from: a */
    public final ContentValues mo60801a(Object obj) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("item_id", ((C24554e) obj).f62236a);
        return contentValues;
    }

    /* renamed from: b */
    public final String mo60802b() {
        return "analytic_url";
    }

    /* renamed from: c */
    public final Object mo60803c(ContentValues contentValues) {
        return new C24554e(contentValues.getAsString("item_id"));
    }
}
