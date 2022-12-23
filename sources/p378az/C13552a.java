package p378az;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicSessionCredentials;
import com.moovit.MoovitApplication;
import java.io.IOException;

/* renamed from: az.a */
public final class C13552a implements AWSCredentialsProvider {

    /* renamed from: a */
    public static final C13552a f33497a = new C13552a();

    /* renamed from: a */
    public static BasicSessionCredentials m33959a(boolean z) {
        IOException iOException;
        try {
            return ((C13554c) new C13553b(MoovitApplication.f37317k, z).mo52626J()).f33500f;
        } catch (Exception e) {
            if (e instanceof IOException) {
                iOException = (IOException) e;
            } else {
                iOException = new IOException(e);
            }
            throw new AmazonClientException("sendAndReadAwsCredentials(" + z + ") failure.", iOException);
        }
    }

    public final AWSCredentials getCredentials() {
        return m33959a(false);
    }

    public final void refresh() {
        m33959a(true);
    }
}
