package com.moovit.image.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20952m0;

public class ResourceImageRef implements ImageRef {
    public static final Parcelable.Creator<ResourceImageRef> CREATOR = new C16059a();

    /* renamed from: b */
    public final int f41821b;

    /* renamed from: com.moovit.image.model.ResourceImageRef$a */
    public class C16059a implements Parcelable.Creator<ResourceImageRef> {
        public final Object createFromParcel(Parcel parcel) {
            return new ResourceImageRef(parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new ResourceImageRef[i];
        }
    }

    /* renamed from: com.moovit.image.model.ResourceImageRef$b */
    public static class C16060b extends C19619s<ResourceImageRef> {

        /* renamed from: w */
        public final C20952m0<String> f41822w;

        public C16060b(C20952m0<String> m0Var) {
            super(0, ResourceImageRef.class);
            this.f41822w = m0Var;
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new ResourceImageRef(this.f41822w.mo53030d(pVar.mo51947p()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(this.f41822w.mo53029c(((ResourceImageRef) obj).f41821b));
        }
    }

    public ResourceImageRef(int i) {
        this.f41821b = i;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: p */
    public final Image mo48235p(String[] strArr) {
        return new ResourceImage(this.f41821b, strArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f41821b);
    }
}
