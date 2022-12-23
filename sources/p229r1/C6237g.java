package p229r1;

import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: r1.g */
public final class C6237g {

    /* renamed from: a */
    public static final Object f19684a = new Object();

    /* renamed from: b */
    public static char[] f19685b = new char[24];

    /* renamed from: a */
    public static int m14826a(long j) {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        if (f19685b.length < 0) {
            f19685b = new char[0];
        }
        char[] cArr = f19685b;
        int i5 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i5 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (i5 > 0) {
            c = '+';
        } else {
            c = '-';
            j = -j;
        }
        int i6 = (int) (j % 1000);
        int floor = (int) Math.floor((double) (j / 1000));
        if (floor > 86400) {
            i = floor / Strategy.TTL_SECONDS_MAX;
            floor -= Strategy.TTL_SECONDS_MAX * i;
        } else {
            i = 0;
        }
        if (floor > 3600) {
            i2 = floor / 3600;
            floor -= i2 * 3600;
        } else {
            i2 = 0;
        }
        if (floor > 60) {
            int i7 = floor / 60;
            i4 = floor - (i7 * 60);
            i3 = i7;
        } else {
            i4 = floor;
            i3 = 0;
        }
        cArr[0] = c;
        int b = m14827b(cArr, i, 'd', 1, false, 0);
        if (b != 1) {
            z = true;
        } else {
            z = false;
        }
        int b2 = m14827b(cArr, i2, 'h', b, z, 0);
        if (b2 != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int b3 = m14827b(cArr, i3, 'm', b2, z2, 0);
        if (b3 != 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int b4 = m14827b(cArr, i6, 'm', m14827b(cArr, i4, 's', b3, z3, 0), true, 0);
        cArr[b4] = 's';
        return b4 + 1;
    }

    /* renamed from: b */
    public static int m14827b(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
