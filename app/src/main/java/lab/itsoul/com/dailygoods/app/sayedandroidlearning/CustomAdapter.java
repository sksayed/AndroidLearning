package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends BaseAdapter {

    int flagId ;
    String [] countryName ;
    Context context ;
    LayoutInflater inflater ;


    public CustomAdapter(Context context, String[] countryNames, int flagID) {
        this.flagId = flagID ;
        this.countryName = countryNames ;
        this.context = context ;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        System.out.println(" ekhane asche ");
    }

    @Override
    public int getCount() {
        return  this.countryName.length ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if ( convertView == null)
        {
           convertView = this.inflater.inflate(R.layout.sample_view_with_flag , parent , false);

        }

        ImageView imageView = convertView.findViewById(R.id.sampleViewWithFlagImageId);
        TextView textView1 = convertView.findViewById(R.id.sampleViewWithFlagCountryNameId);
        TextView textView2 =  convertView.findViewById(R.id.sampleViewWithFlagDescriptionId);

        imageView.setImageResource(R.drawable.bangladesh);
        textView1.setText(this.countryName[position]);
        textView2.setText("please click for the details ...");


        return convertView ;
    }
}
