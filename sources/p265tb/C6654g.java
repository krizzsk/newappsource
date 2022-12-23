package p265tb;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: tb.g */
public interface C6654g extends C6652e {

    /* renamed from: tb.g$a */
    public interface C6655a {
        /* renamed from: a */
        C6654g mo22825a();
    }

    /* renamed from: b */
    Map<String, List<String>> mo20679b();

    void close() throws IOException;

    /* renamed from: d */
    void mo20680d(C6671u uVar);

    /* renamed from: e */
    long mo16699e(C6657i iVar) throws IOException;

    Uri getUri();
}
