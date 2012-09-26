package es.sabadowdev.android.example.selector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private Context context;

	private String[] items = new String[] { 
			"one", 
			"two",
			"three",
			"four",			
			"five",
			"six",
			"seven" };

	public MyAdapter(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		return items.length;
	}

	@Override
	public String getItem(int position) {
		return items[position];
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//TODO: should implement ViewHolder Pattern for performance
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		CustomLinearLayoutCheckable row = (CustomLinearLayoutCheckable) inflater.inflate(R.layout.row, parent, false);

		TextView tv1 = (TextView) row.findViewById(R.id.tv1);
		tv1.setText(getItem(position));

		return row;
	}

}
