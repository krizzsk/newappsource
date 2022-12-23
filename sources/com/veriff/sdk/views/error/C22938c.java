package com.veriff.sdk.views.error;

import com.appsflyer.share.Constants;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21789ix;
import mobi.lab.veriff.util.C24465j;

/* renamed from: com.veriff.sdk.views.error.c */
public class C22938c implements a$b {

    /* renamed from: b */
    private static C24465j f58235b = C24465j.m61538a(Constants.URL_CAMPAIGN);

    /* renamed from: c */
    private final a$c f58236c;

    /* renamed from: d */
    private final a$a f58237d;

    /* renamed from: e */
    private final int f58238e;

    /* renamed from: f */
    private final C21645fu f58239f;

    /* renamed from: g */
    private final C21789ix f58240g;

    public C22938c(a$c a_c, a$a a_a, int i, C21645fu fuVar, C21789ix ixVar) {
        this.f58236c = a_c;
        this.f58237d = a_a;
        this.f58238e = i;
        this.f58239f = fuVar;
        this.f58240g = ixVar;
        a_c.mo57038a(this);
    }

    /* renamed from: a */
    public void mo57838a(int i) {
        C24465j jVar = f58235b;
        jVar.mo60705d("Exiting Veriff with statuscode: " + i);
        this.f58239f.mo54921a(C21716gg.m52944e(this.f58238e));
        this.f58236c.mo57815a(i);
    }

    /* renamed from: b */
    public void mo57839b() {
        C24465j jVar = f58235b;
        StringBuilder k = C13555b.m33972k("onViewCreated ");
        k.append(this.f58238e);
        jVar.mo60705d(k.toString());
        int i = this.f58238e;
        if (i != 6) {
            switch (i) {
                case 21:
                    f58235b.mo60705d("Showing session error");
                    this.f58236c.mo57819b();
                    break;
                case 22:
                    f58235b.mo60705d("Showing system error");
                    this.f58236c.mo57820c();
                    break;
                case 23:
                    f58235b.mo60705d("Showing uploading error");
                    this.f58236c.mo57821d();
                    break;
                case 24:
                    f58235b.mo60705d("Showing network error");
                    this.f58236c.mo57822e();
                    break;
                default:
                    switch (i) {
                        case 26:
                            f58235b.mo60705d("Showing camera error");
                            this.f58236c.mo57823f();
                            break;
                        case 27:
                            f58235b.mo60705d("Showing microphone error");
                            this.f58236c.mo57824g();
                            break;
                        case 28:
                            f58235b.mo60705d("Showing video required error");
                            this.f58236c.mo57825h();
                            this.f58239f.mo54921a(C21716gg.m52962r());
                            break;
                        case 29:
                            f58235b.mo60705d("Showing version unsupported error");
                            this.f58236c.mo57827o();
                            this.f58239f.mo54921a(C21716gg.m52963s());
                            break;
                        case 30:
                            this.f58236c.mo57828p();
                            break;
                        case 31:
                            this.f58236c.mo57829q();
                            this.f58239f.mo54921a(C21716gg.m52910ac());
                            break;
                        case 32:
                            f58235b.mo60705d("Showing mic unavailable error");
                            this.f58236c.mo57826n();
                            break;
                    }
            }
        } else {
            this.f58236c.mo57815a(199);
        }
        this.f58239f.mo54921a(C21716gg.m52914b(this.f58238e, this.f58240g));
    }

    /* renamed from: c */
    public void mo57841c() {
        this.f58239f.mo54921a(C21716gg.m52937d(this.f58238e));
        this.f58236c.mo57814a();
    }

    /* renamed from: d */
    public void mo57842d() {
        f58235b.mo60705d("onExitPrompted(), showing confirmationDialog");
        this.f58236c.mo57816a(C21719gi.BACK_BUTTON);
    }

    /* renamed from: e */
    public void mo57843e() {
        f58235b.mo60705d("onLanguageChanged(), refreshing view");
        this.f58236c.mo57830r();
    }

    /* renamed from: f */
    public void mo57844f() {
        f58235b.mo60705d("onLanguageClicked(), opening language view");
        this.f58236c.mo57831s();
    }

    /* renamed from: g */
    public void mo57845g() {
        f58235b.mo60705d("onAskPermissionsClicked(), launching permission dialog");
        this.f58236c.mo57832t();
    }

    /* renamed from: h */
    public void mo57846h() {
        this.f58239f.mo54921a(C21716gg.m52911ad());
        this.f58236c.mo57833u();
    }

    /* renamed from: i */
    public void mo57847i() {
        f58235b.mo60705d("onViewResumed()");
        int i = this.f58238e;
        if (i == 27) {
            this.f58236c.mo57818a("android.permission.RECORD_AUDIO");
        } else if (i == 26) {
            this.f58236c.mo57818a("android.permission.CAMERA");
        } else if (i == 31 && this.f58237d.mo57837a()) {
            this.f58236c.mo57834v();
        }
    }

    /* renamed from: j */
    public void mo57848j() {
        f58235b.mo60705d("onTryAgainFlow()");
        this.f58236c.mo57835w();
    }

    /* renamed from: b */
    public void mo57840b(int i) {
        C24465j jVar = f58235b;
        jVar.mo60705d("onPermissionresult(" + i + ")");
        if (i == 0) {
            if (this.f58238e == 27) {
                this.f58239f.mo54921a(C21716gg.m52960p());
            } else {
                this.f58239f.mo54921a(C21716gg.m52957m());
            }
            this.f58236c.mo57834v();
        }
    }
}
