package jc0;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import kotlin.Pair;
import mf0.C24362h;
import n60.C18531b;
import p026b7.C1499d;
import p026b7.C1503h;

/* renamed from: jc0.b */
public final class C12804b extends Dialog {

    /* renamed from: e */
    public static final /* synthetic */ int f31666e = 0;

    /* renamed from: b */
    public final C12805a f31667b;

    /* renamed from: c */
    public RelativeLayout f31668c;

    /* renamed from: d */
    public ImageView f31669d;

    /* renamed from: jc0.b$a */
    public interface C12805a {
        /* renamed from: a */
        void mo35805a();

        /* renamed from: c */
        void mo35806c(C12804b bVar);

        void zzc();

        Pair zzd();

        void zze();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12804b(Context context, int i, int i2, boolean z, C12805a aVar) {
        super(context, C1503h.UMOAKNoTitleBarScreenTheme);
        ImageView imageView;
        C24362h.m61208c(context);
        this.f31667b = aVar;
        WindowManager.LayoutParams a = mo39644a(i, i2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f31668c = relativeLayout;
        setContentView(relativeLayout, a);
        if (z) {
            RelativeLayout.LayoutParams layoutParams = null;
            Pair zzd = aVar.zzd();
            if (zzd == null) {
                imageView = null;
            } else {
                imageView = (ImageView) zzd.mo59068c();
            }
            this.f31669d = imageView;
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.f31669d = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                ImageView imageView3 = this.f31669d;
                if (imageView3 != null) {
                    imageView3.setImageResource(C1499d.umoak_ic_close_circular_grey);
                }
            }
            layoutParams = zzd != null ? (RelativeLayout.LayoutParams) zzd.mo59069d() : layoutParams;
            this.f31668c.addView(this.f31669d, layoutParams == null ? m32606b() : layoutParams);
            ImageView imageView4 = this.f31669d;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new C18531b(this, 9));
            }
        }
        setOnDismissListener(new C12803a(this));
    }

    /* renamed from: b */
    public static RelativeLayout.LayoutParams m32606b() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
        float f = (float) 40;
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        C24362h.m61210e(displayMetrics2, "getSystem().displayMetrics");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ((displayMetrics.density * f) + 0.5f), (int) ((f * displayMetrics2.density) + 0.5f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        return layoutParams;
    }

    /* renamed from: c */
    public static void m32607c(C12804b bVar, ViewGroup viewGroup) {
        if (viewGroup.getParent() != bVar.f31668c) {
            if (viewGroup.getParent() != null) {
                ViewParent parent = viewGroup.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(viewGroup);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            bVar.f31668c.addView(viewGroup);
        }
        ImageView imageView = bVar.f31669d;
        if (imageView != null) {
            imageView.bringToFront();
        }
    }

    /* renamed from: a */
    public final WindowManager.LayoutParams mo39644a(int i, int i2) {
        WindowManager.LayoutParams layoutParams;
        Window window = getWindow();
        if (window == null) {
            layoutParams = null;
        } else {
            layoutParams = window.getAttributes();
        }
        if (layoutParams == null) {
            layoutParams = new WindowManager.LayoutParams();
        }
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.width = i;
        layoutParams.height = i2;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        return layoutParams;
    }

    public final void onBackPressed() {
        C12805a aVar = this.f31667b;
        if (aVar != null) {
            aVar.mo35805a();
        }
        super.onBackPressed();
    }

    public final void onStart() {
        super.onStart();
        ImageView imageView = this.f31669d;
        if (imageView != null) {
            imageView.bringToFront();
        }
        C12805a aVar = this.f31667b;
        if (aVar != null) {
            aVar.zzc();
        }
    }
}
