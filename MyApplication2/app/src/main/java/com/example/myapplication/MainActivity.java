package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import net.objecthunter.exp4j.*;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// 数字ボタン　00 - 9 アクション読み取り
        Button button1 = findViewById(R.id.button1);
        Button1Listener button1listener = new Button1Listener();
        button1.setOnClickListener(button1listener);

        Button button2 = findViewById(R.id.button2);
        Button2Listener button2listener = new Button2Listener();
        button2.setOnClickListener(button2listener);

        Button button3 = findViewById(R.id.button_3);
        Button3Listener button3listener = new Button3Listener();
        button3.setOnClickListener(button3listener);

        Button button4 = findViewById(R.id.button4);
        Button4Listener button4listener = new Button4Listener();
        button4.setOnClickListener(button4listener);

        Button button5 = findViewById(R.id.button5);
        Button5Listener button5listener = new Button5Listener();
        button5.setOnClickListener(button5listener);

        Button button6 = findViewById(R.id.button6);
        Button6Listener button6listener = new Button6Listener();
        button6.setOnClickListener(button6listener);

        Button button7 = findViewById(R.id.button7);
        Button7Listener button7listener = new Button7Listener();
        button7.setOnClickListener(button7listener);

        Button button8 = findViewById(R.id.button8);
        Button8Listener button8listener = new Button8Listener();
        button8.setOnClickListener(button8listener);

        Button button9 = findViewById(R.id.button9);
        Button9Listener button9listener = new Button9Listener();
        button9.setOnClickListener(button9listener);

        Button button0 = findViewById(R.id.button0);
        Button0Listener button0listener = new Button0Listener();
        button0.setOnClickListener(button0listener);

        Button button00 = findViewById(R.id.button00);
        Button00Listener button00listener = new Button00Listener();
        button00.setOnClickListener(button00listener);
// イコール
        Button button_equ = findViewById(R.id.button_equ);
        Button_equListener button_equlistener = new Button_equListener();
        button_equ.setOnClickListener(button_equlistener);
// クリア
        Button button_cle = (Button)this.findViewById(R.id.button_cle);
        Button_cleListener button_clelistener = new Button_cleListener();
        button_cle.setOnClickListener(button_clelistener);
// 足し算
        Button button_tas = findViewById(R.id.button_tas);
        Button_tasListener button_taslistener = new Button_tasListener();
        button_tas.setOnClickListener(button_taslistener);
// 引き算
        Button button_hik = findViewById(R.id.button_hik);
        Button_hikListener button_hiklistener = new Button_hikListener();
        button_hik.setOnClickListener(button_hiklistener);
// 掛け算
        Button button_kak = findViewById(R.id.button_kak);
        Button_kakListener button_kaklistener = new Button_kakListener();
        button_kak.setOnClickListener(button_kaklistener);
// 割り算
        Button button_wal = findViewById(R.id.button_wal);
        Button_walListener button_wallistener = new Button_walListener();
        button_wal.setOnClickListener(button_wallistener);
// 小数点
        Button button_dot = findViewById(R.id.button_dot);
        Button_dotListener button_dotlistener = new Button_dotListener();
        button_dot.setOnClickListener(button_dotlistener);
// (左括弧
        Button button_lka = findViewById(R.id.button_lka);
        Button_lkaListener button_lkalistener = new Button_lkaListener();
        button_lka.setOnClickListener(button_lkalistener);
// )右括弧
        Button button_rka = findViewById(R.id.button_rka);
        Button_rkaListener button_rkalistener = new Button_rkaListener();
        button_rka.setOnClickListener(button_rkalistener);
// 括弧削除
        Button button_par = findViewById(R.id.button_par);
        Button_parListener button_parlistener = new Button_parListener();
        button_par.setOnClickListener(button_parlistener);
// セパレート
        Button button_sep = findViewById(R.id.button_sep);
        Button_sepListener button_seplistener = new Button_sepListener();
        button_sep.setOnClickListener(button_seplistener);

// backspace
        Button button_bs = findViewById(R.id.button_bs);
        Button_bsListener button_bslistener = new Button_bsListener();
        button_bs.setOnClickListener(button_bslistener);
// Extention
        Button button_ext = findViewById(R.id.button_ext);
        Button_extListener button_extlistener = new Button_extListener();
        button_ext.setOnClickListener(button_extlistener);
// Aspect
        Button button_aspect = findViewById(R.id.button_aspect);
        Button_aspectListener button_aspectlistener = new Button_aspectListener();
        button_aspect.setOnClickListener(button_aspectlistener);
//// 累乗
        Button button_bek = findViewById(R.id.button_bek);
        Button_bekListener button_beklistener = new Button_bekListener();
        button_bek.setOnClickListener(button_beklistener);
