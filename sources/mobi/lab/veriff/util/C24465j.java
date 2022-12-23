package mobi.lab.veriff.util;

/* renamed from: mobi.lab.veriff.util.j */
public class C24465j implements LogAccess {

    /* renamed from: b */
    private final String f61926b;

    private C24465j(String str) {
        this.f61926b = str;
    }

    /* renamed from: a */
    public static C24465j m61537a(Object obj) {
        return m61536a((Class) obj.getClass());
    }

    /* renamed from: d */
    public void mo60705d(String str) {
        mo60706d(str, (Throwable) null);
    }

    /* renamed from: d */
    public void mo60653d(String str, String str2, Throwable th) {
    }

    /* renamed from: e */
    public void mo60707e(String str) {
        mo60708e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo60654e(String str, String str2, Throwable th) {
    }

    /* renamed from: i */
    public void mo60709i(String str) {
        mo60710i(str, (Throwable) null);
    }

    /* renamed from: i */
    public void mo60655i(String str, String str2, Throwable th) {
    }

    /* renamed from: w */
    public void mo60711w(String str) {
        mo60712w(str, (Throwable) null);
    }

    /* renamed from: w */
    public void mo60656w(String str, String str2, Throwable th) {
    }

    /* renamed from: a */
    public static C24465j m61536a(Class cls) {
        return m61538a(cls.getSimpleName());
    }

    /* renamed from: d */
    public void mo60706d(String str, Throwable th) {
        mo60653d(this.f61926b, str, th);
    }

    /* renamed from: e */
    public void mo60708e(String str, Throwable th) {
        mo60654e(this.f61926b, str, th);
    }

    /* renamed from: i */
    public void mo60710i(String str, Throwable th) {
        mo60655i(this.f61926b, str, th);
    }

    /* renamed from: w */
    public void mo60712w(String str, Throwable th) {
        mo60656w(this.f61926b, str, th);
    }

    /* renamed from: a */
    public static C24465j m61538a(String str) {
        return new C24465j(str);
    }
}
