package h60;

import aa0.C7543n;
import android.content.Context;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.payments.MVGenerateExternalAuthenticationinfoRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p977zz.C20964s0;
import v40.C25754i;
import w40.C25762e;

/* renamed from: h60.e0 */
public final class C17311e0 extends C13778r<C17311e0, C17314f0, MVGenerateExternalAuthenticationinfoRequest> {

    /* renamed from: y */
    public static final AtomicReference<C7543n<C25762e>> f44693y = new AtomicReference<>();

    /* renamed from: w */
    public final String f44694w;

    /* renamed from: x */
    public final boolean f44695x;

    public C17311e0(C13752e eVar, String str, boolean z) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_account_token, C17314f0.class);
        C21100e.m49373x(str, "paymentContext");
        this.f44694w = str;
        this.f44695x = z;
        RO mVGenerateExternalAuthenticationinfoRequest = new MVGenerateExternalAuthenticationinfoRequest();
        mVGenerateExternalAuthenticationinfoRequest.paymentContext = str;
        this.f33922v = mVGenerateExternalAuthenticationinfoRequest;
    }

    /* renamed from: E */
    public final List<C17314f0> mo21059E() throws IOException, ServerException {
        if (this.f44695x) {
            return Collections.emptyList();
        }
        C7543n<C25762e> O = mo49830O();
        if (O == null) {
            return Collections.emptyList();
        }
        C25762e eVar = O.get(this.f44694w);
        if (eVar == null) {
            return Collections.emptyList();
        }
        this.f51765h = true;
        return Collections.singletonList(new C17314f0(eVar.f64275b));
    }

    /* renamed from: O */
    public final C7543n<C25762e> mo49830O() {
        AtomicReference<C7543n<C25762e>> atomicReference = f44693y;
        if (atomicReference.get() == null) {
            synchronized (atomicReference) {
                if (atomicReference.get() == null) {
                    Context context = this.f51759b;
                    C25762e.C25763a aVar = C25762e.f64273d;
                    C7543n q = C7543n.m17285q(context, aVar, aVar, "payment_account_token");
                    try {
                        q.mo51042l();
                    } catch (IOException unused) {
                        q = null;
                    }
                    atomicReference.set(q);
                }
            }
        }
        return f44693y.get();
    }

    /* renamed from: P */
    public final C17314f0 mo40668N() throws IOException, BadResponseException, ServerException {
        C7543n<C25762e> O;
        C17314f0 f0Var = (C17314f0) super.mo40051G();
        if (!C20964s0.m49090h(f0Var.f44697m) && (O = mo49830O()) != null) {
            O.put(this.f44694w, new C25762e(this.f44694w, f0Var.f44697m, System.currentTimeMillis()));
        }
        return f0Var;
    }
}
