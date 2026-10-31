package com.signalfredo.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends Activity {

    LinearLayout layout;
    TextView signalText;
    TextView historyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scroll = new ScrollView(this);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(25, 30, 25, 30);
        layout.setBackgroundColor(Color.BLACK);

        TextView title = new TextView(this);
        title.setText("SIGNAL FREDO");
        title.setTextSize(30);
        title.setTextColor(Color.GREEN);
        title.setGravity(Gravity.CENTER);

        TextView indicators = new TextView(this);
        indicators.setText("EMA 9 / EMA 21\nRSI 14\nANALIZ MACHE OTOMATIK");
        indicators.setTextColor(Color.WHITE);
        indicators.setTextSize(18);
        indicators.setGravity(Gravity.CENTER);

        signalText = new TextView(this);
        signalText.setText("\nAPLIKASYON AN PARE\nAP TANN DONE MACHE...");
        signalText.setTextColor(Color.YELLOW);
        signalText.setTextSize(20);
        signalText.setGravity(Gravity.CENTER);

        Button analyze = new Button(this);
        analyze.setText("ANALIZE MACHE");

        analyze.setOnClickListener(v -> analyzeMarket());

        historyText = new TextView(this);
        historyText.setTextColor(Color.WHITE);
        historyText.setTextSize(16);
        historyText.setText("\nISTORIK SIYAL YO\n");

        layout.addView(title);
        layout.addView(indicators);
        layout.addView(signalText);
        layout.addView(analyze);
        layout.addView(historyText);

        scroll.addView(layout);
        setContentView(scroll);
    }

    private void analyzeMarket() {
        signalText.setText(
            "ANALIZ DEMO\n\n" +
            "EMA 9 / EMA 21\n" +
            "RSI 14\n\n" +
            "PA GEN DONE MACHE REYÈL\n" +
            "KONEKTE YON SOUS DONE"
        );

        historyText.append("\nNouvo analiz DEMO");
    }
}