package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001,B\u0011\b\u0016\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*B-\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b)\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0018\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\bJ\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bR\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&¨\u0006-"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "Ljava/util/Calendar;", "component2", "component3", "component4", "documentNumber", "dateOfBirth", "dateOfExpiry", "confident", "copy", "isEmpty", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "toMrzInfo", "Z", "getConfident", "()Z", "Ljava/util/Calendar;", "getDateOfBirth", "()Ljava/util/Calendar;", "getDateOfExpiry", "Ljava/lang/String;", "getDocumentNumber", "()Ljava/lang/String;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz;", "mrz", "<init>", "(Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz;)V", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Z)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.rz */
public final class C22466rz implements Parcelable {
    public static final Parcelable.Creator<C22466rz> CREATOR = new C22468b();

    /* renamed from: a */
    public static final C22467a f56684a = new C22467a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C22466rz f56685f = new C22466rz((String) null, (Calendar) null, (Calendar) null, false);

    /* renamed from: b */
    private final String f56686b;

    /* renamed from: c */
    private final Calendar f56687c;

    /* renamed from: d */
    private final Calendar f56688d;

    /* renamed from: e */
    private final boolean f56689e;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/PendingMrzInfo$Companion;", "", "()V", "EMPTY", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "getEMPTY", "()Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rz$a */
    public static final class C22467a {
        private C22467a() {
        }

        public /* synthetic */ C22467a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C22466rz mo56569a() {
            return C22466rz.f56685f;
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rz$b */
    public static class C22468b implements Parcelable.Creator<C22466rz> {
        /* renamed from: a */
        public final C22466rz createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C22466rz(parcel.readString(), (Calendar) parcel.readSerializable(), (Calendar) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* renamed from: a */
        public final C22466rz[] newArray(int i) {
            return new C22466rz[i];
        }
    }

    public C22466rz(String str, Calendar calendar, Calendar calendar2, boolean z) {
        this.f56686b = str;
        this.f56687c = calendar;
        this.f56688d = calendar2;
        this.f56689e = z;
    }

    /* renamed from: a */
    public final C21960lf mo56559a() {
        Date time;
        Date time2;
        String str = this.f56686b;
        if (str != null) {
            Locale locale = Locale.US;
            C24362h.m61210e(locale, "Locale.US");
            String upperCase = str.toUpperCase(locale);
            C24362h.m61210e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            SimpleDateFormat a = C22470sa.f56694a;
            Calendar calendar = this.f56687c;
            if (!(calendar == null || (time = calendar.getTime()) == null)) {
                String format = a.format(time);
                C24362h.m61210e(format, "DATE_FORMAT.format(dateO…rth?.time ?: return null)");
                SimpleDateFormat a2 = C22470sa.f56694a;
                Calendar calendar2 = this.f56688d;
                if (!(calendar2 == null || (time2 = calendar2.getTime()) == null)) {
                    String format2 = a2.format(time2);
                    C24362h.m61210e(format2, "DATE_FORMAT.format(dateO…iry?.time ?: return null)");
                    C21960lf lfVar = new C21960lf(upperCase, format, format2);
                    if (this.f56689e) {
                        return lfVar;
                    }
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo56560b() {
        String str = this.f56686b;
        return (str == null || C25081h.m62831B(str)) && this.f56687c == null && this.f56688d == null;
    }

    /* renamed from: c */
    public final String mo56561c() {
        return this.f56686b;
    }

    /* renamed from: d */
    public final Calendar mo56562d() {
        return this.f56687c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Calendar mo56564e() {
        return this.f56688d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22466rz)) {
            return false;
        }
        C22466rz rzVar = (C22466rz) obj;
        return C24362h.m61206a(this.f56686b, rzVar.f56686b) && C24362h.m61206a(this.f56687c, rzVar.f56687c) && C24362h.m61206a(this.f56688d, rzVar.f56688d) && this.f56689e == rzVar.f56689e;
    }

    public int hashCode() {
        String str = this.f56686b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Calendar calendar = this.f56687c;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f56688d;
        if (calendar2 != null) {
            i = calendar2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f56689e;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("PendingMrzInfo(documentNumber=");
        k.append(this.f56686b);
        k.append(", dateOfBirth=");
        k.append(this.f56687c);
        k.append(", dateOfExpiry=");
        k.append(this.f56688d);
        k.append(", confident=");
        return C25541a.m63885p(k, this.f56689e, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f56686b);
        parcel.writeSerializable(this.f56687c);
        parcel.writeSerializable(this.f56688d);
        parcel.writeInt(this.f56689e ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.mo56806b();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22466rz(com.veriff.sdk.internal.C22561tq.C22566c r5) {
        /*
            r4 = this;
            java.lang.String r0 = "mrz"
            mf0.C24362h.m61211f(r5, r0)
            com.veriff.sdk.internal.tq$c$b r0 = r5.mo56786d()
            r1 = 0
            if (r0 == 0) goto L_0x0017
            com.veriff.sdk.internal.tq$c$b$a r0 = r0.mo56806b()
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.mo56810a()
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            com.veriff.sdk.internal.tq$c$b r2 = r5.mo56786d()
            if (r2 == 0) goto L_0x002f
            com.veriff.sdk.internal.tq$c$b$b r2 = r2.mo56805a()
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.mo56815a()
            if (r2 == 0) goto L_0x002f
            java.util.Calendar r2 = com.veriff.sdk.internal.C22470sa.m54781b((java.lang.String) r2)
            goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            com.veriff.sdk.internal.tq$c$b r3 = r5.mo56786d()
            if (r3 == 0) goto L_0x0046
            com.veriff.sdk.internal.tq$c$b$a r3 = r3.mo56806b()
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r3.mo56811b()
            if (r3 == 0) goto L_0x0046
            java.util.Calendar r1 = com.veriff.sdk.internal.C22470sa.m54781b((java.lang.String) r3)
        L_0x0046:
            boolean r5 = com.veriff.sdk.internal.C22470sa.m54782b((com.veriff.sdk.internal.C22561tq.C22566c) r5)
            r4.<init>(r0, r2, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22466rz.<init>(com.veriff.sdk.internal.tq$c):void");
    }
}
