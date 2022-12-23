package p158l7;

import com.cubic.umo.auth.database.AuthDatabase;
import p170m7.C5716c;
import p217q2.C6149d;
import p269u2.C6685f;

/* renamed from: l7.g */
public final class C5637g extends C6149d<C5716c> {
    public C5637g(AuthDatabase authDatabase) {
        super(authDatabase);
    }

    /* renamed from: b */
    public final String mo21491b() {
        return "UPDATE OR ABORT `Token` SET `account_id` = ?,`access_token` = ?,`access_expire_time` = ?,`refresh_expire_time` = ?,`refresh_token` = ?,`token_type` = ? WHERE `account_id` = ?";
    }

    /* renamed from: d */
    public final void mo21498d(C6685f fVar, Object obj) {
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
        fVar.bindLong(7, cVar.f18531a);
    }
}
