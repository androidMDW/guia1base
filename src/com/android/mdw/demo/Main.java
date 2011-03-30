package com.android.mdw.demo;

import java.util.HashMap;
import java.util.LinkedList;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class Main extends Activity {
	/**
	 * constantes necesarias a utilizar al guardar la información 
	 * en un HashMap, por el momento son necesarias para el parser
	 * de XML
	 * 
	 */
	static final String DATA_TITLE = "T";
	static final String DATA_LINK  = "L";
	
    /** Este método es llamado cuando la actividad es creada */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}