package p475eu;

import aa0.C7554s;
import android.content.Context;
import android.text.SpannableStringBuilder;
import c00.C13733n;
import com.moovit.transit.TransitLine;
import java.util.Collections;
import p824tp.C19746x;
import p977zz.C20964s0;
import x00.C20440a;

/* renamed from: eu.a */
public final class C16881a implements C13733n<TransitLine, CharSequence> {

    /* renamed from: b */
    public final /* synthetic */ Context f43903b;

    /* renamed from: c */
    public final /* synthetic */ C16882b f43904c;

    public C16881a(C16882b bVar, Context context) {
        this.f43904c = bVar;
        this.f43903b = context;
    }

    public final Object convert(Object obj) throws Exception {
        int i;
        TransitLine transitLine = (TransitLine) obj;
        this.f43904c.f43905i.add(Collections.singletonList(transitLine));
        Context context = this.f43903b;
        C20440a aVar = C7554s.f23036a;
        String str = transitLine.f23688d;
        String str2 = transitLine.f23689e;
        boolean h = C20964s0.m49090h(str);
        boolean h2 = C20964s0.m49090h(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!h) {
            spannableStringBuilder.append(str);
        }
        if (!h && !h2) {
            if (C20964s0.m49091i(str2)) {
                i = C19746x.string_list_delimiter_arrow_left;
            } else {
                i = C19746x.string_list_delimiter_arrow_right;
            }
            spannableStringBuilder.append(context.getText(i));
        }
        if (!h2) {
            spannableStringBuilder.append(str2);
        }
        return spannableStringBuilder;
    }
}
