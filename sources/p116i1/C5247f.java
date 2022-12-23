package p116i1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.camera.camera2.internal.C0509c;
import com.appboy.support.AppboyFileUtils;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.p982v1.XmlPullParserException;
import p116i1.C5240d;
import p129j1.C5355e;
import p229r1.C6232b;
import p241s0.C6306f;

/* renamed from: i1.f */
public final class C5247f {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f17365a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<C5251d, SparseArray<C5250c>> f17366b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f17367c = new Object();

    /* renamed from: i1.f$a */
    public static class C5248a {
        /* renamed from: a */
        public static Drawable m13264a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        public static Drawable m13265b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: i1.f$b */
    public static class C5249b {
        /* renamed from: a */
        public static int m13266a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        public static ColorStateList m13267b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: i1.f$c */
    public static class C5250c {

        /* renamed from: a */
        public final ColorStateList f17368a;

        /* renamed from: b */
        public final Configuration f17369b;

        /* renamed from: c */
        public final int f17370c;

        public C5250c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i;
            this.f17368a = colorStateList;
            this.f17369b = configuration;
            if (theme == null) {
                i = 0;
            } else {
                i = theme.hashCode();
            }
            this.f17370c = i;
        }
    }

    /* renamed from: i1.f$d */
    public static final class C5251d {

        /* renamed from: a */
        public final Resources f17371a;

        /* renamed from: b */
        public final Resources.Theme f17372b;

        public C5251d(Resources resources, Resources.Theme theme) {
            this.f17371a = resources;
            this.f17372b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5251d.class != obj.getClass()) {
                return false;
            }
            C5251d dVar = (C5251d) obj;
            if (!this.f17371a.equals(dVar.f17371a) || !C6232b.m14816a(this.f17372b, dVar.f17372b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C6232b.m14817b(this.f17371a, this.f17372b);
        }
    }

    /* renamed from: i1.f$e */
    public static abstract class C5252e {
        /* renamed from: a */
        public final void mo21012a(int i) {
            new Handler(Looper.getMainLooper()).post(new C5253g(i, 0, this));
        }

        /* renamed from: b */
        public final void mo21013b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new C0509c(4, this, typeface));
        }

        /* renamed from: c */
        public abstract void mo2199c(int i);

        /* renamed from: d */
        public abstract void mo2200d(Typeface typeface);
    }

    /* renamed from: a */
    public static int m13262a(Resources resources, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return C5249b.m13266a(resources, i, (Resources.Theme) null);
        }
        return resources.getColor(i);
    }

    /* renamed from: b */
    public static Typeface m13263b(Context context, int i, TypedValue typedValue, int i2, C5252e eVar, boolean z, boolean z2) {
        int i3 = i;
        TypedValue typedValue2 = typedValue;
        int i4 = i2;
        C5252e eVar2 = eVar;
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue2, true);
        CharSequence charSequence = typedValue2.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (charSequence2.startsWith("res/")) {
                int i5 = typedValue2.assetCookie;
                C6306f<String, Typeface> fVar = C5355e.f17654b;
                Typeface typeface2 = fVar.get(C5355e.m13431b(resources, i3, charSequence2, i5, i4));
                if (typeface2 != null) {
                    if (eVar2 != null) {
                        eVar2.mo21013b(typeface2);
                    }
                    typeface = typeface2;
                } else if (!z2) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(AppboyFileUtils.SHARED_PREFERENCES_FILENAME_SUFFIX)) {
                            C5240d.C5242b a = C5240d.m13258a(resources.getXml(i3), resources);
                            if (a != null) {
                                typeface = C5355e.m13430a(context, a, resources, i, charSequence2, typedValue2.assetCookie, i2, eVar, z);
                            } else if (eVar2 != null) {
                                eVar2.mo21012a(-3);
                            }
                        } else {
                            int i6 = typedValue2.assetCookie;
                            Typeface d = C5355e.f17653a.mo21137d(context, resources, i, charSequence2, i2);
                            if (d != null) {
                                fVar.put(C5355e.m13431b(resources, i3, charSequence2, i6, i4), d);
                            }
                            if (eVar2 != null) {
                                if (d != null) {
                                    eVar2.mo21013b(d);
                                } else {
                                    eVar2.mo21012a(-3);
                                }
                            }
                            typeface = d;
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        if (eVar2 != null) {
                            eVar2.mo21012a(-3);
                        }
                    }
                }
            } else if (eVar2 != null) {
                eVar2.mo21012a(-3);
            }
            if (typeface != null || eVar2 != null || z2) {
                return typeface;
            }
            StringBuilder k = C13555b.m33972k("Font resource ID #0x");
            k.append(Integer.toHexString(i));
            k.append(" could not be retrieved.");
            throw new Resources.NotFoundException(k.toString());
        }
        StringBuilder k2 = C13555b.m33972k("Resource \"");
        k2.append(resources.getResourceName(i3));
        k2.append("\" (");
        k2.append(Integer.toHexString(i));
        k2.append(") is not a Font: ");
        k2.append(typedValue2);
        throw new Resources.NotFoundException(k2.toString());
    }
}
