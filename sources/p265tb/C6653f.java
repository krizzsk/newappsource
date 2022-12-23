package p265tb;

import android.net.Uri;
import android.util.Base64;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.net.URLDecoder;
import p277ub.C6774a0;
import p624ld.C18187b;

/* renamed from: tb.f */
public final class C6653f extends C6651d {

    /* renamed from: e */
    public C6657i f20659e;

    /* renamed from: f */
    public byte[] f20660f;

    /* renamed from: g */
    public int f20661g;

    /* renamed from: h */
    public int f20662h;

    public C6653f() {
        super(false);
    }

    public final void close() {
        if (this.f20660f != null) {
            this.f20660f = null;
            mo22822l();
        }
        this.f20659e = null;
    }

    /* renamed from: e */
    public final long mo16699e(C6657i iVar) throws IOException {
        String str;
        String str2;
        mo22823m(iVar);
        this.f20659e = iVar;
        Uri uri = iVar.f20668a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            if (valueOf.length() != 0) {
                str2 = "Unsupported scheme: ".concat(valueOf);
            } else {
                str2 = new String("Unsupported scheme: ");
            }
            throw new ParserException(str2);
        }
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = C6774a0.f20959a;
        String[] split = schemeSpecificPart.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
        if (split.length == 2) {
            String str3 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f20660f = Base64.decode(str3, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str3);
                    if (valueOf2.length() != 0) {
                        str = "Error while parsing Base64 encoded string: ".concat(valueOf2);
                    } else {
                        str = new String("Error while parsing Base64 encoded string: ");
                    }
                    throw new ParserException(str, e);
                }
            } else {
                this.f20660f = C6774a0.m15961u(URLDecoder.decode(str3, C18187b.f46427a.name()));
            }
            long j = iVar.f20673f;
            byte[] bArr = this.f20660f;
            if (j <= ((long) bArr.length)) {
                int i2 = (int) j;
                this.f20661g = i2;
                int length = bArr.length - i2;
                this.f20662h = length;
                long j2 = iVar.f20674g;
                if (j2 != -1) {
                    this.f20662h = (int) Math.min((long) length, j2);
                }
                mo22824n(iVar);
                long j3 = iVar.f20674g;
                if (j3 != -1) {
                    return j3;
                }
                return (long) this.f20662h;
            }
            this.f20660f = null;
            throw new DataSourceException();
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(valueOf3.length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw new ParserException(sb.toString());
    }

    public final Uri getUri() {
        C6657i iVar = this.f20659e;
        if (iVar != null) {
            return iVar.f20668a;
        }
        return null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f20662h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f20660f;
        int i4 = C6774a0.f20959a;
        System.arraycopy(bArr2, this.f20661g, bArr, i, min);
        this.f20661g += min;
        this.f20662h -= min;
        mo22821k(min);
        return min;
    }
}
