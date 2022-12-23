package p029bb;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.play.core.appupdate.C14226d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p011aa.C0141e;
import p326ya.C7357c;
import p624ld.C18187b;

/* renamed from: bb.a */
public final class C1520a extends C0141e {

    /* renamed from: d */
    public static final Pattern f5468d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b */
    public final CharsetDecoder f5469b = C18187b.f46429c.newDecoder();

    /* renamed from: c */
    public final CharsetDecoder f5470c = C18187b.f46428b.newDecoder();

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public final Metadata mo321m(C7357c cVar, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.f5469b.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.f5470c.decode(byteBuffer).toString();
                this.f5470c.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f5470c.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.f5470c.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f5469b.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, (String) null, (String) null));
        }
        Matcher matcher = f5468d.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String H0 = C14226d.m35341H0(group);
                H0.getClass();
                if (H0.equals("streamurl")) {
                    str3 = group2;
                } else if (H0.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}
