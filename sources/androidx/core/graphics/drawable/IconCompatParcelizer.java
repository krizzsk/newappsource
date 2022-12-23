package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p022b3.C1462b;

public class IconCompatParcelizer {
    public static IconCompat read(C1462b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3344a = bVar.mo5801j(iconCompat.f3344a, 1);
        byte[] bArr = iconCompat.f3346c;
        if (bVar.mo5799h(2)) {
            bArr = bVar.mo5797f();
        }
        iconCompat.f3346c = bArr;
        iconCompat.f3347d = bVar.mo5803l(iconCompat.f3347d, 3);
        iconCompat.f3348e = bVar.mo5801j(iconCompat.f3348e, 4);
        iconCompat.f3349f = bVar.mo5801j(iconCompat.f3349f, 5);
        iconCompat.f3350g = (ColorStateList) bVar.mo5803l(iconCompat.f3350g, 6);
        String str = iconCompat.f3352i;
        if (bVar.mo5799h(7)) {
            str = bVar.mo5804m();
        }
        iconCompat.f3352i = str;
        String str2 = iconCompat.f3353j;
        if (bVar.mo5799h(8)) {
            str2 = bVar.mo5804m();
        }
        iconCompat.f3353j = str2;
        iconCompat.f3351h = PorterDuff.Mode.valueOf(iconCompat.f3352i);
        switch (iconCompat.f3344a) {
            case -1:
                Parcelable parcelable = iconCompat.f3347d;
                if (parcelable != null) {
                    iconCompat.f3345b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f3347d;
                if (parcelable2 == null) {
                    byte[] bArr2 = iconCompat.f3346c;
                    iconCompat.f3345b = bArr2;
                    iconCompat.f3344a = 3;
                    iconCompat.f3348e = 0;
                    iconCompat.f3349f = bArr2.length;
                    break;
                } else {
                    iconCompat.f3345b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f3346c, Charset.forName("UTF-16"));
                iconCompat.f3345b = str3;
                if (iconCompat.f3344a == 2 && iconCompat.f3353j == null) {
                    iconCompat.f3353j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f3345b = iconCompat.f3346c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1462b bVar) {
        bVar.getClass();
        iconCompat.f3352i = iconCompat.f3351h.name();
        switch (iconCompat.f3344a) {
            case -1:
                iconCompat.f3347d = (Parcelable) iconCompat.f3345b;
                break;
            case 1:
            case 5:
                iconCompat.f3347d = (Parcelable) iconCompat.f3345b;
                break;
            case 2:
                iconCompat.f3346c = ((String) iconCompat.f3345b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f3346c = (byte[]) iconCompat.f3345b;
                break;
            case 4:
            case 6:
                iconCompat.f3346c = iconCompat.f3345b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f3344a;
        if (-1 != i) {
            bVar.mo5811t(i, 1);
        }
        byte[] bArr = iconCompat.f3346c;
        if (bArr != null) {
            bVar.mo5806o(2);
            bVar.mo5808q(bArr);
        }
        Parcelable parcelable = iconCompat.f3347d;
        if (parcelable != null) {
            bVar.mo5806o(3);
            bVar.mo5812u(parcelable);
        }
        int i2 = iconCompat.f3348e;
        if (i2 != 0) {
            bVar.mo5811t(i2, 4);
        }
        int i3 = iconCompat.f3349f;
        if (i3 != 0) {
            bVar.mo5811t(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3350g;
        if (colorStateList != null) {
            bVar.mo5806o(6);
            bVar.mo5812u(colorStateList);
        }
        String str = iconCompat.f3352i;
        if (str != null) {
            bVar.mo5806o(7);
            bVar.mo5813v(str);
        }
        String str2 = iconCompat.f3353j;
        if (str2 != null) {
            bVar.mo5806o(8);
            bVar.mo5813v(str2);
        }
    }
}
