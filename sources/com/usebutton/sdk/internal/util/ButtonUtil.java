package com.usebutton.sdk.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p090g1.C4732a;
import p988j$.util.DesugarTimeZone;

public class ButtonUtil {
    private static final String APP_ID_REGEX = "^app-[0-9a-zA-Z-]+$";
    private static final SafeSimpleDateFormat DATE_FORMAT = new SafeSimpleDateFormat();
    private static final String ENCODING_UTF8 = "UTF-8";
    private static final Pattern VERSION_PATTERN = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)");

    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }

    @SuppressLint({"DefaultLocale"})
    public static String formatCurrency(String str, int i) {
        float f = ((float) i) / 100.0f;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        Currency currency = getCurrency(str);
        if (currency != null) {
            numberInstance = NumberFormat.getCurrencyInstance();
            numberInstance.setCurrency(currency);
        }
        if (i % 100 == 0) {
            numberInstance.setMinimumFractionDigits(0);
            numberInstance.setMaximumFractionDigits(0);
        } else {
            numberInstance.setMinimumFractionDigits(2);
            numberInstance.setMaximumFractionDigits(2);
        }
        return numberInstance.format((double) f);
    }

    public static ApplicationInfo getApplicationInfo(Context context, int i) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), i);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalStateException("Couldn't retrieve own package info.");
        }
    }

    private static Currency getCurrency(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Currency instance = Currency.getInstance(str.toUpperCase(Locale.US));
            try {
                if (!Currency.getAvailableCurrencies().contains(instance)) {
                    return null;
                }
            } catch (IllegalArgumentException unused) {
            }
            return instance;
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    public static PackageInfo getPackageInfo(Context context, int i) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalStateException("Couldn't retrieve own package info.");
        }
    }

    public static String imageSizeString(byte[] bArr) {
        if (bArr == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return String.format(Locale.US, "%dx%d %.1fkB", new Object[]{Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth), Float.valueOf(((float) bArr.length) / 1024.0f)});
    }

    public static boolean isApplicationIdValid(String str) {
        return str != null && str.matches(APP_ID_REGEX);
    }

    public static boolean isDebugBuild(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isInstalledFromStore(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        ButtonLog.visibleFormat("Found installer application to be: %s", installerPackageName);
        return !TextUtils.isEmpty(installerPackageName);
    }

    public static String isoDateFormat(long j) {
        return isoFormat(new Date(j));
    }

    public static String isoFormat(Date date) {
        return DATE_FORMAT.format(date);
    }

    public static String md5(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.forName(ENCODING_UTF8)));
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static long millisFromIsoFormat(String str) {
        SafeSimpleDateFormat safeSimpleDateFormat = new SafeSimpleDateFormat();
        safeSimpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        try {
            return safeSimpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            return Long.MIN_VALUE;
        }
    }

    public static String parseSemanticVersion(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = VERSION_PATTERN.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static String readMetaData(String str, Context context) {
        Bundle bundle = getApplicationInfo(context, RecyclerView.C1119a0.FLAG_IGNORE).metaData;
        if (bundle != null) {
            return bundle.getString(str, "");
        }
        return "";
    }

    public static Bitmap resourceToBitmap(Context context, int i) {
        return drawableToBitmap(C4732a.getDrawable(context, i));
    }

    public static int safeColorValue(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.charAt(0) == '#') {
            str = str.substring(1);
        }
        if (str.length() == 8) {
            i = Integer.parseInt(str.substring(6, 8), 16);
        } else {
            i = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        }
        return Integer.parseInt(str.substring(0, 6), 16) | (i << 24);
    }

    public static byte[] streamToByteArray(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Math.min(i, 10240)];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read && j < ((long) i)) {
                byteArrayOutputStream.write(bArr, 0, read);
                j += (long) read;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: finally extract failed */
    public static String streamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(inputStream), ENCODING_UTF8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        }
    }

    public static String toString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void writeStringToStream(OutputStream outputStream, String str) throws IOException {
        if (str != null) {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, ENCODING_UTF8);
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        }
    }
}
