package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3682e;
import com.fyber.inneractive.sdk.util.C3721p0;

/* renamed from: com.fyber.inneractive.sdk.player.controller.s */
public interface C3020s {
    /* renamed from: a */
    C3677d0.C3678a mo13938a(C3721p0 p0Var, C3682e eVar);

    /* renamed from: a */
    C3677d0.C3678a mo13939a(String str, C3721p0 p0Var);

    /* renamed from: a */
    void mo13940a(View view, String str);

    /* renamed from: a */
    void mo13941a(String str, String str2);

    /* renamed from: a */
    void mo13942a(boolean z);

    /* renamed from: a */
    void mo13943a(boolean z, Orientation orientation);

    /* renamed from: e */
    void mo13944e();

    /* renamed from: g */
    void mo13945g();

    /* renamed from: h */
    void mo13946h();

    /* renamed from: j */
    void mo13947j();

    /* renamed from: k */
    void mo13948k();

    /* renamed from: l */
    void mo13949l();

    void onCompleted();

    void onPlayerError();

    void onProgress(int i, int i2);

    /* renamed from: r */
    void mo13953r();
}
