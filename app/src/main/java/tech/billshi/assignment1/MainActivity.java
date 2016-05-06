package tech.billshi.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int clicks = 0;
    private boolean isImageDisp = false;
    private TextView textField;
    private ImageView dogImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textField = (TextView) findViewById(R.id.textField);
        dogImageView = (ImageView) findViewById(R.id.dogImageView);
        if (savedInstanceState != null) {
            clicks = savedInstanceState.getInt("clicks");
            isImageDisp = savedInstanceState.getBoolean("isImageDisp");
        }
        setTextField();
        setImage();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("clicks", clicks);
        outState.putBoolean("isImageDisp", isImageDisp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.reset:
                reset();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onClickRegister(View view) {
        clicks++;
        setTextField();
    }

    public void onClickToggle(View view) {
        isImageDisp = !isImageDisp;
        setImage();
    }

    private void reset() {
        clicks = 0;
        isImageDisp = false;
        resetTextField();
        resetImage();
    }

    private void resetTextField() {
        textField.setText(R.string.no_clicks_yet);
    }

    private void setTextField() {
        if (clicks > 0) {
            textField.setText(String.format("Clicked %d times.", clicks));
        } else {
            resetTextField();
        }
    }

    private void resetImage() {
//        dogImageView.setImageResource(android.R.color.transparent);
//        dogImageView.setContentDescription(null);
        dogImageView.setVisibility(View.INVISIBLE);
    }

    private void setImage() {
        if (isImageDisp) {
//            dogImageView.setImageResource(R.drawable.dog);
//            dogImageView.setContentDescription(getText(R.string.dog));
            dogImageView.setVisibility(View.VISIBLE);
        } else {
            resetImage();
        }
    }

}
