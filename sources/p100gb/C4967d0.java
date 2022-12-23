package p100gb;

import java.util.Arrays;
import java.util.Random;

/* renamed from: gb.d0 */
public interface C4967d0 {

    /* renamed from: gb.d0$a */
    public static class C4968a implements C4967d0 {

        /* renamed from: a */
        public final Random f16793a;

        /* renamed from: b */
        public final int[] f16794b;

        /* renamed from: c */
        public final int[] f16795c;

        public C4968a() {
            this(new Random());
        }

        /* renamed from: a */
        public final C4968a mo20666a(int i) {
            int i2 = i + 0;
            int[] iArr = new int[(this.f16794b.length - i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f16794b;
                if (i3 >= iArr2.length) {
                    return new C4968a(iArr, new Random(this.f16793a.nextLong()));
                }
                int i5 = iArr2[i3];
                if (i5 < 0 || i5 >= i) {
                    int i6 = i3 - i4;
                    if (i5 >= 0) {
                        i5 -= i2;
                    }
                    iArr[i6] = i5;
                } else {
                    i4++;
                }
                i3++;
            }
        }

        /* renamed from: b */
        public final int mo20667b(int i) {
            int i2 = this.f16795c[i] - 1;
            if (i2 >= 0) {
                return this.f16794b[i2];
            }
            return -1;
        }

        /* renamed from: c */
        public final int mo20668c(int i) {
            int i2 = this.f16795c[i] + 1;
            int[] iArr = this.f16794b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        /* renamed from: d */
        public final int mo20669d() {
            int[] iArr = this.f16794b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        /* renamed from: e */
        public final C4968a mo20670e() {
            return new C4968a(new Random(this.f16793a.nextLong()));
        }

        /* renamed from: f */
        public final int mo20671f() {
            int[] iArr = this.f16794b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        /* renamed from: g */
        public final C4968a mo20672g(int i) {
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                iArr[i3] = this.f16793a.nextInt(this.f16794b.length + 1);
                int i4 = i3 + 1;
                int nextInt = this.f16793a.nextInt(i4);
                iArr2[i3] = iArr2[nextInt];
                iArr2[nextInt] = i3 + 0;
                i3 = i4;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f16794b.length + i)];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr4 = this.f16794b;
                if (i2 >= iArr4.length + i) {
                    return new C4968a(iArr3, new Random(this.f16793a.nextLong()));
                }
                if (i5 >= i || i6 != iArr[i5]) {
                    int i7 = i6 + 1;
                    int i8 = iArr4[i6];
                    iArr3[i2] = i8;
                    if (i8 >= 0) {
                        iArr3[i2] = i8 + i;
                    }
                    i6 = i7;
                } else {
                    iArr3[i2] = iArr2[i5];
                    i5++;
                }
                i2++;
            }
        }

        public final int getLength() {
            return this.f16794b.length;
        }

        public C4968a(Random random) {
            this(new int[0], random);
        }

        public C4968a(int[] iArr, Random random) {
            this.f16794b = iArr;
            this.f16793a = random;
            this.f16795c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f16795c[iArr[i]] = i;
            }
        }
    }

    /* renamed from: a */
    C4968a mo20666a(int i);

    /* renamed from: b */
    int mo20667b(int i);

    /* renamed from: c */
    int mo20668c(int i);

    /* renamed from: d */
    int mo20669d();

    /* renamed from: e */
    C4968a mo20670e();

    /* renamed from: f */
    int mo20671f();

    /* renamed from: g */
    C4968a mo20672g(int i);

    int getLength();
}
