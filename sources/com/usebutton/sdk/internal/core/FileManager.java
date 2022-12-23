package com.usebutton.sdk.internal.core;

import android.content.Context;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
    private static final String TAG = "FileManager";
    private final Context context;

    public FileManager(Context context2) {
        this.context = context2;
    }

    private FileInputStream getFileInputStream(String str) {
        try {
            return this.context.openFileInput(str);
        } catch (FileNotFoundException unused) {
            ButtonLog.verboseFormat(TAG, "Failed to find %s", str);
            return null;
        }
    }

    private FileOutputStream getFileOutputStream(String str) {
        try {
            return this.context.openFileOutput(str, 0);
        } catch (FileNotFoundException unused) {
            ButtonLog.verboseFormat(TAG, "Failed to find %s", str);
            return null;
        }
    }

    public String readFile(String str) {
        try {
            FileInputStream fileInputStream = getFileInputStream(str);
            if (fileInputStream != null) {
                return ButtonUtil.streamToString(fileInputStream);
            }
            return null;
        } catch (IOException unused) {
            ButtonLog.verboseFormat(TAG, "Failed to read to %s", str);
            return null;
        }
    }

    public void writeFile(String str, String str2) {
        FileOutputStream fileOutputStream = getFileOutputStream(str);
        if (fileOutputStream != null) {
            try {
                ButtonUtil.writeStringToStream(fileOutputStream, str2);
            } catch (IOException unused) {
                ButtonLog.verboseFormat(TAG, "Failed to write to %s", str);
            }
        }
    }
}
