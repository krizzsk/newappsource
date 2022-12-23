package com.moovit.ticketing.purchase.cart;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.cart.CartInfo;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseCartStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseCartStep> CREATOR = new C7655a();

    /* renamed from: h */
    public static final C7656b f23277h = new C7656b(PurchaseCartStep.class);

    /* renamed from: e */
    public final String f23278e;

    /* renamed from: f */
    public final CartInfo f23279f;

    /* renamed from: g */
    public final String f23280g;

    /* renamed from: com.moovit.ticketing.purchase.cart.PurchaseCartStep$a */
    public class C7655a implements Parcelable.Creator<PurchaseCartStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseCartStep) C19612n.m46981v(parcel, PurchaseCartStep.f23277h);
        }

        public final Object[] newArray(int i) {
            return new PurchaseCartStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.cart.PurchaseCartStep$b */
    public class C7656b extends C19619s<PurchaseCartStep> {
        public C7656b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseCartStep(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), (CartInfo) CartInfo.f23252f.read(pVar), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseCartStep purchaseCartStep = (PurchaseCartStep) obj;
            qVar.mo51954p(purchaseCartStep.f23246b);
            qVar.mo51954p(purchaseCartStep.f23247c);
            qVar.mo51954p(purchaseCartStep.f23278e);
            CartInfo cartInfo = purchaseCartStep.f23279f;
            CartInfo.C7648b bVar = CartInfo.f23252f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(cartInfo, qVar);
            qVar.mo51955t(purchaseCartStep.f23280g);
        }
    }

    public PurchaseCartStep(String str, String str2, String str3, CartInfo cartInfo, String str4) {
        super(str, str2, (String) null);
        C21100e.m49373x(str3, "paymentContext");
        this.f23278e = str3;
        C21100e.m49373x(cartInfo, "cartInfo");
        this.f23279f = cartInfo;
        this.f23280g = str4;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        Intent intent = new Intent(purchaseTicketActivity, PurchaseCartConfirmationActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("step", this);
        purchaseTicketActivity.startActivity(intent);
        purchaseTicketActivity.finish();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23277h);
    }
}
