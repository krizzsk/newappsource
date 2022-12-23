package p90;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.moovit.ticketing.validation.receipt.media.C7772a;
import com.moovit.ticketing.validation.receipt.media.MediaTicketReceiptContent;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import m90.C12890b;
import n90.C12919a;
import o90.C12957a;
import p786rz.C19387a;
import q90.C13040a;
import r90.C13049a;

/* renamed from: p90.a */
public final class C12997a implements C12890b.C12891a<C12890b, IOException> {
    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public static MediaTicketReceiptContent m32879f(MediaTicketReceiptContent mediaTicketReceiptContent) throws IOException {
        boolean z;
        String str = mediaTicketReceiptContent.f23586b;
        byte[] bArr = mediaTicketReceiptContent.f23587c;
        String str2 = mediaTicketReceiptContent.f23588d;
        byte[] bArr2 = mediaTicketReceiptContent.f23589e;
        if (bArr == null || (str2 != null && bArr2 == null)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (bArr == null) {
            InputStream openStream = FirebasePerfUrlConnection.openStream(new URL(str));
            try {
                byte[] d = C19387a.m46672d(openStream);
                openStream.close();
                bArr = d;
            } catch (Throwable th) {
                openStream.close();
                throw th;
            }
        }
        if (str2 != null && bArr2 == null) {
            InputStream openStream2 = FirebasePerfUrlConnection.openStream(new URL(str2));
            try {
                byte[] d2 = C19387a.m46672d(openStream2);
                openStream2.close();
                bArr2 = d2;
            } catch (Throwable th2) {
                openStream2.close();
                throw th2;
            }
        }
        return new MediaTicketReceiptContent(str, str2, bArr, bArr2);
    }

    /* renamed from: a */
    public final Object mo39739a(C7772a aVar) throws Exception {
        boolean z;
        MediaTicketReceiptContent f = m32879f(aVar.f23593e);
        MediaTicketReceiptContent f2 = m32879f(aVar.f23594f);
        MediaTicketReceiptContent f3 = m32879f(aVar.f23595g);
        if (f == null && f2 == null && f3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (f == null) {
            f = aVar.f23593e;
        }
        MediaTicketReceiptContent mediaTicketReceiptContent = f;
        if (f2 == null) {
            f2 = aVar.f23594f;
        }
        MediaTicketReceiptContent mediaTicketReceiptContent2 = f2;
        if (f3 == null) {
            f3 = aVar.f23595g;
        }
        return new C7772a(aVar.f31901a, aVar.f31902b, aVar.f31903c, aVar.f23592d, mediaTicketReceiptContent, mediaTicketReceiptContent2, f3, aVar.f23596h);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo39740b(C13040a aVar) throws Exception {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo39741c(C12957a aVar) throws Exception {
        return null;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo39742d(C13049a aVar) throws Exception {
        return null;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo39743e(C12919a aVar) throws Exception {
        return null;
    }
}
