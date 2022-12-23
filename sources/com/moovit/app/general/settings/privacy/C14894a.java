package com.moovit.app.general.settings.privacy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import f00.C16919g;
import p130j2.C5367a;
import p172m9.C5720b;
import p755qs.C19169f;
import p824tp.C19731i;

/* renamed from: com.moovit.app.general.settings.privacy.a */
public final class C14894a {

    /* renamed from: b */
    public static volatile C14894a f38074b;

    /* renamed from: c */
    public static final C16919g.C16920a f38075c = new C16919g.C16920a("PRIVACY_POLICY_AGREEMENT_V2", false);

    /* renamed from: d */
    public static final C16919g.C16920a f38076d = new C16919g.C16920a("BACKGROUND_LOCATION_TRACKING", true);

    /* renamed from: e */
    public static final C16919g.C16920a f38077e = new C16919g.C16920a("ALLOW_SELLING_DATA", true);

    /* renamed from: f */
    public static final C16919g.C16920a f38078f = new C16919g.C16920a("ALLOW_DATA_SHARING", true);

    /* renamed from: g */
    public static final C16919g.C16920a f38079g = new C16919g.C16920a("ALLOW_PERSONALIZED_ADS", true);

    /* renamed from: a */
    public final Context f38080a;

    /* renamed from: com.moovit.app.general.settings.privacy.a$a */
    public static class C14895a {

        /* renamed from: a */
        public final Context f38081a;

        /* renamed from: b */
        public final SharedPreferences f38082b;

        /* renamed from: c */
        public SharedPreferences.Editor f38083c = null;

        /* renamed from: d */
        public int f38084d = 0;

        public C14895a(Context context, SharedPreferences sharedPreferences) {
            C21100e.m49373x(context, "appContext");
            this.f38081a = context;
            C21100e.m49373x(sharedPreferences, "prefs");
            this.f38082b = sharedPreferences;
        }

        /* renamed from: a */
        public final void mo45019a() {
            SharedPreferences.Editor editor = this.f38083c;
            if (editor != null) {
                editor.apply();
                Context context = this.f38081a;
                if (C5720b.m14041I(context)) {
                    C19731i.m47197a(context).f50172b.mo42913b(new C19169f(context), true);
                }
                Context context2 = this.f38081a;
                int i = this.f38084d;
                Intent intent = new Intent("com.moovit.app.general.settings.privacy.action.updated");
                intent.putExtra("mask", i);
                C5367a.m13473a(context2).mo21147c(intent);
            }
        }

        /* renamed from: b */
        public final SharedPreferences.Editor mo45020b() {
            if (this.f38083c == null) {
                this.f38083c = this.f38082b.edit();
            }
            return this.f38083c;
        }

        /* renamed from: c */
        public final void mo45021c(boolean z) {
            Boolean bool;
            C16919g.C16920a aVar = C14894a.f38078f;
            if (this.f38082b.contains(aVar.f43935a)) {
                bool = aVar.mo19759a(this.f38082b);
            } else {
                bool = null;
            }
            if (bool == null || bool.booleanValue() != z) {
                aVar.mo19760c(mo45020b(), Boolean.valueOf(z));
                this.f38084d |= 4;
            }
        }

        /* renamed from: d */
        public final void mo45022d(boolean z) {
            Boolean bool;
            C16919g.C16920a aVar = C14894a.f38079g;
            if (this.f38082b.contains(aVar.f43935a)) {
                bool = aVar.mo19759a(this.f38082b);
            } else {
                bool = null;
            }
            if (bool == null || bool.booleanValue() != z) {
                mo45020b().putBoolean(aVar.f43935a, Boolean.valueOf(z).booleanValue());
                this.f38084d |= 8;
            }
        }
    }

    public C14894a(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f38080a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static C14894a m37560b(Context context) {
        if (f38074b == null) {
            synchronized (C14894a.class) {
                if (f38074b == null) {
                    f38074b = new C14894a(context);
                }
            }
        }
        return f38074b;
    }

    /* renamed from: a */
    public final C14895a mo45012a() {
        return new C14895a(this.f38080a, mo45013c());
    }

    /* renamed from: c */
    public final SharedPreferences mo45013c() {
        return this.f38080a.getSharedPreferences("com.moovit.general.settings.privacy.PrivacySettingsPref", 0);
    }

    /* renamed from: d */
    public final boolean mo45014d() {
        return f38076d.mo19759a(mo45013c()).booleanValue();
    }

    /* renamed from: e */
    public final Boolean mo45015e() {
        SharedPreferences c = mo45013c();
        C16919g.C16920a aVar = f38079g;
        if (c.contains(aVar.f43935a)) {
            return aVar.mo19759a(c);
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo45016f() {
        return f38077e.mo19759a(mo45013c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo45017g() {
        return f38075c.mo19759a(mo45013c()).booleanValue();
    }

    /* renamed from: h */
    public final void mo45018h() {
        SharedPreferences c = mo45013c();
        SharedPreferences.Editor edit = c.edit();
        C16919g.C16920a aVar = f38075c;
        Boolean bool = Boolean.TRUE;
        aVar.mo19760c(edit, bool);
        C16919g.C16920a aVar2 = f38076d;
        if (!c.contains(aVar2.f43935a)) {
            aVar2.mo19760c(edit, bool);
        }
        C16919g.C16920a aVar3 = f38077e;
        if (!c.contains(aVar3.f43935a)) {
            aVar3.mo19760c(edit, bool);
        }
        edit.apply();
        C5720b.m14039G(this.f38080a);
    }
}
