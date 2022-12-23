package j60;

import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVAlternateAuthProviderRequest;
import com.tranzmate.moovit.protocol.payments.MVAlternateAuthProviderResult;
import com.tranzmate.moovit.protocol.payments.MVAlternateWebAuthProviderResult;
import h60.C17316g;
import h60.C17353s0;
import j60.C17709a;
import p810sz.C19617r;

/* renamed from: j60.b */
public final class C17711b extends C17709a {

    /* renamed from: a */
    public final String f45462a;

    public C17711b(String str) {
        C21100e.m49373x(str, "resultUrl");
        this.f45462a = str;
    }

    /* renamed from: a */
    public final void mo50164a(C17709a.C17710a aVar) {
        C17316g gVar = (C17316g) aVar;
        gVar.getClass();
        C19617r rVar = C17353s0.f44739a;
        String str = this.f45462a;
        MVAlternateWebAuthProviderResult mVAlternateWebAuthProviderResult = new MVAlternateWebAuthProviderResult();
        mVAlternateWebAuthProviderResult.resultUrl = str;
        MVAlternateAuthProviderResult mVAlternateAuthProviderResult = new MVAlternateAuthProviderResult();
        mVAlternateAuthProviderResult.setField_ = MVAlternateAuthProviderResult._Fields.WEB_AUTH_RESULT;
        mVAlternateAuthProviderResult.value_ = mVAlternateWebAuthProviderResult;
        String str2 = gVar.f44701w;
        RO mVAlternateAuthProviderRequest = new MVAlternateAuthProviderRequest();
        mVAlternateAuthProviderRequest.paymentContext = str2;
        mVAlternateAuthProviderRequest.authResult = mVAlternateAuthProviderResult;
        gVar.f33922v = mVAlternateAuthProviderRequest;
    }
}
