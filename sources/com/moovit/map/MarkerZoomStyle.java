package com.moovit.map;

import a20.C13387a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import ce0.C21100e;
import com.appboy.support.ValidationUtils;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageSet;
import com.moovit.map.C16273d;
import java.io.IOException;
import p001a0.C0016g;
import p025b6.C1495h;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20936e0;
import v10.C20065a;

public class MarkerZoomStyle extends C16273d implements C13387a, Parcelable {
    public static final Parcelable.Creator<MarkerZoomStyle> CREATOR = new C16242a();

    /* renamed from: h */
    public static final C16243b f42446h = new C16243b();

    /* renamed from: i */
    public static final C16244c f42447i = new C16244c(MarkerZoomStyle.class);

    /* renamed from: b */
    public final Image f42448b;

    /* renamed from: c */
    public final C1495h<C20065a> f42449c;

    /* renamed from: d */
    public C20065a f42450d;

    /* renamed from: e */
    public final int f42451e;

    /* renamed from: f */
    public final float f42452f;

    /* renamed from: g */
    public final int f42453g;

    /* renamed from: com.moovit.map.MarkerZoomStyle$a */
    public class C16242a implements Parcelable.Creator<MarkerZoomStyle> {
        public final Object createFromParcel(Parcel parcel) {
            return (MarkerZoomStyle) C19612n.m46981v(parcel, MarkerZoomStyle.f42447i);
        }

        public final Object[] newArray(int i) {
            return new MarkerZoomStyle[i];
        }
    }

    /* renamed from: com.moovit.map.MarkerZoomStyle$b */
    public class C16243b extends C19621u<MarkerZoomStyle> {
        public C16243b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            MarkerZoomStyle markerZoomStyle = (MarkerZoomStyle) obj;
            Image image = markerZoomStyle.f42448b;
            C19617r rVar = C16019d.m40803a().f41718d;
            qVar.getClass();
            rVar.write(image, qVar);
            qVar.mo51939l(markerZoomStyle.f42451e);
            qVar.mo51938j(markerZoomStyle.f42452f);
            qVar.mo51939l(markerZoomStyle.f42453g);
        }
    }

    /* renamed from: com.moovit.map.MarkerZoomStyle$c */
    public class C16244c extends C19620t<MarkerZoomStyle> {
        public C16244c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            float f;
            C19617r rVar = C16019d.m40803a().f41718d;
            pVar.getClass();
            Image image = (Image) rVar.read(pVar);
            int l = pVar.mo51924l();
            int i2 = 1;
            if (i >= 1) {
                f = pVar.mo51923j();
            } else {
                f = 1.5f;
            }
            if (i >= 2) {
                i2 = pVar.mo51924l();
            }
            return new MarkerZoomStyle(image, l, f, i2);
        }
    }

    public MarkerZoomStyle() {
        throw null;
    }

    public MarkerZoomStyle(Image image) {
        this(ValidationUtils.APPBOY_STRING_MAX_LENGTH, image);
    }

    /* renamed from: c */
    public static SparseArray<MarkerZoomStyle> m41440c(ImageSet imageSet) {
        return m41441d(imageSet, (C1495h) null, ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: d */
    public static SparseArray m41441d(ImageSet imageSet, C1495h hVar, int i) {
        MarkerZoomStyle markerZoomStyle;
        int size = imageSet.f41813b.size();
        SparseArray sparseArray = new SparseArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = imageSet.f41813b.keyAt(i2);
            if (imageSet.f41813b.valueAt(i2) == null) {
                markerZoomStyle = null;
            } else {
                markerZoomStyle = new MarkerZoomStyle(imageSet.f41813b.valueAt(i2), hVar, i, 1.5f, 1);
            }
            sparseArray.append(keyAt, markerZoomStyle);
        }
        return sparseArray;
    }

    /* renamed from: b */
    public final Object mo48602b(C16273d.C16274a aVar, Boolean bool) {
        return aVar.mo48761d(this, bool);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MarkerZoomStyle)) {
            return false;
        }
        MarkerZoomStyle markerZoomStyle = (MarkerZoomStyle) obj;
        if (this.f42448b.equals(markerZoomStyle.f42448b) && this.f42451e == markerZoomStyle.f42451e && this.f42452f == markerZoomStyle.f42452f && this.f42453g == markerZoomStyle.f42453g) {
            return true;
        }
        return false;
    }

    public final Image getImage() {
        return this.f42448b;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42448b), this.f42451e, Float.floatToIntBits(this.f42452f), this.f42453g);
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("[");
        k.append(this.f42448b);
        k.append(", a=");
        k.append(this.f42451e);
        k.append(", tsc=");
        k.append(this.f42452f);
        k.append(", o=");
        if (this.f42453g == 1) {
            str = "CAMERA";
        } else {
            str = "GROUND";
        }
        return C0016g.m31o(k, str, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42446h);
    }

    public MarkerZoomStyle(int i, Image image) {
        this(image, i, 1.5f, 1);
    }

    public MarkerZoomStyle(Image image, int i, float f, int i2) {
        this(image, (C1495h<C20065a>) null, i, f, i2);
    }

    public MarkerZoomStyle(Image image, C1495h<C20065a> hVar, int i, float f, int i2) {
        C21100e.m49373x(image, "icon");
        this.f42448b = image;
        this.f42449c = hVar;
        this.f42451e = C20936e0.m49036b(0, ValidationUtils.APPBOY_STRING_MAX_LENGTH, i);
        C21100e.m49357p(f, "tappableSizeCoef");
        this.f42452f = f;
        this.f42453g = i2;
    }
}
