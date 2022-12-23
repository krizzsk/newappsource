package p173ma;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p277ub.C6774a0;

/* renamed from: ma.p */
public final class C5746p {

    /* renamed from: c */
    public static final Pattern f18616c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f18617a = -1;

    /* renamed from: b */
    public int f18618b = -1;

    /* renamed from: a */
    public final boolean mo21599a(String str) {
        Matcher matcher = f18616c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = C6774a0.f20959a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f18617a = parseInt;
            this.f18618b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo21600b(Metadata metadata) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f13864b;
            if (i < entryArr.length) {
                Metadata.Entry entry = entryArr[i];
                if (entry instanceof CommentFrame) {
                    CommentFrame commentFrame = (CommentFrame) entry;
                    if ("iTunSMPB".equals(commentFrame.f13921d) && mo21599a(commentFrame.f13922e)) {
                        return;
                    }
                } else if (entry instanceof InternalFrame) {
                    InternalFrame internalFrame = (InternalFrame) entry;
                    if ("com.apple.iTunes".equals(internalFrame.f13928c) && "iTunSMPB".equals(internalFrame.f13929d) && mo21599a(internalFrame.f13930e)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
