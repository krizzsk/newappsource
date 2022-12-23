package p988j$.time.format;

/* renamed from: j$.time.format.l */
enum C25807l implements C25802g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        return true;
    }

    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
