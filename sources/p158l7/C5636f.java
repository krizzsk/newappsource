package p158l7;

import com.cubic.umo.auth.database.AuthDatabase;
import p170m7.C5716c;
import p217q2.C6150e;
import p269u2.C6685f;

/* renamed from: l7.f */
public final class C5636f extends C6150e<C5716c> {
    public C5636f(AuthDatabase authDatabase) {
        super(authDatabase);
    }

    /* renamed from: b */
    public final String mo21491b() {
        return "INSERT OR ABORT INTO `Token` (`account_id`,`access_token`,`access_expire_time`,`refresh_expire_time`,`refresh_token`,`token_type`) VALUES (?,?,?,?,?,?)";
    }

    /* renamed from: d */
    public final void mo21492d(C6685f fVar, Object obj) {
        C5716c cVar = (C5716c) obj;
        fVar.bindLong(1, cVar.f18531a);
        String str = cVar.f18532b;
        if (str == null) {
            fVar.bindNull(2);
        } else {
            fVar.bindString(2, str);
        }
        fVar.bindLong(3, cVar.f18533c);
        fVar.bindLong(4, cVar.f18534d);
        String str2 = cVar.f18535e;
        if (str2 == null) {
            fVar.bindNull(5);
        } else {
            fVar.bindString(5, str2);
        }
        String str3 = cVar.f18536f;
        if (str3 == null) {
            fVar.bindNull(6);
        } else {
            fVar.bindString(6, str3);
        }
    }
}
