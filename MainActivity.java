package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;
import android.view.inputmethod.InputMethodManager;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button _ok_button;
    private EditText input_TextBox;
    private TextView output_TextView;
    private Button helpb;
    private Button del;

    String About_us = " Бұл бағдарлама ММИ \"Дарын\"-ның Дүйсен Бірханым мен Сейсеков Алинұр оқушыларымен ғылими жоба үшін жасалған." +
            "\nЭто приложение создано в рамках научного проекта учениками СШИ \"Дарын\" Дуйсен Бирханым  и Сейсековым Алинуром.";
    public void hideKeyboard(View view) {
        try {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch(Exception ignored) {
        }
    }

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helpb = findViewById(R.id.help);
        _ok_button = findViewById(R.id.okButton);
        output_TextView = findViewById(R.id.outputTextview);
        input_TextBox = findViewById(R.id.inputTextview);
        del = findViewById(R.id.delete);

        _ok_button.setOnClickListener(this);
        helpb.setOnClickListener(this);
        del.setOnClickListener(this);

    }

    public void onClick(View v) {
        hideKeyboard(v);





        if (v.getId() == _ok_button.getId()) {

            output_TextView.setTextSize(30);
            String text = input_TextBox.getText().toString();
            String Text = text.replaceAll("(б)", "<font color=#009E43>$б</font>").replaceAll("(Б)", "<font color=#009E43>$Б</font>")
                    .replaceAll("(в)", "<font color=#00A144>$в</font>").replaceAll("(В)", "<font color=#00A144>$В</font>")
                    .replaceAll("(г)", "<font color=#00CF57>$г</font>").replaceAll("(Г)", "<font color=#00CF57>$Г</font>")
                    .replaceAll("(ғ)", "<font color=#00E05F>$ғ</font>").replaceAll("(Ғ)", "<font color=#00E05F>$Ғ</font>")
                    .replaceAll("(ұ)", "<font color=#FFE20A>$ұ</font>").replaceAll("(Ұ)", "<font color=#FFE20A>$Ұ</font>")
                    .replaceAll("(ү)", "<font color=#F4DB0A>$ү</font>").replaceAll("(Ү)", "<font color=#F4DB0A>$Ү</font>")
                    .replaceAll("(у)", "<font color=#C9B25A>$у</font>").replaceAll("(У)", "<font color=#C9B25A>$У</font>")
                    .replaceAll("(ю)", "<font color=#CFB708>$ю</font>").replaceAll("(Ю)", "<font color=#CFB708>$Ю</font>")
                    .replaceAll("(а)", "<font color=#E81220>$а</font>").replaceAll("(А)", "<font color=#E81220>$А</font>")
                    .replaceAll("(ә)", "<font color=#FF0000>$ә</font>").replaceAll("(Ә)", "<font color=#FF0000>$Ә</font>")
                    .replaceAll("(я)", "<font color=#E8283D>$я</font>").replaceAll("(Я)", "<font color=#E8283D>$Я</font>")
                    .replaceAll("(е)", "<font color=#F27A00>$е</font>").replaceAll("(Е)", "<font color=#F27A00>$Е</font>")
                    .replaceAll("(э)", "<font color=#F27A3C>$э</font>").replaceAll("(Э)", "<font color=#F27A3C>$Э</font>")
                    .replaceAll("(о)", "<font color=#F29580>$о</font>").replaceAll("(О)", "<font color=#F29580>$О</font>")
                    .replaceAll("(ө)", "<font color=#FA9A84>$ө</font>").replaceAll("(Ө)", "<font color=#FA9A84>$Ө</font>")
                    .replaceAll("(ё)", "<font color=#C27766>$ё</font>").replaceAll("(Ё)", "<font color=#C27766>$Ё</font>")
                    .replaceAll("(һ)", "<font color=#A0B0F0>$һ</font>").replaceAll("(Һ)", "<font color=#A0B0F0>$Һ</font>")
                    .replaceAll("(ң)", "<font color=#9E9BFF>$ң</font>").replaceAll("(Ң)", "<font color=#9E9BFF>$Ң</font>")
                    .replaceAll("(н)", "<font color=#8F8CE7>$н</font>").replaceAll("(Н)", "<font color=#8F8CE7>$Н</font>")
                    .replaceAll("(м)", "<font color=#817FD1>$м</font>").replaceAll("(М)", "<font color=#817FD1>$М</font>")
                    .replaceAll("(ф)", "<font color=#85A8DC>$ф</font>").replaceAll("(Ф)", "<font color=#85A8DC>$Ф</font>")
                    .replaceAll("(х)", "<font color=#A0B0C7>$х</font>").replaceAll("(Х)", "<font color=#A0B0C7>$Х</font>")
                    .replaceAll("(ц)", "<font color=#2D7FDB>$ц</font>").replaceAll("(Ц)", "<font color=#2D7FDB>$Ц</font>")
                    .replaceAll("(ч)", "<font color=#0079D1>$ч</font>").replaceAll("(Ч)", "<font color=#0079D1>$Ч</font>")
                    .replaceAll("(ш)", "<font color=#0060A6>$ш</font>").replaceAll("(Ш)", "<font color=#0060A6>$Ш</font>")
                    .replaceAll("(щ)", "<font color=#004D85>$щ</font>").replaceAll("(Щ)", "<font color=#004D85>$Щ</font>")
                    .replaceAll("(д)", "<font color=#560219>$д</font>").replaceAll("(Д)", "<font color=#560219>$Д</font>")
                    .replaceAll("(ж)", "<font color=#750322>$ж</font>").replaceAll("(Ж)", "<font color=#750322>$Ж</font>")
                    .replaceAll("(з)", "<font color=#92042B>$з</font>").replaceAll("(З)", "<font color=#92042B>$З</font>")
                    .replaceAll("(і)", "<font color=#FF91AE>$і</font>").replaceAll("(І)", "<font color=#FF91AE>$І</font>")
                    .replaceAll("(и)", "<font color=#EB85A0>$и</font>").replaceAll("(И)", "<font color=#EB85A0>$И</font>")
                    .replaceAll("(р)", "<font color=#028F89>$р</font>").replaceAll("(Р)", "<font color=#028F89>$Р</font>")
                    .replaceAll("(л)", "<font color=#027B76>$л</font>").replaceAll("(Л)", "<font color=#027B76>$Л</font>")
                    .replaceAll("(й)", "<font color=#03A8A1>$й</font>").replaceAll("(Й)", "<font color=#03A8A1>$Й</font>")
                    .replaceAll("(к)", "<font color=#42B4ED>$к</font>").replaceAll("(К)", "<font color=#42B4ED>$К</font>")
                    .replaceAll("(қ)", "<font color=#49C8FF>$қ</font>").replaceAll("(Қ)", "<font color=#49C8FF>$Қ</font>")
                    .replaceAll("(п)", "<font color=#3CA401>$п</font>").replaceAll("(П)", "<font color=#3CA401>$П</font>")
                    .replaceAll("(с)", "<font color=#45BCF0>$с</font>").replaceAll("(С)", "<font color=#45BCF0>$С</font>")
                    .replaceAll("(т)", "<font color=#3592BA>$т</font>").replaceAll("(Т)", "<font color=#3592BA>$Т</font>")
                    .replaceAll("(ы)", "<font color=#725742>$ы</font>").replaceAll("(Ы)", "<font color=#725742>$Ы</font>");

            output_TextView.setText(Html.fromHtml(Text), TextView.BufferType.SPANNABLE);
            output_TextView.setMovementMethod(ScrollingMovementMethod.getInstance());

            }
        else {
            if (v.getId() == helpb.getId()) {
                output_TextView.setTextSize(20);
                output_TextView.setText(Html.fromHtml(About_us), TextView.BufferType.SPANNABLE);
                output_TextView.setMovementMethod(ScrollingMovementMethod.getInstance());

            }
            if (v.getId() == del.getId()) {
                output_TextView.setText("");
                input_TextBox.setText("");

            }
        }

    }
}
