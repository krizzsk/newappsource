package p832tx;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.location.C16202a;
import com.moovit.umo.ads.C7872a;
import com.moovit.umo.ads.C7873b;
import com.moovit.umo.ads.UmoAds;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import p011aa.C0141e;
import p094g5.C4811j;
import p543hq.C17474b;
import p735pt.C18984e;
import p824tp.C19721a;
import p824tp.C19722a0;
import p824tp.C19731i;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p927xw.C20636e;
import w90.C13222b;

/* renamed from: tx.a */
public class C19791a extends C15682c<MoovitAppActivity> implements UmoAds.C7868c {

    /* renamed from: p */
    public static final /* synthetic */ int f50312p = 0;

    /* renamed from: n */
    public final C19792a f50313n = new C19792a();

    /* renamed from: o */
    public View f50314o;

    /* renamed from: tx.a$a */
    public class C19792a extends C0141e {
        public C19792a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C7872a aVar = (C7872a) cVar;
            C4811j jVar = ((C7873b) gVar).f23831g;
            if (jVar != null) {
                C19791a aVar2 = C19791a.this;
                int i = C19791a.f50312p;
                FragmentActivity activity = aVar2.getActivity();
                View view = aVar2.getView();
                if (activity != null && view != null) {
                    String str = (String) jVar.f16208a;
                    String str2 = (String) jVar.f16209b;
                    String str3 = (String) jVar.f16210c;
                    String str4 = (String) jVar.f16211d;
                    String str5 = (String) jVar.f16212e;
                    int i2 = ((C19722a0) aVar2.mo46776J1("USER_CONTEXT")).f50160a.f32927c.f15142b;
                    Location O1 = aVar2.mo46780O1();
                    Context context = view.getContext();
                    if (UmoAds.f23806d == null) {
                        synchronized (UmoAds.class) {
                            if (UmoAds.f23806d == null) {
                                UmoAds.f23806d = new UmoAds(context);
                            }
                        }
                    }
                    UmoAds umoAds = UmoAds.f23806d;
                    Tasks.call(umoAds.f23809c, new UmoAds.C7869d(umoAds.f23807a, new UmoAds.C7871f(str, str2, str3, str4, i2, O1), umoAds.f23808b)).addOnSuccessListener((Activity) activity, new C20636e(aVar2, umoAds, str5, view)).addOnFailureListener((Activity) activity, (OnFailureListener) new C18984e(1));
                }
            }
        }
    }

    public C19791a() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireActivity()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("USER_CONTEXT");
    }

    /* renamed from: W */
    public final void mo24510W(String str, String str2, String str3) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ad_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ID, str);
        aVar.mo49939g(AnalyticsAttributeKey.BANNER_TYPE, str2);
        aVar.mo49945m(AnalyticsAttributeKey.URI, str3);
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        Context requireContext = requireContext();
        C19721a aVar = C19731i.m47197a(requireContext).f50171a;
        mo46794g2(C7872a.class.getName(), new C7872a(aVar.f50157h, aVar.f50159j, requireContext, aVar.f50152c, aVar.f50155f), this.f50313n);
    }

    /* renamed from: b1 */
    public final void mo24511b1(RuntimeException runtimeException) {
        View view = this.f50314o;
        if (view != null && !C13222b.m33316a(view.getContext()).f32796a.getPackageName().startsWith("com.cubic.ctp.app")) {
            this.f50314o.setVisibility(8);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ad_load_failed");
        aVar.mo49938f(AnalyticsAttributeKey.ERROR_CODE, runtimeException);
        mo46797j2(aVar.mo49933a());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.umo_ads_section_fragment, viewGroup, false);
        this.f50314o = inflate;
        if (!C13222b.m33316a(inflate.getContext()).f32796a.getPackageName().startsWith("com.cubic.ctp.app")) {
            i = 8;
        }
        inflate.setVisibility(i);
        return this.f50314o;
    }

    public final void onResume() {
        super.onResume();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ad_unit_umo_section_impression");
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: z */
    public final void mo24512z(String str, String str2) {
        View view = this.f50314o;
        if (view != null && !C13222b.m33316a(view.getContext()).f32796a.getPackageName().startsWith("com.cubic.ctp.app")) {
            this.f50314o.setVisibility(0);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ad_impression");
        aVar.mo49939g(AnalyticsAttributeKey.ID, str);
        aVar.mo49939g(AnalyticsAttributeKey.BANNER_TYPE, str2);
        mo46797j2(aVar.mo49933a());
    }
}
