package m90;

import a30.C0072d;
import a30.C0073e;
import a30.C0074f;
import android.content.Context;
import androidx.fragment.app.Fragment;
import ce0.C21100e;
import com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketScreenConfiguration;
import com.moovit.ticketing.validation.receipt.media.C7772a;
import com.moovit.ticketing.validation.receipt.media.C7774b;
import com.usebutton.sdk.internal.api.AppActionRequest;
import m90.C12890b;
import n90.C12919a;
import n90.C12921b;
import o90.C12957a;
import p605ki.C18047b;
import p871vo.C20178e;
import p977zz.C20941h;
import q90.C13040a;
import q90.C13042b;
import r90.C13049a;
import r90.C13052c;

/* renamed from: m90.d */
public final class C12894d implements C12890b.C12891a<Fragment, RuntimeException> {

    /* renamed from: a */
    public final Context f31908a;

    public C12894d(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f31908a = context;
    }

    /* renamed from: a */
    public final Object mo39739a(C7772a aVar) throws Exception {
        C7774b bVar = new C7774b();
        C12889a.m32680m2(bVar, aVar);
        return bVar;
    }

    /* renamed from: b */
    public final Object mo39740b(C13040a aVar) throws Exception {
        C13042b bVar = new C13042b();
        C12889a.m32680m2(bVar, aVar);
        return bVar;
    }

    /* renamed from: c */
    public final Object mo39741c(C12957a aVar) throws Exception {
        C0072d dVar = aVar.f32095d;
        Context context = this.f31908a;
        String str = dVar.f152a;
        C18047b.f46173p.getClass();
        C18047b a = C18047b.C18048a.m44717a(str);
        String str2 = dVar.f153b;
        int f = C20941h.m49043f(C0073e.colorPrimary, context);
        UniversalTicketScreenConfiguration universalTicketScreenConfiguration = new UniversalTicketScreenConfiguration();
        universalTicketScreenConfiguration.f37215b = Integer.valueOf(f);
        universalTicketScreenConfiguration.f37216c = (float) context.getResources().getDimensionPixelSize(C0074f.corner_radius);
        universalTicketScreenConfiguration.f37218e = Integer.valueOf(f);
        int i = C20178e.f51192o;
        return C20178e.C20179a.m47753a(a, str2, universalTicketScreenConfiguration);
    }

    /* renamed from: d */
    public final Object mo39742d(C13049a aVar) throws Exception {
        C13052c cVar = new C13052c();
        C12889a.m32680m2(cVar, aVar);
        return cVar;
    }

    /* renamed from: e */
    public final Object mo39743e(C12919a aVar) throws Exception {
        C12921b bVar = new C12921b();
        C12889a.m32680m2(bVar, aVar);
        return bVar;
    }
}
