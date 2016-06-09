package kr.hs.duk4957_emirim.SimpleDialog;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import kr.hs.duk4957_emirim.simpledialog.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] items={"젤리빈", "킷캣", "롤리팝"};
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=(Button)findViewById(R.id.but_dialog);
        but.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("First Dialog");

        /*dialog.setSingleChoiceItems(items, checkArr ,new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                but.setText(items(which));
            }
        });*/
        dialog.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
        });

        dialog.setIcon(R.drawable.bubble);
        dialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "대화상자의 화인 버튼을 클릭했음 . ", Toast.LENGTH_LONG).show();
            }
        });

        dialog.show();
    }
}