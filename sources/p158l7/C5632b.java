package p158l7;

import com.cubic.umo.auth.database.AuthDatabase;
import p170m7.C5714a;
import p217q2.C6150e;
import p269u2.C6685f;

/* renamed from: l7.b */
public final class C5632b extends C6150e<C5714a> {
    public C5632b(AuthDatabase authDatabase) {
        super(authDatabase);
    }

    /* renamed from: b */
    public final String mo21491b() {
        return "INSERT OR ABORT INTO `Account` (`_id`,`cubic_id`,`session_state`,`email_is_verified`,`preferred_username`,`pass_id`,`card_number`,`account_key`,`mobile_is_verified`,`media_id`,`user_token`,`mobile_number`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
    }

    /* renamed from: d */
    public final void mo21492d(C6685f fVar, Object obj) {
        Integer num;
        C5714a aVar = (C5714a) obj;
        fVar.bindLong(1, aVar.f18517a);
        String str = aVar.f18518b;
        if (str == null) {
            fVar.bindNull(2);
        } else {
            fVar.bindString(2, str);
        }
        String str2 = aVar.f18519c;
        if (str2 == null) {
            fVar.bindNull(3);
        } else {
            fVar.bindString(3, str2);
        }
        fVar.bindLong(4, aVar.f18520d ? 1 : 0);
        String str3 = aVar.f18521e;
        if (str3 == null) {
            fVar.bindNull(5);
        } else {
            fVar.bindString(5, str3);
        }
        Integer num2 = aVar.f18522f;
        if (num2 == null) {
            fVar.bindNull(6);
        } else {
            fVar.bindLong(6, (long) num2.intValue());
        }
        String str4 = aVar.f18523g;
        if (str4 == null) {
            fVar.bindNull(7);
        } else {
            fVar.bindString(7, str4);
        }
        String str5 = aVar.f18524h;
        if (str5 == null) {
            fVar.bindNull(8);
        } else {
            fVar.bindString(8, str5);
        }
        Boolean bool = aVar.f18525i;
        if (bool == null) {
            num = null;
        } else {
            num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        }
        if (num == null) {
            fVar.bindNull(9);
        } else {
            fVar.bindLong(9, (long) num.intValue());
        }
        String str6 = aVar.f18526j;
        if (str6 == null) {
            fVar.bindNull(10);
        } else {
            fVar.bindString(10, str6);
        }
        String str7 = aVar.f18527k;
        if (str7 == null) {
            fVar.bindNull(11);
        } else {
            fVar.bindString(11, str7);
        }
        String str8 = aVar.f18528l;
        if (str8 == null) {
            fVar.bindNull(12);
        } else {
            fVar.bindString(12, str8);
        }
    }
}
