package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import hd0.C23450j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import lf0.C24236l;
import mobi.lab.veriff.data.C24420a;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.util.C24465j;

/* renamed from: com.veriff.sdk.internal.wm */
public class C22661wm implements Parcelable {
    public static final Parcelable.Creator<C22661wm> CREATOR = new Parcelable.Creator<C22661wm>() {
        /* renamed from: a */
        public C22661wm createFromParcel(Parcel parcel) {
            return new C22661wm(parcel);
        }

        /* renamed from: a */
        public C22661wm[] newArray(int i) {
            return new C22661wm[i];
        }
    };

    /* renamed from: a */
    private final C24465j f57315a = C24465j.m61537a((Object) this);

    /* renamed from: b */
    private final String f57316b;

    /* renamed from: c */
    private final String f57317c;

    /* renamed from: d */
    private final String f57318d;

    /* renamed from: e */
    private final C24420a f57319e;

    /* renamed from: f */
    private final AtomicInteger f57320f;

    /* renamed from: g */
    private final AtomicInteger f57321g;

    /* renamed from: h */
    private final C22083no f57322h;

    /* renamed from: i */
    private List<C21791iy> f57323i = new ArrayList();

    public C22661wm(String str, String str2, String str3, C24420a aVar, List<C21791iy> list) {
        this.f57316b = str;
        this.f57317c = str2;
        this.f57318d = str3;
        this.f57319e = aVar;
        this.f57320f = new AtomicInteger(0);
        this.f57321g = new AtomicInteger(0);
        this.f57322h = new C22083no();
        this.f57323i = list;
    }

    /* renamed from: a */
    public String mo57012a() {
        String str = this.f57317c;
        if (str != null) {
            return str;
        }
        throw new C22527sn("idvVerificationId cannot be null when its required check the call site if you should be calling getPoaVerificationId() instead");
    }

    /* renamed from: b */
    public String mo57016b() {
        String str = this.f57318d;
        if (str != null) {
            return str;
        }
        throw new C22527sn("poaVerificationId cannot be null when its required check the call site if you should be calling getIdvVerificationId() instead");
    }

    /* renamed from: c */
    public void mo57018c() {
        this.f57319e.mo60558c();
    }

    /* renamed from: d */
    public boolean mo57019d() {
        return this.f57319e.mo60555a();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C24422b mo57021e() {
        return this.f57319e.mo60559d();
    }

    /* renamed from: f */
    public String mo57022f() {
        return this.f57319e.mo60559d().mo60569a().mo55481a();
    }

    /* renamed from: g */
    public String mo57023g() {
        return this.f57316b + "_" + this.f57320f.incrementAndGet() + "_" + mo57022f();
    }

    /* renamed from: h */
    public String mo57024h() {
        return this.f57319e.mo60559d().mo60569a().mo55483b();
    }

    /* renamed from: i */
    public String mo57025i() {
        return this.f57316b + "_" + this.f57320f.incrementAndGet() + "_" + mo57024h();
    }

    /* renamed from: j */
    public String mo57026j() {
        return this.f57316b + "_" + this.f57320f.incrementAndGet() + "_selfid_video";
    }

    /* renamed from: k */
    public String mo57027k() {
        return this.f57316b + "_" + this.f57320f.incrementAndGet() + "_address";
    }

    /* renamed from: l */
    public List<C21791iy> mo57028l() {
        return this.f57323i;
    }

    /* renamed from: m */
    public C22083no mo57029m() {
        return this.f57322h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57316b);
        parcel.writeString(this.f57317c);
        parcel.writeString(this.f57318d);
        parcel.writeParcelable(this.f57319e, i);
        parcel.writeInt(this.f57320f.get());
        parcel.writeInt(this.f57321g.get());
        parcel.writeParcelable(this.f57322h, i);
        parcel.writeList(this.f57323i);
    }

    /* renamed from: a */
    public void mo57014a(String str) {
        C21791iy a = C21791iy.m53250a(str);
        if (!m55237b(a)) {
            this.f57319e.mo60554a(new C24422b(a));
        } else {
            this.f57315a.mo60709i("Flow already contains portrait-with-doc step, do nothing...");
        }
    }

    /* renamed from: b */
    public void mo57017b(String str) {
        this.f57319e.mo60553a((C24236l<? super C24422b, Boolean>) new C23450j(str));
    }

    /* renamed from: b */
    private boolean m55237b(C21791iy iyVar) {
        for (C24422b a : this.f57319e.mo60556b()) {
            if (a.mo60569a() == iyVar) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m55235a(String str, C24422b bVar) {
        return Boolean.valueOf(bVar.mo60569a() == C21791iy.m53251b(str) || bVar.mo60569a() == C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK_AFTER_BARCODE);
    }

    /* renamed from: a */
    public void mo57015a(List<C21791iy> list) {
        this.f57323i = list;
    }

    /* renamed from: a */
    public void mo57013a(C21791iy iyVar) {
        this.f57319e.mo60557b(new C24422b(iyVar));
    }

    public C22661wm(Parcel parcel) {
        this.f57316b = parcel.readString();
        this.f57317c = parcel.readString();
        this.f57318d = parcel.readString();
        this.f57319e = (C24420a) parcel.readParcelable(getClass().getClassLoader());
        this.f57320f = new AtomicInteger(parcel.readInt());
        this.f57321g = new AtomicInteger(parcel.readInt());
        this.f57322h = (C22083no) parcel.readParcelable(getClass().getClassLoader());
        parcel.readList(this.f57323i, C21791iy.class.getClassLoader());
    }
}
