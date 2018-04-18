package cn.edu.hqu.cst.android.chapter35;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Activty:","onCreate");
        setContentView(R.layout.activity_main);
        BlankFragment blankFragment=BlankFragment.newInstance("这是Activity传递进来的参数1","这是Activity传递进来的参数2");
        getFragmentManager().beginTransaction().add(R.id.fragment,blankFragment).commit();
    }

    @Override
    protected void onStart() {
        Log.i("Activity","onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i("Activity","onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.i("Activity:","onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("Activity:","onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Activity:","onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Activity:","onDestroy");
        super.onDestroy();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        Log.i("Activity:","onAttachFragment");
        super.onAttachFragment(fragment);
    }

    @Override
    public void finish() {
        Log.i("Activity:","finish");
        super.finish();
    }
}