// sin
        Button button_sin = findViewById(R.id.button_sin);
        Button_sinListener button_sinlistener = new Button_sinListener();
        button_sin.setOnClickListener(button_sinlistener);
// cos
        Button button_cos = findViewById(R.id.button_cos);
        Button_cosListener button_coslistener = new Button_cosListener();
        button_cos.setOnClickListener(button_coslistener);
// tan
        Button button_tan = findViewById(R.id.button_tan);
        Button_tanListener button_tanlistener = new Button_tanListener();
        button_tan.setOnClickListener(button_tanlistener);
// log
        Button button_log = findViewById(R.id.button_log);
        Button_logListener button_loglistener = new Button_logListener();
        button_log.setOnClickListener(button_loglistener);
// log10
        Button button_log10 = findViewById(R.id.button_log10);
        Button_log10Listener button_log10listener = new Button_log10Listener();
        button_log10.setOnClickListener(button_log10listener);

// 比較
        Button button_root = findViewById(R.id.button_root);
        Button_rootListener button_rootlistener = new Button_rootListener();
        button_root.setOnClickListener(button_rootlistener);

// 履歴削除
        Button button_rmem = findViewById(R.id.button_rmem);
        Button_rmemListener button_rmemlistener = new Button_rmemListener();
        button_rmem.setOnClickListener(button_rmemlistener);

// 履歴追加
        Button button_calls = findViewById(R.id.button_calls);
        Button_callsListener button_callslistener = new Button_callsListener();
        button_calls.setOnClickListener(button_callslistener);
// 履歴合計
        Button button_csum = findViewById(R.id.button_csum);
        Button_csumListener button_csumlistener = new Button_csumListener();
        button_csum.setOnClickListener(button_csumlistener);
    }

    interface intt{
        String a = "exam";
    }
//四則計算用
    static class Shiso implements intt{
        public String call(String s) {
            System.out.println(a+s);
            Expression expression = new ExpressionBuilder(s).build();
            double result = expression.evaluate();
            return String.valueOf(result);
        }
    }
//イコールが押されたときの動作　計算用のライブラリ　exp4j　と上の　Shiso　を使用
    private class Button_equListener implements View.OnClickListener {
        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        public void onClick(View view) {
            try {
                //文字入力欄のid editText から 文字入力欄のオブジェクトEditTextを取得
                TextView editText = findViewById(R.id.editText);
                TextView editText2 = findViewById(R.id.editText2);
                //文字出力のid TV から 文字出力欄のオブジェクトTVを取得
                TextView TV = findViewById(R.id.textView);
                //入力された文字列をeditTextから取得し、string に保存
                String string = editText.getText().toString();

                //回答　クラスに丸投げ
                Shiso shiso = new Shiso();
                String Ans = shiso.call(string);

                string = '(' + string + ')';
                editText.setText("");
                editText.setText(string);
                //string の文字列(入力された文字列)をTV に入力。画面に表示される
                TV.setText("");
                TV.setText(Ans);


            }catch(IllegalArgumentException e){
                TextView editText = findViewById(R.id.editText);
                editText.setText("");
            }catch(EmptyStackException e){
                TextView editText = findViewById(R.id.editText);
                editText.setText("b");
            }
        }
    }

//　電池持続時間の計算用　単体の機能のため、細分化はなし
    private class Button_extListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            TextView editText = findViewById(R.id.editText);
            TextView editText2 = findViewById(R.id.editText2);
            TextView TV = findViewById(R.id.textView);
            String edit = String.valueOf(editText.getText());
            try{

                if (edit.equals("")) {
                    TV.setText("_mAh_V_W");
                }else{
                    String[] elec = edit.split("_");
                    List<Double> volt = new ArrayList<>();

                    for (String s : elec) {
                        volt.add(Double.parseDouble(s));
                    }

                    double a = volt.get(0);
                    double b = volt.get(1);
                    double c = volt.get(2);
                    double d = a / 1000 * b / c * 60;

                    editText.setText("");
                    String result = String.valueOf(d);
                    editText.setText(result+"min");
                }
            }catch (NumberFormatException e){
                editText.setText("");
            }catch (IndexOutOfBoundsException e){
                editText.setText("");
            }
        }
    }

    //画面費の計算実行　単体の機能のため細分化はしていません
    private class Button_aspectListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            TextView editText = findViewById(R.id.editText);
            TextView editText2 = findViewById(R.id.editText2);
            TextView TV = findViewById(R.id.textView);
            String edit = String.valueOf(editText.getText());
            try{

                if (edit.equals("")) {
                    TV.setText("_px_px");
                }else{
                    String[] elec = edit.split("_");
                    List<Double> volt = new ArrayList<>();

                    for (String s : elec) {
                        volt.add(Double.parseDouble(s));
                    }

                    double a = volt.get(0);
                    double b = volt.get(1);
                    int x = gcd((int)a,(int)b);
                    int y = (int)a/x;
                    int z = (int)b/x;

                    double c = (a+b)/100;
                    double d = a/c;
                    double e = b/c;

                    String result1 = String.valueOf(d);
                    String result2 = String.valueOf(e);
                    String result3 = String.valueOf(y);
                    String result4 = String.valueOf(z);

                    editText.setText("");
                    editText.setText(result3+" : "+result4+" , "+result1+" : "+result2);
                }
            }catch (NumberFormatException e){
                editText.setText("");
            }catch (IndexOutOfBoundsException e){
                editText.setText("");
            }
        }
    }
    // 最大公約数を求める　１つ上のクラスで使う
    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
