package p116i1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: i1.e */
public final class C5246e {

    /* renamed from: a */
    public final int[] f17363a;

    /* renamed from: b */
    public final float[] f17364b;

    public C5246e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f17363a = new int[size];
        this.f17364b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f17363a[i] = ((Integer) arrayList.get(i)).intValue();
            this.f17364b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C5246e(int i, int i2) {
        this.f17363a = new int[]{i, i2};
        this.f17364b = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
    }

    public C5246e(int i, int i2, int i3) {
        this.f17363a = new int[]{i, i2, i3};
        this.f17364b = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    }
}
