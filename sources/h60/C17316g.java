package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVAlternateAuthProviderRequest;
import j60.C17709a;
import j60.C17711b;
import v40.C25754i;

/* renamed from: h60.g */
public final class C17316g extends C13778r<C17316g, C17319h, MVAlternateAuthProviderRequest> implements C17709a.C17710a {

    /* renamed from: w */
    public final String f44701w;

    /* renamed from: x */
    public final C17709a f44702x;

    public C17316g(C13752e eVar, String str, C17711b bVar) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_alternate_provider, C17319h.class);
        C21100e.m49373x(str, "paymentContext");
        this.f44701w = str;
        this.f44702x = bVar;
        bVar.mo50164a(this);
    }
}
