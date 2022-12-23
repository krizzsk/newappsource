package p502fx;

import ce0.C21100e;
import mf0.C24362h;
import p001a0.C0016g;

/* renamed from: fx.d */
public final class C17119d {

    /* renamed from: a */
    public final /* synthetic */ int f44305a;

    /* renamed from: b */
    public final String f44306b;

    public C17119d(String str, int i) {
        this.f44305a = i;
        if (i != 1) {
            C21100e.m49373x(str, "qrCode");
            this.f44306b = str;
            return;
        }
        C24362h.m61211f(str, "name");
        this.f44306b = str;
    }

    public final String toString() {
        switch (this.f44305a) {
            case 0:
                return C0016g.m31o(C13555b.m33972k("TodPassengerActionQrCodeAdditionalInfo{qrCode="), this.f44306b, "}");
            default:
                return this.f44306b;
        }
    }
}
