package zendesk.core;

import com.amazonaws.util.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p988j$.util.DesugarTimeZone;

class BlipsFormatHelper {
    public static String nowAsString(Date date) {
        Date date2;
        if (date == null) {
            date2 = new Date();
        } else {
            date2 = new Date(date.getTime());
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date2);
    }
}
