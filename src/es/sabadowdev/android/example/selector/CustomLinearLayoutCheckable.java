package es.sabadowdev.android.example.selector;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class CustomLinearLayoutCheckable extends LinearLayout implements Checkable {
	private boolean checked;
    	
	private static final int[] CheckedStateSet = {
	    android.R.attr.state_checked
	};
	
    public CustomLinearLayoutCheckable(Context context, AttributeSet attrs) {
        super(context, attrs);
	}
    
    @Override 
    public boolean isChecked() { 
        return checked; 
    }
    
    @Override 
    public void setChecked(boolean checked) {
    	this.checked = checked;
    	if(checked){
    		
    	}
    }
    
    @Override 
    public void toggle() { 
    	checked = !checked;
    } 
    
    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        if (isChecked()) {
            mergeDrawableStates(drawableState, CheckedStateSet);
        }
        return drawableState;
    }

    @Override
    public boolean performClick() {
        toggle();
        return super.performClick();
    }
} 
