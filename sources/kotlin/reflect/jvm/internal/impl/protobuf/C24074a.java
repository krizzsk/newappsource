package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
public abstract class C24074a implements C24090h {
    public int memoizedHashCode = 0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a */
    public static abstract class C24075a<BuilderType extends C24075a> implements C24090h.C24091a {
        /* renamed from: b */
        public abstract BuilderType mo59652n(C24078c cVar, C24079d dVar) throws IOException;

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a */
        public static final class C24076a extends FilterInputStream {

            /* renamed from: b */
            public int f61067b;

            public C24076a(ByteArrayInputStream byteArrayInputStream, int i) {
                super(byteArrayInputStream);
                this.f61067b = i;
            }

            public final int available() throws IOException {
                return Math.min(super.available(), this.f61067b);
            }

            public final int read() throws IOException {
                if (this.f61067b <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f61067b--;
                }
                return read;
            }

            public final long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f61067b));
                if (skip >= 0) {
                    this.f61067b = (int) (((long) this.f61067b) - skip);
                }
                return skip;
            }

            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f61067b;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f61067b -= read;
                }
                return read;
            }
        }
    }
}
