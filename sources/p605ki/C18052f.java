package p605ki;

import android.app.Application;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.exception.config.SdkConfigurationException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import p364al.C13487h;
import p413co.C13872r;
import p440dj.C16671a;
import p561ik.C17618a;
import p583jk.C17873f;
import p626lf.C18201b;
import p704om.C18791g;
import p725pj.C18926a;
import p726pk.C18928a;
import p846un.C19962d;
import p866vj.C20143a;
import p868vl.C20156c;
import p868vl.C20159f;
import p913xi.C20531d;
import p913xi.C20532e;

/* renamed from: ki.f */
public final class C18052f {

    /* renamed from: a */
    public Application f46189a;

    /* renamed from: b */
    public InputStream f46190b;

    /* renamed from: a */
    public final C18047b mo50526a() throws JustRideSdkException {
        C13487h hVar;
        ByteArrayOutputStream byteArrayOutputStream;
        boolean z;
        C13872r rVar;
        if (this.f46189a == null) {
            throw new JustRideSdkException("Please provide the instance of the hosting application.");
        } else if (this.f46190b != null) {
            new C17873f();
            new C17873f();
            C16671a aVar = new C16671a(new C20531d(new C20532e()));
            InputStream inputStream = this.f46190b;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray.length >= 256) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    hVar = C18201b.m44923t((C18926a) null, C20143a.f51118e, String.format(Locale.UK, "The SDK Configuration data is not of the expected size. Received configuration data of length %d bytes", new Object[]{Integer.valueOf(byteArray.length)}));
                } else {
                    byte[] copyOfRange = Arrays.copyOfRange(byteArray, 0, byteArray.length - 256);
                    try {
                        rVar = new C13872r(Boolean.valueOf(C19962d.m47454b(C19962d.m47453a(C18201b.f46457f, C18201b.f46458g), copyOfRange, Arrays.copyOfRange(byteArray, byteArray.length - 256, byteArray.length))), (C18926a) null);
                    } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e) {
                        rVar = new C13872r(Boolean.FALSE, C17873f.m44275b(e));
                    }
                    if (rVar.mo40817a()) {
                        hVar = C18201b.m44923t(rVar.f34120b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error");
                    } else if (Boolean.FALSE.equals(rVar.f34119a)) {
                        hVar = C18201b.m44923t((C18926a) null, C20143a.f51119f, String.format(Locale.UK, "The signature in the SDK Configuration data is not valid. Received configuration data of length %d bytes", new Object[]{Integer.valueOf(byteArray.length)}));
                    } else {
                        try {
                            C18928a aVar2 = (C18928a) aVar.mo50643a(new String(copyOfRange, StandardCharsets.UTF_8));
                            String str = aVar2.f48178e;
                            String str2 = aVar2.f48179f;
                            try {
                                C20156c.m47738a(str);
                                try {
                                    C20159f.m47740a(str2);
                                    hVar = new C13487h(aVar2, (C18926a) null);
                                } catch (SdkConfigurationException e2) {
                                    hVar = C18201b.m44923t(C17873f.m44275b(e2), C20143a.f51121h, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error.");
                                }
                            } catch (SdkConfigurationException e3) {
                                hVar = C18201b.m44923t(C17873f.m44275b(e3), C20143a.f51120g, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error.");
                            }
                        } catch (JSONException e4) {
                            hVar = C18201b.m44923t(new C17618a(e4.getMessage()), Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error");
                        }
                    }
                }
            } catch (IOException e5) {
                hVar = C18201b.m44923t(C17873f.m44275b(e5), Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error");
            } catch (Throwable th) {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                throw th;
            }
            if (!hVar.mo40399a()) {
                return new C18047b(this.f46189a, (C18928a) hVar.f33365a, new C18791g());
            }
            C18926a aVar3 = hVar.f33366b;
            StringBuilder k = C13555b.m33972k("SDK Configuration data not valid: ");
            k.append(aVar3.mo51439b());
            throw new JustRideSdkException(k.toString());
        } else {
            throw new JustRideSdkException("Please provide the configuration data");
        }
    }
}
