package p090g1;

import android.os.Handler;
import android.os.Looper;
import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import le0.C24224b;
import p364al.C13487h;
import p413co.C13868n;
import p413co.C13872r;
import p702ok.C18775a;
import p725pj.C18926a;
import p818tj.C19683a;

/* renamed from: g1.d */
public final class C4745d {

    /* renamed from: a */
    public Object f16031a;

    public /* synthetic */ C4745d(Object obj) {
        this.f16031a = obj;
    }

    /* renamed from: a */
    public final C13487h mo20254a(String str, String str2) {
        C13872r<Date> b = ((C13868n) this.f16031a).mo40785b(C21100e.m49332a0(), str2);
        if (!b.mo40817a()) {
            return new C13487h(new C18775a(str, (Date) b.f34119a), (C18926a) null);
        }
        C18926a aVar = b.f34120b;
        if (aVar.f48169a.equals("brand_data")) {
            return new C13487h(null, aVar);
        }
        return new C13487h(null, new C19683a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }

    /* renamed from: b */
    public final void mo20255b() {
        ((C24224b) this.f16031a).dispose();
    }

    public C4745d(int i) {
        if (i == 3) {
            this.f16031a = new HashSet();
        } else if (i != 8) {
            this.f16031a = new ArrayList();
        } else {
            this.f16031a = new Handler(Looper.getMainLooper());
        }
    }
}
