package com.google.android.gms.internal.places;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzbb extends zzq<Float> implements zzcw, RandomAccess {
    private static final zzbb zzic;
    private int size;
    private float[] zzid;

    static {
        zzbb zzbb = new zzbb(new float[0], 0);
        zzic = zzbb;
        zzbb.zzab();
    }

    public zzbb() {
        this(new float[10], 0);
    }

    private final void zzd(int i, float f) {
        int i2;
        zzac();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
        float[] fArr = this.zzid;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzid, i, fArr2, i + 1, this.size - i);
            this.zzid = fArr2;
        }
        this.zzid[i] = f;
        this.size++;
        this.modCount++;
    }

    private final String zzg(int i) {
        return C13715c.m34243i(35, "Index:", i, ", Size:", this.size);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzd(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        zzac();
        zzbd.checkNotNull(collection);
        if (!(collection instanceof zzbb)) {
            return super.addAll(collection);
        }
        zzbb zzbb = (zzbb) collection;
        int i = zzbb.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zzid;
            if (i3 > fArr.length) {
                this.zzid = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzbb.zzid, 0, this.zzid, this.size, zzbb.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbb)) {
            return super.equals(obj);
        }
        zzbb zzbb = (zzbb) obj;
        if (this.size != zzbb.size) {
            return false;
        }
        float[] fArr = zzbb.zzid;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.zzid[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzf(i);
        return Float.valueOf(this.zzid[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzid[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        zzac();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.zzid[i]))) {
                float[] fArr = this.zzid;
                System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        zzac();
        if (i2 >= i) {
            float[] fArr = this.zzid;
            System.arraycopy(fArr, i2, fArr, i, this.size - i2);
            this.size -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzac();
        zzf(i);
        float[] fArr = this.zzid;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.size;
    }

    public final void zzf(float f) {
        zzd(this.size, f);
    }

    public final /* synthetic */ zzbh zzh(int i) {
        if (i >= this.size) {
            return new zzbb(Arrays.copyOf(this.zzid, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    private zzbb(float[] fArr, int i) {
        this.zzid = fArr;
        this.size = i;
    }

    private final void zzf(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
    }

    public final /* synthetic */ Object remove(int i) {
        zzac();
        zzf(i);
        float[] fArr = this.zzid;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Float.valueOf(f);
    }
}
