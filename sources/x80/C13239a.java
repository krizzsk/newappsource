package x80;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1043v;
import com.moovit.ticketing.purchase.cart.CartInfo;
import w50.C20283g;

/* renamed from: x80.a */
public final class C13239a extends C0989a {

    /* renamed from: c */
    public final C1043v<CartInfo> f32862c;

    /* renamed from: d */
    public volatile C20283g f32863d;

    public C13239a(Application application, C1001d0 d0Var) {
        super(application);
        this.f32862c = d0Var.mo4293c("cartInfo");
    }

    public final void onCleared() {
        super.onCleared();
        this.f32863d = null;
    }
}
