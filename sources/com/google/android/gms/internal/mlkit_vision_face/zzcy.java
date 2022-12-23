package com.google.android.gms.internal.mlkit_vision_face;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0016g;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;
import p789se.C19451e;

final class zzcy implements C19450d {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final C19448b zzf;
    private static final C19448b zzg;
    private static final C19449c<Map.Entry<Object, Object>> zzh = zzcx.zza;
    private OutputStream zzb;
    private final Map<Class<?>, C19449c<?>> zzc;
    private final Map<Class<?>, C19451e<?>> zzd;
    private final C19449c<Object> zze;

    static {
        zzcw f = C13715c.m34240f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzf = new C19448b(LinksConfiguration.KEY_KEY, C16530d.m42017j(hashMap));
        zzcw f2 = C13715c.m34240f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzg = new C19448b("value", C16530d.m42017j(hashMap2));
    }

    public zzcy(OutputStream outputStream, Map<Class<?>, C19449c<?>> map, Map<Class<?>, C19451e<?>> map2, C19449c<Object> cVar) {
        this.zzb = outputStream;
        this.zzc = map;
        this.zzd = map2;
        this.zze = cVar;
    }

    public static final /* synthetic */ void zze(Map.Entry entry, C19450d dVar) throws IOException {
        dVar.add(zzf, entry.getKey());
        dVar.add(zzg, entry.getValue());
    }

    private final <T> zzcy zzf(C19449c<T> cVar, C19448b bVar, T t) throws IOException {
        long zzg2 = zzg(cVar, t);
        if (zzg2 == 0) {
            return this;
        }
        zzl((zzj(bVar) << 3) | 2);
        zzm(zzg2);
        cVar.encode(t, this);
        return this;
    }

    private final <T> long zzg(C19449c<T> cVar, T t) throws IOException {
        OutputStream outputStream;
        zzct zzct = new zzct();
        try {
            outputStream = this.zzb;
            this.zzb = zzct;
            cVar.encode(t, this);
            this.zzb = outputStream;
            long zza2 = zzct.zza();
            zzct.close();
            return zza2;
        } catch (Throwable th) {
            try {
                zzct.close();
            } catch (Throwable th2) {
                zzcq.zza(th, th2);
            }
            throw th;
        }
    }

    private final <T> zzcy zzh(C19451e<T> eVar, C19448b bVar, T t) throws IOException {
        eVar.encode(t, new zzdc(bVar, this));
        return this;
    }

