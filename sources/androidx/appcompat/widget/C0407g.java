package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.appcompat.widget.C0478x0;
import p090g1.C4732a;
import p114i.C5215a;
import p114i.C5217c;
import p114i.C5219e;
import p129j1.C5348a;

/* renamed from: androidx.appcompat.widget.g */
public final class C0407g {

    /* renamed from: b */
    public static final PorterDuff.Mode f1503b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C0407g f1504c;

    /* renamed from: a */
    public C0478x0 f1505a;

    /* renamed from: androidx.appcompat.widget.g$a */
    public class C0408a implements C0478x0.C0484f {

        /* renamed from: a */
        public final int[] f1506a = {C5219e.abc_textfield_search_default_mtrl_alpha, C5219e.abc_textfield_default_mtrl_alpha, C5219e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f1507b = {C5219e.abc_ic_commit_search_api_mtrl_alpha, C5219e.abc_seekbar_tick_mark_material, C5219e.abc_ic_menu_share_mtrl_alpha, C5219e.abc_ic_menu_copy_mtrl_am_alpha, C5219e.abc_ic_menu_cut_mtrl_alpha, C5219e.abc_ic_menu_selectall_mtrl_alpha, C5219e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f1508c = {C5219e.abc_textfield_activated_mtrl_alpha, C5219e.abc_textfield_search_activated_mtrl_alpha, C5219e.abc_cab_background_top_mtrl_alpha, C5219e.abc_text_cursor_material, C5219e.abc_text_select_handle_left_mtrl, C5219e.abc_text_select_handle_middle_mtrl, C5219e.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f1509d = {C5219e.abc_popup_background_mtrl_mult, C5219e.abc_cab_background_internal_bg, C5219e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f1510e = {C5219e.abc_tab_indicator_material, C5219e.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f1511f = {C5219e.abc_btn_check_material, C5219e.abc_btn_radio_material, C5219e.abc_btn_check_material_anim, C5219e.abc_btn_radio_material_anim};

        /* renamed from: a */
        public static boolean m1030a(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static ColorStateList m1031b(int i, Context context) {
            int c = C0391c1.m974c(C5215a.colorControlHighlight, context);
            int b = C0391c1.m973b(C5215a.colorButtonNormal, context);
            return new ColorStateList(new int[][]{C0391c1.f1461b, C0391c1.f1463d, C0391c1.f1462c, C0391c1.f1465f}, new int[]{b, C5348a.m13413i(c, i), C5348a.m13413i(c, i), i});
        }

        /* renamed from: c */
        public static LayerDrawable m1032c(C0478x0 x0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable f = x0Var.mo2207f(context, C5219e.abc_star_black_48dp);
            Drawable f2 = x0Var.mo2207f(context, C5219e.abc_star_half_black_48dp);
            if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) f;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: e */
        public static void m1033e(Drawable drawable, int i, PorterDuff.Mode mode) {
            int[] iArr = C0418j0.f1525a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C0407g.f1503b;
            }
            mutate.setColorFilter(C0407g.m1026c(i, mode));
        }

        /* renamed from: d */
        public final ColorStateList mo2078d(int i, Context context) {
            if (i == C5219e.abc_edit_text_material) {
                return C4732a.getColorStateList(context, C5217c.abc_tint_edittext);
            }
            if (i == C5219e.abc_switch_track_mtrl_alpha) {
                return C4732a.getColorStateList(context, C5217c.abc_tint_switch_track);
            }
            if (i == C5219e.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                int i2 = C5215a.colorSwitchThumbNormal;
                ColorStateList d = C0391c1.m975d(i2, context);
                if (d == null || !d.isStateful()) {
                    iArr[0] = C0391c1.f1461b;
                    iArr2[0] = C0391c1.m973b(i2, context);
                    iArr[1] = C0391c1.f1464e;
                    iArr2[1] = C0391c1.m974c(C5215a.colorControlActivated, context);
                    iArr[2] = C0391c1.f1465f;
                    iArr2[2] = C0391c1.m974c(i2, context);
                } else {
                    int[] iArr3 = C0391c1.f1461b;
                    iArr[0] = iArr3;
                    iArr2[0] = d.getColorForState(iArr3, 0);
                    iArr[1] = C0391c1.f1464e;
                    iArr2[1] = C0391c1.m974c(C5215a.colorControlActivated, context);
                    iArr[2] = C0391c1.f1465f;
                    iArr2[2] = d.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == C5219e.abc_btn_default_mtrl_shape) {
                return m1031b(C0391c1.m974c(C5215a.colorButtonNormal, context), context);
            } else {
                if (i == C5219e.abc_btn_borderless_material) {
                    return m1031b(0, context);
                }
                if (i == C5219e.abc_btn_colored_material) {
                    return m1031b(C0391c1.m974c(C5215a.colorAccent, context), context);
                }
                if (i == C5219e.abc_spinner_mtrl_am_alpha || i == C5219e.abc_spinner_textfield_background_material) {
                    return C4732a.getColorStateList(context, C5217c.abc_tint_spinner);
                }
                if (m1030a(i, this.f1507b)) {
                    return C0391c1.m975d(C5215a.colorControlNormal, context);
                }
                if (m1030a(i, this.f1510e)) {
                    return C4732a.getColorStateList(context, C5217c.abc_tint_default);
                }
                if (m1030a(i, this.f1511f)) {
                    return C4732a.getColorStateList(context, C5217c.abc_tint_btn_checkable);
                }
                if (i == C5219e.abc_seekbar_thumb_material) {
                    return C4732a.getColorStateList(context, C5217c.abc_tint_seek_thumb);
                }
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized C0407g m1025a() {
        C0407g gVar;
        synchronized (C0407g.class) {
            if (f1504c == null) {
                m1027d();
            }
            gVar = f1504c;
        }
        return gVar;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m1026c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        synchronized (C0407g.class) {
            h = C0478x0.m1314h(i, mode);
        }
        return h;
    }

    /* renamed from: d */
    public static synchronized void m1027d() {
        synchronized (C0407g.class) {
            if (f1504c == null) {
                C0407g gVar = new C0407g();
                f1504c = gVar;
                gVar.f1505a = C0478x0.m1313d();
                C0478x0 x0Var = f1504c.f1505a;
                C0408a aVar = new C0408a();
                synchronized (x0Var) {
                    x0Var.f1666g = aVar;
                }
            }
        }
    }

    /* renamed from: e */
    public static void m1028e(Drawable drawable, C0406f1 f1Var, int[] iArr) {
        boolean z;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = C0478x0.f1657h;
        int[] state = drawable.getState();
        int[] iArr2 = C0418j0.f1525a;
        if (drawable.mutate() == drawable) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = f1Var.f1502d;
            if (z2 || f1Var.f1501c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z2) {
                    colorStateList = f1Var.f1499a;
                } else {
                    colorStateList = null;
                }
                if (f1Var.f1501c) {
                    mode = f1Var.f1500b;
                } else {
                    mode = C0478x0.f1657h;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = C0478x0.m1314h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: b */
    public final synchronized Drawable mo2077b(Context context, int i) {
        return this.f1505a.mo2207f(context, i);
    }
}
