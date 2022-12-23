package com.cubic.umo.pass.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¨\u0006\u000e"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/VisualValidationRequest;", "", "", "eventId", "timeStamp", "", "deviceId", "qrCode", "", "latitude", "longitude", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;DD)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class VisualValidationRequest {

    /* renamed from: a */
    public final String f8293a;

    /* renamed from: b */
    public final String f8294b;

    /* renamed from: c */
    public final long f8295c;

    /* renamed from: d */
    public final String f8296d;

    /* renamed from: e */
    public final double f8297e;

    /* renamed from: f */
    public final double f8298f;

    public VisualValidationRequest(String str, @C12943g(name = "when") String str2, long j, @C12943g(name = "qr") String str3, double d, double d2) {
        C13437d.m33711q(str, "eventId", str2, "timeStamp", str3, "qrCode");
        this.f8293a = str;
        this.f8294b = str2;
        this.f8295c = j;
        this.f8296d = str3;
        this.f8297e = d;
        this.f8298f = d2;
    }

    @C12943g(name = "liveEvent")
    public static /* synthetic */ void isLiveEvent$annotations() {
    }

    public final VisualValidationRequest copy(String str, @C12943g(name = "when") String str2, long j, @C12943g(name = "qr") String str3, double d, double d2) {
        C24362h.m61211f(str, "eventId");
        C24362h.m61211f(str2, "timeStamp");
        String str4 = str3;
        C24362h.m61211f(str4, "qrCode");
        return new VisualValidationRequest(str, str2, j, str4, d, d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualValidationRequest)) {
            return false;
        }
        VisualValidationRequest visualValidationRequest = (VisualValidationRequest) obj;
        return C24362h.m61206a(this.f8293a, visualValidationRequest.f8293a) && C24362h.m61206a(this.f8294b, visualValidationRequest.f8294b) && this.f8295c == visualValidationRequest.f8295c && C24362h.m61206a(this.f8296d, visualValidationRequest.f8296d) && C24362h.m61206a(Double.valueOf(this.f8297e), Double.valueOf(visualValidationRequest.f8297e)) && C24362h.m61206a(Double.valueOf(this.f8298f), Double.valueOf(visualValidationRequest.f8298f));
    }

    public final int hashCode() {
        int d = C13715c.m34238d(this.f8294b, this.f8293a.hashCode() * 31, 31);
        long j = this.f8295c;
        int d2 = C13715c.m34238d(this.f8296d, (d + ((int) (j ^ (j >>> 32)))) * 31, 31);
        long doubleToLongBits = Double.doubleToLongBits(this.f8297e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f8298f);
        return ((d2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("VisualValidationRequest(eventId=");
        k.append(this.f8293a);
        k.append(", timeStamp=");
        k.append(this.f8294b);
        k.append(", deviceId=");
        k.append(this.f8295c);
        k.append(", qrCode=");
        k.append(this.f8296d);
        k.append(", latitude=");
        k.append(this.f8297e);
        k.append(", longitude=");
        k.append(this.f8298f);
        k.append(')');
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VisualValidationRequest(String str, String str2, long j, String str3, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? 0.0d : d2);
    }
}
