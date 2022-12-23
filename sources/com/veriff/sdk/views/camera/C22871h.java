package com.veriff.sdk.views.camera;

import android.content.Context;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C21843ja;
import com.veriff.sdk.internal.C22046na;
import com.veriff.sdk.internal.C22064nk;
import com.veriff.sdk.internal.C22464rx;
import com.veriff.sdk.internal.C22465ry;
import com.veriff.sdk.internal.C22661wm;
import p090g1.C4732a;

/* renamed from: com.veriff.sdk.views.camera.h */
public class C22871h implements g$a {

    /* renamed from: a */
    private final Context f58045a;

    /* renamed from: b */
    private final C22064nk f58046b;

    /* renamed from: c */
    private final C22834ai f58047c;

    /* renamed from: d */
    private final C21789ix f58048d;

    /* renamed from: e */
    private final C22661wm f58049e;

    /* renamed from: f */
    private final String f58050f;

    /* renamed from: g */
    private final String f58051g;

    public C22871h(Context context, C22064nk nkVar, C22834ai aiVar, C21789ix ixVar, C22661wm wmVar, String str, String str2) {
        this.f58045a = context;
        this.f58046b = nkVar;
        this.f58047c = aiVar;
        this.f58048d = ixVar;
        this.f58049e = wmVar;
        this.f58050f = str;
        this.f58051g = str2;
    }

    /* renamed from: a */
    public boolean mo54892a() {
        return this.f58045a.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    /* renamed from: b */
    public C22661wm mo57699b() {
        return this.f58049e;
    }

    /* renamed from: c */
    public boolean mo57700c() {
        if (!this.f58048d.mo55446a() || !C21843ja.m53317b(this.f58049e.mo57021e().mo60569a())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo57701d() {
        return this.f58048d.mo55447b();
    }

    /* renamed from: e */
    public boolean mo57702e() {
        return this.f58048d.mo55451e();
    }

    /* renamed from: f */
    public boolean mo57703f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo57704g() {
        if (C22465ry.m54758a(this.f58048d).equals(C22464rx.DISABLED) || !this.f58049e.mo57021e().mo60569a().equals(C21791iy.TAKE_PHOTO_OF_PASSPORT)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public String mo57705h() {
        return this.f58050f;
    }

    /* renamed from: i */
    public String mo57706i() {
        return this.f58051g;
    }

    /* renamed from: j */
    public double mo57707j() {
        return this.f58048d.mo55434K();
    }

    /* renamed from: k */
    public boolean mo56418k() {
        return C4732a.checkSelfPermission(this.f58045a, "android.permission.CAMERA") == 0;
    }

    /* renamed from: l */
    public boolean mo56419l() {
        return C4732a.checkSelfPermission(this.f58045a, "android.permission.RECORD_AUDIO") == 0;
    }

    /* renamed from: m */
    public C22833ah mo57723m() {
        return this.f58047c.mo57648a(this.f58049e, mo56419l());
    }

    /* renamed from: a */
    public void mo57697a(C22046na naVar) {
        this.f58046b.mo55948a(naVar);
    }

    /* renamed from: a */
    public boolean mo57698a(String... strArr) {
        for (String a : strArr) {
            if (mo57696a(a) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public C22046na mo57696a(String str) {
        return this.f58046b.mo55946a(str);
    }
}
