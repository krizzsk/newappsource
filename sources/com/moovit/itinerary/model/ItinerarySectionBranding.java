package com.moovit.itinerary.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.commons.utils.Color;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImagePack;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20937f;
import p977zz.C20939g;

public class ItinerarySectionBranding implements Parcelable {
    public static final Parcelable.Creator<ItinerarySectionBranding> CREATOR = new C16094a();

    /* renamed from: f */
    public static final C16095b f41921f = new C16095b(ItinerarySectionBranding.class);

    /* renamed from: b */
    public final Color f41922b;

    /* renamed from: c */
    public final Color f41923c;

    /* renamed from: d */
    public final ImagePack f41924d;

    /* renamed from: e */
    public final Image f41925e;

    /* renamed from: com.moovit.itinerary.model.ItinerarySectionBranding$a */
    public class C16094a implements Parcelable.Creator<ItinerarySectionBranding> {
        public final Object createFromParcel(Parcel parcel) {
            return (ItinerarySectionBranding) C19612n.m46981v(parcel, ItinerarySectionBranding.f41921f);
        }

        public final Object[] newArray(int i) {
            return new ItinerarySectionBranding[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.ItinerarySectionBranding$b */
    public class C16095b extends C19619s<ItinerarySectionBranding> {
        public C16095b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C20939g gVar = Color.f41006j;
            pVar.getClass();
            return new ItinerarySectionBranding((Color) gVar.read(pVar), (Color) gVar.read(pVar), (ImagePack) pVar.mo51962q(ImagePack.f41807d), (Image) pVar.mo51962q(C16019d.m40803a().f41718d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ItinerarySectionBranding itinerarySectionBranding = (ItinerarySectionBranding) obj;
            Color color = itinerarySectionBranding.f41922b;
            C20937f fVar = Color.f41005i;
            qVar.getClass();
            fVar.write(color, qVar);
            fVar.write(itinerarySectionBranding.f41923c, qVar);
            qVar.mo51967q(itinerarySectionBranding.f41924d, ImagePack.f41807d);
            qVar.mo51967q(itinerarySectionBranding.f41925e, C16019d.m40803a().f41718d);
        }
    }

    public ItinerarySectionBranding(Color color, Color color2, ImagePack imagePack, Image image) {
        this.f41922b = color;
        this.f41923c = color2;
        this.f41924d = imagePack;
        this.f41925e = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41921f);
    }
}
