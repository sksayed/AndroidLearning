package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ProductViewHolder extends ChildViewHolder {

    private TextView mTextView ;

    public ProductViewHolder(View itemView) {
        super(itemView);
        this.mTextView = itemView.findViewById(R.id.product);
    }

    public void bind(Product product)
    {
        mTextView.setText(product.name);
    }
}
