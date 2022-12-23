package j70;

import android.location.Location;
import c00.C13733n;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.sdk.datacollection.sensors.SensorType;
import com.moovit.sdk.datacollection.sensors.WifiSensorValue;
import java.util.Locale;
import p977zz.C20964s0;

/* renamed from: j70.b */
public final class C17714b implements C13733n<C17712a, String> {

    /* renamed from: b */
    public final /* synthetic */ WifiSensorValue f45473b;

    public C17714b(WifiSensorValue wifiSensorValue) {
        this.f45473b = wifiSensorValue;
    }

    public final Object convert(Object obj) throws Exception {
        String str;
        String str2;
        String str3;
        String str4;
        Float f;
        Float f2;
        Float f3;
        Double d;
        C17712a aVar = (C17712a) obj;
        String str5 = aVar.f45464a;
        String f4 = C20964s0.m49088f(aVar.f45466c);
        String valueOf = String.valueOf(aVar.f45468e);
        String valueOf2 = String.valueOf(aVar.f45469f);
        String f5 = C20964s0.m49088f(aVar.f45465b);
        Integer num = aVar.f45470g;
        if (num == null) {
            str = "";
        } else {
            str = num.toString();
        }
        Integer num2 = aVar.f45471h;
        if (num2 == null) {
            str2 = "";
        } else {
            str2 = num2.toString();
        }
        Integer num3 = aVar.f45472i;
        if (num3 == null) {
            str3 = "";
        } else {
            str3 = num3.toString();
        }
        String valueOf3 = String.valueOf(aVar.f45467d);
        if (this.f45473b.f42992d) {
            Location location = this.f45473b.f42991c;
            SensorType sensorType = SensorType.WIFI;
            CharSequence[] charSequenceArr = new CharSequence[10];
            charSequenceArr[0] = str5;
            charSequenceArr[1] = f4;
            charSequenceArr[2] = valueOf;
            charSequenceArr[3] = valueOf2;
            charSequenceArr[4] = f5;
            charSequenceArr[5] = str;
            charSequenceArr[6] = str2;
            charSequenceArr[7] = str3;
            charSequenceArr[8] = valueOf3;
            if (location == null) {
                str4 = ",,,,,,,,,";
            } else {
                Object[] objArr = new Object[10];
                objArr[0] = Long.valueOf(location.getTime());
                objArr[1] = Double.valueOf(location.getLatitude());
                objArr[2] = Double.valueOf(location.getLongitude());
                if (location.hasAccuracy()) {
                    f = Float.valueOf(location.getAccuracy());
                } else {
                    f = "";
                }
                objArr[3] = f;
                if (location.hasSpeed()) {
                    f2 = Float.valueOf(location.getSpeed());
                } else {
                    f2 = "";
                }
                objArr[4] = f2;
                if (location.hasBearing()) {
                    f3 = Float.valueOf(location.getBearing());
                } else {
                    f3 = "";
                }
                objArr[5] = f3;
                if (location.hasAltitude()) {
                    d = Double.valueOf(location.getAltitude());
                } else {
                    d = "";
                }
                objArr[6] = d;
                objArr[7] = "";
                objArr[8] = C20964s0.m49088f(location.getProvider());
                objArr[9] = "";
                str4 = String.format((Locale) null, "%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", objArr);
            }
            charSequenceArr[9] = str4;
            return C20964s0.m49097o(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, charSequenceArr).toString();
        }
        return C20964s0.m49097o(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, str5, f4, valueOf).toString();
    }
}
