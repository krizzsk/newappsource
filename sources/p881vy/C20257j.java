package p881vy;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.wondo.MVNewWondoUserRequest;

/* renamed from: vy.j */
public final class C20257j extends C13778r<C20257j, C20258k, MVNewWondoUserRequest> {

    /* renamed from: w */
    public final String f51363w;

    /* renamed from: x */
    public final String f51364x;

    public C20257j(C13752e eVar, String str, String str2) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_wondo_registration, C20258k.class);
        this.f51363w = str;
        this.f51364x = str2;
        RO mVNewWondoUserRequest = new MVNewWondoUserRequest();
        if (str != null) {
            mVNewWondoUserRequest.referrer = str;
        }
        if (str2 != null) {
            mVNewWondoUserRequest.origin = str2;
        }
        this.f33922v = mVNewWondoUserRequest;
    }
}
