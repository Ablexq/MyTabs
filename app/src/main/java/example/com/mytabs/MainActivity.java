package example.com.mytabs;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout one;
    private LinearLayout two;
    private LinearLayout three;
    private TextView tab1;
    private TextView tab2;
    private TextView tab3;

    private ImageView home_tab_one_icon;
    private ImageView home_tab_two_icon;
    private ImageView home_tab_three_icon;
    private TextView home_tab_one_text;
    private TextView home_tab_two_text;
    private TextView home_tab_three_text;

    private RadioButton btn1;
    private RadioButton btn2;
    private RadioButton btn3;

    private int mCurrentIndex = 0;

    private Drawable drawableSelect1;
    private Drawable drawableDefault1;
    private Drawable drawableDefault2;
    private Drawable drawableSelect2;
    private Drawable drawableDefault3;
    private Drawable drawableSelect3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawableSelect1 = getResources().getDrawable(R.drawable.tab1_icon_select);
        drawableDefault1 = getResources().getDrawable(R.drawable.tab1_icon_default);
        drawableDefault2 = getResources().getDrawable(R.drawable.tab2_icon_default);
        drawableSelect2 = getResources().getDrawable(R.drawable.tab2_icon_select);
        drawableDefault3 = getResources().getDrawable(R.drawable.tab3_icon_default);
        drawableSelect3 = getResources().getDrawable(R.drawable.tab3_icon_select);

        one = (LinearLayout) findViewById(R.id.home_tab_one);
        two = (LinearLayout) findViewById(R.id.home_tab_two);
        three = (LinearLayout) findViewById(R.id.home_tab_three);
        home_tab_one_icon = (ImageView) findViewById(R.id.home_tab_one_icon);
        home_tab_two_icon = (ImageView) findViewById(R.id.home_tab_two_icon);
        home_tab_three_icon = (ImageView) findViewById(R.id.home_tab_three_icon);
        home_tab_one_text = (TextView) findViewById(R.id.home_tab_one_text);
        home_tab_two_text = (TextView) findViewById(R.id.home_tab_two_text);
        home_tab_three_text = (TextView) findViewById(R.id.home_tab_three_text);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);

        tab1 = (TextView) findViewById(R.id.home_tab_1);
        tab2 = (TextView) findViewById(R.id.home_tab_2);
        tab3 = (TextView) findViewById(R.id.home_tab_3);
        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);
        tab3.setOnClickListener(this);

        btn1 = (RadioButton) findViewById(R.id.btn1);
        btn2 = (RadioButton) findViewById(R.id.btn2);
        btn3 = (RadioButton) findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_tab_one:
            case R.id.home_tab_1:
            case R.id.btn1:
                setCurrentItem(0);
                break;

            case R.id.home_tab_two:
            case R.id.home_tab_2:
            case R.id.btn2:
                setCurrentItem(1);
                break;

            case R.id.home_tab_three:
            case R.id.home_tab_3:
            case R.id.btn3:
                setCurrentItem(2);
                break;
        }
    }

    public void setCurrentItem(int index) {
        if (mCurrentIndex != index) {
            mCurrentIndex = index;

            switch (mCurrentIndex) {
                case 0:
                    home_tab_one_icon.setImageResource(R.drawable.tab1_icon_select);
                    home_tab_one_text.setTextColor(Color.parseColor("#3082f2"));
                    home_tab_two_icon.setImageResource(R.drawable.tab2_icon_default);
                    home_tab_two_text.setTextColor(Color.parseColor("#000000"));
                    home_tab_three_icon.setImageResource(R.drawable.tab3_icon_default);
                    home_tab_three_text.setTextColor(Color.parseColor("#000000"));

                    /*textview*/
                    drawableSelect1.setBounds(0, 0, drawableSelect1.getMinimumWidth(), drawableSelect1.getMinimumHeight());
                    tab1.setCompoundDrawables(null, drawableSelect1, null, null);
                    tab1.setTextColor(Color.parseColor("#3082f2"));

                    drawableDefault2.setBounds(0, 0, drawableDefault2.getMinimumWidth(), drawableDefault2.getMinimumHeight());
                    tab2.setCompoundDrawables(null, drawableDefault2, null, null);
                    tab2.setTextColor(Color.parseColor("#000000"));

                    drawableDefault3.setBounds(0, 0, drawableDefault3.getMinimumWidth(), drawableDefault3.getMinimumHeight());
                    tab3.setCompoundDrawables(null, drawableDefault3, null, null);
                    tab3.setTextColor(Color.parseColor("#000000"));

                    /*radiobutton*/
                    drawableSelect1.setBounds(0, 0, drawableSelect1.getMinimumWidth(), drawableSelect1.getMinimumHeight());
                    btn1.setCompoundDrawables(null, drawableSelect1, null, null);
                    btn1.setTextColor(Color.parseColor("#3082f2"));

                    drawableDefault2.setBounds(0, 0, drawableDefault2.getMinimumWidth(), drawableDefault2.getMinimumHeight());
                    btn2.setCompoundDrawables(null, drawableDefault2, null, null);
                    btn2.setTextColor(Color.parseColor("#000000"));

                    drawableDefault3.setBounds(0, 0, drawableDefault3.getMinimumWidth(), drawableDefault3.getMinimumHeight());
                    btn3.setCompoundDrawables(null, drawableDefault3, null, null);
                    btn3.setTextColor(Color.parseColor("#000000"));

                    break;

                case 1:
                    home_tab_one_icon.setImageResource(R.drawable.tab1_icon_default);
                    home_tab_one_text.setTextColor(Color.parseColor("#000000"));
                    home_tab_two_icon.setImageResource(R.drawable.tab2_icon_select);
                    home_tab_two_text.setTextColor(Color.parseColor("#3082f2"));
                    home_tab_three_icon.setImageResource(R.drawable.tab3_icon_default);
                    home_tab_three_text.setTextColor(Color.parseColor("#000000"));

                    /*textview*/
                    drawableDefault1.setBounds(0, 0, drawableDefault1.getMinimumWidth(), drawableDefault1.getMinimumHeight());
                    tab1.setCompoundDrawables(null, drawableDefault1, null, null);
                    tab1.setTextColor(Color.parseColor("#000000"));

                    drawableSelect2.setBounds(0, 0, drawableSelect2.getMinimumWidth(), drawableSelect2.getMinimumHeight());
                    tab2.setCompoundDrawables(null, drawableSelect2, null, null);
                    tab2.setTextColor(Color.parseColor("#3082f2"));

                    drawableDefault3.setBounds(0, 0, drawableDefault3.getMinimumWidth(), drawableDefault3.getMinimumHeight());
                    tab3.setCompoundDrawables(null, drawableDefault3, null, null);
                    tab3.setTextColor(Color.parseColor("#000000"));

                    /*radiobutton*/
                    drawableDefault1.setBounds(0, 0, drawableDefault1.getMinimumWidth(), drawableDefault1.getMinimumHeight());
                    btn1.setCompoundDrawables(null, drawableDefault1, null, null);
                    btn1.setTextColor(Color.parseColor("#000000"));

                    drawableSelect2.setBounds(0, 0, drawableSelect2.getMinimumWidth(), drawableSelect2.getMinimumHeight());
                    btn2.setCompoundDrawables(null, drawableSelect2, null, null);
                    btn2.setTextColor(Color.parseColor("#3082f2"));

                    drawableDefault3.setBounds(0, 0, drawableDefault3.getMinimumWidth(), drawableDefault3.getMinimumHeight());
                    btn3.setCompoundDrawables(null, drawableDefault3, null, null);
                    btn3.setTextColor(Color.parseColor("#000000"));
                    break;

                case 2:
                    home_tab_one_icon.setImageResource(R.drawable.tab1_icon_default);
                    home_tab_one_text.setTextColor(Color.parseColor("#000000"));
                    home_tab_two_icon.setImageResource(R.drawable.tab2_icon_default);
                    home_tab_two_text.setTextColor(Color.parseColor("#000000"));
                    home_tab_three_icon.setImageResource(R.drawable.tab3_icon_select);
                    home_tab_three_text.setTextColor(Color.parseColor("#3082f2"));

                    /*textview*/
                    drawableDefault1.setBounds(0, 0, drawableDefault1.getMinimumWidth(), drawableDefault1.getMinimumHeight());
                    tab1.setCompoundDrawables(null, drawableDefault1, null, null);
                    tab1.setTextColor(Color.parseColor("#000000"));

                    drawableDefault2.setBounds(0, 0, drawableDefault2.getMinimumWidth(), drawableDefault2.getMinimumHeight());
                    tab2.setCompoundDrawables(null, drawableDefault2, null, null);
                    tab2.setTextColor(Color.parseColor("#000000"));

                    drawableSelect3.setBounds(0, 0, drawableSelect3.getMinimumWidth(), drawableSelect3.getMinimumHeight());
                    tab3.setCompoundDrawables(null, drawableSelect3, null, null);
                    tab3.setTextColor(Color.parseColor("#3082f2"));

                    /*radiobutton*/
                    drawableDefault1.setBounds(0, 0, drawableDefault1.getMinimumWidth(), drawableDefault1.getMinimumHeight());
                    btn1.setCompoundDrawables(null, drawableDefault1, null, null);
                    btn1.setTextColor(Color.parseColor("#000000"));

                    drawableDefault2.setBounds(0, 0, drawableDefault2.getMinimumWidth(), drawableDefault2.getMinimumHeight());
                    btn2.setCompoundDrawables(null, drawableDefault2, null, null);
                    btn2.setTextColor(Color.parseColor("#000000"));

                    drawableSelect3.setBounds(0, 0, drawableSelect3.getMinimumWidth(), drawableSelect3.getMinimumHeight());
                    btn3.setCompoundDrawables(null, drawableSelect3, null, null);
                    btn3.setTextColor(Color.parseColor("#3082f2"));
                    break;
            }

        }
    }
}