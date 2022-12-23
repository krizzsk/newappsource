package mobi.lab.veriff.data;

import android.graphics.Color;
import mobi.lab.veriff.C24418a;

@Deprecated
public class Branding {

    /* renamed from: a */
    private final int f61787a;

    /* renamed from: b */
    private final int f61788b;

    /* renamed from: c */
    private final int f61789c;

    /* renamed from: d */
    private final Integer f61790d;

    /* renamed from: e */
    private final int f61791e;

    /* renamed from: f */
    private final int f61792f;

    /* renamed from: g */
    private final float f61793g;

    /* renamed from: h */
    private final int f61794h;

    /* renamed from: i */
    private final DrawableProvider f61795i;

    /* renamed from: j */
    private final int f61796j;

    /* renamed from: k */
    private final int f61797k;

    @Deprecated
    public static class Builder {

        /* renamed from: a */
        private int f61798a = Color.parseColor("#004e5f");

        /* renamed from: b */
        private int f61799b = Color.parseColor("#00b4aa");

        /* renamed from: c */
        private int f61800c = Color.parseColor("#ffffff");

        /* renamed from: d */
        private float f61801d = 4.0f;

        /* renamed from: e */
        private int f61802e = C24418a.f61782a;

        /* renamed from: g */
        private int f61803g = C24418a.f61783b;

        /* renamed from: h */
        private int f61804h = C24418a.f61784c;

        /* renamed from: i */
        private Integer f61805i = null;

        /* renamed from: j */
        private int f61806j = Color.parseColor("#222328");

        /* renamed from: k */
        private int f61807k = Color.parseColor("#505366");

        public Branding build() {
            int i;
            Integer num = this.f61805i;
            if (num != null) {
                i = num.intValue();
            } else {
                i = this.f61800c;
            }
            return new Branding(this.f61798a, this.f61799b, this.f61800c, Integer.valueOf(i), this.f61806j, this.f61807k, this.f61801d, this.f61802e, (DrawableProvider) null, this.f61803g, this.f61804h);
        }
    }

    public int getBackgroundColor() {
        return this.f61789c;
    }

    public int getBulletPoint() {
        return this.f61796j;
    }

    public float getButtonCornerRadius() {
        return this.f61793g;
    }

    public int getNotificationIcon() {
        return this.f61797k;
    }

    public int getPrimaryTextColor() {
        return this.f61791e;
    }

    public int getSecondaryColor() {
        return this.f61788b;
    }

    public int getSecondaryTextColor() {
        return this.f61792f;
    }

    public int getStatusBarColor() {
        return this.f61790d.intValue();
    }

    public int getThemeColor() {
        return this.f61787a;
    }

    public int getToolbarIcon() {
        return this.f61794h;
    }

    public DrawableProvider getToolbarIconDrawableProvider() {
        return this.f61795i;
    }

    private Branding(int i, int i2, int i3, Integer num, int i4, int i5, float f, int i6, DrawableProvider drawableProvider, int i7, int i8) {
        this.f61787a = i;
        this.f61788b = i2;
        this.f61789c = i3;
        this.f61790d = num;
        this.f61791e = i4;
        this.f61792f = i5;
        this.f61793g = f;
        this.f61794h = i6;
        this.f61795i = drawableProvider;
        this.f61796j = i7;
        this.f61797k = i8;
    }
}
