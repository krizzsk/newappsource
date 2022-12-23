package com.moovit.util;

import android.content.Context;
import android.content.res.Resources;
import java.text.DecimalFormat;
import java.util.HashSet;
import p824tp.C19728f;
import p824tp.C19744v;
import p824tp.C19746x;

public final class DistanceUtils {

    /* renamed from: a */
    public static final C7882a f23847a = new C7882a();

    /* renamed from: b */
    public static final C7883b f23848b = new C7883b();

    public enum DistanceSystem {
        METRIC(1.0f, 1000, C19744v.metric_distance_primary, C19744v.metric_distance_primary_abbrev, C19744v.metric_distance_large, C19744v.metric_distance_large_abbrev, C19746x.metric_distance_large_frac, C19746x.metric_distance_large_frac_abbrev),
        IMPERIAL(0.9144f, 1760, C19744v.imperial_distance_primary, C19744v.imperial_distance_primary_abbrev, C19744v.imperial_distance_large, C19744v.imperial_distance_large_abbrev, C19746x.imperial_distance_large_frac, C19746x.imperial_distance_large_frac_abbrev);
        
        private final int distanceLarge;
        private final int distanceLargeAbbrev;
        private final int distanceLargeFrac;
        private final int distanceLargeFracAbbrev;
        private final int distancePrimary;
        private final int distancePrimaryAbbrev;
        private final int largeUnitSize;
        private final float toMetersCoef;

        private DistanceSystem(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.toMetersCoef = f;
            this.largeUnitSize = i;
            this.distancePrimary = i2;
            this.distancePrimaryAbbrev = i3;
            this.distanceLarge = i4;
            this.distanceLargeAbbrev = i5;
            this.distanceLargeFrac = i6;
            this.distanceLargeFracAbbrev = i7;
        }

        public int getDistanceLarge() {
            return this.distanceLarge;
        }

        public int getDistanceLargeAbbrev() {
            return this.distanceLargeAbbrev;
        }

        public int getDistanceLargeFrac() {
            return this.distanceLargeFrac;
        }

        public int getDistanceLargeFracAbbrev() {
            return this.distanceLargeFracAbbrev;
        }

        public int getDistancePrimary() {
            return this.distancePrimary;
        }

        public int getDistancePrimaryAbbrev() {
            return this.distancePrimaryAbbrev;
        }

        public int getLargeUnitSize() {
            return this.largeUnitSize;
        }

        public float getToMetersCoef() {
            return this.toMetersCoef;
        }
    }

    /* renamed from: com.moovit.util.DistanceUtils$a */
    public class C7882a extends ThreadLocal<DecimalFormat> {
        public final Object initialValue() {
            return new DecimalFormat("#.#");
        }
    }

    /* renamed from: com.moovit.util.DistanceUtils$b */
    public class C7883b extends ThreadLocal<DecimalFormat> {
        public final Object initialValue() {
            return new DecimalFormat("#");
        }
    }

    /* renamed from: a */
    public static String m17934a(int i, Context context) {
        String str;
        if (i >= m17935b(context).getLargeUnitSize()) {
            DistanceSystem b = m17935b(context);
            int distanceLargeAbbrev = b.getDistanceLargeAbbrev();
            int distanceLargeFracAbbrev = b.getDistanceLargeFracAbbrev();
            Resources resources = context.getResources();
            int largeUnitSize = m17935b(context).getLargeUnitSize();
            if (i % largeUnitSize == 0) {
                int i2 = i / largeUnitSize;
                return resources.getQuantityString(distanceLargeAbbrev, i2, new Object[]{Integer.valueOf(i2)});
            }
            double d = ((double) i) / ((double) largeUnitSize);
            if (i < largeUnitSize * 10) {
                str = ((DecimalFormat) f23847a.get()).format(d);
            } else {
                str = ((DecimalFormat) f23848b.get()).format(d);
            }
            return resources.getString(distanceLargeFracAbbrev, new Object[]{str});
        }
        if (i > 10) {
            i = ((i + 5) / 10) * 10;
        }
        return context.getResources().getQuantityString(m17935b(context).getDistancePrimaryAbbrev(), i, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: b */
    public static DistanceSystem m17935b(Context context) {
        HashSet hashSet = C19728f.f50164e;
        if (C19728f.f50164e.contains(Integer.valueOf(((C19728f) context.getSystemService("metro_context")).f50165a.f16140o.f15142b))) {
            return DistanceSystem.IMPERIAL;
        }
        return DistanceSystem.METRIC;
    }

    /* renamed from: c */
    public static float m17936c(Context context, float f) {
        return f / m17935b(context).getToMetersCoef();
    }
}
