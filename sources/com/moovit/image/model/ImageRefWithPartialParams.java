package com.moovit.image.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19584i;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ImageRefWithPartialParams implements ImageRef {
    public static final Parcelable.Creator<ImageRefWithPartialParams> CREATOR = new C16051a();

    /* renamed from: b */
    public final ImageRef f41810b;

    /* renamed from: c */
    public final String[] f41811c;

    /* renamed from: com.moovit.image.model.ImageRefWithPartialParams$a */
    public class C16051a implements Parcelable.Creator<ImageRefWithPartialParams> {
        public final Object createFromParcel(Parcel parcel) {
            String[] strArr = new String[parcel.readInt()];
            parcel.readStringArray(strArr);
            return new ImageRefWithPartialParams((ImageRef) parcel.readParcelable(ImageRef.class.getClassLoader()), strArr);
        }

        public final Object[] newArray(int i) {
            return new ImageRefWithPartialParams[i];
        }
    }

    /* renamed from: com.moovit.image.model.ImageRefWithPartialParams$b */
    public static class C16052b extends C19619s<ImageRefWithPartialParams> {

        /* renamed from: w */
        public C19584i<ImageRef> f41812w;

        public C16052b() {
            super(0, ImageRefWithPartialParams.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19584i<ImageRef> iVar = this.f41812w;
            pVar.getClass();
            return new ImageRefWithPartialParams(iVar.read(pVar), pVar.mo51949u());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ImageRefWithPartialParams imageRefWithPartialParams = (ImageRefWithPartialParams) obj;
            ImageRef imageRef = imageRefWithPartialParams.f41810b;
            C19584i<ImageRef> iVar = this.f41812w;
            qVar.getClass();
            iVar.write(imageRef, qVar);
            qVar.mo51956u(imageRefWithPartialParams.f41811c);
        }
    }

    public ImageRefWithPartialParams(ImageRef imageRef, String[] strArr) {
        C21100e.m49373x(imageRef, "imageRef");
        this.f41810b = imageRef;
        C21100e.m49373x(strArr, "partialParams");
        this.f41811c = strArr;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: p */
    public final Image mo48235p(String... strArr) {
        String[] strArr2 = this.f41811c;
        String[] strArr3 = new String[(strArr2.length + strArr.length)];
        System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
        System.arraycopy(strArr, 0, strArr3, this.f41811c.length, strArr.length);
        return this.f41810b.mo48235p(strArr3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f41810b, 0);
        parcel.writeInt(this.f41811c.length);
        parcel.writeStringArray(this.f41811c);
    }
}
