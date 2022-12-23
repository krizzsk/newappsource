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

public class DocklessBicycleMetadata implements Parcelable {
    public static final Parcelable.Creator<DocklessBicycleMetadata> CREATOR = new C16265a();

    /* renamed from: j */
    public static final C16266b f42491j = new C16266b(DocklessBicycleMetadata.class);

    /* renamed from: b */
    public final String f42492b;

    /* renamed from: c */
    public final Image f42493c;

    /* renamed from: d */
    public final String f42494d;

    /* renamed from: e */
    public final AppDeepLink f42495e;

    /* renamed from: f */
    public final boolean f42496f;

    /* renamed from: g */
    public final int f42497g;

    /* renamed from: h */
    public final int f42498h;

    /* renamed from: i */
    public final String f42499i;

    /* renamed from: com.moovit.map.collections.category.types.DocklessBicycleMetadata$a */
    public class C16265a implements Parcelable.Creator<DocklessBicycleMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return (DocklessBicycleMetadata) C19612n.m46981v(parcel, DocklessBicycleMetadata.f42491j);
        }

        public final Object[] newArray(int i) {
            return new DocklessBicycleMetadata[i];
        }
    }

    /* renamed from: com.moovit.map.collections.category.types.DocklessBicycleMetadata$b */
    public class C16266b extends C19619s<DocklessBicycleMetadata> {
        public C16266b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new DocklessBicycleMetadata(pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51947p(), (AppDeepLink) pVar.mo51962q(AppDeepLink.f40996d), pVar.mo51919b(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            DocklessBicycleMetadata docklessBicycleMetadata = (DocklessBicycleMetadata) obj;
            qVar.mo51954p(docklessBicycleMetadata.f42492b);
            C16019d.m40803a().f41718d.write(docklessBicycleMetadata.f42493c, qVar);
            qVar.mo51954p(docklessBicycleMetadata.f42494d);
            qVar.mo51967q(docklessBicycleMetadata.f42495e, AppDeepLink.f40996d);
            qVar.mo51934b(docklessBicycleMetadata.f42496f);
            qVar.mo51939l(docklessBicycleMetadata.f42497g);
            qVar.mo51939l(docklessBicycleMetadata.f42498h);
            qVar.mo51955t(docklessBicycleMetadata.f42499i);
        }
    }

    public DocklessBicycleMetadata(String str, Image image, String str2, AppDeepLink appDeepLink, boolean z, int i, int i2, String str3) {
        C21100e.m49373x(str, "providerName");
        this.f42492b = str;
        C21100e.m49373x(image, "providerImage");
        this.f42493c = image;
        this.f42494d = str2;
        this.f42495e = appDeepLink;
        this.f42496f = z;
        this.f42497g = i;
        this.f42498h = i2;
        this.f42499i = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42491j);
    }
}
