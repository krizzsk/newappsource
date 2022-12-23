package p296w4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p358af.C13437d;

/* renamed from: w4.d */
public final class C6986d {

    /* renamed from: b */
    public static final Pattern f21755b = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);

    /* renamed from: a */
    public final long f21756a;

    public C6986d(long j) {
        this.f21756a = j;
    }

    /* renamed from: a */
    public static C6986d m16470a(String str) {
        Matcher matcher = f21755b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(3);
            double doubleValue = Double.valueOf(group).doubleValue();
            if (group2.equalsIgnoreCase("milli") || group2.equalsIgnoreCase("millisecond") || group2.length() == 0) {
                return new C6986d((long) doubleValue);
            }
            if (group2.equalsIgnoreCase("second") || group2.equalsIgnoreCase("seconde")) {
                return new C6986d((long) (doubleValue * 1000.0d));
            }
            if (group2.equalsIgnoreCase("minute")) {
                return new C6986d((long) (doubleValue * 60000.0d));
            }
            if (group2.equalsIgnoreCase("hour")) {
                return new C6986d((long) (doubleValue * 3600000.0d));
            }
            if (group2.equalsIgnoreCase("day")) {
                return new C6986d((long) (doubleValue * 8.64E7d));
            }
            throw new IllegalStateException(C25541a.m63881k("Unexpected ", group2));
        }
        throw new IllegalArgumentException(C13437d.m33706k("String value [", str, "] is not in the expected format."));
    }

    public final String toString() {
        String str;
        StringBuilder sb;
        long j = this.f21756a;
        if (j < 1000) {
            sb = new StringBuilder();
            sb.append(this.f21756a);
            str = " milliseconds";
        } else if (j < 60000) {
            sb = new StringBuilder();
            sb.append(this.f21756a / 1000);
            str = " seconds";
        } else {
            int i = (j > 3600000 ? 1 : (j == 3600000 ? 0 : -1));
            sb = new StringBuilder();
            if (i < 0) {
                sb.append(this.f21756a / 60000);
                str = " minutes";
            } else {
                sb.append(this.f21756a / 3600000);
                str = " hours";
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
