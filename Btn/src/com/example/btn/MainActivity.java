package com.example.btn;

import org.w3c.dom.Text;

import com.example.btn.R;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	TextView tx;
	EditText edt;
	int opt=0;
	String num="";
	int m1=0;
	int res=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edt = (EditText)findViewById(R.id.edit);
		tx = (TextView)findViewById(R.id.Text);
		
		findViewById(R.id.button1).setOnClickListener(this);
		findViewById(R.id.button2).setOnClickListener(this);
		findViewById(R.id.button3).setOnClickListener(this);
		findViewById(R.id.button4).setOnClickListener(this);
		findViewById(R.id.button5).setOnClickListener(this);
		findViewById(R.id.button6).setOnClickListener(this);
		findViewById(R.id.button7).setOnClickListener(this);
		findViewById(R.id.button8).setOnClickListener(this);
		findViewById(R.id.button9).setOnClickListener(this);
		findViewById(R.id.button0).setOnClickListener(this);
		findViewById(R.id.buttonDiv).setOnClickListener(this);
		findViewById(R.id.buttonMult).setOnClickListener(this);
		findViewById(R.id.buttonPlus).setOnClickListener(this);
		findViewById(R.id.buttonMinus).setOnClickListener(this);
		findViewById(R.id.buttonRes).setOnClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		case R.id.button0:
			edt.append("0");
			break;
		case R.id.button1:
			edt.append("1");
			break;
		case R.id.button2:
			edt.append("2");
			break;
		case R.id.button3:
			edt.append("3");
			break;
		case R.id.button4:
			edt.append("4");
			break;
		case R.id.button5:
			edt.append("5");
			break;
		case R.id.button6:
			edt.append("6");
			break;
		case R.id.button7:
			edt.append("7");
			break;
		case R.id.button8:
			edt.append("8");
			break;
		case R.id.button9:
			edt.append("9");
			break;
		case R.id.buttonDiv:
			m1=Integer.parseInt((edt.toString()));
			edt.setText("");
			opt=4;
			break;
		case R.id.buttonMult:
			m1=Integer.parseInt((edt.toString()));
			edt.setText("");
			opt=3;
			break;
		case R.id.buttonPlus:
			m1=Integer.parseInt((edt.toString()));
			edt.setText("");
			opt=1;
			break;
		case R.id.buttonMinus:
			m1=Integer.parseInt((edt.toString()));
			edt.setText("");
			opt=2;
			break;
		case R.id.buttonRes:
			switch(opt)
			{
			case 1:
				res = m1+Integer.parseInt((edt.toString()));
				break;
			case 2:
				res = m1-Integer.parseInt((edt.toString()));
				break;
			case 3:
				res = m1*Integer.parseInt((edt.toString()));
				break;
			case 4:
				res = m1/Integer.parseInt((edt.toString()));
				break;
			}
			tx.setText(Integer.toString(res));
			break;
		}

	}

}
