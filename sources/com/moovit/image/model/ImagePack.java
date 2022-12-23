package com.moovit.image.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;

public class ImagePack implements Parcelable {
    public static final Parcelable.Creator<ImagePack> CREATOR = new C16049a();

    /* renamed from: d */
    public static final C16050b f41807d = new C16050b(ImagePack.class);

    /* renamed from: b */
    public final Image f41808b;

    /* renamed from: c */
    public final Image f41809c;

    /* renamed from: com.moovit.image.model.ImagePack$a */
    public class C16049a implements Parcelable.Creator<ImagePack> {
        public final Object createFromParcel(Parcel parcel) {
            return (ImagePack) C19612n.m46981v(parcel, ImagePack.f41807d);
        }

        public final Object[] newArray(int i) {
            return new ImagePack[i];
        }
    }

    /* renamed from: com.moovit.image.model.ImagePack$b */
    public class C16050b extends C19619s<ImagePack> {
        public C16050b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19617r rVar = C16019d.m40803a().f41718d;
            pVar.getClass();
            return new ImagePack((Image) rVar.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ImagePack imagePack = (ImagePack) obj;
            Image image = imagePack.f41808b;
            C19617r rVar = C16019d.m40803a().f41718d;
            qVar.getClass();
            rVar.write(image, qVar);
            C16019d.m40803a().f41718d.write(imagePack.f41809c, qVar);
        }
    }

    public ImagePack(Image image, Image image2) {
        C21100e.m49373x(image, "rtl");
        this.f41808b = image;
        C21100e.m49373x(image2, "ltr");
        this.f41809c = image2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41807d);
    }
}
