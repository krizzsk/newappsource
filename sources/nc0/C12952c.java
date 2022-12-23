package nc0;

import ac0.C7557a;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdOrientation;
import com.cubic.umo.p045ad.types.AKAdUIConfig;
import com.cubic.umo.p045ad.types.AKHostedConfig;
import com.cubic.umo.p045ad.types.AKProgressIndicatorConfig;
import java.util.ArrayList;
import java.util.Iterator;
import mf0.C24362h;
import p026b7.C1500e;
import p043ch.qos.logback.classic.Logger;
import wb0.C13233c;

/* renamed from: nc0.c */
public final class C12952c {

    /* renamed from: nc0.c$a */
    public /* synthetic */ class C12953a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32092a;

        static {
            int[] iArr = new int[UMOAdKitAdOrientation.values().length];
            iArr[UMOAdKitAdOrientation.PORTRAIT.ordinal()] = 1;
            iArr[UMOAdKitAdOrientation.LANDSCAPE.ordinal()] = 2;
            f32092a = iArr;
        }
    }

    /* renamed from: a */
    public static int m32791a(int i) {
        return (int) ((((float) i) * m32793c((Context) null).density) + 0.5f);
    }

    /* renamed from: b */
    public static int m32792b(String str, String str2) {
        int parseColor = Color.parseColor(str2);
        if (!C12954d.m32800c(str)) {
            return parseColor;
        }
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            Logger logger = C7557a.f23040a;
            Logger logger2 = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("IllegalArgumentException while parsing Color Value (Exception: ");
            J0.append(e.getLocalizedMessage());
            J0.append(')');
            logger2.mo6667d(J0.toString());
            return parseColor;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0003, code lost:
        r1 = r1.getResources();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.DisplayMetrics m32793c(android.content.Context r1) {
        /*
            if (r1 != 0) goto L_0x0003
            goto L_0x0009
        L_0x0003:
            android.content.res.Resources r1 = r1.getResources()
            if (r1 != 0) goto L_0x000b
        L_0x0009:
            r1 = 0
            goto L_0x000f
        L_0x000b:
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
        L_0x000f:
            if (r1 != 0) goto L_0x001e
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            java.lang.String r0 = "getSystem().displayMetrics"
            mf0.C24362h.m61210e(r1, r0)
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nc0.C12952c.m32793c(android.content.Context):android.util.DisplayMetrics");
    }

    /* renamed from: d */
    public static ArrayList m32794d(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(m32794d((ViewGroup) childAt));
            }
            Object tag = childAt.getTag();
            if (tag != null && C24362h.m61206a(tag, "UMOAdView")) {
                arrayList.add(childAt);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: e */
    public static void m32795e(FrameLayout frameLayout) {
        AKProgressIndicatorConfig aKProgressIndicatorConfig;
        String str;
        AKAdUIConfig adUIConfig;
        View findViewById = frameLayout.findViewById(C1500e.ll_progress_bg);
        if (findViewById != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById;
            View findViewById2 = frameLayout.findViewById(C1500e.umoak_progress);
            if (findViewById2 != null) {
                ProgressBar progressBar = (ProgressBar) findViewById2;
                AKHostedConfig aKHostedConfig = C13233c.f32845d;
                String str2 = null;
                if (aKHostedConfig == null || (adUIConfig = aKHostedConfig.getAdUIConfig()) == null) {
                    aKProgressIndicatorConfig = null;
                } else {
                    aKProgressIndicatorConfig = adUIConfig.getProgressIndicatorConfig();
                }
                Drawable background = linearLayout.getBackground();
                if (background != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    if (aKProgressIndicatorConfig == null) {
                        str = null;
                    } else {
                        str = aKProgressIndicatorConfig.getBgColor();
                    }
                    gradientDrawable.setColor(m32792b(str, "#FFFFFF"));
                    Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                    if (aKProgressIndicatorConfig != null) {
                        str2 = aKProgressIndicatorConfig.getSpinnerColor();
                    }
                    indeterminateDrawable.setColorFilter(m32792b(str2, "#696969"), PorterDuff.Mode.MULTIPLY);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ProgressBar");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    /* renamed from: f */
    public static int m32796f(int i) {
        return (int) ((((float) i) / m32793c((Context) null).density) + 0.5f);
    }

    /* renamed from: g */
    public static void m32797g(UMOAdKitBannerView uMOAdKitBannerView) {
        ArrayList d = m32794d(uMOAdKitBannerView);
        if (!d.isEmpty()) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                uMOAdKitBannerView.removeView((View) it.next());
            }
        }
    }
}
