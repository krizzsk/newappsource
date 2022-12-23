package ud0;

import android.text.TextUtils;
import com.appboy.Constants;
import com.vungle.warren.C23097c;
import com.vungle.warren.C23236v0;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.tasks.UnknownTagException;
import ld0.C24220a;
import ld0.C24221b;
import nd0.C24486e;
import td0.C24932c;

/* renamed from: ud0.l */
public final class C25029l implements C25022f {

    /* renamed from: a */
    public final C23192a f63213a;

    /* renamed from: b */
    public final C24932c f63214b;

    /* renamed from: c */
    public final VungleApiClient f63215c;

    /* renamed from: d */
    public final C24220a f63216d;

    /* renamed from: e */
    public final C23097c f63217e;

    /* renamed from: f */
    public final C24486e f63218f;

    public C25029l(C23192a aVar, C24932c cVar, VungleApiClient vungleApiClient, C24221b bVar, C23097c cVar2, C24486e eVar) {
        this.f63213a = aVar;
        this.f63214b = cVar;
        this.f63215c = vungleApiClient;
        this.f63216d = bVar;
        this.f63217e = cVar2;
        this.f63218f = eVar;
    }

    /* renamed from: a */
    public final C25021e mo61559a(String str) throws UnknownTagException {
        if (!TextUtils.isEmpty(str)) {
            int i = C25025i.f63206b;
            if (str.startsWith("ud0.i")) {
                return new C25025i(C23236v0.f58973f);
            }
            int i2 = C25020d.f63194c;
            if (str.startsWith("ud0.d")) {
                return new C25020d(this.f63217e, C23236v0.f58972e);
            }
            int i3 = C25028k.f63210c;
            if (str.startsWith("ud0.k")) {
                return new C25028k(this.f63215c, this.f63213a);
            }
            int i4 = C25019c.f63190d;
            if (str.startsWith("ud0.c")) {
                return new C25019c(this.f63214b, this.f63213a, this.f63217e);
            }
            int i5 = C25017a.f63184b;
            if (str.startsWith(Constants.APPBOY_PUSH_CONTENT_KEY)) {
                return new C25017a(this.f63216d);
            }
            int i6 = C25027j.f63208b;
            if (str.startsWith("j")) {
                return new C25027j(this.f63218f);
            }
            String[] strArr = C25018b.f63186d;
            if (str.startsWith("ud0.b")) {
                return new C25018b(this.f63215c, this.f63213a, this.f63217e);
            }
            throw new UnknownTagException(C25541a.m63881k("Unknown Job Type ", str));
        }
        throw new UnknownTagException("Job tag is null");
    }
}
