package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Genre extends ExpandableGroup<Artist> {

  public Genre(String title, List<Artist> items) {
    super(title, items);
  }
}