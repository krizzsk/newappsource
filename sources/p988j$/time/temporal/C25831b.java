package p988j$.time.temporal;

/* renamed from: j$.time.temporal.b */
public enum C25831b implements C25846q {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a */
    private final String f64424a;

    private C25831b(String str) {
        this.f64424a = str;
    }

    /* renamed from: a */
    public final C25840k mo83780a(C25840k kVar, long j) {
        return kVar.mo83613e(j, this);
    }

    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public final String toString() {
        return this.f64424a;
    }
}
