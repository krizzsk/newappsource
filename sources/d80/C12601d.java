package d80;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import c00.C13717b;
import com.appsflyer.ServerParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20964s0;

/* renamed from: d80.d */
public final class C12601d extends C12598a<C12601d, C12602e> {
    public C12601d(Context context) {
        super(context, Uri.parse("https://www.googleapis.com/geolocation/v1/geolocate"), true, C12602e.class);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: N */
    public static void m32307N(Context context, JSONObject jSONObject) throws JSONException {
        TelephonyManager telephonyManager;
        int i;
        int i2;
        int i3 = 17;
        if (C20943i.m49051d(17) && C20934d0.m49030a(context) && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            allCellInfo.size();
            if (!C13717b.m34258e(allCellInfo)) {
                for (CellInfo next : allCellInfo) {
                    JSONObject jSONObject2 = null;
                    if (C20943i.m49051d(i3)) {
                        if (next instanceof CellInfoCdma) {
                            CellInfoCdma cellInfoCdma = (CellInfoCdma) next;
                            CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
                            CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
                            int basestationId = cellIdentity.getBasestationId();
                            int networkId = cellIdentity.getNetworkId();
                            int systemId = cellIdentity.getSystemId();
                            int dbm = cellSignalStrength.getDbm();
                            if (!(basestationId == Integer.MAX_VALUE || networkId == Integer.MAX_VALUE || systemId == Integer.MAX_VALUE)) {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("cellId", basestationId);
                                jSONObject2.put("locationAreaCode", networkId);
                                jSONObject2.put("mobileNetworkCode", systemId);
                                jSONObject2.put("signalStrength", dbm);
                            }
                        } else if (next instanceof CellInfoGsm) {
                            CellInfoGsm cellInfoGsm = (CellInfoGsm) next;
                            CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                            CellSignalStrengthGsm cellSignalStrength2 = cellInfoGsm.getCellSignalStrength();
                            int cid = cellIdentity2.getCid();
                            int lac = cellIdentity2.getLac();
                            int mcc = cellIdentity2.getMcc();
                            int mnc = cellIdentity2.getMnc();
                            int dbm2 = cellSignalStrength2.getDbm();
                            if (C20943i.m49051d(26)) {
                                i2 = cellSignalStrength2.getTimingAdvance();
                            } else {
                                i2 = Integer.MAX_VALUE;
                            }
                            if (!(cid == Integer.MAX_VALUE || lac == Integer.MAX_VALUE || mcc == Integer.MAX_VALUE || mnc == Integer.MAX_VALUE)) {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("cellId", cid);
                                jSONObject2.put("locationAreaCode", lac);
                                jSONObject2.put("mobileCountryCode", mcc);
                                jSONObject2.put("mobileNetworkCode", mnc);
                                jSONObject2.put("signalStrength", dbm2);
                                if (i2 != Integer.MAX_VALUE) {
                                    jSONObject2.put("timingAdvance", i2);
                                }
                            }
                        } else if (C20943i.m49051d(18) && (next instanceof CellInfoWcdma)) {
                            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) next;
                            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
                            CellSignalStrengthWcdma cellSignalStrength3 = cellInfoWcdma.getCellSignalStrength();
                            int cid2 = cellIdentity3.getCid();
                            int lac2 = cellIdentity3.getLac();
                            int mcc2 = cellIdentity3.getMcc();
                            int mnc2 = cellIdentity3.getMnc();
                            int dbm3 = cellSignalStrength3.getDbm();
                            if (!(cid2 == Integer.MAX_VALUE || lac2 == Integer.MAX_VALUE || mcc2 == Integer.MAX_VALUE || mnc2 == Integer.MAX_VALUE)) {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("cellId", cid2);
                                jSONObject2.put("locationAreaCode", lac2);
                                jSONObject2.put("mobileCountryCode", mcc2);
                                jSONObject2.put("mobileNetworkCode", mnc2);
                                jSONObject2.put("signalStrength", dbm3);
                            }
                        } else if (next instanceof CellInfoLte) {
                            CellInfoLte cellInfoLte = (CellInfoLte) next;
                            CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
                            CellSignalStrengthLte cellSignalStrength4 = cellInfoLte.getCellSignalStrength();
                            int ci = cellIdentity4.getCi();
                            int mcc3 = cellIdentity4.getMcc();
                            int mnc3 = cellIdentity4.getMnc();
                            int dbm4 = cellSignalStrength4.getDbm();
                            if (C20943i.m49051d(26)) {
                                i = cellSignalStrength4.getTimingAdvance();
                            } else {
                                i = Integer.MAX_VALUE;
                            }
                            if (!(ci == Integer.MAX_VALUE || mcc3 == Integer.MAX_VALUE || mnc3 == Integer.MAX_VALUE)) {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("cellId", ci);
                                jSONObject2.put("mobileCountryCode", mcc3);
                                jSONObject2.put("mobileNetworkCode", mnc3);
                                jSONObject2.put("signalStrength", dbm4);
                                if (i != Integer.MAX_VALUE) {
                                    jSONObject2.put("timingAdvance", i);
                                }
                            }
                        }
                    }
                    if (jSONObject2 != null) {
                        jSONObject.accumulate("cellTowers", jSONObject2);
                    } else {
                        JSONObject jSONObject3 = jSONObject;
                    }
                    i3 = 17;
                }
            }
        }
    }

    /* renamed from: O */
    public static void m32308O(Context context, JSONObject jSONObject) throws JSONException {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!C20964s0.m49090h(networkOperatorName)) {
                jSONObject.put(ServerParameters.CARRIER, networkOperatorName);
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!C20964s0.m49090h(networkOperator)) {
                int parseInt = Integer.parseInt(networkOperator.substring(0, 3));
                int parseInt2 = Integer.parseInt(networkOperator.substring(3));
                jSONObject.put("homeMobileCountryCode", parseInt);
                jSONObject.put("homeMobileNetworkCode", parseInt2);
            }
        }
    }

    /* renamed from: P */
    public static void m32309P(Context context, JSONObject jSONObject) throws JSONException {
        WifiManager wifiManager;
        long j;
        if (C20934d0.m49032c(context) && (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) != null) {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            scanResults.size();
            if (!C13717b.m34258e(scanResults)) {
                for (ScanResult next : scanResults) {
                    if (C20943i.m49051d(17)) {
                        j = SystemClock.elapsedRealtime() - TimeUnit.MICROSECONDS.toMillis(next.timestamp);
                    } else {
                        j = 0;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("macAddress", next.BSSID);
                    jSONObject2.put("signalStrength", next.level);
                    jSONObject2.put(InneractiveMediationDefs.KEY_AGE, j);
                    jSONObject.accumulate("wifiAccessPoints", jSONObject2);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)(1:5)|6|7|8|9|10|11|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo21361L() throws org.json.JSONException {
        /*
            r4 = this;
            android.content.Context r0 = r4.f51759b
            android.content.Context r0 = r0.getApplicationContext()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 1
            java.lang.String r3 = "considerIp"
            r1.put(r3, r2)
            java.lang.String r2 = "phone"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x001f }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x001f }
            if (r2 != 0) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            r2.getNetworkType()     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            m32308O(r0, r1)     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            m32307N(r0, r1)     // Catch:{ Exception -> 0x0025 }
        L_0x0025:
            m32309P(r0, r1)     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C12601d.mo21361L():org.json.JSONObject");
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setConnectTimeout(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }
}
