package od0;

import android.content.ContentValues;
import td0.C24931b;

/* renamed from: od0.b */
public final class C24544b implements C24931b<C24543a> {
    /* renamed from: a */
    public final ContentValues mo60801a(Object obj) {
        C24543a aVar = (C24543a) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("item_id", aVar.f62167a);
        contentValues.put("ad_identifier", aVar.f62168b);
        contentValues.put("paren_id", aVar.f62169c);
        contentValues.put("server_path", aVar.f62170d);
        contentValues.put("local_path", aVar.f62171e);
        contentValues.put("file_status", Integer.valueOf(aVar.f62172f));
        contentValues.put("file_type", Integer.valueOf(aVar.f62173g));
        contentValues.put("file_size", Long.valueOf(aVar.f62174h));
        contentValues.put("retry_count", Integer.valueOf(aVar.f62175i));
        contentValues.put("retry_error", Integer.valueOf(aVar.f62176j));
        return contentValues;
    }

    /* renamed from: b */
    public final String mo60802b() {
        return "adAsset";
    }

    /* renamed from: c */
    public final Object mo60803c(ContentValues contentValues) {
        C24543a aVar = new C24543a(contentValues.getAsString("ad_identifier"), contentValues.getAsString("server_path"), contentValues.getAsString("local_path"), contentValues.getAsString("item_id"));
        aVar.f62172f = contentValues.getAsInteger("file_status").intValue();
        aVar.f62173g = contentValues.getAsInteger("file_type").intValue();
        aVar.f62174h = (long) contentValues.getAsInteger("file_size").intValue();
        aVar.f62175i = contentValues.getAsInteger("retry_count").intValue();
        aVar.f62176j = contentValues.getAsInteger("retry_error").intValue();
        aVar.f62169c = contentValues.getAsString("paren_id");
        return aVar;
    }
}
