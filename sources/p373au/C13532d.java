package p373au;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.integration.MicroMobilityIntegrationView;
import com.tranzmate.R;
import java.util.concurrent.ExecutorService;
import p066e0.C4454r0;
import p304x.C7070l;
import p785ry.C19381a;
import p785ry.C19385e;
import p874vr.C20199a;
import p944yq.C20750a;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;

/* renamed from: au.d */
public final class C13532d {
    /* renamed from: a */
    public static ViewGroup.MarginLayoutParams m33906a(Resources resources) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int h = UiUtils.m40249h(resources, 8.0f);
        marginLayoutParams.bottomMargin = h;
        marginLayoutParams.topMargin = h;
        return marginLayoutParams;
    }

    /* renamed from: b */
    public static ViewGroup.MarginLayoutParams m33907b(Resources resources) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int h = UiUtils.m40249h(resources, 6.0f);
        marginLayoutParams.bottomMargin = h;
        marginLayoutParams.topMargin = h;
        marginLayoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.screen_edge));
        return marginLayoutParams;
    }

    /* renamed from: c */
    public static View m33908c(LinearLayout linearLayout, AppDeepLink appDeepLink) {
        C19047a a = C19047a.m46164a(linearLayout.getContext().getApplicationContext());
        if (a == null || !((Boolean) a.mo51505b(C20199a.f51307y0)).booleanValue()) {
            return LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.dockless_leg_deep_link_action_view, linearLayout, false);
        }
        String str = appDeepLink.f40997b;
        View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.dockless_leg_promo_code_action_view, linearLayout, false);
        Task<C19381a> b = C19385e.f49315c.mo51792b();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Task<TContinuationResult> onSuccessTask = b.onSuccessTask(executorService, new C4454r0(11));
        if (!C20964s0.m49090h(str)) {
            onSuccessTask = onSuccessTask.onSuccessTask(executorService, new C7070l(str, 12));
        }
        onSuccessTask.addOnSuccessListener(new C20750a(inflate, 1));
        return inflate;
    }

    /* renamed from: d */
    public static MicroMobilityIntegrationView m33909d(LinearLayout linearLayout, MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        MicroMobilityIntegrationView microMobilityIntegrationView = new MicroMobilityIntegrationView(linearLayout.getContext(), (AttributeSet) null);
        microMobilityIntegrationView.setIntegrationItem(microMobilityIntegrationItem);
        return microMobilityIntegrationView;
    }

    /* renamed from: e */
    public static boolean m33910e(Context context) {
        C19047a a = C19047a.m46164a(context.getApplicationContext());
        if (a == null || ((Boolean) a.mo51505b(C19053d.f48462N)).booleanValue()) {
            return true;
        }
        return false;
    }
}
