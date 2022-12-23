package com.moovit.ticketing.purchase.cart;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CartInfo implements Parcelable {
    public static final Parcelable.Creator<CartInfo> CREATOR = new C7647a();

    /* renamed from: f */
    public static final C7648b f23252f = new C7648b(CartInfo.class);

    /* renamed from: b */
    public final String f23253b;

    /* renamed from: c */
    public final PurchaseVerificationType f23254c;

    /* renamed from: d */
    public final List<CartItem> f23255d;

    /* renamed from: e */
    public final CurrencyAmount f23256e;

    /* renamed from: com.moovit.ticketing.purchase.cart.CartInfo$a */
    public class C7647a implements Parcelable.Creator<CartInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (CartInfo) C19612n.m46981v(parcel, CartInfo.f23252f);
        }

        public final Object[] newArray(int i) {
            return new CartInfo[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.cart.CartInfo$b */
    public class C7648b extends C19619s<CartInfo> {
        public C7648b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new CartInfo(pVar.mo51947p(), PurchaseVerificationType.CODER.read(pVar), pVar.mo51959g(CartItem.f23257j), (CurrencyAmount) CurrencyAmount.f23843f.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CartInfo cartInfo = (CartInfo) obj;
            qVar.mo51954p(cartInfo.f23253b);
            PurchaseVerificationType.CODER.write(cartInfo.f23254c, qVar);
            qVar.mo51965h(cartInfo.f23255d, CartItem.f23257j);
            CurrencyAmount currencyAmount = cartInfo.f23256e;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
        }
    }

    public CartInfo(String str, PurchaseVerificationType purchaseVerificationType, ArrayList arrayList, CurrencyAmount currencyAmount) {
        C21100e.m49373x(str, "cartContextId");
        this.f23253b = str;
        C21100e.m49373x(purchaseVerificationType, "verificationType");
        this.f23254c = purchaseVerificationType;
        List<CartItem> unmodifiableList = Collections.unmodifiableList(arrayList);
        C21100e.m49373x(unmodifiableList, "cartItems");
        this.f23255d = unmodifiableList;
        C21100e.m49373x(currencyAmount, "fullPrice");
        this.f23256e = currencyAmount;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23252f);
    }
}
