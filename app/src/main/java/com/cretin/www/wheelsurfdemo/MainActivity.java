package com.cretin.www.wheelsurfdemo;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.cretin.www.wheelsruflibrary.listener.RotateListener;
import com.cretin.www.wheelsruflibrary.view.WheelSurfView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //娉ㄦ剰鐐癸細
        //1銆佸湪浣跨敤鏆村埄妯″紡鐨勬椂鍊欙紝鍒嗗尯涓暟璇峰姟蹇呬笌浣犳彁渚涚殑搴曠洏涓婄殑鍒嗗尯涓暟涓€鑷达紝
        //骞朵笖锛岃淇濊瘉浣犳彁渚涚殑搴曞浘鏄渾鐨勶紝鑳屾櫙鏄€忔槑鐨勶紝鑰屼笖姣忎釜鍒嗗尯鏄潎绛夊垎鐨?        //2銆佸湪浣跨敤鑷畾涔夋ā寮忔椂锛氳淇濊瘉鏂囧瓧鎻忚堪锛屽浘鏍囷紝鑳屾櫙棰滆壊鐨勯泦鍚堥暱搴︽槸涓€鏍风殑锛?        //骞朵笖闀垮害涓庡垎绫讳釜鏁颁竴鑷磘ypenum
        //3銆侀噸瑕佺殑浜嬫儏璇翠笁閬?        //    typenum蹇呬紶
        //    typenum蹇呬紶
        //    typenum蹇呬紶

        //鑾峰彇绗竴涓鍥?        final WheelSurfView wheelSurfView = findViewById(R.id.wheelSurfView);
        //娣诲姞婊氬姩鐩戝惉
        wheelSurfView.setRotateListener(new RotateListener() {
            @Override
            public void rotateEnd(int position, String des) {
                Toast.makeText(MainActivity.this, "缁撴潫浜?" + position + "   " + des, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rotating(ValueAnimator valueAnimator) {

            }

            @Override
            public void rotateBefore(ImageView goImg) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("娓╅Θ鎻愮ず");
                builder.setMessage("纭畾瑕佽姳璐?00绉垎鎶藉锛?);
                builder.setPositiveButton("纭畾", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //妯℃嫙浣嶇疆
                        int position = new Random().nextInt(7) + 1;
                        wheelSurfView.startRotate(position);
                    }
                });
                builder.setNegativeButton("鍙栨秷", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();

            }
        });


        //鑾峰彇绗簩涓鍥?        final WheelSurfView wheelSurfView1 = findViewById(R.id.wheelSurfView1);
        //娣诲姞婊氬姩鐩戝惉
        wheelSurfView1.setRotateListener(new RotateListener() {
            @Override
            public void rotateEnd(int position, String des) {
                Toast.makeText(MainActivity.this, "缁撴潫浜?浣嶇疆锛? + position + "   鎻忚堪锛? + des, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rotating(ValueAnimator valueAnimator) {

            }

            @Override
            public void rotateBefore(ImageView goImg) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("娓╅Θ鎻愮ず");
                builder.setMessage("纭畾瑕佽姳璐?00绉垎鎶藉锛?);
                builder.setPositiveButton("纭畾", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //妯℃嫙浣嶇疆
                        int position = new Random().nextInt(7) + 1;
                        wheelSurfView1.startRotate(position);
                    }
                });
                builder.setNegativeButton("鍙栨秷", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();

            }
        });
    }
}

