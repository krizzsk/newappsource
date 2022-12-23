package com.google.android.gms.location.places.internal;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.util.Collection;
import java.util.List;

public final class zzi {
    public static CharSequence zzb(String str, List<zzb> list, CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        for (zzb next : list) {
            CharacterStyle wrap = CharacterStyle.wrap(characterStyle);
            int i = next.offset;
            spannableString.setSpan(wrap, i, next.length + i, 0);
        }
        return spannableString;
    }

    public static String zzc(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return TextUtils.join(", ", collection);
    }
}
