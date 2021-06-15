package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private EditText etMainOne;
    private EditText etMainTwo;
    private String TAG = ".MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        etMainOne = (EditText) findViewById(R.id.et_main_one);
        etMainTwo = (EditText) findViewById(R.id.et_main_two);


        etMainOne.addTextChangedListener(new TextWatcher(){
            /**
             * 调用此方法是为了通知您，在s某处，文本已更改。
             * 从此回调中对s进行进一步更改是合法的，
             * 但请注意不要让自己陷入无限循环，
             * 因为您所做的任何更改都会导致再次递归调用此方法。
             * （您不会被告知更改发生在哪里，
             * 因为其他 afterTextChanged() 方法可能已经进行了其他更改并使偏移量无效。
             * 但是如果您需要知道这里，您可以使用Spannable.setSpan中的onTextChanged来标记您的位置，
             * 然后查看从这里跨度结束的地方。
             * @param s
             */
            @Override
            public void afterTextChanged(Editable s) {
                Log.d(TAG, "afterTextChanged");
            }

            /**
             * 调用此方法是为了通知您，
             * 在s ，从start的count字符即将被长度为after新文本替换。
             * 尝试从此回调中更改s是错误的。
             * @param s
             * @param start
             * @param count
             * @param after
             */
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d(TAG, "beforeTextChanged:" + s + "-" + start + "-" + count + "-" + after);

            }

            /**
             * 调用此方法是为了通知您，
             * 在s ，从start的count字符刚刚替换了 length before旧文本。
             * 尝试从此回调中更改s是错误的。
             * @param s
             * @param start
             * @param before
             * @param count
             */

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                Log.d(TAG, "onTextChanged:" + s + "-" + "-" + start + "-" + before + "-" + count);
                etMainTwo.setText(s);
            }

        });

    }
}