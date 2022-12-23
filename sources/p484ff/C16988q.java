package p484ff;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;
import p484ff.C16964d;

/* renamed from: ff.q */
public final class C16988q implements Closeable {

    /* renamed from: b */
    public final URL f44098b;

    /* renamed from: c */
    public volatile Future<?> f44099c;

    /* renamed from: d */
    public Task<Bitmap> f44100d;

    public C16988q(URL url) {
        this.f44098b = url;
    }

    public final void close() {
        this.f44099c.cancel(true);
    }

    /* renamed from: e */
    public final Bitmap mo49623e() throws IOException {
        if (Log.isLoggable(FirebaseMessaging.TAG, 4)) {
            Objects.toString(this.f44098b);
        }
        URLConnection openConnection = this.f44098b.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] b = C16964d.m42803b(new C16964d.C16965a(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable(FirebaseMessaging.TAG, 2)) {
                    int length = b.length;
                    Objects.toString(this.f44098b);
                }
                if (b.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable(FirebaseMessaging.TAG, 3)) {
                            Objects.toString(this.f44098b);
                        }
                        return decodeByteArray;
                    }
                    StringBuilder k = C13555b.m33972k("Failed to decode image: ");
                    k.append(this.f44098b);
                    throw new IOException(k.toString());
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }
}
