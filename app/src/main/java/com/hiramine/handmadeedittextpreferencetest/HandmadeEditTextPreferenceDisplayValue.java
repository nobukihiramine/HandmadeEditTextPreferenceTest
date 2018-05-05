package com.hiramine.handmadeedittextpreferencetest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HandmadeEditTextPreferenceDisplayValue extends HandmadeEditTextPreference
{
	public HandmadeEditTextPreferenceDisplayValue( Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes )
	{
		super( context, attrs, defStyleAttr, defStyleRes );
	}

	public HandmadeEditTextPreferenceDisplayValue( Context context, AttributeSet attrs, int defStyleAttr )
	{
		super( context, attrs, defStyleAttr );
	}

	public HandmadeEditTextPreferenceDisplayValue( Context context, AttributeSet attrs )
	{
		super( context, attrs );
	}

	public HandmadeEditTextPreferenceDisplayValue( Context context )
	{
		super( context );
	}

	@Override
	protected View onCreateView( ViewGroup parent )
	{
		setWidgetLayoutResource( R.layout.widget_valuetext );
		return super.onCreateView( parent );
	}

	@Override
	protected void onBindView( View view )
	{
		super.onBindView( view );
		TextView textView = (TextView)view.findViewById( R.id.textview_value );
		textView.setText( getText() );
	}

	// プリファレンス変更結果を、呼び出し元の画面に反映されるために、notifyChanged() が必要。
	// （DisplayValueEditTextPreference、DisplayValueListPreferenceは、
	// 　親クラスのsetValues()にnotifyChanged()呼び出しがあるので、不要）
	@Override
	public void setText( String text )
	{
		super.setText( text );

		notifyChanged();
	}
}
