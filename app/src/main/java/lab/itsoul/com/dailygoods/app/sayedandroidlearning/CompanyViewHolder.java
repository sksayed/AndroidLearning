package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class CompanyViewHolder extends GroupViewHolder {

    private TextView mTextView ;
    public CompanyViewHolder(View itemView) {
        super(itemView);

        this.mTextView = itemView.findViewById(R.id.company);
    }

    public void bind (Company company)
    {
        mTextView.setText(company.getTitle());
    }


}
