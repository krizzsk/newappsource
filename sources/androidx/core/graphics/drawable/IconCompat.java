package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.appboy.support.AppboyFileUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f3343k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3344a;

    /* renamed from: b */
    public Object f3345b;

    /* renamed from: c */
    public byte[] f3346c;

    /* renamed from: d */
    public Parcelable f3347d;

    /* renamed from: e */
    public int f3348e;

    /* renamed from: f */
    public int f3349f;

    /* renamed from: g */
    public ColorStateList f3350g;

    /* renamed from: h */
    public PorterDuff.Mode f3351h;

    /* renamed from: i */
    public String f3352i;

    /* renamed from: j */
    public String f3353j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C0774a {
        /* renamed from: a */
        public static int m2344a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0776c.m2352a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        /* renamed from: b */
        public static String m2345b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0776c.m2353b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public static int m2346c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0776c.m2354c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                Objects.toString(obj);
                return -1;
            } catch (InvocationTargetException unused2) {
                Objects.toString(obj);
                return -1;
            } catch (NoSuchMethodException unused3) {
                Objects.toString(obj);
                return -1;
            }
        }

        /* renamed from: d */
        public static Uri m2347d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0776c.m2355d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: e */
        public static Drawable m2348e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: f */
        public static Icon m2349f(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f3344a) {
                case -1:
                    return (Icon) iconCompat.f3345b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f3345b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.mo3429e(), iconCompat.f3348e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f3345b, iconCompat.f3348e, iconCompat.f3349f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f3345b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.m2334a((Bitmap) iconCompat.f3345b, false));
                        break;
                    } else {
                        icon = C0775b.m2351b((Bitmap) iconCompat.f3345b);
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        icon = C0777d.m2356a(iconCompat.mo3431h());
                        break;
                    } else if (context != null) {
                        InputStream i2 = iconCompat.mo3432i(context);
                        if (i2 != null) {
                            if (i < 26) {
                                icon = Icon.createWithBitmap(IconCompat.m2334a(BitmapFactory.decodeStream(i2), false));
                                break;
                            } else {
                                icon = C0775b.m2351b(BitmapFactory.decodeStream(i2));
                                break;
                            }
                        } else {
                            StringBuilder k = C13555b.m33972k("Cannot load adaptive icon from uri: ");
                            k.append(iconCompat.mo3431h());
                            throw new IllegalStateException(k.toString());
                        }
                    } else {
                        StringBuilder k2 = C13555b.m33972k("Context is required to resolve the file uri of the icon: ");
                        k2.append(iconCompat.mo3431h());
                        throw new IllegalArgumentException(k2.toString());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f3350g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3351h;
            if (mode != IconCompat.f3343k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    public static class C0775b {
        /* renamed from: a */
        public static Drawable m2350a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        public static Icon m2351b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    public static class C0776c {
        /* renamed from: a */
        public static int m2352a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        public static String m2353b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        public static int m2354c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        public static Uri m2355d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    public static class C0777d {
        /* renamed from: a */
        public static Icon m2356a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3344a = -1;
        this.f3346c = null;
        this.f3347d = null;
        this.f3348e = 0;
        this.f3349f = 0;
        this.f3350g = null;
        this.f3351h = f3343k;
        this.f3352i = null;
    }

    /* renamed from: a */
    public static Bitmap m2334a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m2335b(Resources resources, String str, int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3348e = i;
            if (resources != null) {
                try {
                    iconCompat.f3345b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3345b = str;
            }
            iconCompat.f3353j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: f */
    public static Resources m2336f(Context context, String str) {
        if (MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", new Object[]{str});
            return null;
        }
    }

    /* renamed from: c */
    public final Bitmap mo3427c() {
        int i = this.f3344a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f3345b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f3345b;
        } else {
            if (i == 5) {
                return m2334a((Bitmap) this.f3345b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: d */
    public final int mo3428d() {
        int i = this.f3344a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0774a.m2344a(this.f3345b);
        }
        if (i == 2) {
            return this.f3348e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: e */
    public final String mo3429e() {
        int i = this.f3344a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0774a.m2345b(this.f3345b);
        }
        if (i == 2) {
            String str = this.f3353j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f3345b).split(":", -1)[0];
            }
            return this.f3353j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: g */
    public final int mo3430g() {
        int i = this.f3344a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            return i;
        }
        return C0774a.m2346c(this.f3345b);
    }

    /* renamed from: h */
    public final Uri mo3431h() {
        int i = this.f3344a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0774a.m2347d(this.f3345b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3345b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: i */
    public final InputStream mo3432i(Context context) {
        Uri h = mo3431h();
        String scheme = h.getScheme();
        if ("content".equals(scheme) || AppboyFileUtils.FILE_SCHEME.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h);
            } catch (Exception unused) {
                h.toString();
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3345b));
            } catch (FileNotFoundException unused2) {
                h.toString();
                return null;
            }
        }
    }

    /* renamed from: j */
    public final Icon mo3433j(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0774a.m2349f(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f3344a == -1) {
            return String.valueOf(this.f3345b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f3344a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f3344a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3345b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3345b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3353j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo3428d())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3348e);
                if (this.f3349f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3349f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3345b);
                break;
        }
        if (this.f3350g != null) {
            sb.append(" tint=");
            sb.append(this.f3350g);
        }
        if (this.f3351h != f3343k) {
            sb.append(" mode=");
            sb.append(this.f3351h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f3346c = null;
        this.f3347d = null;
        this.f3348e = 0;
        this.f3349f = 0;
        this.f3350g = null;
        this.f3351h = f3343k;
        this.f3352i = null;
        this.f3344a = i;
    }
}
