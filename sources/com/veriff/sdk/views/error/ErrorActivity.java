package com.veriff.sdk.views.error;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.support.AppboyImageUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.veriff.sdk.internal.C21637fn;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C22006me;
import com.veriff.sdk.internal.C22306qh;
import com.veriff.sdk.internal.C22420rr;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.internal.C22700xq;
import com.veriff.sdk.views.base.verification.C22814a;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24469n;
import p090g1.C4732a;

public class ErrorActivity extends C22814a implements a$c {

    /* renamed from: l */
    public static final String f58227l = "ErrorActivity.EXTRA_ERROR_TYPE";

    /* renamed from: m */
    private C22661wm f58228m;

    /* renamed from: n */
    private Intent f58229n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public a$b f58230o;

    /* renamed from: p */
    private C22306qh f58231p;

    /* renamed from: b */
    public void mo57819b() {
        this.f58231p.mo56321f(103);
    }

    /* renamed from: c */
    public void mo57820c() {
        this.f58231p.mo56322g(105);
    }

    /* renamed from: d */
    public void mo57821d() {
        this.f58231p.mo56323h(104);
    }

    /* renamed from: e */
    public void mo57822e() {
        this.f58231p.mo56324i(104);
    }

    /* renamed from: f */
    public void mo57823f() {
        this.f58231p.mo56315a(50);
    }

    /* renamed from: g */
    public void mo57824g() {
        this.f58231p.mo56320e(51);
    }

    /* renamed from: h */
    public void mo57825h() {
        this.f58231p.mo56317b(107);
    }

    /* renamed from: n */
    public void mo57826n() {
        this.f58231p.mo56318c(112);
    }

    /* renamed from: o */
    public void mo57827o() {
        this.f58231p.mo56319d(109);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 8 && i2 == -1) {
            C21637fn.m52523c().mo54894a(new Runnable() {
                public void run() {
                    ErrorActivity.this.f58230o.mo57843e();
                }
            });
        }
    }

    public void onBackPressed() {
        this.f58230o.mo57842d();
    }

    public void onResume() {
        super.onResume();
        this.f58231p.mo56314a();
        this.f58230o.mo57847i();
    }

    /* renamed from: p */
    public void mo57828p() {
        this.f58231p.mo56325j(110);
    }

    /* renamed from: q */
    public void mo57829q() {
        this.f58231p.mo56326k(111);
    }

    /* renamed from: r */
    public void mo57830r() {
        C22700xq xqVar = new C22700xq(this, mo56158h_().mo60604g());
        C24469n.C24470a aVar = C24469n.f61931a;
        aVar.mo60714a(mo56158h_().mo60604g(), this.f56065c.mo54912f().mo60691a(), mo57577m());
        try {
            C22306qh qhVar = new C22306qh(this, this.f56065c.mo54912f().mo60691a(), xqVar, mo57577m(), this.f56065c.mo54908b(), new C22306qh.C22322a() {
                /* renamed from: a */
                public void mo56327a() {
                    ErrorActivity.this.f58230o.mo57841c();
                }

                /* renamed from: b */
                public void mo56329b() {
                    ErrorActivity.this.f58230o.mo57844f();
                }

                /* renamed from: c */
                public void mo56330c() {
                    ErrorActivity.this.f58230o.mo57845g();
                }

                /* renamed from: d */
                public void mo56331d() {
                    ErrorActivity.this.f58230o.mo57846h();
                }

                /* renamed from: e */
                public void mo56332e() {
                    ErrorActivity.this.f58230o.mo57848j();
                }

                /* renamed from: a */
                public void mo56328a(int i) {
                    ErrorActivity.this.f58230o.mo57838a(i);
                }
            });
            this.f58231p = qhVar;
            setContentView(qhVar);
            this.f58230o.mo57839b();
            aVar.mo60718d();
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    /* renamed from: s */
    public void mo57831s() {
        this.f57890h.mo57586c();
    }

    /* renamed from: t */
    public void mo57832t() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), (String) null));
        startActivity(intent);
    }

    /* renamed from: u */
    public void mo57833u() {
        C22420rr.f56591a.mo56498a(this, mo57577m()).mo56463a(this);
    }

    /* renamed from: v */
    public void mo57834v() {
        this.f58231p.mo56316b();
    }

    /* renamed from: w */
    public void mo57835w() {
        Intent intent = this.f58229n;
        if (intent != null) {
            this.f57890h.mo56170a(intent.addFlags(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES));
        } else {
            C22006me.m53663b(this, C24426d.m61427a(mo56158h_(), this.f56065c.mo54912f().mo60699e()));
        }
        finish();
    }

    /* renamed from: a */
    public static Intent m56614a(Context context, int i, C24426d dVar, C21895jw jwVar, C22661wm wmVar, Intent intent) {
        Intent intent2 = new Intent(context, ErrorActivity.class);
        intent2.setFlags(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES);
        intent2.putExtra(f58227l, i);
        intent2.addFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        C22814a.m56078a(intent2, dVar, jwVar);
        if (wmVar != null) {
            intent2.putExtra("mobi.lab.veriff.views.error.EXTRA_FLOW_SESSION", wmVar);
        }
        if (intent != null) {
            intent2.putExtra("com.veriff.sdk.error.EXTRA_RETURN_INTENT", intent);
        }
        return intent2;
    }

    /* renamed from: a */
    public void mo57572a(boolean z, Bundle bundle) {
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(f58227l, 6);
        this.f58228m = (C22661wm) intent.getParcelableExtra("mobi.lab.veriff.views.error.EXTRA_FLOW_SESSION");
        this.f58229n = (Intent) intent.getParcelableExtra("com.veriff.sdk.error.EXTRA_RETURN_INTENT");
        this.f58230o = new C22938c(this, new C22937b(C22420rr.f56591a.mo56498a(this, mo57577m())), intExtra, mo56159j().mo54908b(), mo57577m());
        mo57830r();
    }

    /* renamed from: a */
    public void mo57038a(a$b a_b) {
        this.f58230o = a_b;
    }

    /* renamed from: a */
    public void mo57814a() {
        C22006me.m53663b(this, C24426d.m61427a(mo56158h_(), this.f56065c.mo54912f().mo60699e()));
        finish();
    }

    /* renamed from: a */
    public void mo57815a(int i) {
        mo56155a(false, i, this.f58228m);
    }

    /* renamed from: a */
    public void mo57816a(C21719gi giVar) {
        mo56152a(C21783is.error, giVar, this.f58228m);
    }

    /* renamed from: a */
    public void mo57818a(String str) {
        if (!getApplication().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            this.f58230o.mo57840b(-1);
        } else {
            this.f58230o.mo57840b(C4732a.checkSelfPermission(getBaseContext(), str));
        }
    }
}
