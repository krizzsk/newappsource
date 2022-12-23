package com.moovit.image.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.image.C16019d;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;
import p977zz.C20944i0;
import p977zz.C20975x0;

public class ImageSet implements Parcelable {
    public static final Parcelable.Creator<ImageSet> CREATOR = new C16053a();

    /* renamed from: b */
    public final SparseArray<Image> f41813b;

    /* renamed from: com.moovit.image.model.ImageSet$a */
    public class C16053a implements Parcelable.Creator<ImageSet> {
        public final Object createFromParcel(Parcel parcel) {
            return (ImageSet) C19612n.m46981v(parcel, C16019d.m40803a().f41719e);
        }

        public final Object[] newArray(int i) {
            return new ImageSet[i];
        }
    }

    /* renamed from: com.moovit.image.model.ImageSet$b */
    public static class C16054b extends C19619s<ImageSet> {

        /* renamed from: w */
        public final C19589j<? extends Image> f41814w;

        /* renamed from: x */
        public final C19600l<? super Image> f41815x;

        public C16054b(C19617r rVar, C19617r rVar2) {
            super(0, ImageSet.class);
            this.f41814w = rVar;
            this.f41815x = rVar2;
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new ImageSet(pVar.mo51963s(this.f41814w), true);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51968s(((ImageSet) obj).f41813b, this.f41815x);
        }
    }

    public ImageSet() {
        throw null;
    }

    public ImageSet(SparseArray<Image> sparseArray, boolean z) {
        C21100e.m49373x(sparseArray, "imageRefs");
        this.f41813b = z ? sparseArray.clone() : sparseArray;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSet)) {
            return false;
        }
        ImageSet imageSet = (ImageSet) obj;
        if (this.f41813b.size() != imageSet.f41813b.size()) {
            return false;
        }
        for (int i = 0; i < this.f41813b.size(); i++) {
            if (this.f41813b.keyAt(i) != imageSet.f41813b.keyAt(i) || !C20975x0.m49118e(this.f41813b.valueAt(i), imageSet.f41813b.valueAt(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = this.f41813b.size();
        int i = 17;
        for (int i2 = 0; i2 < size; i2++) {
            i = C17884p.m44360c((i * 37) + this.f41813b.keyAt(i2), this.f41813b.valueAt(i2));
        }
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, C16019d.m40803a().f41719e);
    }

    @SafeVarargs
    public ImageSet(C20944i0<Integer, Image>... i0VarArr) {
        this.f41813b = C13717b.m34268o(i0VarArr);
    }

    public ImageSet(Image image) {
        SparseArray<Image> sparseArray = new SparseArray<>(1);
        this.f41813b = sparseArray;
        sparseArray.put(0, image);
    }
}
