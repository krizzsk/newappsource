package com.google.android.gms.internal.p986firebaseauthapi;

import com.amazonaws.http.HttpHeader;
import com.appsflyer.internal.referrer.Payload;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxl */
public final class zzxl {
    public static void zza(String str, zzwo zzwo, zzxi zzxi, Type type, zzws zzws) {
        BufferedOutputStream bufferedOutputStream;
        try {
            Preconditions.checkNotNull(zzwo);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzwo.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty(HttpHeader.CONTENT_TYPE, "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzws.zza(httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            bufferedOutputStream.write(bytes, 0, length);
            bufferedOutputStream.close();
            zzb(httpURLConnection, zzxi, type);
            return;
        } catch (SocketTimeoutException unused) {
            zzxi.zza(Payload.RESPONSE_TIMEOUT);
            return;
        } catch (UnknownHostException unused2) {
            zzxi.zza("<<Network Error>>");
            return;
        } catch (IOException | NullPointerException | JSONException e) {
            zzxi.zza(e.getMessage());
            return;
        } catch (Throwable th) {
            zzxk.zza(th, th);
        }
        throw th;
    }

    private static void zzb(HttpURLConnection httpURLConnection, zzxi zzxi, Type type) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (zzc(responseCode)) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (!zzc(responseCode)) {
                zzxi.zza((String) zzwn.zza(sb2, String.class));
            } else {
                zzxi.zzb((zzwp) zzwn.zza(sb2, type));
            }
            httpURLConnection.disconnect();
            return;
        } catch (SocketTimeoutException unused) {
            zzxi.zza(Payload.RESPONSE_TIMEOUT);
            httpURLConnection.disconnect();
            return;
        } catch (zzui | IOException e) {
            try {
                zzxi.zza(e.getMessage());
                return;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            zzxk.zza(th, th);
        }
        throw th;
    }

    private static final boolean zzc(int i) {
        return i >= 200 && i < 300;
    }
}
