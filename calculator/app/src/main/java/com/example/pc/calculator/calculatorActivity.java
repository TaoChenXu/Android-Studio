package com.example.pc.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class calculatorActivity extends AppCompatActivity {
    <?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="colorPrimary">#3F51B5</color>
    <color name="colorPrimaryDark">#303F9F</color>
    <color name="colorAccent">#FF4081</color>
    <color name="white">#FFFFFF</color>
    <color name="black">#000000</color>
    <color name="zi">#FFFFFF</color>
    <color name="gray">#BEBEBE</color>
    <color name="green">#9AFF9A</color>
    <color name="littlegreen">#F0FFFF</color>
</resources>
    <?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
<corners android:radius="5dp"/>
    <solid
    android:color="@color/white"/>
</shape>
    <?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:drawable="@color/littlegreen"
    android:state_pressed="true"/>
    <item android:drawable="@color/white" />
</selector>
    <?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:drawable="@color/white"
    android:state_pressed="true"/>
    <item android:drawable="@color/littlegreen" />
</selector>
    <?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="@drawable/jisuanqi"

    tools:context="com.example.administrator.calculate.MainActivity"
            >

    <LinearLayout
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="30dp"
    android:paddingLeft="20dp"
    android:paddingRight="20dp"
    android:paddingTop="20dp">
     <EditText
    android:id="@+id/input"
    android:layout_width="fill_parent"
    android:layout_height="60dp"
    android:background="@drawable/white"
    android:editable="false"
    android:gravity="right|bottom"
            />
    </LinearLayout>
    <LinearLayout
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="20dp"
    android:orientation="horizontal"
    android:gravity="center">
    <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="C"
    android:background="@drawable/selector"
    android:gravity="center"
    android:textSize="25sp"
    android:id="@+id/clear"
            />
    <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="←"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="23sp"
    android:id="@+id/delete"
            />
    <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="×"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/cheng"
            />
    <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="÷"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/clu"
            />

</LinearLayout>

    <LinearLayout
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="20dp"
    android:orientation="horizontal"
    android:gravity="center">
        <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="7"
    android:background="@drawable/selector"
    android:gravity="center"
    android:textSize="25sp"
    android:id="@+id/num7"
            />
        <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="8"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/num8"
            />
        <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="9"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/num9"
            />
        <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="－"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/charjian"
            />

    </LinearLayout>

    <LinearLayout
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="20dp"
    android:orientation="horizontal"
    android:gravity="center">
        <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="4"
    android:background="@drawable/selector"
    android:gravity="center"
    android:textSize="25sp"
    android:id="@+id/num4"
            />
        <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="5"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/num5"
            />
        <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="6"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/num6"
            />
        <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="＋"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/charadd"
            />

    </LinearLayout>

    <LinearLayout
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:gravity="center_horizontal"
    android:layout_marginTop="10dp"
            >
        <LinearLayout
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="vertical"

            >
            <LinearLayout
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
            >
                <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:background="@drawable/selector"
    android:text="1"
    android:gravity="center"
    android:textSize="25sp"
    android:id="@+id/num1"
            />
                <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="2"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/num2"/>
                <Button
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:text="3"
    android:background="@drawable/selector"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/num3"/>
            </LinearLayout>

            <LinearLayout
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:layout_marginTop="10dp">

                <Button
    android:id="@+id/num0"
    android:layout_width="140dp"
    android:layout_height="65dp"
    android:text="0"
    android:background="@drawable/selector"
    android:gravity="center"
    android:textSize="25sp" />

                <Button
    android:id="@+id/dian"
    android:layout_width="65dp"
    android:layout_height="65dp"
    android:layout_marginLeft="10dp"
    android:background="@drawable/selector"
    android:gravity="center"
    android:text="."
    android:textSize="25sp" />

            </LinearLayout>

        </LinearLayout>

        <LinearLayout
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">
            <Button
    android:layout_width="65dp"
    android:layout_height="140dp"
    android:text="="
    android:background="@drawable/equal"
    android:gravity="center"
    android:layout_marginLeft="10dp"
    android:textSize="25sp"
    android:id="@+id/equai"/>
        </LinearLayout>

    </LinearLayout>

</LinearLayout>
            123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899100101102103104105106107108109110111112113114115116117118119120121122123124125126127128129130131132133134135136137138139140141142143144145146147148149150151152153154155156157158159160161162163164165166167168169170171172173174175176177178179180181182183184185186187188189190191192193194195196197198199200201202203204205206207208209210211212213214215216217218219220221222223224225226227228229230231232233234235236237238239240241242243244245246247248249250251252253254255256257258259260261262263264265266267


package com.example.administrator.calculate;

    public class MainActivity extends AppCompatActivity {

        @BindView(R.id.input)
        EditText input;
        @BindView(R.id.clear)
        Button clear;
        @BindView(R.id.delete)
        Button delete;
        @BindView(R.id.cheng)
        Button cheng;
        @BindView(R.id.clu)
        Button chu;
        @BindView(R.id.num7)
        Button num7;
        @BindView(R.id.num8)
        Button num8;
        @BindView(R.id.num9)
        Button num9;
        @BindView(R.id.charjian)
        Button charjian;
        @BindView(R.id.num4)
        Button num4;
        @BindView(R.id.num5)
        Button num5;
        @BindView(R.id.num6)
        Button num6;
        @BindView(R.id.charadd)
        Button charadd;
        @BindView(R.id.num1)
        Button num1;
        @BindView(R.id.num2)
        Button num2;
        @BindView(R.id.num3)
        Button num3;
        @BindView(R.id.num0)
        Button num0;
        @BindView(R.id.dian)
        Button dian;
        @BindView(R.id.equai)
        Button equal;

        private  String ss="";
        private  boolean fu=false;
        private  boolean num=false;
        private  boolean point=false;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ButterKnife.bind(this);


        }

        @OnClick({R.id.clear, R.id.delete, R.id.cheng, R.id.clu, R.id.num7, R.id.num8, R.id.num9, R.id.charjian, R.id.num4, R.id.num5, R.id.num6, R.id.charadd, R.id.num1, R.id.num2, R.id.num3, R.id.num0, R.id.dian, R.id.equai})
        public void onViewClicked(View view) {
            switch (view.getId()) {
                case R.id.clear:
                {
                    ss="";
                    input.setText(ss);
                }
                break;
                case R.id.delete:
                {
                    if(ss.indexOf(" ")==ss.length()-3)
                    {
                        ss= ss.substring(0,ss.length() - 2);
                    }
                    if(ss.length()>0)
                    {
                        ss= ss.substring(0,ss.length() - 1);
                    }
                    input.setText(ss);
                }
                break;
                case R.id.cheng:
                {
                    if(ss.length()==0)
                    {
                        break;
                    }
                    if(ss.contains(" "))
                    {
                        if(ss.indexOf(" ")==ss.length()-3||ss.indexOf(" ")==ss.length()-2||ss.indexOf(" ")==ss.length()-1) break;
                        getResult();
                    }
                    fu=true;
                    ss+=" × ";
                    input.setText(ss);
                }
                break;
                case R.id.clu:
                {
                    if(ss.length()==0)
                    {
                        break;
                    }
                    if(ss.contains(" "))
                    {
                        if(ss.indexOf(" ")==ss.length()-3||ss.indexOf(" ")==ss.length()-2||ss.indexOf(" ")==ss.length()-1) break;
                        getResult();
                    }
                    fu=true;
                    ss+=" ÷ ";
                    input.setText(ss);
                }
                break;
                case R.id.num7:
                {
                    ss+="7";
                    input.setText(ss);
                }
                break;
                case R.id.num8:
                {
                    ss+="8";
                    input.setText(ss);
                }
                break;
                case R.id.num9:
                {
                    ss+="9";
                    input.setText(ss);
                }
                break;
                case R.id.charjian:
                {
                    if(ss.length()==0)
                    {
                        break;
                    }
                    if(ss.contains(" "))
                    {
                        if(ss.indexOf(" ")==ss.length()-3||ss.indexOf(" ")==ss.length()-2||ss.indexOf(" ")==ss.length()-1) break;
                        getResult();
                    }
                    fu=true;
                    ss+=" － ";
                    input.setText(ss);
                }
                break;
                case R.id.num4:
                {
                    ss+="4";
                    input.setText(ss);
                }
                break;
                case R.id.num5:
                {
                    ss+="5";
                    input.setText(ss);
                }
                break;
                case R.id.num6:
                {
                    ss+="6";
                    input.setText(ss);
                }
                break;
                case R.id.charadd:
                {
                    if(ss.length()==0)
                    {
                        break;
                    }
                    if(ss.contains(" "))
                    {
                        if(ss.indexOf(" ")==ss.length()-3||ss.indexOf(" ")==ss.length()-2||ss.indexOf(" ")==ss.length()-1) break;
                        getResult();
                    }
                    fu=true;
                    ss+=" ＋ ";
                    input.setText(ss);
                }
                break;
                case R.id.num1:
                {
                    ss+="1";
                    input.setText(ss);
                }
                break;
                case R.id.num2:
                {
                    ss+="2";
                    input.setText(ss);
                }
                break;
                case R.id.num3:
                {
                    ss+="3";
                    input.setText(ss);
                }
                break;
                case R.id.num0:
                {
                    ss+="0";
                    input.setText(ss);
                }
                break;
                case R.id.dian:
                {
                    if(ss.length()==0||ss.indexOf(" ")==ss.length()-3||ss.lastIndexOf(".")>ss.indexOf(" "))
                    {
                        break;
                    }
                    else
                    {
                        ss+=".";
                        input.setText(ss);
                    }
                }
                break;
                case R.id.equai:
                    getResult();
                    break;
            }
        }
        private void getResult()
        {
            double result=0;
            if(ss==null||ss.equals("")) return;
            if(!ss.contains(" "))  return;
            String s1=ss.substring(0,ss.indexOf(" "));
            String op=ss.substring(ss.indexOf(" ")+1,ss.indexOf(" ")+2);
            String s2=ss.substring(ss.indexOf(" ")+3);
            if(!s1.equals("")&&!s2.equals(""))
            {
                double d1=Double.parseDouble(s1);
                double d2=Double.parseDouble(s2 );
                switch (op)
                {
                    case "＋": result=d1+d2;break;
                    case "－": result=d1-d2;break;
                    case "×": result=d1*d2;break;
                    case "÷":
                    {
                        if(d2==0)
                        {
                            Toast.makeText(this, "不能除以零", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        result=d1/d2*1.0;
                    }
                    break;
                }

                int r = (int)  result;
                if(r==result)
                {
                    input.setText(""+r);
                    ss=""+r;
                }
                else
                {
                    input.setText(result+"");
                    ss=""+result;
                }

            }
        }
    }
}