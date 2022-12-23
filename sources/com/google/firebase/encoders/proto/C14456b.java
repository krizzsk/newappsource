package com.google.firebase.encoders.proto;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;
import p789se.C19451e;
import p861ve.C20110a;
import p861ve.C20111b;
import p861ve.C20112c;
import p861ve.C20116f;

/* renamed from: com.google.firebase.encoders.proto.b */
public final class C14456b implements C19450d {

    /* renamed from: f */
    public static final Charset f36514f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C19448b f36515g;

    /* renamed from: h */
    public static final C19448b f36516h;

    /* renamed from: i */
    public static final C20112c f36517i = new C20112c();

    /* renamed from: a */
    public OutputStream f36518a;

    /* renamed from: b */
    public final Map<Class<?>, C19449c<?>> f36519b;

    /* renamed from: c */
    public final Map<Class<?>, C19451e<?>> f36520c;

    /* renamed from: d */
    public final C19449c<Object> f36521d;

    /* renamed from: e */
    public final C20116f f36522e = new C20116f(this);

    /* renamed from: com.google.firebase.encoders.proto.b$a */
    public static /* synthetic */ class C14457a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36523a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36523a = r0
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36523a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36523a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.encoders.proto.C14456b.C14457a.<clinit>():void");
        }
    }

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        C14455a aVar = new C14455a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(Protobuf.class, aVar);
        f36515g = new C19448b(LinksConfiguration.KEY_KEY, C16530d.m42017j(hashMap));
        C14455a aVar2 = new C14455a(2, intEncoding);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Protobuf.class, aVar2);
        f36516h = new C19448b("value", C16530d.m42017j(hashMap2));
    }

    public C14456b(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, C19449c cVar) {
        this.f36518a = byteArrayOutputStream;
        this.f36519b = map;
        this.f36520c = map2;
        this.f36521d = cVar;
    }

    /* renamed from: g */
    public static int m35983g(C19448b bVar) {
        Protobuf protobuf = (Protobuf) bVar.mo51855a(Protobuf.class);
        if (protobuf != null) {
            return ((C14455a) protobuf).f36512a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: a */
    public final C14456b mo43345a(C19448b bVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo43357h((m35983g(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f36514f);
            mo43357h(bytes.length);
            this.f36518a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object a : (Collection) obj) {
                mo43345a(bVar, a, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry f : ((Map) obj).entrySet()) {
                mo43356f(f36517i, bVar, f, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo43352b(bVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo43353c(bVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo43355e(bVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo43354d(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            mo43357h((m35983g(bVar) << 3) | 2);
            mo43357h(bArr.length);
            this.f36518a.write(bArr);
            return this;
        } else {
            C19449c cVar = this.f36519b.get(obj.getClass());
            if (cVar != null) {
                mo43356f(cVar, bVar, obj, z);
                return this;
            }
            C19451e eVar = this.f36520c.get(obj.getClass());
            if (eVar != null) {
                C20116f fVar = this.f36522e;
                fVar.f51032a = false;
                fVar.f51034c = bVar;
                fVar.f51033b = z;
                eVar.encode(obj, fVar);
                return this;
            } else if (obj instanceof C20111b) {
                mo43354d(bVar, ((C20111b) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo43354d(bVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                mo43356f(this.f36521d, bVar, obj, z);
                return this;
            }
        }
    }

    public final C19450d add(C19448b bVar, Object obj) throws IOException {
        mo43345a(bVar, obj, true);
        return this;
    }

    /* renamed from: b */
    public final void mo43352b(C19448b bVar, double d, boolean z) throws IOException {
        if (!z || d != 0.0d) {
            mo43357h((m35983g(bVar) << 3) | 1);
            this.f36518a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
        }
    }

    /* renamed from: c */
    public final void mo43353c(C19448b bVar, float f, boolean z) throws IOException {
        if (!z || f != BitmapDescriptorFactory.HUE_RED) {
            mo43357h((m35983g(bVar) << 3) | 5);
            this.f36518a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array());
        }
    }

    /* renamed from: d */
    public final void mo43354d(C19448b bVar, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            Protobuf protobuf = (Protobuf) bVar.mo51855a(Protobuf.class);
            if (protobuf != null) {
                C14455a aVar = (C14455a) protobuf;
                int i2 = C14457a.f36523a[aVar.f36513b.ordinal()];
                if (i2 == 1) {
                    mo43357h(aVar.f36512a << 3);
                    mo43357h(i);
                } else if (i2 == 2) {
                    mo43357h(aVar.f36512a << 3);
                    mo43357h((i << 1) ^ (i >> 31));
                } else if (i2 == 3) {
                    mo43357h((aVar.f36512a << 3) | 5);
                    this.f36518a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                }
            } else {
                throw new EncodingException("Field has no @Protobuf config");
            }
        }
    }

    /* renamed from: e */
    public final void mo43355e(C19448b bVar, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            Protobuf protobuf = (Protobuf) bVar.mo51855a(Protobuf.class);
            if (protobuf != null) {
                C14455a aVar = (C14455a) protobuf;
                int i = C14457a.f36523a[aVar.f36513b.ordinal()];
                if (i == 1) {
                    mo43357h(aVar.f36512a << 3);
                    mo43358i(j);
                } else if (i == 2) {
                    mo43357h(aVar.f36512a << 3);
                    mo43358i((j >> 63) ^ (j << 1));
                } else if (i == 3) {
                    mo43357h((aVar.f36512a << 3) | 1);
                    this.f36518a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                }
            } else {
                throw new EncodingException("Field has no @Protobuf config");
            }
        }
    }

    /* renamed from: f */
    public final void mo43356f(C19449c cVar, C19448b bVar, Object obj, boolean z) throws IOException {
        OutputStream outputStream;
        C20110a aVar = new C20110a();
        try {
            outputStream = this.f36518a;
            this.f36518a = aVar;
            cVar.encode(obj, this);
            this.f36518a = outputStream;
            long j = aVar.f51027b;
            aVar.close();
            if (!z || j != 0) {
                mo43357h((m35983g(bVar) << 3) | 2);
                mo43358i(j);
                cVar.encode(obj, this);
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: h */
    public final void mo43357h(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f36518a.write((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            i >>>= 7;
        }
        this.f36518a.write(i & 127);
    }

    /* renamed from: i */
    public final void mo43358i(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f36518a.write((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            j >>>= 7;
        }
        this.f36518a.write(((int) j) & 127);
    }

    public final C19450d add(C19448b bVar, double d) throws IOException {
        mo43352b(bVar, d, true);
        return this;
    }

    public final C19450d add(C19448b bVar, float f) throws IOException {
        mo43353c(bVar, f, true);
        return this;
    }

    public final C19450d add(C19448b bVar, int i) throws IOException {
        mo43354d(bVar, i, true);
        return this;
    }

    public final C19450d add(C19448b bVar, long j) throws IOException {
        mo43355e(bVar, j, true);
        return this;
    }

    public final C19450d add(C19448b bVar, boolean z) throws IOException {
        mo43354d(bVar, z ? 1 : 0, true);
        return this;
    }
}
