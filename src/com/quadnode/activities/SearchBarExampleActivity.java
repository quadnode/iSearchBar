package com.quadnode.activities;



import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;

public class SearchBarExampleActivity extends Activity implements OnClickListener, TextWatcher{
	
	EditText searchEditText;
	ImageView clearSearchBox;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isearch_bar);
        
        searchEditText = (EditText) findViewById(R.id.search_box);
		searchEditText.addTextChangedListener(this);
		clearSearchBox = (ImageView) findViewById(R.id.clear_search_box);
		clearSearchBox.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
    	switch (v.getId()) {
		case R.id.clear_search_box:
			clearSearchBox.setVisibility(View.GONE);
			searchEditText.setText("");
			break;

		default:
			break;
		}
    }
    
    @Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		if (searchEditText.getText().toString().equals("")) {
			clearSearchBox.setVisibility(View.GONE);
		} else {
			clearSearchBox.setVisibility(View.VISIBLE);
		}
	}

	@Override
	public void afterTextChanged(Editable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub
		
	}
	
}