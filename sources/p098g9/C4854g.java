package p098g9;

/* renamed from: g9.g */
public final class C4854g implements C4850c {
    /* renamed from: a */
    public final String mo20340a(String str) {
        if (!str.startsWith("lib") || !str.endsWith(".so")) {
            return System.mapLibraryName(str);
        }
        return str;
    }
}
