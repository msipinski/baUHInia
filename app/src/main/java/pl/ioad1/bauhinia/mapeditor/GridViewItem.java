package pl.ioad1.bauhinia.mapeditor;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

import pl.ioad1.bauhinia.R;

public class GridViewItem extends LinearLayout {

    public GridViewItem(Context context) {
        super(context);
    }

    public GridViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GridViewItem(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec); // This is the key that will make the
                                                             // height equivalent to its width
    }

    public void changeTileBackground(int background) {
        ImageView imageView = findViewById(R.id.single_tile_image_view);
        imageView.setImageResource(background);
    }

}