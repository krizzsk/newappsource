package p157l6;

import com.bumptech.glide.load.data.C2144e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: l6.a */
public final class C5628a implements C2144e<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f18380a;

    /* renamed from: l6.a$a */
    public static class C5629a implements C2144e.C2145a<ByteBuffer> {
        /* renamed from: a */
        public final Class<ByteBuffer> mo10902a() {
            return ByteBuffer.class;
        }

        /* renamed from: b */
        public final C2144e mo10903b(Object obj) {
            return new C5628a((ByteBuffer) obj);
        }
    }

    public C5628a(ByteBuffer byteBuffer) {
        this.f18380a = byteBuffer;
    }

    /* renamed from: a */
    public final Object mo10898a() throws IOException {
        this.f18380a.position(0);
        return this.f18380a;
    }

    /* renamed from: b */
    public final void mo10899b() {
    }
}
