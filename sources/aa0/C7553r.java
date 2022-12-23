package aa0;

import android.content.Context;
import ce0.C21100e;
import com.moovit.commons.utils.DataUnit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.thrift.TBase;
import p693nz.C18648a;
import p693nz.C18650b;
import vi0.C25111a;
import xi0.C25276a;

/* renamed from: aa0.r */
public final class C7553r {

    /* renamed from: b */
    public static final C7553r f23033b = new C7553r();

    /* renamed from: c */
    public static final long f23034c = TimeUnit.DAYS.toMillis(30);

    /* renamed from: a */
    public final AtomicReference<C18650b<String>> f23035a = new AtomicReference<>((Object) null);

    /* renamed from: a */
    public final C18650b<String> mo23811a(Context context) throws Exception {
        C18650b<String> bVar = this.f23035a.get();
        if (bVar == null) {
            synchronized (this.f23035a) {
                bVar = this.f23035a.get();
                if (bVar == null) {
                    bVar = new C18650b<>(new File(new File(context.getFilesDir(), "stores"), "trip_plan"), Math.round(DataUnit.MiB.toBytes(10.0d)), true);
                    bVar.mo51042l();
                    this.f23035a.set(bVar);
                }
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public final String mo23812b(Context context, TBase<?, ?> tBase) {
        byte[] bArr;
        C21100e.m49355o();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            tBase.mo25202X0(new C25111a(new C25276a((OutputStream) byteArrayOutputStream)));
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        try {
            C18650b<String> a = mo23811a(context);
            String uuid = UUID.randomUUID().toString();
            a.put(uuid, new C18648a(System.currentTimeMillis() + f23034c, bArr));
            return uuid;
        } catch (Exception unused2) {
            return null;
        }
    }
}
