package p781ru;

import ce0.C21100e;
import com.moovit.app.mot.purchase.model.MotQrCodeStationFare;
import p664mu.C18437c;

/* renamed from: ru.c */
public final class C19330c {

    /* renamed from: a */
    public final C18437c.C18440b f49185a;

    /* renamed from: b */
    public final MotQrCodeStationFare f49186b;

    /* renamed from: c */
    public final C19329b f49187c;

    public C19330c(C18437c.C18440b bVar, MotQrCodeStationFare motQrCodeStationFare) {
        this.f49185a = bVar;
        this.f49186b = motQrCodeStationFare;
        this.f49187c = null;
    }

    public C19330c(C18437c.C18440b bVar, C19329b bVar2) {
        this.f49185a = bVar;
        this.f49186b = null;
        C21100e.m49373x(bVar2, "singleActivationFare");
        this.f49187c = bVar2;
    }
}
