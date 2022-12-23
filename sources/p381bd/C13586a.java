package p381bd;

import com.google.android.play.core.install.InstallState;

/* renamed from: bd.a */
public final class C13586a extends InstallState {

    /* renamed from: a */
    public final int f33556a;

    /* renamed from: b */
    public final long f33557b;

    /* renamed from: c */
    public final long f33558c;

    /* renamed from: d */
    public final int f33559d;

    /* renamed from: e */
    public final String f33560e;

    public C13586a(int i, int i2, long j, long j2, String str) {
        this.f33556a = i;
        this.f33557b = j;
        this.f33558c = j2;
        this.f33559d = i2;
        if (str != null) {
            this.f33560e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final long mo40477a() {
        return this.f33557b;
    }

    /* renamed from: b */
    public final int mo40478b() {
        return this.f33559d;
    }

    /* renamed from: c */
    public final int mo40479c() {
        return this.f33556a;
    }

    /* renamed from: d */
    public final String mo40480d() {
        return this.f33560e;
    }

    /* renamed from: e */
    public final long mo40481e() {
        return this.f33558c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f33556a == installState.mo40479c() && this.f33557b == installState.mo40477a() && this.f33558c == installState.mo40481e() && this.f33559d == installState.mo40478b() && this.f33560e.equals(installState.mo40480d())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f33556a;
        long j = this.f33557b;
        long j2 = this.f33558c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f33559d) * 1000003) ^ this.f33560e.hashCode();
    }

    public final String toString() {
        int i = this.f33556a;
        long j = this.f33557b;
        long j2 = this.f33558c;
        int i2 = this.f33559d;
        String str = this.f33560e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
