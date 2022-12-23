package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import p003a2.C0047b;

/* renamed from: androidx.emoji2.text.m */
public final class C0855m {

    /* renamed from: androidx.emoji2.text.m$a */
    public static class C0856a {

        /* renamed from: a */
        public final ByteBuffer f3539a;

        public C0856a(ByteBuffer byteBuffer) {
            this.f3539a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public final long mo3639a() throws IOException {
            return ((long) this.f3539a.getInt()) & 4294967295L;
        }

        /* renamed from: b */
        public final void mo3640b(int i) throws IOException {
            ByteBuffer byteBuffer = this.f3539a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* renamed from: a */
    public static C0047b m2554a(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        C0856a aVar = new C0856a(duplicate);
        aVar.mo3640b(4);
        short s = duplicate.getShort() & 65535;
        if (s <= 100) {
            aVar.mo3640b(6);
            int i = 0;
            while (true) {
                if (i >= s) {
                    j = -1;
                    break;
                }
                int i2 = aVar.f3539a.getInt();
                aVar.mo3640b(4);
                j = aVar.mo3639a();
                aVar.mo3640b(4);
                if (1835365473 == i2) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                aVar.mo3640b((int) (j - ((long) aVar.f3539a.position())));
                aVar.mo3640b(12);
                long a = aVar.mo3639a();
                for (int i3 = 0; ((long) i3) < a; i3++) {
                    int i4 = aVar.f3539a.getInt();
                    long a2 = aVar.mo3639a();
                    aVar.mo3639a();
                    if (1164798569 == i4 || 1701669481 == i4) {
                        duplicate.position((int) (a2 + j));
                        C0047b bVar = new C0047b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.mo25b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
