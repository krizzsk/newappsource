package si0;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* renamed from: si0.i */
public interface C24902i extends C24893c0, ReadableByteChannel {
    /* renamed from: A1 */
    String mo61375A1(Charset charset) throws IOException;

    /* renamed from: D */
    C24898f mo61377D();

    /* renamed from: N0 */
    void mo61384N0(long j) throws IOException;

    /* renamed from: R0 */
    int mo61389R0(C24913t tVar) throws IOException;

    /* renamed from: V0 */
    ByteString mo61396V0(long j) throws IOException;

    /* renamed from: W1 */
    long mo61398W1(C24898f fVar) throws IOException;

    /* renamed from: f1 */
    byte[] mo61408f1() throws IOException;

    /* renamed from: f2 */
    long mo61409f2() throws IOException;

    C24898f getBuffer();

    /* renamed from: h2 */
    InputStream mo61411h2();

    /* renamed from: l1 */
    boolean mo61415l1() throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    /* renamed from: s */
    long mo61424s(ByteString byteString) throws IOException;

    void skip(long j) throws IOException;

    /* renamed from: t0 */
    boolean mo61427t0(long j) throws IOException;

    /* renamed from: u */
    String mo61429u(long j) throws IOException;

    /* renamed from: z0 */
    String mo61440z0() throws IOException;
}
