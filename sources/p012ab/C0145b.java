package p012ab;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: ab.b */
public final class C0145b {

    /* renamed from: a */
    public final ByteArrayOutputStream f413a;

    /* renamed from: b */
    public final DataOutputStream f414b;

    public C0145b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f413a = byteArrayOutputStream;
        this.f414b = new DataOutputStream(byteArrayOutputStream);
    }
}
