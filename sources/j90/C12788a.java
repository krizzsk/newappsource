package j90;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.network.model.ServerId;
import com.moovit.util.ParcelableMemRef;
import j90.C12789b;
import l90.C12850a;
import l90.C12852c;
import m80.C12887v;
import p688nu.C18630b;

/* renamed from: j90.a */
public abstract class C12788a<R extends C12789b> extends C15682c<MoovitActivity> {

    /* renamed from: n */
    public final Class<R> f31611n = C12850a.class;

    public C12788a() {
        super(MoovitActivity.class);
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        Bundle Q1 = mo46782Q1();
        ParcelableMemRef parcelableMemRef = (ParcelableMemRef) Q1.getParcelable("validationInfo");
        if (parcelableMemRef == null || parcelableMemRef.mo24562b() == null) {
            ServerId serverId = (ServerId) Q1.getParcelable("providerId");
            if (serverId != null) {
                C12887v.m32668b().mo39734c(serverId).addOnSuccessListener((Activity) requireActivity(), new C18630b(4, this, view));
                return;
            }
            return;
        }
        C12852c cVar = (C12852c) this;
        cVar.f31783s = (C12850a) ((C12789b) parcelableMemRef.mo24562b());
        if (cVar.isResumed()) {
            cVar.f31779o.mo23804e();
        }
    }
}
