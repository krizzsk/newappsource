package si0;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* renamed from: si0.h */
public interface C24901h extends C24887a0, WritableByteChannel {
    /* renamed from: D */
    C24898f mo61377D();

    /* renamed from: E1 */
    C24901h mo61378E1(long j) throws IOException;

    /* renamed from: G1 */
    C24901h mo61379G1(int i, int i2, String str) throws IOException;

    /* renamed from: M */
    C24901h mo61382M() throws IOException;

    /* renamed from: O0 */
    C24901h mo61386O0(long j) throws IOException;

    /* renamed from: Q */
    C24901h mo61387Q(String str) throws IOException;

    /* renamed from: R1 */
    C24901h mo61390R1(ByteString byteString) throws IOException;

    /* renamed from: U1 */
    C24901h mo61394U1(int i, int i2, byte[] bArr) throws IOException;

    void flush() throws IOException;

    C24898f getBuffer();

    /* renamed from: q1 */
    long mo61417q1(C24893c0 c0Var) throws IOException;

    C24901h write(byte[] bArr) throws IOException;

    C24901h writeByte(int i) throws IOException;

    C24901h writeInt(int i) throws IOException;

    C24901h writeShort(int i) throws IOException;
}
