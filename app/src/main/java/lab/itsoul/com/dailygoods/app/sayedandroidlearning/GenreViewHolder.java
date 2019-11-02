package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class GenreViewHolder extends GroupViewHolder{

  private TextView genreTitle;

  public GenreViewHolder(View itemView) {
    super(itemView);
    genreTitle = itemView.findViewById(R.id.genre_title);
  }

  public void setGenreTitle(ExpandableGroup group) {
    genreTitle.setText(group.getTitle());
  }
}