package p988j$.time.temporal;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import p988j$.time.C25783b;
import p988j$.time.DayOfWeek;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.temporal.WeekFields */
public final class WeekFields implements Serializable {

    /* renamed from: e */
    private static final ConcurrentHashMap f64414e = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: f */
    public static final C25846q f64415f = C25839j.f64433d;

    /* renamed from: a */
    private final DayOfWeek f64416a;

    /* renamed from: b */
    private final int f64417b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final transient C25842m f64418c = C25849t.m64642i(this);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final transient C25842m f64419d;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        m64566d(DayOfWeek.SUNDAY, 1);
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        C25831b bVar = C25831b.NANOS;
        this.f64419d = C25849t.m64644k(this);
        C25849t.m64643j(this);
        if (dayOfWeek == null) {
            throw new NullPointerException("firstDayOfWeek");
        } else if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        } else {
            this.f64416a = dayOfWeek;
            this.f64417b = i;
        }
    }

    /* renamed from: d */
    public static WeekFields m64566d(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentHashMap concurrentHashMap = f64414e;
        WeekFields weekFields = (WeekFields) concurrentHashMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentHashMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentHashMap.get(str);
    }

    /* renamed from: of */
    public static WeekFields m64567of(Locale locale) {
        if (locale != null) {
            Calendar instance = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
            return m64566d(DayOfWeek.SUNDAY.mo83608k((long) (instance.getFirstDayOfWeek() - 1)), instance.getMinimalDaysInFirstWeek());
        }
        throw new NullPointerException("locale");
    }

    /* renamed from: c */
    public final int mo83765c() {
        return this.f64417b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f64416a;
    }

    public final int hashCode() {
        return (this.f64416a.ordinal() * 7) + this.f64417b;
    }

    public final String toString() {
        StringBuilder a = C25783b.m64414a("WeekFields[");
        a.append(this.f64416a);
        a.append(',');
        a.append(this.f64417b);
        a.append(']');
        return a.toString();
    }
}
