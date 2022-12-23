package y90;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.user.LocaleInfo;
import com.tranzmate.moovit.protocol.users.MVChangeUserLangRequest;
import com.tranzmate.moovit.protocol.users.MVLocale;
import p824tp.C19746x;

/* renamed from: y90.c */
public final class C13269c extends C13778r<C13269c, C13270d, MVChangeUserLangRequest> {
    public C13269c(C13752e eVar, LocaleInfo localeInfo) {
        super(eVar, C19746x.api_path_update_user_locale_request_path, C13270d.class);
        MVLocale s = C13749c.m34333s(localeInfo);
        RO mVChangeUserLangRequest = new MVChangeUserLangRequest();
        mVChangeUserLangRequest.newLocale = s;
        this.f33922v = mVChangeUserLangRequest;
    }
}
