package com.food.nofoodwaste;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DashBoardActivity extends AppCompatActivity {

    private EditText edtName,edtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        //initView();

        findViewById(R.id.layout_donate_food).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donationBtnClick();
            }
        });
        findViewById(R.id.layout_volunteer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volunteerBtnClick();
            }
        });
        findViewById(R.id.layout_map_a_location).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLocationBtnClick();
            }
        });


    }

    private void donationBtnClick(){
        //Intent intent = new Intent(getApplicationContext(),DashBoardActivity.class);
        //startActivity(intent);
    }

    private void volunteerBtnClick(){
        //Intent intent = new Intent(getApplicationContext(),DashBoardActivity.class);
        //startActivity(intent);
    }

    private void mapLocationBtnClick(){
        //Intent intent = new Intent(getApplicationContext(),DashBoardActivity.class);
        //startActivity(intent);
    }

    /*private void doLogin() {
        String name = edtName.getText().toString().trim();
        String mobile = edtPhone.getText().toString().trim();
        if (isValidationSuccess(name,mobile)){
            doLoginTask(name,mobile);
        }else {
            //displayToast();
        }
    }

    private void doLoginTask(String name, String mobile) {
        Intent intent = new Intent(getApplicationContext(),)
    }

    private void displayToast(String toastMsg) {
        Toast.makeText(getApplicationContext(),toastMsg,Toast.LENGTH_SHORT).show();
    }

    private boolean isValidationSuccess(String name, String mobile) {
        boolean isSuccess = true;

        if (name.length() > 3){
            isSuccess = false;
        }else if(!mobile.matches(Helpers.REG_EXP_MOBILE)){
            isSuccess = false;
        }
        return isSuccess;
    }

    private void initView() {
        edtName = (EditText)findViewById(R.id.edt_name);
        edtPhone = (EditText)findViewById(R.id.edt_phone);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/
}
