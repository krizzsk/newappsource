package j00;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.C0794g;
import com.moovit.commons.utils.UiUtils;
import i00.C17529h;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: j00.i */
public final class C17691i {

    /* renamed from: a */
    public static final C17694c f45443a = new C17694c();

    /* renamed from: b */
    public static final C17695d f45444b = new C17695d();

    /* renamed from: c */
    public static final C17698g f45445c = new C17698g();

    /* renamed from: d */
    public static final C17702k f45446d = new C17702k();

    /* renamed from: e */
    public static final C17693b f45447e = new C17693b();

    /* renamed from: j00.i$a */
    public class C17692a extends Property<Drawable, Integer> {
        public C17692a() {
            super(Integer.class, "level");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((Drawable) obj).getLevel());
        }

        public final void set(Object obj, Object obj2) {
            ((Drawable) obj).setLevel(((Integer) obj2).intValue());
        }
    }

    /* renamed from: j00.i$b */
    public class C17693b extends Property<ImageView, Integer> {
        public C17693b() {
            super(Integer.class, "setImageTintList");
        }

        public final Object get(Object obj) {
            ColorStateList a = C0794g.C0795a.m2406a((ImageView) obj);
            if (a != null) {
                return Integer.valueOf(a.getDefaultColor());
            }
            return null;
        }

        public final void set(Object obj, Object obj2) {
            ColorStateList colorStateList;
            ImageView imageView = (ImageView) obj;
            Integer num = (Integer) obj2;
            if (num != null) {
                colorStateList = ColorStateList.valueOf(num.intValue());
            } else {
                colorStateList = null;
            }
            C0794g.m2404a(imageView, colorStateList);
        }
    }

    /* renamed from: j00.i$c */
    public class C17694c extends Property<View, Integer> {
        public C17694c() {
            super(Integer.class, "minHeight");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return Integer.valueOf(C6333d0.C6337d.m15044d((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            ((View) obj).setMinimumHeight(((Integer) obj2).intValue());
        }
    }

    /* renamed from: j00.i$d */
    public class C17695d extends Property<View, Integer> {
        public C17695d() {
            super(Integer.class, "height");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((View) obj).getHeight());
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = ((Integer) obj2).intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: j00.i$e */
    public class C17696e extends Property<View, Integer> {
        public C17696e() {
            super(Integer.class, "paddingTop");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((View) obj).getPaddingTop());
        }

        public final void set(Object obj, Object obj2) {
            UiUtils.m40266y((View) obj, UiUtils.Edge.TOP, ((Integer) obj2).intValue());
        }
    }

    /* renamed from: j00.i$f */
    public class C17697f extends Property<View, Integer> {
        public C17697f() {
            super(Integer.class, "paddingBottom");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((View) obj).getPaddingBottom());
        }

        public final void set(Object obj, Object obj2) {
            UiUtils.m40266y((View) obj, UiUtils.Edge.BOTTOM, ((Integer) obj2).intValue());
        }
    }

    /* renamed from: j00.i$g */
    public class C17698g extends Property<ProgressBar, Integer> {
        public C17698g() {
            super(Integer.class, "progress");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((ProgressBar) obj).getProgress());
        }

        public final void set(Object obj, Object obj2) {
            ((ProgressBar) obj).setProgress(((Integer) obj2).intValue());
        }
    }

    /* renamed from: j00.i$h */
    public class C17699h extends Property<View, Integer> {
        public C17699h() {
            super(Integer.class, "scrollX");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((View) obj).getScrollX());
        }

        public final void set(Object obj, Object obj2) {
            ((View) obj).setScrollX(((Integer) obj2).intValue());
        }
    }

    /* renamed from: j00.i$i */
    public class C17700i extends Property<View, Integer> {
        public C17700i() {
            super(Integer.class, "scrollY");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((View) obj).getScrollY());
        }

        public final void set(Object obj, Object obj2) {
            ((View) obj).setScrollY(((Integer) obj2).intValue());
        }
    }

    /* renamed from: j00.i$j */
    public class C17701j extends Property<C17529h, Integer> {
        public C17701j() {
            super(Integer.class, "scroll");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((C17529h) obj).getScroll());
        }

        public final void set(Object obj, Object obj2) {
            ((C17529h) obj).setScroll(((Integer) obj2).intValue());
        }
    }

    /* renamed from: j00.i$k */
    public class C17702k extends Property<TextView, Integer> {
        public C17702k() {
            super(Integer.class, "textColor");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((TextView) obj).getCurrentTextColor());
        }

        public final void set(Object obj, Object obj2) {
            ((TextView) obj).setTextColor(((Integer) obj2).intValue());
        }
    }

    static {
        new C17696e();
        new C17697f();
        new C17699h();
        new C17700i();
        new C17701j();
        new C17692a();
    }
}
