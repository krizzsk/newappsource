package com.moovit.map.collections.category.types;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class DocklessScooterMetadata implements Parcelable {
    public static final Parcelable.Creator<DocklessScooterMetadata> CREATOR = new C16271a();

    /* renamed from: j */
    public static final C16272b f42519j = new C16272b(DocklessScooterMetadata.class);

    /* renamed from: b */
    public final String f42520b;

    /* renamed from: c */
    public final Image f42521c;

    /* renamed from: d */
    public final String f42522d;

    /* renamed from: e */
    public final AppDeepLink f42523e;

    /* renamed from: f */
    public final boolean f42524f;

    /* renamed from: g */
    public final int f42525g;

    /* renamed from: h */
    public final int f42526h;

    /* renamed from: i */
    public final String f42527i;

    /* renamed from: com.moovit.map.collections.category.types.DocklessScooterMetadata$a */
    public class C16271a implements Parcelable.Creator<DocklessScooterMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return (DocklessScooterMetadata) C19612n.m46981v(parcel, DocklessScooterMetadata.f42519j);
        }

        public final Object[] newArray(int i) {
            return new DocklessScooterMetadata[i];
        }
    }

    /* renamed from: com.moovit.map.collections.category.types.DocklessScooterMetadata$b */
    public class C16272b extends C19619s<DocklessScooterMetadata> {
        public C16272b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new DocklessScooterMetadata(pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51947p(), (AppDeepLink) pVar.mo51962q(AppDeepLink.f40996d), pVar.mo51919b(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            DocklessScooterMetadata docklessScooterMetadata = (DocklessScooterMetadata) obj;
            qVar.mo51954p(docklessScooterMetadata.f42520b);
            C16019d.m40803a().f41718d.write(docklessScooterMetadata.f42521c, qVar);
            qVar.mo51954p(docklessScooterMetadata.f42522d);
            qVar.mo51967q(docklessScooterMetadata.f42523e, AppDeepLink.f40996d);
            qVar.mo51934b(docklessScooterMetadata.f42524f);
            qVar.mo51939l(docklessScooterMetadata.f42525g);
            qVar.mo51939l(docklessScooterMetadata.f42526h);
            qVar.mo51955t(docklessScooterMetadata.f42527i);
        }
    }

    public DocklessScooterMetadata(String str, Image image, String str2, AppDeepLink appDeepLink, boolean z, int i, int i2, String str3) {
        C21100e.m49373x(str, "providerName");
        this.f42520b = str;
        C21100e.m49373x(image, "providerImage");
        this.f42521c = image;
        C21100e.m49373x(str2, "name");
        this.f42522d = str2;
        this.f42523e = appDeepLink;
        this.f42524f = z;
        this.f42525g = i;
        this.f42526h = i2;
        this.f42527i = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42519j);
    }
}
