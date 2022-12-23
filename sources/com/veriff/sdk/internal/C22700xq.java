package com.veriff.sdk.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.provider.Settings;
import android.util.TypedValue;
import bf0.C21050d;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.R$dimen;
import mobi.lab.veriff.R$drawable;
import p116i1.C5247f;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010O\u001a\u00020\b2\b\b\u0001\u0010P\u001a\u00020QH\u0002J\u0014\u0010R\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010S\u001a\u00020QH\u0002J\u0012\u0010T\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010S\u001a\u00020QJ\u001e\u0010U\u001a\u0004\u0018\u00010\u00102\b\u0010V\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010W\u001a\u00020QH\u0002J\u001e\u0010U\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010S\u001a\u00020Q2\b\b\u0001\u0010W\u001a\u00020QH\u0002J\u0012\u0010X\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010S\u001a\u00020QJ\u001c\u0010Y\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010S\u001a\u00020Q2\b\b\u0001\u0010Z\u001a\u00020QJ\f\u0010[\u001a\u00020\b*\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0014\u0010%\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0011\u0010)\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0013\u0010+\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0013\u0010-\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010\u0012R\u0013\u0010/\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b0\u0010\u0012R\u0011\u00101\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b2\u0010\u0016R\u0011\u00103\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b4\u0010\u0016R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b:\u0010 R\u0011\u0010;\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b<\u0010 R\u0014\u0010=\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010 R\u0011\u0010?\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010C\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bD\u0010\u0016R\u0013\u0010E\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bF\u0010\u0012R\u0011\u0010G\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bH\u0010 R\u0013\u0010I\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0012R\u0013\u0010K\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0011\u0010M\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bN\u0010B¨\u0006\\"}, mo59060d2 = {"Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "", "context", "Landroid/content/Context;", "branding", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "(Landroid/content/Context;Lmobi/lab/veriff/util/resourcesHelper/Branding;)V", "animationScale", "", "animationsDisabled", "", "getAnimationsDisabled", "()Z", "getBranding", "()Lmobi/lab/veriff/util/resourcesHelper/Branding;", "divider", "Landroid/graphics/drawable/Drawable;", "getDivider", "()Landroid/graphics/drawable/Drawable;", "getVrffButtonStatesGhost", "Landroid/graphics/drawable/StateListDrawable;", "getGetVrffButtonStatesGhost", "()Landroid/graphics/drawable/StateListDrawable;", "vrffBtnEmptyDisabled", "getVrffBtnEmptyDisabled", "vrffBtnEmptyEnabled", "getVrffBtnEmptyEnabled", "vrffBtnEmptyPressed", "getVrffBtnEmptyPressed", "vrffBtnFullDisabled", "Landroid/graphics/drawable/GradientDrawable;", "getVrffBtnFullDisabled", "()Landroid/graphics/drawable/GradientDrawable;", "vrffBtnFullEnabled", "getVrffBtnFullEnabled", "vrffBtnFullPressed", "getVrffBtnFullPressed", "vrffBtnGhostDisabled", "getVrffBtnGhostDisabled", "vrffBtnGhostEnabled", "getVrffBtnGhostEnabled", "vrffBtnGhostPressed", "getVrffBtnGhostPressed", "vrffButtonLoadingFull", "getVrffButtonLoadingFull", "vrffButtonLoadingGhost", "getVrffButtonLoadingGhost", "vrffButtonLoadingHollow", "getVrffButtonLoadingHollow", "vrffButtonStatesEmpty", "getVrffButtonStatesEmpty", "vrffButtonStatesFilled", "getVrffButtonStatesFilled", "vrffCheckSelectedDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "getVrffCheckSelectedDrawable", "()Landroid/graphics/drawable/ShapeDrawable;", "vrffCheckUnSelectedDrawable", "getVrffCheckUnSelectedDrawable", "vrffContainerWithBorder", "getVrffContainerWithBorder", "vrffContainerWithBorderSelected", "getVrffContainerWithBorderSelected", "vrffDocItemText", "Landroid/content/res/ColorStateList;", "getVrffDocItemText", "()Landroid/content/res/ColorStateList;", "vrffDocumentItemStates", "getVrffDocumentItemStates", "vrffInfoItem", "getVrffInfoItem", "vrffInfoSheetContainer", "getVrffInfoSheetContainer", "vrffProgressIndefinite", "getVrffProgressIndefinite", "vrffStepIndicator", "getVrffStepIndicator", "vrffToolbarExpandedTextColorList", "getVrffToolbarExpandedTextColorList", "getDimenInternal", "dimenId", "", "getDrawableInternal", "drawableId", "getDrawableWithBackgroundTint", "getDrawableWithColorInternal", "drawable", "filterColor", "getDrawableWithThemeTint", "getDrawableWithTint", "tintColor", "toPx", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xq */
public final class C22700xq {

