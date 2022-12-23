package com.moovit.util.time;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import c00.C13717b;
import ce0.C21100e;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p824tp.C19744v;
import p824tp.C19746x;
import p977zz.C20930c;
import p977zz.C20950l0;

public final class MinutesSpanFormatter {

    /* renamed from: b */
    public static final Set f23890b = Collections.singleton(new RelativeSizeSpan(0.4f));

    /* renamed from: a */
    public final SpanSystem f23891a;

    public enum SpanSystem {
        REGULAR {
            public CharSequence formatAccessibilitySpan(Context context, long j) {
                return super.formatAccessibilitySpan(context, Math.max(1, j));
            }

            public CharSequence formatSpan(Context context, long j) {
                return super.formatSpan(context, Math.max(1, j));
            }
        },
        PASSIVE {
            public CharSequence formatAccessibilitySpan(Context context, long j) {
                if (j == 0) {
                    return context.getText(C19746x.voice_over_stationview_line_due);
                }
                return super.formatAccessibilitySpan(context, j);
            }

            public CharSequence formatSpan(Context context, long j) {
                if (j == 0) {
                    return context.getText(C19746x.minutes_span_passive_zero);
                }
                return super.formatSpan(context, j);
            }

            public CharSequence getSpanUnit(Context context, long j) {
                if (j == 0) {
                    return null;
                }
                return super.getSpanUnit(context, j);
            }
        },
        ACTIVE {
            public CharSequence formatAccessibilitySpan(Context context, long j) {
                if (j == 0) {
                    return context.getText(C19746x.voice_over_stationview_line_due);
                }
                return super.formatAccessibilitySpan(context, j);
            }

            public CharSequence formatSpan(Context context, long j) {
                if (j == 0) {
                    return context.getText(C19746x.minutes_span_active_zero);
                }
                return super.formatSpan(context, j);
            }

            public CharSequence getSpanUnit(Context context, long j) {
                if (j == 0) {
                    return null;
                }
                return super.getSpanUnit(context, j);
            }
        };

        public CharSequence formatAccessibilitySpan(Context context, long j) {
            Locale b = C20930c.m49020b(context);
            return context.getString(C19746x.voice_over_home_line_arrival_time, new Object[]{String.format(b, "%d", new Object[]{Long.valueOf(j)})});
        }

        public CharSequence formatSpan(Context context, long j) {
            return String.format(C20930c.m49020b(context), "%d", new Object[]{Long.valueOf(j)});
        }

        public CharSequence getSpanUnit(Context context, long j) {
            return context.getResources().getQuantityString(C19744v.unit_minutes_span, (int) j);
        }
    }

    public MinutesSpanFormatter(SpanSystem spanSystem) {
        C21100e.m49373x(spanSystem, "spanSystem");
        this.f23891a = spanSystem;
    }

    /* renamed from: a */
    public final SpannableStringBuilder mo24601a(Context context, long j, long j2, long j3, Collection collection) {
        int i;
        CharSequence charSequence;
        long n = C7925b.m18026n(j, j2);
        SpannableStringBuilder spannableStringBuilder = null;
        if (n <= j3 && n >= 0) {
            if (i < 0) {
                charSequence = null;
            } else {
                charSequence = this.f23891a.formatAccessibilitySpan(context, n);
            }
            if (charSequence != null) {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
                SpannableString j4 = mo24610j(context, n, collection);
                if (j4 != null) {
                    spannableStringBuilder.append(' ');
                    spannableStringBuilder.append(j4);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public final SpannableStringBuilder mo24602b(Context context, long j) {
        return mo24603c(context, j, Collections.emptySet());
    }

    /* renamed from: c */
    public final SpannableStringBuilder mo24603c(Context context, long j, Collection collection) {
        CharSequence i = mo24609i(context, j);
        if (i == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i);
        SpannableString j2 = mo24610j(context, j, collection);
        if (j2 != null) {
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append(j2);
        }
        return spannableStringBuilder;
    }

    /* renamed from: d */
    public final SpannableStringBuilder mo24604d(Context context, C20950l0 l0Var, TimeUnit timeUnit) {
        long minutes = timeUnit.toMinutes((long) ((Integer) l0Var.f52695a).intValue());
        long minutes2 = timeUnit.toMinutes((long) ((Integer) l0Var.f52696b).intValue());
        List emptyList = Collections.emptyList();
        if (minutes2 <= minutes) {
            return mo24603c(context, minutes, emptyList);
        }
        CharSequence i = mo24609i(context, minutes);
        CharSequence i2 = mo24609i(context, minutes2);
        if (i == null || i2 == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(context.getString(C19746x.time_range, new Object[]{i, i2}));
        SpannableString j = mo24610j(context, minutes2, emptyList);
        if (j != null) {
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append(j);
        }
        return spannableStringBuilder;
    }

    /* renamed from: e */
    public final SpannableStringBuilder mo24605e(Context context, long j, long j2) {
        return mo24606f(context, j, j2, Long.MAX_VALUE, Collections.emptySet());
    }

    /* renamed from: f */
    public final SpannableStringBuilder mo24606f(Context context, long j, long j2, long j3, Collection collection) {
        long n = C7925b.m18026n(j, j2);
        if (n > j3 || n < 0) {
            return null;
        }
        return mo24603c(context, n, collection);
    }

    /* renamed from: g */
    public final SpannableStringBuilder mo24607g(Context context, long j, Collection collection) {
        return mo24606f(context, System.currentTimeMillis(), j, Long.MAX_VALUE, collection);
    }

    /* renamed from: h */
    public final SpannableStringBuilder mo24608h(Context context, long j, List list, long j2, Set set) {
        CharSequence i;
        Context context2 = context;
        if (C13717b.m34258e(list)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size());
        Iterator it = list.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            long n = C7925b.m18026n(j, ((Long) it.next()).longValue());
            if (0 <= n && n <= j2 && (i = mo24609i(context, n)) != null) {
                linkedHashSet.add(i);
                j3 = n;
            }
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CharSequence charSequence = (CharSequence) it2.next();
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(", ");
            }
            spannableStringBuilder.append(charSequence);
        }
        SpannableString j4 = mo24610j(context, j3, set);
        if (j4 != null) {
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append(j4);
        }
        return spannableStringBuilder;
    }

    /* renamed from: i */
    public final CharSequence mo24609i(Context context, long j) {
        if (j < 0) {
            return null;
        }
        return this.f23891a.formatSpan(context, j);
    }

    /* renamed from: j */
    public final SpannableString mo24610j(Context context, long j, Collection collection) {
        CharSequence spanUnit;
        if (j < 0 || (spanUnit = this.f23891a.getSpanUnit(context, j)) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(spanUnit);
        for (Object span : collection) {
            spannableString.setSpan(span, 0, spanUnit.length(), 33);
        }
        return spannableString;
    }
}
