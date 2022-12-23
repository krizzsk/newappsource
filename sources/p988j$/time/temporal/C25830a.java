package p988j$.time.temporal;

/* renamed from: j$.time.temporal.a */
public enum C25830a implements C25842m {
    NANO_OF_SECOND("NanoOfSecond", C25848s.m64629i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", C25848s.m64629i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", C25848s.m64629i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", C25848s.m64629i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", C25848s.m64629i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", C25848s.m64629i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", C25848s.m64629i(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", C25848s.m64629i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", C25848s.m64629i(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", C25848s.m64629i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", C25848s.m64629i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", C25848s.m64629i(1, 12)),
    HOUR_OF_DAY("HourOfDay", C25848s.m64629i(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", C25848s.m64629i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", C25848s.m64629i(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", C25848s.m64629i(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", C25848s.m64629i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", C25848s.m64629i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", C25848s.m64631k(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", C25848s.m64631k(365, 366)),
    EPOCH_DAY("EpochDay", C25848s.m64629i(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", C25848s.m64631k(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", C25848s.m64629i(1, 53)),
    PROLEPTIC_MONTH("ProlepticMonth", C25848s.m64629i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", C25848s.m64631k(999999999, 1000000000)),
    YEAR("Year", C25848s.m64629i(-999999999, 999999999), 0),
    ERA("Era", C25848s.m64629i(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", C25848s.m64629i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", C25848s.m64629i(-64800, 64800));
    

    /* renamed from: a */
    private final String f64421a;

    /* renamed from: b */
    private final C25848s f64422b;

    private C25830a(String str, C25848s sVar) {
        this.f64421a = str;
        this.f64422b = sVar;
    }

    private C25830a(String str, C25848s sVar, int i) {
        this.f64421a = str;
        this.f64422b = sVar;
    }

    /* renamed from: a */
    public final boolean mo83770a(C25841l lVar) {
        return lVar.mo83603f(this);
    }

    /* renamed from: b */
    public final C25848s mo83771b(C25841l lVar) {
        return lVar.mo83602d(this);
    }

    /* renamed from: c */
    public final C25848s mo83772c() {
        return this.f64422b;
    }

    /* renamed from: d */
    public final long mo83773d(C25841l lVar) {
        return lVar.mo83604g(this);
    }

    /* renamed from: e */
    public final C25840k mo83774e(C25840k kVar, long j) {
        return kVar.mo83609a(j, this);
    }

    /* renamed from: f */
    public final int mo83775f(long j) {
        return this.f64422b.mo83788a(j, this);
    }

    /* renamed from: g */
    public final void mo83776g(long j) {
        this.f64422b.mo83789b(j, this);
    }

    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final String toString() {
        return this.f64421a;
    }
}
