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

public class DocklessMopedMetadata implements Parcelable {
    public static final Parcelable.Creator<DocklessMopedMetadata> CREATOR = new C16269a();

    /* renamed from: j */
    public static final C16270b f42510j = new C16270b(DocklessMopedMetadata.class);

    /* renamed from: b */
    public final String f42511b;

    /* renamed from: c */
    public final Image f42512c;

    /* renamed from: d */
    public final String f42513d;

    /* renamed from: e */
    public final AppDeepLink f42514e;

    /* renamed from: f */
    public final boolean f42515f;

    /* renamed from: g */
    public final int f42516g;

    /* renamed from: h */
    public final int f42517h;

    /* renamed from: i */
    public final String f42518i;

    /* renamed from: com.moovit.map.collections.category.types.DocklessMopedMetadata$a */
    public class C16269a implements Parcelable.Creator<DocklessMopedMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return (DocklessMopedMetadata) C19612n.m46981v(parcel, DocklessMopedMetadata.f42510j);
        }

        public final Object[] newArray(int i) {
            return new DocklessMopedMetadata[i];
        }
    }

    /* renamed from: com.moovit.map.collections.category.types.DocklessMopedMetadata$b */
    public class C16270b extends C19619s<DocklessMopedMetadata> {
        public C16270b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new DocklessMopedMetadata(pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51947p(), (AppDeepLink) pVar.mo51962q(AppDeepLink.f40996d), pVar.mo51919b(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            DocklessMopedMetadata docklessMopedMetadata = (DocklessMopedMetadata) obj;
            qVar.mo51954p(docklessMopedMetadata.f42511b);
            C16019d.m40803a().f41718d.write(docklessMopedMetadata.f42512c, qVar);
            qVar.mo51954p(docklessMopedMetadata.f42513d);
            qVar.mo51967q(docklessMopedMetadata.f42514e, AppDeepLink.f40996d);
            qVar.mo51934b(docklessMopedMetadata.f42515f);
            qVar.mo51939l(docklessMopedMetadata.f42516g);
            qVar.mo51939l(docklessMopedMetadata.f42517h);
            qVar.mo51955t(docklessMopedMetadata.f42518i);
        }
    }

    public DocklessMopedMetadata(String str, Image image, String str2, AppDeepLink appDeepLink, boolean z, int i, int i2, String str3) {
        C21100e.m49373x(str, "providerName");
        this.f42511b = str;
        C21100e.m49373x(image, "providerImage");
        this.f42512c = image;
        C21100e.m49373x(str2, "name");
        this.f42513d = str2;
        this.f42514e = appDeepLink;
        this.f42515f = z;
        this.f42516g = i;
        this.f42517h = i2;
        this.f42518i = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42510j);
    }
}
