package p078f0;

import android.util.Size;
import java.util.Comparator;

/* renamed from: f0.b */
public final class C4635b implements Comparator<Size> {

    /* renamed from: b */
    public boolean f15859b;

    public C4635b(boolean z) {
        this.f15859b = z;
    }

    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        if (this.f15859b) {
            return signum * -1;
        }
        return signum;
    }
}
