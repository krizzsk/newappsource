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

public class DocklessCarMetadata implements Parcelable {
    public static final Parcelable.Creator<DocklessCarMetadata> CREATOR = new C16267a();

    /* renamed from: k */
    public static final C16268b f42500k = new C16268b(DocklessCarMetadata.class);

    /* renamed from: b */
    public final String f42501b;

    /* renamed from: c */
    public final Image f42502c;

    /* renamed from: d */
    public final String f42503d;

    /* renamed from: e */
    public final AppDeepLink f42504e;

    /* renamed from: f */
    public final int f42505f;

    /* renamed from: g */
    public final int f42506g;

    /* renamed from: h */
    public final int f42507h;

    /* renamed from: i */
    public final int f42508i;

    /* renamed from: j */
    public final String f42509j;

    /* renamed from: com.moovit.map.collections.category.types.DocklessCarMetadata$a */
    public class C16267a implements Parcelable.Creator<DocklessCarMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return (DocklessCarMetadata) C19612n.m46981v(parcel, DocklessCarMetadata.f42500k);
        }

        public final Object[] newArray(int i) {
            return new DocklessCarMetadata[i];
        }
    }

    /* renamed from: com.moovit.map.collections.category.types.DocklessCarMetadata$b */
    public class C16268b extends C19619s<DocklessCarMetadata> {
        public C16268b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new DocklessCarMetadata(pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51947p(), (AppDeepLink) pVar.mo51962q(AppDeepLink.f40996d), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            DocklessCarMetadata docklessCarMetadata = (DocklessCarMetadata) obj;
            qVar.mo51954p(docklessCarMetadata.f42501b);
            C16019d.m40803a().f41718d.write(docklessCarMetadata.f42502c, qVar);
            qVar.mo51954p(docklessCarMetadata.f42503d);
            qVar.mo51967q(docklessCarMetadata.f42504e, AppDeepLink.f40996d);
            qVar.mo51939l(docklessCarMetadata.f42505f);
            qVar.mo51939l(docklessCarMetadata.f42506g);
            qVar.mo51939l(docklessCarMetadata.f42507h);
            qVar.mo51939l(docklessCarMetadata.f42508i);
            qVar.mo51955t(docklessCarMetadata.f42509j);
        }
    }

    public DocklessCarMetadata(String str, Image image, String str2, AppDeepLink appDeepLink, int i, int i2, int i3, int i4, String str3) {
        C21100e.m49373x(str, "providerName");
        this.f42501b = str;
        C21100e.m49373x(image, "providerImage");
        this.f42502c = image;
        C21100e.m49373x(str2, "name");
        this.f42503d = str2;
        this.f42504e = appDeepLink;
        this.f42505f = i;
        this.f42506g = i2;
        this.f42507h = i3;
        this.f42508i = i4;
        this.f42509j = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42500k);
    }
}
