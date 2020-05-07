package com.my.newproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends Activity {
    private Button button1;
    private Button button2;
    private Button button3;
    private CalendarView calendarview5;
    private LinearLayout linear1;
    private LinearLayout linear10;
    private LinearLayout linear11;
    private LinearLayout linear12;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    /* access modifiers changed from: private */
    public Intent next = new Intent();
    private ScrollView vscroll2;
    private ScrollView vscroll3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.linear12 = (LinearLayout) findViewById(R.id.linear12);
        this.linear10 = (LinearLayout) findViewById(R.id.linear10);
        this.linear11 = (LinearLayout) findViewById(R.id.linear11);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(R.id.linear4);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
        this.vscroll3 = (ScrollView) findViewById(R.id.vscroll3);
        this.calendarview5 = (CalendarView) findViewById(R.id.calendarview5);
        this.button2 = (Button) findViewById(R.id.button2);
        this.button3 = (Button) findViewById(R.id.button3);
        this.button1 = (Button) findViewById(R.id.button1);
        this.button2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.next.setClass(MainActivity.this.getApplicationContext(), Main3Activity.class);
                MainActivity.this.next.setFlags(67108864);
                MainActivity.this.startActivity(MainActivity.this.next);
            }
        });
        this.button3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.next.setClass(MainActivity.this.getApplicationContext(), Main2Activity.class);
                MainActivity.this.next.setFlags(67108864);
                MainActivity.this.startActivity(MainActivity.this.next);
            }
        });
    }

    private void initializeLogic() {
        setTitle("Page 1");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1];
    }

    @Deprecated
    public int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i) {
        return TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}
