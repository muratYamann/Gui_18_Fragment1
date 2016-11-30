package com.yamankod.gui_18_fragment1;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListFrag extends ListFragment {
	String[] values = new String[] { "samsung", "sony", "apple",
			"microsoft", "toshiba" };
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,values);
		setListAdapter(adapter);
	}
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String item = (String) getListAdapter().getItem(position);
		DetailFrag frag = (DetailFrag) getFragmentManager().findFragmentById(
				R.id.frag_capt);
		if (frag != null && frag.isInLayout()) {
			frag.setText(getCapt(item));
		}
	}
	private String getCapt(String ship) {
		if (ship.toLowerCase().contains("samsung")) {
			return "South Korea";
		}
		if (ship.toLowerCase().contains("sony")) {
			return "Japan";
		}
		if (ship.toLowerCase().contains("apple")) {
			return "USA";
		}
		if (ship.toLowerCase().contains("microsoft")) {
			return "USA";
		}
		if (ship.toLowerCase().contains("toshiba")) {
			return "Japan";
		}
		return "???";
	}
}
