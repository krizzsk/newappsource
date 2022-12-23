package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DetectedActivity;
import com.moovit.commons.geo.LatLonE6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MockLocation implements Parcelable {
    public static final Parcelable.Creator<MockLocation> CREATOR = new C4207a();

    /* renamed from: f */
    public static final C4208b f15037f = new C4208b();

    /* renamed from: g */
    public static final C4209c f15038g = new C4209c();

    /* renamed from: h */
    public static final C4210d f15039h = new C4210d(DetectedActivity.class);

    /* renamed from: b */
    public final LatLonE6 f15040b;

    /* renamed from: c */
    public final float f15041c;

    /* renamed from: d */
    public final String f15042d;

    /* renamed from: e */
    public final List<DetectedActivity> f15043e;

    /* renamed from: com.moovit.navigation.MockLocation$a */
    public class C4207a implements Parcelable.Creator<MockLocation> {
        public final Object createFromParcel(Parcel parcel) {
            return (MockLocation) C19612n.m46981v(parcel, MockLocation.f15038g);
        }

        public final Object[] newArray(int i) {
            return new MockLocation[i];
        }
    }

    /* renamed from: com.moovit.navigation.MockLocation$b */
    public class C4208b implements C19600l<MockLocation> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            MockLocation mockLocation = (MockLocation) obj;
            qVar.mo51967q(mockLocation.f15040b, LatLonE6.f40978f);
            qVar.mo51938j(mockLocation.f15041c);
            qVar.mo51955t(mockLocation.f15042d);
            qVar.mo51964g(mockLocation.f15043e, MockLocation.f15039h);
        }
    }

    /* renamed from: com.moovit.navigation.MockLocation$c */
    public class C4209c implements C19589j<MockLocation> {
        public final Object read(C19615p pVar) throws IOException {
            return new MockLocation((LatLonE6) pVar.mo51962q(LatLonE6.f40979g), pVar.mo51923j(), pVar.mo51948t(), pVar.mo51958f(MockLocation.f15039h));
        }
    }

    /* renamed from: com.moovit.navigation.MockLocation$d */
    public class C4210d extends C19619s<DetectedActivity> {
        public C4210d(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new DetectedActivity(pVar.mo51924l(), pVar.mo51924l());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            qVar.mo51939l(detectedActivity.getType());
            qVar.mo51939l(detectedActivity.getConfidence());
        }
    }

    public MockLocation(LatLonE6 latLonE6, float f, String str, ArrayList arrayList) {
        if (latLonE6 != null) {
            this.f15040b = latLonE6;
            this.f15041c = f;
            this.f15042d = str;
            this.f15043e = arrayList;
            return;
        }
        throw new IllegalArgumentException("location may not be null");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15037f);
    }
}
