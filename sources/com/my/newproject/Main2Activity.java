package com.my.newproject;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class Main2Activity extends Activity {
    private Button button3;
    private Button button6;
    /* access modifiers changed from: private */
    public EditText edittext3;
    private SharedPreferences file;
    /* access modifiers changed from: private */
    public SharedPreferences filee;
    private LinearLayout linear10;
    private LinearLayout linear11;
    private LinearLayout linear3;
    private ArrayList<String> list = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<String> listin = new ArrayList<>();
    /* access modifiers changed from: private */
    public String listing = "";
    /* access modifiers changed from: private */
    public ListView listview1;
    private ScrollView vscroll3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main2);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linear10 = (LinearLayout) findViewById(R.id.linear10);
        this.linear11 = (LinearLayout) findViewById(R.id.linear11);
        this.button3 = (Button) findViewById(R.id.button3);
        this.edittext3 = (EditText) findViewById(R.id.edittext3);
        this.vscroll3 = (ScrollView) findViewById(R.id.vscroll3);
        this.button6 = (Button) findViewById(R.id.button6);
        this.listview1 = (ListView) findViewById(R.id.listview1);
        this.file = getSharedPreferences("file", 0);
        this.filee = getSharedPreferences("filee", 0);
        this.button3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Main2Activity.this.listin.add(Main2Activity.this.edittext3.getText().toString());
                Main2Activity.this.listview1.setAdapter(new ArrayAdapter(Main2Activity.this.getBaseContext(), 17367043, Main2Activity.this.listin));
                ((BaseAdapter) Main2Activity.this.listview1.getAdapter()).notifyDataSetChanged();
            }
        });
        this.button6.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Main2Activity.this.filee.edit().putString(Main2Activity.this.edittext3.getText().toString(), Main2Activity.this.listing).commit();
            }
        });
    }

    private void initializeLogic() {
        setTitle("list");
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
