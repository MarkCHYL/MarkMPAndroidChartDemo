package com.view.mark.markmpandroidchartdemo;

import android.annotation.SuppressLint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.view.mark.markmpandroidchartdemo.custom.DayAxisValueFormatter;
import com.view.mark.markmpandroidchartdemo.custom.MyAxisValueFormatter;
import com.view.mark.markmpandroidchartdemo.custom.XYMarkerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.charts1)
    BarChart mChart;

    private List<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setContent();
    }

    private void setContent() {

        for (int i = 0; i <6 ; i++) {
            list.add(10 + i*10);
        }

        List<Integer> month = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            month.add(i + 6 );
        }

        MarkChatUtils.getInstanxce(this,mChart,list,month).setInitChat();
    }
}
