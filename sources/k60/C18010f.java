package k60;

import ad0.C7559a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0207b;
import c70.C13751d;
import com.moovit.design.view.AlertMessageView;
import com.veriff.VeriffBranding;
import com.veriff.sdk.internal.C22006me;
import com.veriff.sdk.internal.C22087nq;
import h60.C17327j1;
import h60.C17342o1;
import h60.C17345p1;
import h60.C17348q1;
import h60.C17351r1;
import i60.C17559a;
import p065e.C4413c;
import p480ez.C16910b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20941h;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;

/* renamed from: k60.f */
public class C18010f extends C17999a {

    /* renamed from: u */
    public static final /* synthetic */ int f46121u = 0;

    /* renamed from: r */
    public final C18011a f46122r = new C18011a();

    /* renamed from: s */
    public final C18012b f46123s = new C18012b();

    /* renamed from: t */
    public final C0207b<Intent> f46124t = registerForActivityResult(new C4413c(), new C17327j1(this, 24));

    /* renamed from: k60.f$a */
    public class C18011a extends C20438i<C17342o1, C17345p1> {
        public C18011a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17342o1 o1Var = (C17342o1) cVar;
            C18010f fVar = C18010f.this;
            String str = ((C17345p1) gVar).f44730m;
            int i = C18010f.f46121u;
            Context requireContext = fVar.requireContext();
            fVar.f46124t.mo772a(C22006me.m53661a(fVar.requireActivity(), C22087nq.m53873a(str, new C7559a(new VeriffBranding(Integer.valueOf(C20941h.m49043f(C25748c.colorPrimary, requireContext)), Integer.valueOf(C20941h.m49043f(16842801, requireContext)), Integer.valueOf(C20941h.m49043f(16843857, requireContext)), Integer.valueOf(C20941h.m49043f(C25748c.colorOnSurface, requireContext)), Integer.valueOf(C20941h.m49043f(C25748c.colorOnSurfaceEmphasisMedium, requireContext)), Float.valueOf(4.0f), Integer.valueOf(C25749d.wdg_img_veriff_logo))))));
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C18010f.this.mo46795h2(C13751d.m34341b(((C17342o1) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    /* renamed from: k60.f$b */
    public class C18012b extends C20438i<C17348q1, C17351r1> {
        public C18012b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17348q1 q1Var = (C17348q1) cVar;
            C17351r1 r1Var = (C17351r1) gVar;
            C18010f.this.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C18010f.this.mo46795h2(C13751d.m34341b(((C17348q1) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    /* renamed from: k60.f$c */
    public static /* synthetic */ class C18013c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46127a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.veriff.VeriffResult$Status[] r0 = com.veriff.VeriffResult.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46127a = r0
                com.veriff.VeriffResult$Status r1 = com.veriff.VeriffResult.Status.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46127a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.VeriffResult$Status r1 = com.veriff.VeriffResult.Status.CANCELED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46127a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.VeriffResult$Status r1 = com.veriff.VeriffResult.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k60.C18010f.C18013c.<clinit>():void");
        }
    }

    static {
        Class<C18010f> cls = C18010f.class;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_registration_step_veriff_fragment, viewGroup, false);
        ((AlertMessageView) inflate.findViewById(C25750e.message_view)).setPositiveButtonClickListener(new C16910b(this, 9));
        return inflate;
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_veriff";
    }

    /* renamed from: s2 */
    public final boolean mo50502s2() {
        return false;
    }

    /* renamed from: w2 */
    public final boolean mo50506w2() {
        return false;
    }
}
