package p285v6;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* renamed from: v6.a */
public final class C6865a implements C6871e<Drawable> {

    /* renamed from: a */
    public final int f21220a;

    /* renamed from: b */
    public C6866b f21221b;

    public C6865a(int i) {
        this.f21220a = i;
    }

    /* renamed from: a */
    public final C6869d mo23123a(DataSource dataSource) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return C6867c.f21224a;
        }
        if (this.f21221b == null) {
            this.f21221b = new C6866b(this.f21220a, false);
        }
        return this.f21221b;
    }
}
