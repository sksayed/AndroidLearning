package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ArtistViewHolder extends ChildViewHolder {

  private TextView artistName;

  public ArtistViewHolder(View itemView) {
    super(itemView);
    artistName = itemView.findViewById(R.id.artist_name);
  }

  public void onBind(Artist artist) {


  }
}