//数字・記号ボタンが押されたときの共通動作
    class inputbutton{

        void insert(String one) {
            TextView editText = findViewById(R.id.editText);
            String string = editText.getText().toString();
            //string の文字列(入力された文字列)をTV に入力。画面に表示される
            editText.setText(string + one);

        }
    }

//ボタン１が押されたときの動作　以後数値、記号ごとに独立して　inutbutton　の呼び出し　繰り返し記述のためコメントは割愛
    private class Button1Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('1');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button2Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('2');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button3Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('3');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button4Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('4');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button5Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('5');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button6Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('6');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button7Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('7');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button8Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('8');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button9Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('9');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button0Listener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('0');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button00Listener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String one = String.valueOf("00");
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_tasListener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('+');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_hikListener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('-');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_kakListener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('*');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_walListener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('/');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_dotListener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('.');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_sinListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String one = String.valueOf("sin(");
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_cosListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String one = String.valueOf("cos(");
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_tanListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String one = String.valueOf("tan(");
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }
    private class Button_logListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String one = String.valueOf("log(");
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }
    private class Button_log10Listener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String one = String.valueOf("log10(");
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }
    private class Button_lkaListener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf('(');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_rkaListener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            String one = String.valueOf(')');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }

    private class Button_parListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            TextView editText = findViewById(R.id.editText);
            String et = String.valueOf(editText.getText());
            String result = et.replace("(","").replace(")","");
            editText.setText("");
            editText.setText(result);
        }
    }

    private class Button_sepListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String one = String.valueOf('_');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }


    private class Button_bekListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String one = String.valueOf('^');
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }
    private class Button_rootListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String one = String.valueOf("sqrt(");
            inputbutton ins = new inputbutton();
            ins.insert(one);
        }
    }
    //　履歴追加用
    private class Button_callsListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            TextView editText2 = findViewById(R.id.editText2);
            TextView TV = findViewById(R.id.textView);
            String x = String.valueOf(TV.getText());
            String y = String.valueOf(editText2.getText());
            String r = x+" "+y;
            editText2.setText(r);
        }
    }
    //　履歴削除用
    private class Button_rmemListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            TextView editText2 = findViewById(R.id.editText2);
            TextView TV = findViewById(R.id.textView);
            editText2.setText("");
        }
    }

    //履歴合計用
    private class Button_csumListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            TextView TV = findViewById(R.id.textView);
            TextView editText2 = findViewById(R.id.editText2);
            TextView editText = findViewById(R.id.editText);

            try {
                String edit = String.valueOf(editText2.getText());
                String[] summ = edit.split(" ");
                List<Double> suml = new ArrayList<>();
                for (String s : summ) {
                    suml.add(Double.parseDouble(s));
                }
                Double sum = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    sum = suml.stream().reduce(Double::sum).get();
                }

                editText.setText("");
                String result = String.valueOf(sum);
                editText.setText(result);
            }catch(NumberFormatException e){

            }catch(NoSuchElementException e){

            }
        }
    }


//　入力窓内削除用
    private class Button_cleListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            TextView editText = findViewById(R.id.editText);
            TextView editText2 = findViewById(R.id.editText2);
            TextView TV = findViewById(R.id.textView);
            String x = String.valueOf(editText.getText());
            if (x.equals("")) {
                TV.setText("");

            } else {
                editText.setText("");
            }
        }
    }
//バックスペースキー動作用
    private class Button_bsListener implements View.OnClickListener {       
        @Override
        public void onClick(View view) {
            try {
                TextView editText = findViewById(R.id.editText);
                TextView TV = findViewById(R.id.textView);
                String text = editText.getText().toString();
                String result = text.substring(0, text.length() - 1);
                //string の文字列(入力された文字列)をTV に入力。画面に表示される
                editText.setText(result);
            } catch (StringIndexOutOfBoundsException e) {
                TextView TV = findViewById(R.id.textView);
            }
        }
    }

}

