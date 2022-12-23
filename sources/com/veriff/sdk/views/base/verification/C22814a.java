package com.veriff.sdk.views.base.verification;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.veriff.sdk.internal.C21541cu;
import com.veriff.sdk.internal.C21566di;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C21900jz;
import com.veriff.sdk.internal.C21911kg;
import com.veriff.sdk.internal.C22233ot;
import com.veriff.sdk.internal.permission.C22252a;
import mobi.lab.veriff.data.C24426d;

/* renamed from: com.veriff.sdk.views.base.verification.a */
public abstract class C22814a extends C22233ot {

    /* renamed from: f */
    public C21895jw f57888f;

    /* renamed from: g */
    public C21789ix f57889g;

    /* renamed from: h */
    public C22816c f57890h;

    /* renamed from: i */
    public C22252a f57891i;

    /* renamed from: j */
    public C21541cu.C21542a f57892j;

    /* renamed from: k */
    public C21900jz f57893k;

    /* renamed from: a */
    public static Intent m56078a(Intent intent, C24426d dVar, C21895jw jwVar) {
        return C22233ot.m54111a(intent, dVar).putExtra("com.veriff.sdk.EXTRA_START_SESSION_DATA", jwVar);
    }

    /* renamed from: a */
    public abstract void mo57572a(boolean z, Bundle bundle);

    public Object getSystemService(String str) {
        if ("VeriffBranding".equals(str)) {
            return mo56158h_().mo60604g();
        }
        if ("VeriffFeatureFlags".equals(str)) {
            return mo57577m();
        }
        return super.getSystemService(str);
    }

    /* renamed from: m */
    public final C21789ix mo57577m() {
        return this.f57889g;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (C21566di.f54308a.mo54584a(this, bundle)) {
            this.f57890h = new C22816c(this, this.f56064b, this.f57888f, this.f56065c.mo54912f());
            this.f57891i = new C22252a(this);
            C21911kg.f55391a.mo55695a(this.f56065c.mo54910d());
            setRequestedOrientation(7);
            if (bundle != null) {
                z = true;
            } else {
                z = false;
            }
            mo57572a(z, bundle);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f57891i.mo56203a(i, strArr, iArr);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C21566di.f54308a.mo54582a(bundle, this.f57893k);
    }

    public void setContentView(View view) {
        view.setLayoutDirection(this.f56065c.mo54912f().mo60698d());
        super.setContentView(view);
        view.requestApplyInsets();
    }
}
