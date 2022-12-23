package com.moovit.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class EmbeddedGalleryImage implements Parcelable {
    public static final Parcelable.Creator<EmbeddedGalleryImage> CREATOR = new C15876a();

    /* renamed from: d */
    public static final C15877b f41478d = new C15877b(EmbeddedGalleryImage.class);

    /* renamed from: b */
    public String f41479b;

    /* renamed from: c */
    public LatLonE6 f41480c;

    /* renamed from: com.moovit.gallery.EmbeddedGalleryImage$a */
    public class C15876a implements Parcelable.Creator<EmbeddedGalleryImage> {
        public final Object createFromParcel(Parcel parcel) {
            return (EmbeddedGalleryImage) C19612n.m46981v(parcel, EmbeddedGalleryImage.f41478d);
        }

        public final Object[] newArray(int i) {
            return new EmbeddedGalleryImage[i];
        }
    }

    /* renamed from: com.moovit.gallery.EmbeddedGalleryImage$b */
    public class C15877b extends C19619s<EmbeddedGalleryImage> {
        public C15877b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new EmbeddedGalleryImage(pVar.mo51948t(), (LatLonE6) pVar.mo51962q(LatLonE6.f40979g));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EmbeddedGalleryImage embeddedGalleryImage = (EmbeddedGalleryImage) obj;
            qVar.mo51955t(embeddedGalleryImage.f41479b);
            qVar.mo51967q(embeddedGalleryImage.f41480c, LatLonE6.f40978f);
        }
    }

    public EmbeddedGalleryImage(String str, LatLonE6 latLonE6) {
        C21100e.m49373x(str, "filePath");
        this.f41479b = str;
        this.f41480c = latLonE6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f41479b.equals(((EmbeddedGalleryImage) obj).f41479b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f41479b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41478d);
    }
}
