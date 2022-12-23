package p195o6;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.load.C2137a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import p007a6.C0085c;
import p007a6.C0086d;
import p007a6.C0087e;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4564b;
import p072e6.C4566d;
import p133j6.C5387b;
import p195o6.C5998c;
import p311x6.C7171h;
import p311x6.C7176l;

/* renamed from: o6.a */
public final class C5994a implements C1493f<ByteBuffer, C5998c> {

    /* renamed from: f */
    public static final C5995a f19152f = new C5995a();

    /* renamed from: g */
    public static final C5996b f19153g = new C5996b();

    /* renamed from: a */
    public final Context f19154a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f19155b;

    /* renamed from: c */
    public final C5996b f19156c;

    /* renamed from: d */
    public final C5995a f19157d;

    /* renamed from: e */
    public final C5997b f19158e;

    /* renamed from: o6.a$a */
    public static class C5995a {
    }

    /* renamed from: o6.a$b */
    public static class C5996b {

        /* renamed from: a */
        public final ArrayDeque f19159a = new ArrayDeque(0);

        public C5996b() {
            char[] cArr = C7176l.f22265a;
        }
    }

    public C5994a(Context context, List<ImageHeaderParser> list, C4566d dVar, C4564b bVar) {
        C5996b bVar2 = f19153g;
        C5995a aVar = f19152f;
        this.f19154a = context.getApplicationContext();
        this.f19155b = list;
        this.f19157d = aVar;
        this.f19158e = new C5997b(dVar, bVar);
        this.f19156c = bVar2;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) eVar.mo5848c(C6007h.f19198b)).booleanValue() || C2137a.m5568c(this.f19155b, byteBuffer) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        C0086d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C5996b bVar = this.f19156c;
        synchronized (bVar) {
            C0086d dVar2 = (C0086d) bVar.f19159a.poll();
            if (dVar2 == null) {
                dVar2 = new C0086d();
            }
            dVar = dVar2;
            dVar.f242b = null;
            Arrays.fill(dVar.f241a, (byte) 0);
            dVar.f243c = new C0085c();
            dVar.f244d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f242b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f242b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            C6000d c = mo21984c(byteBuffer, i, i2, dVar, eVar);
            C5996b bVar2 = this.f19156c;
            synchronized (bVar2) {
                dVar.f242b = null;
                dVar.f243c = null;
                bVar2.f19159a.offer(dVar);
            }
            return c;
        } catch (Throwable th) {
            C5996b bVar3 = this.f19156c;
            synchronized (bVar3) {
                dVar.f242b = null;
                dVar.f243c = null;
                bVar3.f19159a.offer(dVar);
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final C6000d mo21984c(ByteBuffer byteBuffer, int i, int i2, C0086d dVar, C1492e eVar) {
        Bitmap.Config config;
        int i3;
        int i4 = C7171h.f22255a;
        SystemClock.elapsedRealtimeNanos();
        try {
            C0085c b = dVar.mo190b();
            if (b.f232c > 0) {
                if (b.f231b == 0) {
                    if (eVar.mo5848c(C6007h.f19197a) == DecodeFormat.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    int min = Math.min(b.f236g / i2, b.f235f / i);
                    if (min == 0) {
                        i3 = 0;
                    } else {
                        i3 = Integer.highestOneBit(min);
                    }
                    int max = Math.max(1, i3);
                    C5995a aVar = this.f19157d;
                    C5997b bVar = this.f19158e;
                    aVar.getClass();
                    ByteBuffer byteBuffer2 = byteBuffer;
                    C0087e eVar2 = new C0087e(bVar, b, byteBuffer, max);
                    eVar2.mo197h(config);
                    eVar2.mo182b();
                    Bitmap a = eVar2.mo181a();
                    if (a == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            SystemClock.elapsedRealtimeNanos();
                        }
                        return null;
                    }
                    C6000d dVar2 = new C6000d(new C5998c(new C5998c.C5999a(new C6002f(C2116c.m5520b(this.f19154a), eVar2, i, i2, C5387b.f17707b, a))));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return dVar2;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
