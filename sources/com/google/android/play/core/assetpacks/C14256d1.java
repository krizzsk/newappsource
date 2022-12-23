package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.graphics.Color;
import android.util.Base64;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.appboy.support.ValidationUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import mf0.C24362h;
import p129j1.C5348a;
import p742qc.C19098b;
import qg0.C24753j;
import qg0.C24757k;
import ug0.C25065b;

/* renamed from: com.google.android.play.core.assetpacks.d1 */
public final class C14256d1 {

    /* renamed from: a */
    public static C14295n0 f35822a;

    /* renamed from: a */
    public static int m35483a(int i, int i2) {
        return C5348a.m13417m(i, (Color.alpha(i) * i2) / ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: b */
    public static final C24757k m35484b(C24753j jVar, C25065b bVar) {
        C24753j.C24754a.C24756b bVar2;
        C24362h.m61211f(jVar, "<this>");
        C24362h.m61211f(bVar, "classId");
        C24753j.C24754a c = jVar.mo58428c(bVar);
        if (c == null) {
            return null;
        }
        if (c instanceof C24753j.C24754a.C24756b) {
            bVar2 = (C24753j.C24754a.C24756b) c;
        } else {
            bVar2 = null;
        }
        if (bVar2 == null) {
            return null;
        }
        return bVar2.f62660a;
    }

    /* renamed from: c */
    public static int m35485c(int i, View view) {
        return C19098b.m46246b(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: d */
    public static int m35486d(Context context, int i, int i2) {
        TypedValue a = C19098b.m46245a(i, context);
        if (a != null) {
            return a.data;
        }
        return i2;
    }

    /* renamed from: e */
    public static String m35487e(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder q = C25541a.m63886q('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                q.append('[');
                q.append(iArr2[i2]);
                q.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                q.append('.');
                String str = strArr[i2];
                if (str != null) {
                    q.append(str);
                }
            }
        }
        return q.toString();
    }

    /* renamed from: f */
    public static final int m35488f(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            int i7 = -i3;
            int i8 = i % i7;
            if (i8 < 0) {
                i8 += i7;
            }
            int i9 = i2 % i7;
            if (i9 < 0) {
                i9 += i7;
            }
            int i11 = (i8 - i9) % i7;
            if (i11 < 0) {
                i11 += i7;
            }
            return i2 + i11;
        }
    }

    /* renamed from: g */
    public static boolean m35489g(int i) {
        return i != 0 && C5348a.m13410f(i) > 0.5d;
    }

    /* renamed from: h */
    public static boolean m35490h(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    /* renamed from: i */
    public static int m35491i(float f, int i, int i2) {
        return C5348a.m13413i(C5348a.m13417m(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    /* renamed from: j */
    public static String m35492j(List list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable unused) {
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }
}
