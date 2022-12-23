package com.moovit.ticketing.purchase.cart;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.InfoBoxData;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CartItem implements Parcelable {
    public static final Parcelable.Creator<CartItem> CREATOR = new C7649a();

    /* renamed from: j */
    public static final C7650b f23257j = new C7650b(CartItem.class);

    /* renamed from: b */
    public final String f23258b;

    /* renamed from: c */
    public final String f23259c;

    /* renamed from: d */
    public final int f23260d;

    /* renamed from: e */
    public final String f23261e;

    /* renamed from: f */
    public final CurrencyAmount f23262f;

    /* renamed from: g */
    public final CurrencyAmount f23263g;

    /* renamed from: h */
    public final boolean f23264h;

    /* renamed from: i */
    public final InfoBoxData f23265i;

    /* renamed from: com.moovit.ticketing.purchase.cart.CartItem$a */
    public class C7649a implements Parcelable.Creator<CartItem> {
        public final Object createFromParcel(Parcel parcel) {
            return (CartItem) C19612n.m46981v(parcel, CartItem.f23257j);
        }

        public final Object[] newArray(int i) {
            return new CartItem[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.cart.CartItem$b */
    public class C7650b extends C19619s<CartItem> {
        public C7650b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            int l = pVar.mo51924l();
            String t = pVar.mo51948t();
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            return new CartItem(p, p2, l, t, (CurrencyAmount) bVar.read(pVar), (CurrencyAmount) pVar.mo51962q(bVar), pVar.mo51919b(), (InfoBoxData) pVar.mo51962q(InfoBoxData.f23849f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CartItem cartItem = (CartItem) obj;
            qVar.mo51954p(cartItem.f23258b);
            qVar.mo51954p(cartItem.f23259c);
            qVar.mo51939l(cartItem.f23260d);
            qVar.mo51955t(cartItem.f23261e);
            CurrencyAmount currencyAmount = cartItem.f23262f;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            qVar.mo51967q(cartItem.f23263g, bVar);
            qVar.mo51934b(cartItem.f23264h);
            qVar.mo51967q(cartItem.f23265i, InfoBoxData.f23849f);
        }
    }

    public CartItem(String str, String str2, int i, String str3, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, boolean z, InfoBoxData infoBoxData) {
        C21100e.m49373x(str, "id");
        this.f23258b = str;
        C21100e.m49373x(str2, "name");
        this.f23259c = str2;
        this.f23260d = i;
        this.f23261e = str3;
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f23262f = currencyAmount;
        this.f23263g = currencyAmount2;
        this.f23264h = z;
        this.f23265i = infoBoxData;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23257j);
    }
}
