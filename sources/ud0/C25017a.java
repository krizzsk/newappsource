package ud0;

import android.os.Bundle;
import com.appboy.Constants;
import com.google.gson.Gson;
import ld0.C24220a;
import p359ag.C13450g;

/* renamed from: ud0.a */
public final class C25017a implements C25021e {

    /* renamed from: b */
    public static final /* synthetic */ int f63184b = 0;

    /* renamed from: a */
    public final C24220a f63185a;

    public C25017a(C24220a aVar) {
        this.f63185a = aVar;
    }

    /* renamed from: b */
    public static C25023g m62725b(String str, int i, int i2, String[] strArr) {
        Bundle bundle = new Bundle();
        bundle.putInt("action_extra", i);
        bundle.putString("extra_body", str);
        bundle.putStringArray("extra_urls", strArr);
        C25023g gVar = new C25023g(Constants.APPBOY_PUSH_CONTENT_KEY);
        gVar.f63198c = false;
        gVar.f63202g = bundle;
        gVar.f63200e = 2000;
        gVar.f63203h = 1;
        gVar.f63205j = i2;
        gVar.f63204i = 5;
        return gVar;
    }

    /* renamed from: a */
    public final int mo61555a(Bundle bundle, C25024h hVar) {
        String[] stringArray;
        int i = bundle.getInt("action_extra", -1);
        if (i == 0) {
            this.f63185a.mo19957c(((C13450g) new Gson().fromJson(bundle.getString("extra_body"), C13450g.class)).mo40342u());
            return 0;
        } else if (i == 1) {
            String[] stringArray2 = bundle.getStringArray("extra_urls");
            if (stringArray2 == null) {
                return 0;
            }
            String[] b = this.f63185a.mo19956b(stringArray2);
            if (b.length == 0) {
                return 0;
            }
            bundle.putStringArray("extra_urls", b);
            return 2;
        } else if (i == 2) {
            String[] a = this.f63185a.mo19955a();
            if (a.length == 0) {
                return 0;
            }
            bundle.putStringArray("extra_urls", a);
            return 2;
        } else if (i != 3 || (stringArray = bundle.getStringArray("extra_urls")) == null) {
            return 0;
        } else {
            this.f63185a.mo19958d(stringArray);
            return 0;
        }
    }
}