    private static ByteBuffer zzi(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int zzj(C19448b bVar) {
        zzcw zzcw = (zzcw) bVar.mo51855a(zzcw.class);
        if (zzcw != null) {
            return zzcw.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static zzcw zzk(C19448b bVar) {
        zzcw zzcw = (zzcw) bVar.mo51855a(zzcw.class);
        if (zzcw != null) {
            return zzcw;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final void zzl(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.zzb.write((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            i >>>= 7;
        }
        this.zzb.write(i & 127);
    }

    private final void zzm(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.zzb.write((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            j >>>= 7;
        }
        this.zzb.write(((int) j) & 127);
    }

    public final C19450d add(C19448b bVar, double d) throws IOException {
        if (d == 0.0d) {
            return this;
        }
        zzl((zzj(bVar) << 3) | 1);
        this.zzb.write(zzi(8).putDouble(d).array());
        return this;
    }

    public final /* bridge */ /* synthetic */ C19450d add(C19448b bVar, int i) throws IOException {
        zza(bVar, i);
        return this;
    }

    public final /* bridge */ /* synthetic */ C19450d add(C19448b bVar, long j) throws IOException {
        zzb(bVar, j);
        return this;
    }

    public final /* bridge */ /* synthetic */ C19450d add(C19448b bVar, boolean z) throws IOException {
        zzc(bVar, z);
        return this;
    }

    public final C19450d inline(Object obj) throws IOException {
        zzd(obj);
        return this;
    }

    public final C19450d nested(C19448b bVar) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final zzcy zza(C19448b bVar, int i) throws IOException {
        if (i == 0) {
            return this;
        }
        zzcw zzk = zzk(bVar);
        zzcv zzcv = zzcv.DEFAULT;
        int ordinal = zzk.zzb().ordinal();
        if (ordinal == 0) {
            zzl(zzk.zza() << 3);
            zzl(i);
        } else if (ordinal == 1) {
            zzl(zzk.zza() << 3);
            zzl((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            zzl((zzk.zza() << 3) | 5);
            this.zzb.write(zzi(4).putInt(i).array());
        }
        return this;
    }

    public final zzcy zzb(C19448b bVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        zzcw zzk = zzk(bVar);
        zzcv zzcv = zzcv.DEFAULT;
        int ordinal = zzk.zzb().ordinal();
        if (ordinal == 0) {
            zzl(zzk.zza() << 3);
            zzm(j);
        } else if (ordinal == 1) {
            zzl(zzk.zza() << 3);
            zzm((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            zzl((zzk.zza() << 3) | 1);
            this.zzb.write(zzi(8).putLong(j).array());
        }
        return this;
    }

    public final zzcy zzc(C19448b bVar, boolean z) throws IOException {
        if (!z) {
            return this;
        }
        zza(bVar, 1);
        return this;
    }

    public final zzcy zzd(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        C19449c cVar = this.zzc.get(obj.getClass());
        if (cVar != null) {
            cVar.encode(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new EncodingException(C0016g.m31o(new StringBuilder(valueOf.length() + 15), "No encoder for ", valueOf));
    }

    public final C19450d nested(String str) throws IOException {
        return nested(C19448b.m46849b(str));
    }

    public final C19450d add(C19448b bVar, float f) throws IOException {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        zzl((zzj(bVar) << 3) | 5);
        this.zzb.write(zzi(4).putFloat(f).array());
        return this;
    }

    public final C19450d add(C19448b bVar, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == 0) {
                return this;
            }
            zzl((zzj(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzl(bytes.length);
            this.zzb.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object add : (Collection) obj) {
                add(bVar, add);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry zzf2 : ((Map) obj).entrySet()) {
                zzf(zzh, bVar, zzf2);
            }
            return this;
        } else if (obj instanceof Double) {
            add(bVar, ((Double) obj).doubleValue());
            return this;
        } else if (obj instanceof Float) {
            add(bVar, ((Float) obj).floatValue());
            return this;
        } else if (obj instanceof Number) {
            zzb(bVar, ((Number) obj).longValue());
            return this;
        } else if (obj instanceof Boolean) {
            zzc(bVar, ((Boolean) obj).booleanValue());
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                return this;
            }
            zzl((zzj(bVar) << 3) | 2);
            zzl(length);
            this.zzb.write(bArr);
            return this;
        } else {
            C19449c cVar = this.zzc.get(obj.getClass());
            if (cVar != null) {
                zzf(cVar, bVar, obj);
                return this;
            }
            C19451e eVar = this.zzd.get(obj.getClass());
            if (eVar != null) {
                zzh(eVar, bVar, obj);
                return this;
            } else if (obj instanceof zzcu) {
                zza(bVar, ((zzcu) obj).zza());
                return this;
            } else if (obj instanceof Enum) {
                zza(bVar, ((Enum) obj).ordinal());
                return this;
            } else {
                zzf(this.zze, bVar, obj);
                return this;
            }
        }
    }

    public final C19450d add(String str, double d) throws IOException {
        add(C19448b.m46849b(str), d);
        return this;
    }

    public final C19450d add(String str, int i) throws IOException {
        zza(C19448b.m46849b(str), i);
        return this;
    }

    public final C19450d add(String str, long j) throws IOException {
        zzb(C19448b.m46849b(str), j);
        return this;
    }

    public final C19450d add(String str, Object obj) throws IOException {
        add(C19448b.m46849b(str), obj);
        return this;
    }

    public final C19450d add(String str, boolean z) throws IOException {
        zzc(C19448b.m46849b(str), z);
        return this;
    }
}
