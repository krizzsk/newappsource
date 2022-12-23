package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class CameraDescriptor implements Parcelable {
    public static final Parcelable.Creator<CameraDescriptor> CREATOR = new C15691a();

    /* renamed from: e */
    public static final C15692b f40858e = new C15692b();

    /* renamed from: f */
    public static final C15693c f40859f = new C15693c(CameraDescriptor.class);

    /* renamed from: b */
    public final float f40860b;

    /* renamed from: c */
    public final float f40861c;

    /* renamed from: d */
    public final float f40862d;

    /* renamed from: com.moovit.carpool.CameraDescriptor$a */
    public class C15691a implements Parcelable.Creator<CameraDescriptor> {
        public final Object createFromParcel(Parcel parcel) {
            return (CameraDescriptor) C19612n.m46981v(parcel, CameraDescriptor.f40859f);
        }

        public final Object[] newArray(int i) {
            return new CameraDescriptor[i];
        }
    }

    /* renamed from: com.moovit.carpool.CameraDescriptor$b */
    public class C15692b extends C19621u<CameraDescriptor> {
        public C15692b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CameraDescriptor cameraDescriptor = (CameraDescriptor) obj;
            qVar.mo51938j(cameraDescriptor.f40860b);
            qVar.mo51938j(cameraDescriptor.f40861c);
            qVar.mo51938j(cameraDescriptor.f40862d);
        }
    }

    /* renamed from: com.moovit.carpool.CameraDescriptor$c */
    public class C15693c extends C19620t<CameraDescriptor> {
        public C15693c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new CameraDescriptor(pVar.mo51923j(), pVar.mo51923j(), pVar.mo51923j());
        }
    }

    public CameraDescriptor(float f, float f2, float f3) {
        this.f40860b = f;
        this.f40861c = f2;
        this.f40862d = f3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CameraDescriptor)) {
            return false;
        }
        CameraDescriptor cameraDescriptor = (CameraDescriptor) obj;
        if (cameraDescriptor.f40862d == this.f40862d && cameraDescriptor.f40860b == this.f40860b && cameraDescriptor.f40861c == this.f40861c) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40858e);
    }
}
