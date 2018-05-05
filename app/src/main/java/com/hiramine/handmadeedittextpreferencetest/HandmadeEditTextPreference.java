package com.hiramine.handmadeedittextpreferencetest;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;


public class HandmadeEditTextPreference extends DialogPreference
{
	private EditText mEditText;

	public HandmadeEditTextPreference( Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes )
	{
		super( context, attrs, defStyleAttr, defStyleRes );
	}

	public HandmadeEditTextPreference( Context context, AttributeSet attrs, int defStyleAttr )
	{
		super( context, attrs, defStyleAttr );
	}

	public HandmadeEditTextPreference( Context context, AttributeSet attrs )
	{
		super( context, attrs );
	}

	public HandmadeEditTextPreference( Context context )
	{
		super( context );
	}

	public void setText( String text )
	{
		persistString( text );
	}

	public String getText()
	{
		return getPersistedString( "" );
	}

	@Override
	protected View onCreateDialogView()
	{
		setDialogLayoutResource( R.layout.dialog_textpreference );

		return super.onCreateDialogView();
	}

	@Override
	protected void onBindDialogView( View view )
	{
		super.onBindDialogView( view );

		// プリファレンス値の読み込み
		String text = getText();

		// ビューのアイテムの更新
		// （ビューは、onCreateDialogView()で作成される）
		mEditText = (EditText)view.findViewById( R.id.edittext_value );
		mEditText.setText( text );
	}

	@Override
	protected void onDialogClosed( boolean positiveResult )
	{
		super.onDialogClosed( positiveResult );

		if( positiveResult )
		{
			String text = mEditText.getText().toString();

			// プリファレンス値の保存
			setText( text );
		}
	}

	// preferences.xmlのandroid:defaultValueで設定したデフォルト値を利用するために必要な処理
	@Override
	protected Object onGetDefaultValue( TypedArray a, int index )
	{
		return a.getString( index );
	}

	// preferences.xmlのandroid:defaultValueで設定したデフォルト値を利用するために必要な処理
	@Override
	protected void onSetInitialValue( boolean restoreValue, Object defaultValue )
	{
		setText( restoreValue ? getText() : (String)defaultValue );
	}
}
