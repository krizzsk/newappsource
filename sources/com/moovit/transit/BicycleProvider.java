package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.Color;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20937f;
import p977zz.C20939g;

public class BicycleProvider implements Parcelable, C5384a {
    public static final Parcelable.Creator<BicycleProvider> CREATOR = new C7786a();

    /* renamed from: h */
    public static C7787b f23628h = new C7787b(BicycleProvider.class);

    /* renamed from: b */
    public final ServerId f23629b;

    /* renamed from: c */
    public final String f23630c;

    /* renamed from: d */
    public final Color f23631d;

    /* renamed from: e */
    public final Color f23632e;

    /* renamed from: f */
    public final boolean f23633f;

    /* renamed from: g */
    public final Image f23634g;

    /* renamed from: com.moovit.transit.BicycleProvider$a */
    public class C7786a implements Parcelable.Creator<BicycleProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return (BicycleProvider) C19612n.m46981v(parcel, BicycleProvider.f23628h);
        }

        public final Object[] newArray(int i) {
            return new BicycleProvider[i];
        }
    }

    /* renamed from: com.moovit.transit.BicycleProvider$b */
    public class C7787b extends C19619s<BicycleProvider> {
        public C7787b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            String p = pVar.mo51947p();
            C20939g gVar = Color.f41006j;
            return new BicycleProvider(serverId, p, (Color) gVar.read(pVar), (Color) gVar.read(pVar), pVar.mo51919b(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            BicycleProvider bicycleProvider = (BicycleProvider) obj;
            ServerId serverId = bicycleProvider.f23629b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(bicycleProvider.f23630c);
            Color color = bicycleProvider.f23631d;
            C20937f fVar = Color.f41005i;
            fVar.write(color, qVar);
            fVar.write(bicycleProvider.f23632e, qVar);
            qVar.mo51934b(bicycleProvider.f23633f);
            qVar.mo51967q(bicycleProvider.f23634g, C16019d.m40803a().f41718d);
        }
    }

    public BicycleProvider(ServerId serverId, String str, Color color, Color color2, boolean z, Image image) {
        C21100e.m49373x(serverId, "id");
        this.f23629b = serverId;
        C21100e.m49373x(str, "name");
        this.f23630c = str;
        this.f23631d = color;
        this.f23632e = color2;
        this.f23633f = z;
        this.f23634g = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f23629b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23628h);
    }
}
