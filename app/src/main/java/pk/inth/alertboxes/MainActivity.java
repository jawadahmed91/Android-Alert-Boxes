package pk.inth.alertboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnExit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                new AlertDialog.Builder(MainActivity.this)
//                        .setIcon(R.drawable.ic_baseline_warning_24)
//                        .setTitle("Exit")
//                        .setMessage("Are you sure, you want to exit ?")
//                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                finish();
//                            }
//                        })
//                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.dismiss();
//                            }
//                        }).setNeutralButton("Help", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                Toast.makeText(MainActivity.this, "Click on Yes to exit this app.", Toast.LENGTH_LONG).show();
//                            }
//                        }).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(MainActivity.this)
                .setIcon(R.drawable.ic_baseline_warning_24)
                .setTitle("Exit")
                .setMessage("Are you sure, you want to exit ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setNeutralButton("Help", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Click on Yes to exit this app.", Toast.LENGTH_LONG).show();
            }
        }).show();
    }
}