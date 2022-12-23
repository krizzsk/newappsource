package od0;

import android.content.ContentValues;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p359ag.C13450g;
import td0.C24931b;

/* renamed from: od0.r */
public final class C24574r implements C24931b<C24573q> {
    /* renamed from: a */
    public final ContentValues mo60801a(Object obj) {
        String str;
        C24573q qVar = (C24573q) obj;
        ContentValues contentValues = new ContentValues();
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(C24573q.f62300d.toJson((C13450g) qVar.f62303c).getBytes());
            StringBuilder sb = new StringBuilder(digest.length);
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            str = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            str = null;
        }
        if (str == null) {
            str = String.valueOf(C24573q.f62300d.toJson((C13450g) qVar.f62303c).hashCode());
        }
        contentValues.put("item_id", str);
        contentValues.put("json_string", C24573q.f62300d.toJson((C13450g) qVar.f62303c));
        contentValues.put("send_attempts", Integer.valueOf(qVar.f62302b));
        return contentValues;
    }

    /* renamed from: b */
    public final String mo60802b() {
        return "session_data";
    }

    /* renamed from: c */
    public final Object mo60803c(ContentValues contentValues) {
        return new C24573q(contentValues.getAsString("json_string"), contentValues.getAsInteger("send_attempts").intValue());
    }
}
