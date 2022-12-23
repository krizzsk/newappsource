package od0;

import android.content.ContentValues;
import td0.C24931b;

/* renamed from: od0.i */
public final class C24558i implements C24931b<C24557h> {
    /* renamed from: a */
    public final ContentValues mo60801a(Object obj) {
        String str;
        C24557h hVar = (C24557h) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("item_id", hVar.f62240a + ":" + hVar.f62241b);
        contentValues.put("id", hVar.f62240a);
        contentValues.put("time_window_end", Long.valueOf(hVar.f62241b));
        contentValues.put("id_type", Integer.valueOf(hVar.f62242c));
        String[] strArr = hVar.f62243d;
        if (strArr == null || strArr.length == 0) {
            str = "";
        } else {
            if (strArr.length == 1) {
                str = strArr[0];
            } else {
                StringBuilder sb = new StringBuilder(strArr[0]);
                for (int i = 1; i < strArr.length; i++) {
                    sb.append(";");
                    sb.append(strArr[i]);
                }
                str = sb.toString();
            }
        }
        contentValues.put("event_ids", str);
        contentValues.put("timestamp_processed", Long.valueOf(hVar.f62244e));
        return contentValues;
    }

    /* renamed from: b */
    public final String mo60802b() {
        return "cache_bust";
    }

    /* renamed from: c */
    public final Object mo60803c(ContentValues contentValues) {
        String[] strArr;
        C24557h hVar = new C24557h();
        hVar.f62240a = contentValues.getAsString("id");
        hVar.f62241b = contentValues.getAsLong("time_window_end").longValue();
        hVar.f62242c = contentValues.getAsInteger("id_type").intValue();
        String asString = contentValues.getAsString("event_ids");
        if (asString.isEmpty()) {
            strArr = new String[0];
        } else {
            strArr = asString.split(";");
        }
        hVar.f62243d = strArr;
        hVar.f62244e = contentValues.getAsLong("timestamp_processed").longValue();
        return hVar;
    }
}