    /* renamed from: b */
    private final boolean f57380b;

    /* renamed from: c */
    private final Drawable f57381c;

    /* renamed from: d */
    private final Context f57382d;

    /* renamed from: e */
    private final C22696xo f57383e;

    public C22700xq(Context context, C22696xo xoVar) {
        boolean z;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(xoVar, "branding");
        this.f57382d = context;
        this.f57383e = xoVar;
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) < 0.1f) {
            z = true;
        } else {
            z = false;
        }
        this.f57380b = z;
        this.f57381c = m55364b(R$drawable.vrff_divider, xoVar.mo57091g());
    }

    /* renamed from: A */
    private final Drawable m55358A() {
        return m55362a((Drawable) m55366w(), this.f57383e.mo57096k());
    }

    /* renamed from: B */
    private final Drawable m55359B() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m55361a(this.f57383e.mo57100o()));
        gradientDrawable.setColor(this.f57383e.mo57096k());
        C21050d dVar = C21050d.f52856a;
        return m55362a((Drawable) gradientDrawable, this.f57383e.mo57096k());
    }

    /* renamed from: C */
    private final GradientDrawable m55360C() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f57383e.mo57096k());
        gradientDrawable.setStroke((int) m55363b(R$dimen.vrff_stroke_width), this.f57383e.mo57094i());
        gradientDrawable.setCornerRadius(m55363b(R$dimen.vrff_container_corner_rad));
        return gradientDrawable;
    }

    /* renamed from: w */
    private final GradientDrawable m55366w() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m55361a(this.f57383e.mo57100o()));
        gradientDrawable.setColor(this.f57383e.mo57090f());
        return gradientDrawable;
    }

    /* renamed from: x */
    private final GradientDrawable m55367x() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m55361a(this.f57383e.mo57100o()));
        gradientDrawable.setColor(this.f57383e.mo57094i());
        return gradientDrawable;
    }

    /* renamed from: y */
    private final GradientDrawable m55368y() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f57383e.mo57096k());
        gradientDrawable.setCornerRadius(m55361a(this.f57383e.mo57100o()));
        return gradientDrawable;
    }

    /* renamed from: z */
    private final GradientDrawable m55369z() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f57383e.mo57086d());
        gradientDrawable.setCornerRadius(m55361a(this.f57383e.mo57100o()));
        return gradientDrawable;
    }

    /* renamed from: a */
    public final boolean mo57114a() {
        return this.f57380b;
    }

    /* renamed from: b */
    public final GradientDrawable mo57115b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m55361a(this.f57383e.mo57100o()));
        gradientDrawable.setColor(this.f57383e.mo57083a());
        return gradientDrawable;
    }

    /* renamed from: c */
    public final GradientDrawable mo57116c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f57383e.mo57086d());
        gradientDrawable.setCornerRadius(m55361a(this.f57383e.mo57100o()));
        return gradientDrawable;
    }

    /* renamed from: d */
    public final Drawable mo57117d() {
        return m55362a((Drawable) mo57115b(), this.f57383e.mo57088e());
    }

    /* renamed from: e */
    public final StateListDrawable mo57118e() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, m55366w());
        stateListDrawable.addState(new int[]{16842910, 16842919}, mo57115b());
        stateListDrawable.addState(new int[]{16842910, 16842908}, mo57115b());
        stateListDrawable.addState(new int[]{16842910}, m55367x());
        return stateListDrawable;
    }

    /* renamed from: f */
    public final StateListDrawable mo57119f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, m55368y());
        stateListDrawable.addState(new int[]{16842919}, mo57116c());
        stateListDrawable.addState(new int[]{16842908}, mo57116c());
        stateListDrawable.addState(new int[]{16842913}, mo57116c());
        stateListDrawable.addState(new int[]{16842910}, m55369z());
        return stateListDrawable;
    }

    /* renamed from: g */
    public final StateListDrawable mo57120g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, m55358A());
        stateListDrawable.addState(new int[]{16842919, 16842910}, mo57117d());
        stateListDrawable.addState(new int[]{16842908, 16842910}, mo57117d());
        stateListDrawable.addState(new int[]{16842910}, m55359B());
        return stateListDrawable;
    }

    /* renamed from: h */
    public final Drawable mo57121h() {
        if (this.f57380b) {
            return m55365c(R$drawable.vrff_ic_button_loader_full);
        }
        return m55365c(R$drawable.vrff_button_loading_full);
    }

    /* renamed from: i */
    public final Drawable mo57122i() {
        if (this.f57380b) {
            return mo57112a(R$drawable.vrff_ic_button_loader_hollow);
        }
        return mo57112a(R$drawable.vrff_button_loading_hollow);
    }

    /* renamed from: j */
    public final Drawable mo57123j() {
        if (this.f57380b) {
            return mo57112a(R$drawable.vrff_ic_button_loader_hollow);
        }
        return mo57112a(R$drawable.vrff_button_loading_ghost);
    }

    /* renamed from: k */
    public final Drawable mo57124k() {
        if (this.f57380b) {
            return mo57113a(R$drawable.vrff_ic_progress_indefinite, this.f57383e.mo57085c());
        }
        return mo57113a(R$drawable.vrff_progress_indefinite, this.f57383e.mo57085c());
    }

    /* renamed from: l */
    public final Drawable mo57125l() {
        return this.f57381c;
    }

    /* renamed from: m */
    public final GradientDrawable mo57126m() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f57383e.mo57096k());
        gradientDrawable.setStroke((int) m55363b(R$dimen.vrff_stroke_width), this.f57383e.mo57091g());
        gradientDrawable.setCornerRadius(m55363b(R$dimen.vrff_container_corner_rad));
        return gradientDrawable;
    }

    /* renamed from: n */
    public final StateListDrawable mo57127n() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, m55360C());
        return stateListDrawable;
    }

    /* renamed from: o */
    public final GradientDrawable mo57128o() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f57383e.mo57096k());
        float b = m55363b(R$dimen.vrff_corner_rad);
        gradientDrawable.setCornerRadii(new float[]{b, b, b, b, 0.0f, 0.0f, 0.0f, 0.0f});
        return gradientDrawable;
    }

    /* renamed from: p */
    public final GradientDrawable mo57129p() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke((int) m55363b(R$dimen.vrff_stroke_width), this.f57383e.mo57091g());
        int i = R$dimen.vrff_size_32;
        gradientDrawable.setSize((int) m55363b(i), (int) m55363b(i));
        return gradientDrawable;
    }

    /* renamed from: q */
    public final ShapeDrawable mo57130q() {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        C24362h.m61210e(paint, "this.paint");
        paint.setColor(this.f57383e.mo57094i());
        int i = R$dimen.vrff_size_32;
        shapeDrawable.setIntrinsicWidth((int) m55363b(i));
        shapeDrawable.setIntrinsicHeight((int) m55363b(i));
        return shapeDrawable;
    }

    /* renamed from: r */
    public final ColorStateList mo57131r() {
        return new ColorStateList(new int[][]{new int[]{16842913}, new int[]{16842919}, new int[]{-16842910}, new int[]{-16842919}}, new int[]{this.f57383e.mo57098m(), this.f57383e.mo57098m(), this.f57383e.mo57099n(), this.f57383e.mo57099n()});
    }

    /* renamed from: s */
    public final ColorStateList mo57132s() {
        return new ColorStateList(new int[][]{new int[]{16842913}, new int[]{16842919}, new int[]{-16842910}, new int[]{-16842919}}, new int[]{this.f57383e.mo57098m(), this.f57383e.mo57098m(), this.f57383e.mo57098m(), this.f57383e.mo57098m()});
    }

    /* renamed from: t */
    public final Drawable mo57133t() {
        return m55364b(R$drawable.vrff_info_item, this.f57383e.mo57090f());
    }

    /* renamed from: u */
    public final Drawable mo57134u() {
        return mo57113a(R$drawable.vrff_step_indicator, this.f57383e.mo57095j());
    }

    /* renamed from: v */
    public final C22696xo mo57135v() {
        return this.f57383e;
    }

    /* renamed from: a */
    private final float m55361a(float f) {
        Resources resources = this.f57382d.getResources();
        C24362h.m61210e(resources, "context.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* renamed from: a */
    public final Drawable mo57112a(int i) {
        return mo57113a(i, this.f57383e.mo57094i());
    }

    /* renamed from: b */
    private final Drawable m55364b(int i, int i2) {
        return m55362a(m55365c(i), i2);
    }

    /* renamed from: c */
    private final Drawable m55365c(int i) {
        Resources resources = this.f57382d.getResources();
        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
        return C5247f.C5248a.m13264a(resources, i, (Resources.Theme) null);
    }

    /* renamed from: a */
    public final Drawable mo57113a(int i, int i2) {
        Drawable c = m55365c(i);
        Drawable mutate = c != null ? c.mutate() : null;
        if (mutate != null) {
            mutate.setTint(i2);
        }
        return mutate;
    }

    /* renamed from: b */
    private final float m55363b(int i) {
        return this.f57382d.getResources().getDimension(i);
    }

    /* renamed from: a */
    private final Drawable m55362a(Drawable drawable, int i) {
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        if (mutate != null) {
            mutate.setColorFilter(i, PorterDuff.Mode.SRC);
        }
        return mutate;
    }
}
