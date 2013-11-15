package com.example.widget;

import java.util.List;

import org.xmlpull.v1.XmlPullParser;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.imagecaptionview4.R;

/**
 * View to show image with caption and description
 */

public class ImageCaptionView extends RelativeLayout {

   private static final String TAG = ImageCaptionView.class.getSimpleName();

   private RelativeLayout viewContainer = null;
   private TextView caption = null;

   public ImageCaptionView(Context context) {
      super(context);
   }

   public ImageCaptionView(Context context, AttributeSet attrs) {
      this(context, attrs, 0);
   }

   /**
    * Perform inflation from XML and apply a class-specific base style. This
    * constructor of View allows subclasses to use their own base style when
    * they are inflating. For example, a Button class's constructor would call
    * this version of the super class constructor and supply
    * <code>R.attr.buttonStyle</code> for <var>defStyle</var>; this allows
    * the theme's button style to modify all of the base view attributes (in
    * particular its background) as well as the Button class's attributes.
    *
    * @param context The Context the view is running in, through which it can
    *        access the current theme, resources, etc.
    * @param attrs The attributes of the XML tag that is inflating the view.
    * @param defStyle The default style to apply to this view. If 0, no style
    *        will be applied (beyond what is included in the theme). This may
    *        either be an attribute resource, whose value will be retrieved
    *        from the current theme, or an explicit style resource.
    * @see #View(Context, AttributeSet)
    */
   public ImageCaptionView(Context context, AttributeSet attrs, int defStyle) {
      super(context, attrs, defStyle);
      viewContainer = (RelativeLayout) View.inflate(getContext(), R.layout.image_caption_view, this);
   }

   private void setCaption(String captionText) {
      caption.setText(captionText);
   }
   
}
