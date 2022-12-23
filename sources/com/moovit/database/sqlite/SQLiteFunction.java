package com.moovit.database.sqlite;

import com.moovit.database.sqlite.SQLiteDatabase;

public class SQLiteFunction {
    private final MyArgs args;
    public final SQLiteDatabase.Function callback;
    public final int flags;
    public final String name;
    public final int numArgs;
    private final MyResult result;

    public static class MyArgs implements SQLiteDatabase.Function.Args {
        private MyArgs() {
        }
    }

    public static class MyResult implements SQLiteDatabase.Function.Result {
        public long contextPtr;
        public boolean isSet;

        private MyResult() {
        }

        private void checkSet() {
            if (!this.isSet) {
                this.isSet = true;
                return;
            }
            throw new IllegalStateException("Result is already set");
        }

        public void setNull() {
            checkSet();
            SQLiteFunction.nativeSetResultNull(this.contextPtr);
        }
    }

    public SQLiteFunction(String str, int i, SQLiteDatabase.Function function) {
        this(str, i, function, 0);
    }

    private void dispatchCallback(long j, long j2, int i) {
        MyResult myResult = this.result;
        myResult.contextPtr = j;
        MyArgs myArgs = this.args;
        myArgs.getClass();
        myArgs.getClass();
        try {
            this.callback.callback(myArgs, myResult);
            MyResult myResult2 = this.result;
            if (!myResult2.isSet) {
                myResult2.setNull();
            }
        } finally {
            MyResult myResult3 = this.result;
            myResult3.contextPtr = 0;
            myResult3.isSet = false;
            MyArgs myArgs2 = this.args;
            myArgs2.getClass();
            myArgs2.getClass();
        }
    }

    public static native byte[] nativeGetArgBlob(long j, int i);

    public static native double nativeGetArgDouble(long j, int i);

    public static native int nativeGetArgInt(long j, int i);

    public static native long nativeGetArgLong(long j, int i);

    public static native String nativeGetArgString(long j, int i);

    public static native void nativeSetResultBlob(long j, byte[] bArr);

    public static native void nativeSetResultDouble(long j, double d);

    public static native void nativeSetResultError(long j, String str);

    public static native void nativeSetResultInt(long j, int i);

    public static native void nativeSetResultLong(long j, long j2);

    public static native void nativeSetResultNull(long j);

    public static native void nativeSetResultString(long j, String str);

    public SQLiteFunction(String str, int i, SQLiteDatabase.Function function, int i2) {
        this.args = new MyArgs();
        this.result = new MyResult();
        if (str != null) {
            this.name = str;
            this.numArgs = i;
            this.callback = function;
            this.flags = i2;
            return;
        }
        throw new IllegalArgumentException("name must not be null.");
    }
}
