package s10;

import android.content.Context;
import ce0.C21100e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import com.moovit.image.glide.ImageDataException;
import com.moovit.image.glide.data.ImageData;
import com.moovit.network.model.ServerId;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p435de.C16596f;
import t10.C19625a;
import t10.C19626b;

/* renamed from: s10.d */
public final class C19397d implements C2142d<ImageData> {

    /* renamed from: d */
    public static final Set<Class<? extends Throwable>> f49350d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Class[]{SocketTimeoutException.class, UnknownHostException.class})));

    /* renamed from: b */
    public final Context f49351b;

    /* renamed from: c */
    public final ServerId f49352c;

    public C19397d(Context context, ServerId serverId) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f49351b = context;
        C21100e.m49373x(serverId, "serverId");
        this.f49352c = serverId;
    }

    /* renamed from: a */
    public final Class<ImageData> mo6607a() {
        return ImageData.class;
    }

    /* renamed from: b */
    public final void mo6608b() {
    }

    public final void cancel() {
    }

    /* renamed from: d */
    public final DataSource mo6610d() {
        return DataSource.REMOTE;
    }

    /* renamed from: e */
    public final void mo6611e(Priority priority, C2142d.C2143a<? super ImageData> aVar) {
        ImageDataException imageDataException;
        ImageData imageData;
        ImageData imageData2 = null;
        try {
            C19626b bVar = (C19626b) new C19625a(this.f49351b.getApplicationContext(), this.f49352c).mo52626J();
            if (bVar != null) {
                imageData = bVar.f49805g;
            } else {
                imageData = null;
            }
            imageDataException = null;
            imageData2 = imageData;
        } catch (Exception e) {
            imageDataException = new ImageDataException(e);
        }
        if (imageData2 != null) {
            aVar.mo10914f(imageData2);
            return;
        }
        if (imageDataException == null) {
            imageDataException = new ImageDataException("Empty image data");
        }
        Throwable cause = imageDataException.getCause();
        if (cause == null || !f49350d.contains(cause.getClass())) {
            C16596f a = C16596f.m42113a();
            StringBuilder k = C13555b.m33972k("remote server id = ");
            k.append(this.f49352c);
            a.mo49363b(k.toString());
            a.mo49364c(imageDataException);
        }
        aVar.mo10913c(imageDataException);
    }
}
